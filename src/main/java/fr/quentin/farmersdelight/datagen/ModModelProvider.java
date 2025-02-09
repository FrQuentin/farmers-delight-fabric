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
    }
}
