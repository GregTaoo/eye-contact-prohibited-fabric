package com.teamfractal.ecp;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.*;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.text.MessageFormat;
import java.time.format.TextStyle;
import java.util.List;

class DyeableMaskedCapItem extends DyeableArmorItem {
    public DyeableMaskedCapItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(
                MessageFormat.format(
                        new TranslatableText("tooltip.ecp.masked_armor").getString()
                        ,new TranslatableText("types.ecp.cap").getString())
                ));
        super.appendTooltip(stack, world, tooltip, context);
    }
}

class MaskedHelmetItem extends ArmorItem {

    public MaskedHelmetItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(
                MessageFormat.format(
                        new TranslatableText("tooltip.ecp.masked_armor").getString()
                        ,new TranslatableText("types.ecp.cap").getString())
        ));
        super.appendTooltip(stack, world, tooltip, context);
    }
}