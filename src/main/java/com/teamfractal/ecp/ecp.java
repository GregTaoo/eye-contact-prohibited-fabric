package com.teamfractal.ecp;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ecp implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("ecp");

	public static Item leatherMaskedHelmet = new DyeableMaskedCapItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item chainMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.CHAIN, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item ironMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item goldMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item diamondMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item turtleMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.TURTLE, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public static Item netheriteMaskedHelmet = new MaskedHelmetItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {

		LOGGER.info("This is ECP mod for fabric! Made by GregTao,Tapio from TeamFractal.");

		Registry.register(Registry.ITEM, new Identifier("ecp", "leather_masked_helmet"), leatherMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "chain_masked_helmet"), chainMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "iron_masked_helmet"), ironMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "golden_masked_helmet"), goldMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "diamond_masked_helmet"), diamondMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "turtle_masked_helmet"), turtleMaskedHelmet);
		Registry.register(Registry.ITEM, new Identifier("ecp", "netherite_masked_helmet"), netheriteMaskedHelmet);

	}
}
