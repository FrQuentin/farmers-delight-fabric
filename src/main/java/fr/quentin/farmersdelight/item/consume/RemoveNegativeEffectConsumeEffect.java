package fr.quentin.farmersdelight.item.consume;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.ConsumeEffect;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public record RemoveNegativeEffectConsumeEffect() implements ConsumeEffect {
    @Override
    public ConsumeEffect.Type<?> getType() {
        return ConsumeEffect.Type.REMOVE_EFFECTS;
    }

    @Override
    public boolean onConsume(World world, ItemStack stack, LivingEntity user) {
        var effects = user.getStatusEffects();

        List<StatusEffectInstance> negativeEffects = new ArrayList<>();
        for (StatusEffectInstance effect : effects) {
            if (!effect.getEffectType().value().isBeneficial()) {
                negativeEffects.add(effect);
            }
        }
        if (!negativeEffects.isEmpty()) {
            StatusEffectInstance randomNegativeEffect = negativeEffects.get(world.random.nextInt(negativeEffects.size()));
            return user.removeStatusEffect(randomNegativeEffect.getEffectType());
        }

        return false;
    }
}
