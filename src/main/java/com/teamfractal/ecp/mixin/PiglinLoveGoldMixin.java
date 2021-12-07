package com.teamfractal.ecp.mixin;

import com.teamfractal.ecp.EcpArmorMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public class PiglinLoveGoldMixin {
    @Inject(at = @At("HEAD"), method = "wearsGoldArmor(Lnet/minecraft/entity/LivingEntity;)Z", cancellable = true)
    private static void checkIf(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        Iterable<ItemStack> iterable = entity.getArmorItems();
        for (ItemStack itemStack : iterable) {
            Item item = itemStack.getItem();
            if (!(item instanceof ArmorItem) || ((ArmorItem)item).getMaterial() != EcpArmorMaterials.GOLD) continue;
            cir.setReturnValue(true);
        }
    }
}
