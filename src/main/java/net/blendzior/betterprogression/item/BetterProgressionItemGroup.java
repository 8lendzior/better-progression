package net.blendzior.betterprogression.item;

import net.blendzior.betterprogression.BetterProgression;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class BetterProgressionItemGroup {
    public static ItemGroup BETTER_PROGRESSION = FabricItemGroupBuilder.build(new Identifier(BetterProgression.MOD_ID,
            "better_progression"), () -> new ItemStack(Items.BLAST_FURNACE));

    public static void registerItemGroups() {

    }
}