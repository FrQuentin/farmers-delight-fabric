package fr.quentin.farmersdelight.component.type;

import fr.quentin.farmersdelight.item.consume.*;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModConsumableComponents extends ConsumableComponents {
    public static final ConsumableComponent MILK_BOTTLE = drink().consumeEffect(new RemoveRandomEffectConsumeEffect()).build();
    public static final ConsumableComponent HOT_COCOA = drink().consumeEffect(new RemoveNegativeEffectConsumeEffect()).build();
    public static final ConsumableComponent APPLE_CIDER = drink()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0))
            ).build();
    public static final ConsumableComponent MELON_JUICE = drink().consumeEffect(new RestoreHealthConsumeEffect(1)).build();
    public static final ConsumableComponent WHEAT_DOUGH = food().consumeEffect(new ApplyEffectsConsumeEffect(
            new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F))
            .build();
    public static final ConsumableComponent RAW_PASTA = food().consumeEffect(new ApplyEffectsConsumeEffect(
                    new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F))
            .build();
    public static final ConsumableComponent CHICKEN_CUTS = food().consumeEffect(new ApplyEffectsConsumeEffect(
                    new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F))
            .build();
}
