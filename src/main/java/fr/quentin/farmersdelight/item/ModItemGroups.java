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
                        entries.add(ModItems.WHEAT_DOUGH);
                        entries.add(ModItems.RAW_PASTA);
                        entries.add(ModItems.PUMPKIN_SLICE);
                        entries.add(ModItems.CABBAGE_LEAF);
                        entries.add(ModItems.MINCED_BEEF);
                        entries.add(ModItems.BEEF_PATTY);
                        entries.add(ModItems.CHICKEN_CUTS);
                        entries.add(ModItems.COOKED_CHICKEN_CUTS);
                        entries.add(ModItems.BACON);
                        entries.add(ModItems.COOKED_BACON);
                        entries.add(ModItems.COD_SLICE);
                        entries.add(ModItems.COOKED_COD_SLICE);
                        entries.add(ModItems.SALMON_SLICE);
                        entries.add(ModItems.COOKED_SALMON_SLICE);
                        entries.add(ModItems.MUTTON_CHOPS);
                        entries.add(ModItems.COOKED_MUTTON_CHOPS);
                        entries.add(ModItems.HAM);
                        entries.add(ModItems.SMOKED_HAM);
                        entries.add(ModItems.PIE_CRUST);
                        entries.add(ModItems.CAKE_SLICE);
                        entries.add(ModItems.APPLE_PIE_SLICE);
                        entries.add(ModItems.SWEET_BERRY_CHEESECAKE_SLICE);
                        entries.add(ModItems.CHOCOLATE_PIE_SLICE);
                        entries.add(ModItems.SWEET_BERRY_COOKIE);
                        entries.add(ModItems.HONEY_COOKIE);
                        entries.add(ModItems.MELON_POPSICLE);
                        entries.add(ModItems.GLOW_BERRY_CUSTARD);
                        entries.add(ModItems.FRUIT_SALAD);
                        entries.add(ModItems.MIXED_SALAD);
                        entries.add(ModItems.NETHER_SALAD);
                        entries.add(ModItems.BARBECUE_STICK);
                        entries.add(ModItems.EGG_SANDWICH);
                        entries.add(ModItems.CHICKEN_SANDWICH);
                        entries.add(ModItems.HAMBURGER);
                        entries.add(ModItems.BACON_SANDWICH);
                        entries.add(ModItems.MUTTON_WRAP);
                        entries.add(ModItems.DUMPLINGS);
                        entries.add(ModItems.STUFFED_POTATO);
                        entries.add(ModItems.CABBAGE_ROLLS);
                        entries.add(ModItems.SALMON_ROLL);
                        entries.add(ModItems.COD_ROLL);
                        entries.add(ModItems.KELP_ROLL);
                        entries.add(ModItems.KELP_ROLL_SLICE);
                    }).build());

    public static void initialize() {
        FarmersDelight.LOGGER.info("Item Groups initialization");
    }
}
