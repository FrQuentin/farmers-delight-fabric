package fr.quentin.farmersdelight.item;

import fr.quentin.farmersdelight.FarmersDelight;
import fr.quentin.farmersdelight.component.type.ModConsumableComponents;
import fr.quentin.farmersdelight.item.custom.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item CABBAGE = register("cabbage", new Item.Settings().food(ModFoodComponents.CABBAGE));
    public static final Item TOMATO = register("tomato", new Item.Settings().food(ModFoodComponents.TOMATO));
    public static final Item ONION = register("onion", new Item.Settings().food(ModFoodComponents.ONION));
    public static final Item FRIED_EGG = register("fried_egg", new Item.Settings().food(ModFoodComponents.FRIED_EGG));
    public static final Item MILK_BOTTLE = register("milk_bottle",
            MilkBottleItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoodComponents.MILK_BOTTLE, ModConsumableComponents.MILK_BOTTLE)
                    .useRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16)
    );
    public static final Item HOT_COCOA = register("hot_cocoa",
            HotCocoaItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoodComponents.HOT_COCOA, ModConsumableComponents.HOT_COCOA)
                    .useRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16)
    );
    public static final Item APPLE_CIDER = register("apple_cider",
            AppleCiderItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoodComponents.APPLE_CIDER, ModConsumableComponents.APPLE_CIDER)
                    .useRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16)
    );
    public static final Item MELON_JUICE = register("melon_juice",
            MelonJuiceItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoodComponents.MELON_JUICE, ModConsumableComponents.MELON_JUICE)
                    .useRemainder(Items.GLASS_BOTTLE)
                    .maxCount(16)
    );
    public static final Item TOMATO_SAUCE = register("tomato_sauce", new Item.Settings().food(ModFoodComponents.TOMATO_SAUCE).useRemainder(Items.BOWL));

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FarmersDelight.MOD_ID, id));
    }

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    public static Item register(String id, Item.Settings settings) {
        return register(keyOf(id), Item::new, settings);
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void initialize() {
        FarmersDelight.LOGGER.info("Items initialization");
    }
}
