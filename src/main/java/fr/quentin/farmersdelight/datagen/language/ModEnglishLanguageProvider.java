package fr.quentin.farmersdelight.datagen.language;

import fr.quentin.farmersdelight.item.ModItemGroups;
import fr.quentin.farmersdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CABBAGE, "Cabbage");
        translationBuilder.add(ModItems.TOMATO, "Tomato");
        translationBuilder.add(ModItems.ONION, "Onion");
        translationBuilder.add(ModItems.FRIED_EGG, "Fried Egg");
        translationBuilder.add(ModItems.MILK_BOTTLE, "Milk Bottle");
        translationBuilder.add(ModItems.HOT_COCOA, "Hot Cocoa");
        translationBuilder.add(ModItems.APPLE_CIDER, "Apple Cider");
        translationBuilder.add(ModItems.MELON_JUICE, "Melon Juice");
        translationBuilder.add(ModItems.TOMATO_SAUCE, "Tomato Sauce");
        translationBuilder.add(ModItems.WHEAT_DOUGH, "Wheat Dough");
        translationBuilder.add(ModItems.RAW_PASTA, "Raw Pasta");
        translationBuilder.add(ModItems.PUMPKIN_SLICE, "Pumpkin Slice");
        translationBuilder.add(ModItems.CABBAGE_LEAF, "Cabbage Leaf");
        translationBuilder.add(ModItems.MINCED_BEEF, "Minced Beef");
        translationBuilder.add(ModItems.BEEF_PATTY, "Beef Patty");
        translationBuilder.add(ModItems.CHICKEN_CUTS, "Raw Chicken Cuts");
        translationBuilder.add(ModItems.COOKED_CHICKEN_CUTS, "Cooked Chicken Cuts");
        translationBuilder.add(ModItems.BACON, "Raw Bacon");
        translationBuilder.add(ModItems.COOKED_BACON, "Cooked Bacon");
        translationBuilder.add(ModItems.COD_SLICE, "Raw Cod Slice");
        translationBuilder.add(ModItems.COOKED_COD_SLICE, "Cooked Cod Slice");
        translationBuilder.add(ModItems.SALMON_SLICE, "Raw Salmon Slice");
        translationBuilder.add(ModItems.COOKED_SALMON_SLICE, "Cooked Salmon Slice");
        translationBuilder.add(ModItems.MUTTON_CHOPS, "Raw Mutton Chops");
        translationBuilder.add(ModItems.COOKED_MUTTON_CHOPS, "Cooked Mutton Chops");
        translationBuilder.add(ModItems.HAM, "Ham");
        translationBuilder.add(ModItems.SMOKED_HAM, "Smoked Ham");

        translationBuilder.add("item.farmersdelight.milk_bottle.tooltip", "Clears one status effect when consumed");
        translationBuilder.add("item.farmersdelight.hot_cocoa.tooltip", "Removes one harmful status effect when consumed");
        translationBuilder.add("item.farmersdelight.effect.absorption_duration", "Absorption: (01:00)");
        translationBuilder.add("item.farmersdelight.effect.when_applied", "When Applied:");
        translationBuilder.add("item.farmersdelight.effect.max_absorption_bonus", "+4 Max Absorption");
        translationBuilder.add("item.farmersdelight.melon_juice.tooltip", "Restores 1 heart when consumed");

        translationBuilder.add(ModItemGroups.FARMERS_DELIGHT.getDisplayName().getString(), "Farmer's Delight");
    }
}
