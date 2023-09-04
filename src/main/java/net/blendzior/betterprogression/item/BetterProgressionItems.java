package net.blendzior.betterprogression.item;

import net.blendzior.betterprogression.BetterProgression;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BetterProgressionItems {
    public static final ToolMaterial FLINT_TOOL_MATERIAL = BetterProgressionToolMaterials.FLINT;
    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe", new PickaxeItem(FLINT_TOOL_MATERIAL,1,
            1.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item FLINT_SPEAR =registerItem("flint_spear", new SwordItem(FLINT_TOOL_MATERIAL,3,-1.6F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item FLINT_AXE =registerItem("flint_axe", new AxeItem(FLINT_TOOL_MATERIAL,7,-3.2F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));

    public static final Item RAW_BRASS = registerItem("raw_brass", new Item(new FabricItemSettings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new FabricItemSettings()));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new FabricItemSettings()));

    public static final ArmorMaterial BRASS_ARMOR_MATERIAL = BetterProgressionArmorMaterials.BRASS;
    public static final Item BRASS_HELMET = registerItem("brass_helmet", new ArmorItem(BRASS_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_CHESTPLATE = registerItem("brass_chestplate", new ArmorItem(BRASS_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_LEGGINGS = registerItem("brass_leggings", new ArmorItem(BRASS_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_BOOTS = registerItem("brass_boots", new ArmorItem(BRASS_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final ToolMaterial BRASS_TOOL_MATERIAL = BetterProgressionToolMaterials.BRASS;
    public static final Item BRASS_PICKAXE = registerItem("brass_pickaxe", new PickaxeItem(BRASS_TOOL_MATERIAL,1,1.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_SWORD = registerItem("brass_sword", new SwordItem(BRASS_TOOL_MATERIAL,3,-2.4F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_AXE = registerItem("brass_axe", new AxeItem(BRASS_TOOL_MATERIAL,7,-3.2F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_SHOVEL = registerItem("brass_shovel", new ShovelItem(BRASS_TOOL_MATERIAL,1.5F,-3.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item BRASS_HOE = registerItem("brass_hoe", new BetterProgressionHoeItem(BRASS_TOOL_MATERIAL,-2,-2.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));

    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));

    public static final ArmorMaterial STEEL_ARMOR_MATERIAL = BetterProgressionArmorMaterials.STEEL;
    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(STEEL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final ToolMaterial STEEL_TOOL_MATERIAL = BetterProgressionToolMaterials.STEEL;
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(STEEL_TOOL_MATERIAL,1, -2.8F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(STEEL_TOOL_MATERIAL,3,-2.4F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(STEEL_TOOL_MATERIAL,6,-3.1F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(STEEL_TOOL_MATERIAL,1.5F, -3.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new BetterProgressionHoeItem(STEEL_TOOL_MATERIAL,-3,-1.0F, new Item.Settings().group(BetterProgressionItemGroup.BETTER_PROGRESSION)));
    public static final Item RAW_NETHERITE = registerItem("raw_netherite", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterProgression.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BetterProgression.LOGGER.info("Registering Mod Items for " + BetterProgression.MOD_ID);

    }
}