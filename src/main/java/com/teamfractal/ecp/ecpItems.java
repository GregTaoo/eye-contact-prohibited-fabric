package com.teamfractal.ecp;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

class DyeableMaskedCapItem extends DyeableArmorItem {
    public DyeableMaskedCapItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.ecp.masked_armor1").formatted(Formatting.AQUA));
        tooltip.add(new TranslatableText("tooltip.ecp.masked_armor2").formatted(Formatting.AQUA));
        tooltip.add(new TranslatableText("types.ecp.cap").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}

class MaskedHelmetItem extends ArmorItem {

    public MaskedHelmetItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.ecp.masked_armor1").formatted(Formatting.AQUA));
        tooltip.add(new TranslatableText("tooltip.ecp.masked_armor2").formatted(Formatting.AQUA));
        tooltip.add(new TranslatableText("types.ecp.cap").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
