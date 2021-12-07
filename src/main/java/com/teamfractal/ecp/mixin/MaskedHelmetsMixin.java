package com.teamfractal.ecp.mixin;

import com.teamfractal.ecp.ecp;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public class MaskedHelmetsMixin {
	@Inject(at = @At("HEAD"), method = "isPlayerStaring(Lnet/minecraft/entity/player/PlayerEntity;)Z", cancellable = true)
	private void checkIf(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
		ItemStack itemStack = player.getInventory().armor.get(3);
		if (itemStack.isOf(ecp.chainMaskedHelmet)
				|| itemStack.isOf(ecp.leatherMaskedHelmet)
				|| itemStack.isOf(ecp.goldMaskedHelmet)
				|| itemStack.isOf(ecp.turtleMaskedHelmet)
				|| itemStack.isOf(ecp.diamondMaskedHelmet)
				|| itemStack.isOf(ecp.ironMaskedHelmet)
				|| itemStack.isOf(ecp.netheriteMaskedHelmet)) {
			cir.setReturnValue(false);
		}
	}
}
