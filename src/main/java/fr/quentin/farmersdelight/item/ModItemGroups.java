package fr.quentin.farmersdelight.item;

import fr.quentin.farmersdelight.FarmersDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FARMERS_DELIGHT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FarmersDelight.MOD_ID, "farmers_delight"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Blocks.BRICKS))
                    .displayName(Text.translatable("itemGroup.farmersdelight.farmersDelight"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CABBAGE);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.ONION);
                        entries.add(ModItems.FRIED_EGG);
                        entries.add(ModItems.MILK_BOTTLE);
                        entries.add(ModItems.HOT_COCOA);
                        entries.add(ModItems.APPLE_CIDER);
                        entries.add(ModItems.MELON_JUICE);
                        entries.add(ModItems.TOMATO_SAUCE);
                    }).build());

    public static void initialize() {
        FarmersDelight.LOGGER.info("Item Groups initialization");
    }
}
