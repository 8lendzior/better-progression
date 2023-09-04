package net.blendzior.betterprogression.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BetterProgressionToolMaterials implements ToolMaterial {
    FLINT(MiningLevels.STONE, 59, 2.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.FLINT)),
    BRASS(MiningLevels.IRON, 131, 4.0f, 1.0f, 5, () -> Ingredient.ofItems(BetterProgressionItems.BRASS_INGOT)),
    STEEL(MiningLevels.IRON, 400, 6.0f, 2.0f, 12, () -> Ingredient.ofItems(BetterProgressionItems.STEEL_INGOT));
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private BetterProgressionToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();

    }
}
