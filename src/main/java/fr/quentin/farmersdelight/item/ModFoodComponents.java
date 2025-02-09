package fr.quentin.farmersdelight.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4F).build();
    public static final FoodComponent MILK_BOTTLE = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent HOT_COCOA = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent APPLE_CIDER = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent MELON_JUICE = new FoodComponent.Builder().alwaysEdible().build();
    public static final FoodComponent TOMATO_SAUCE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4F).build();
}
