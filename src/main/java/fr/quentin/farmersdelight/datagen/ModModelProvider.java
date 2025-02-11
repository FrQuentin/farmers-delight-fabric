package fr.quentin.farmersdelight.datagen;

import fr.quentin.farmersdelight.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CABBAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILK_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_COCOA, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_CIDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELON_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHEAT_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PASTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINCED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_CUTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CHICKEN_CUTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_COD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SALMON_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTTON_CHOPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_MUTTON_CHOPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKED_HAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIE_CRUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_CHEESECAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELON_POPSICLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_CUSTARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRUIT_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIXED_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTTON_WRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUMPLINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_ROLLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COD_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.KELP_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.KELP_ROLL_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_BROTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_COD_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOODLE_SOUP, Models.GENERATED);
    }
}
