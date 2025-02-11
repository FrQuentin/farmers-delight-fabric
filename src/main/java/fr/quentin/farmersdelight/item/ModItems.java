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
    public static final Item WHEAT_DOUGH = register("wheat_dough", new Item.Settings().food(ModFoodComponents.WHEAT_DOUGH, ModConsumableComponents.WHEAT_DOUGH));
    public static final Item RAW_PASTA = register("raw_pasta", new Item.Settings().food(ModFoodComponents.RAW_PASTA, ModConsumableComponents.RAW_PASTA));
    public static final Item PUMPKIN_SLICE = register("pumpkin_slice", new Item.Settings().food(ModFoodComponents.PUMPKIN_SLICE));
    public static final Item CABBAGE_LEAF = register("cabbage_leaf", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.CABBAGE_LEAF));
    public static final Item MINCED_BEEF = register("minced_beef", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.MINCED_BEEF));
    public static final Item BEEF_PATTY = register("beef_patty", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.BEEF_PATTY));
    public static final Item CHICKEN_CUTS = register("chicken_cuts", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.CHICKEN_CUTS, ModConsumableComponents.CHICKEN_CUTS));
    public static final Item COOKED_CHICKEN_CUTS = register("cooked_chicken_cuts", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COOKED_CHICKEN_CUTS));
    public static final Item BACON = register("bacon", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.BACON));
    public static final Item COOKED_BACON = register("cooked_bacon", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COOKED_BACON));
    public static final Item COD_SLICE = register("cod_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COD_SLICE));
    public static final Item COOKED_COD_SLICE = register("cooked_cod_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COOKED_COD_SLICE));
    public static final Item SALMON_SLICE = register("salmon_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.SALMON_SLICE));
    public static final Item COOKED_SALMON_SLICE = register("cooked_salmon_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COOKED_SALMON_SLICE));
    public static final Item MUTTON_CHOPS = register("mutton_chops", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.MUTTON_CHOPS));
    public static final Item COOKED_MUTTON_CHOPS = register("cooked_mutton_chops", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.COOKED_MUTTON_CHOPS));
    public static final Item HAM = register("ham", new Item.Settings().food(ModFoodComponents.HAM));
    public static final Item SMOKED_HAM = register("smoked_ham", new Item.Settings().food(ModFoodComponents.SMOKED_HAM));
    public static final Item PIE_CRUST = register("pie_crust", new Item.Settings().food(ModFoodComponents.PIE_CRUST));
    public static final Item CAKE_SLICE = register("cake_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.CAKE_SLICE, ModConsumableComponents.CAKE_SLICE));
    public static final Item APPLE_PIE_SLICE = register("apple_pie_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.APPLE_PIE_SLICE, ModConsumableComponents.APPLE_PIE_SLICE));
    public static final Item SWEET_BERRY_CHEESECAKE_SLICE = register("sweet_berry_cheesecake_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.SWEET_BERRY_CHEESECAKE_SLICE, ModConsumableComponents.SWEET_BERRY_CHEESECAKE_SLICE));
    public static final Item CHOCOLATE_PIE_SLICE = register("chocolate_pie_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.CHOCOLATE_PIE_SLICE, ModConsumableComponents.CHOCOLATE_PIE_SLICE));
    public static final Item SWEET_BERRY_COOKIE = register("sweet_berry_cookie", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.SWEET_BERRY_COOKIE));
    public static final Item HONEY_COOKIE = register("honey_cookie", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.HONEY_COOKIE));
    public static final Item MELON_POPSICLE = register("melon_popsicle", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.MELON_POPSICLE));
    public static final Item GLOW_BERRY_CUSTARD = register("glow_berry_custard", new Item.Settings().food(ModFoodComponents.GLOW_BERRY_CUSTARD, ModConsumableComponents.GLOW_BERRY_CUSTARD).maxCount(16));
    public static final Item FRUIT_SALAD = register("fruit_salad", FruitSaladItem::new, new Item.Settings().food(ModFoodComponents.FRUIT_SALAD, ModConsumableComponents.FRUIT_SALAD).maxCount(16));
    public static final Item MIXED_SALAD = register("mixed_salad", MixedSaladItem::new, new Item.Settings().food(ModFoodComponents.MIXED_SALAD, ModConsumableComponents.MIXED_SALAD).maxCount(16));
    public static final Item NETHER_SALAD = register("nether_salad", new Item.Settings().food(ModFoodComponents.NETHER_SALAD, ModConsumableComponents.NETHER_SALAD).maxCount(16));
    public static final Item BARBECUE_STICK = register("barbecue_stick", new Item.Settings().food(ModFoodComponents.BARBECUE_STICK));
    public static final Item EGG_SANDWICH = register("egg_sandwich", new Item.Settings().food(ModFoodComponents.EGG_SANDWICH));
    public static final Item CHICKEN_SANDWICH = register("chicken_sandwich", new Item.Settings().food(ModFoodComponents.CHICKEN_SANDWICH));
    public static final Item HAMBURGER = register("hamburger", new Item.Settings().food(ModFoodComponents.HAMBURGER));
    public static final Item BACON_SANDWICH = register("bacon_sandwich", new Item.Settings().food(ModFoodComponents.BACON_SANDWICH));
    public static final Item MUTTON_WRAP = register("mutton_wrap", new Item.Settings().food(ModFoodComponents.MUTTON_WRAP));
    public static final Item DUMPLINGS = register("dumplings", new Item.Settings().food(ModFoodComponents.DUMPLINGS));
    public static final Item STUFFED_POTATO = register("stuffed_potato", new Item.Settings().food(ModFoodComponents.STUFFED_POTATO));
    public static final Item CABBAGE_ROLLS = register("cabbage_rolls", new Item.Settings().food(ModFoodComponents.CABBAGE_ROLLS));
    public static final Item SALMON_ROLL = register("salmon_roll", new Item.Settings().food(ModFoodComponents.SALMON_ROLL));
    public static final Item COD_ROLL = register("cod_roll", new Item.Settings().food(ModFoodComponents.COD_ROLL));
    public static final Item KELP_ROLL = register("kelp_roll", SlowFoodItem::new, new Item.Settings().food(ModFoodComponents.KELP_ROLL));
    public static final Item KELP_ROLL_SLICE = register("kelp_roll_slice", QuickFoodItem::new, new Item.Settings().food(ModFoodComponents.KELP_ROLL_SLICE));
    public static final Item COOKED_RICE = register("cooked_rice", CookedRiceItem::new, new Item.Settings().food(ModFoodComponents.COOKED_RICE, ModConsumableComponents.COOKED_RICE));
    public static final Item BONE_BROTH = register("bone_broth",
            BoneBrothItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.BONE_BROTH, ModConsumableComponents.BONE_BROTH)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item BEEF_STEW = register("beef_stew",
            BeefStewItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.BEEF_STEW, ModConsumableComponents.BEEF_STEW)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item CHICKEN_SOUP = register("chicken_soup",
            ChickenSoupItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.CHICKEN_SOUP, ModConsumableComponents.CHICKEN_SOUP)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item VEGETABLE_SOUP = register("vegetable_soup",
            VegetableSoupItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.VEGETABLE_SOUP, ModConsumableComponents.VEGETABLE_SOUP)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item FISH_STEW = register("fish_stew",
            FishStewItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.FISH_STEW, ModConsumableComponents.FISH_STEW)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item FRIED_RICE = register("fried_rice",
            FriedRiceItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.FRIED_RICE, ModConsumableComponents.FRIED_RICE)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item PUMPKIN_SOUP = register("pumpkin_soup",
            PumpkinSoupItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.PUMPKIN_SOUP, ModConsumableComponents.PUMPKIN_SOUP)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item BAKED_COD_STEW = register("baked_cod_stew",
            BakedCodStewItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.BAKED_COD_STEW, ModConsumableComponents.BAKED_COD_STEW)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );
    public static final Item NOODLE_SOUP = register("noodle_soup",
            NoodleSoupItem::new,
            new Item.Settings()
                    .recipeRemainder(Items.BOWL)
                    .food(ModFoodComponents.NOODLE_SOUP, ModConsumableComponents.NOODLE_SOUP)
                    .useRemainder(Items.BOWL)
                    .maxCount(16)
    );

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
