package fr.quentin.farmersdelight.item.consume;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.ConsumeEffect;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public record RemoveRandomEffectConsumeEffect() implements ConsumeEffect {
    @Override
    public ConsumeEffect.Type<?> getType() {
        return ConsumeEffect.Type.REMOVE_EFFECTS;
    }

    @Override
    public boolean onConsume(World world, ItemStack stack, LivingEntity user) {
        var effects = user.getStatusEffects();

        if (!effects.isEmpty()) {
            List<StatusEffectInstance> effectList = new ArrayList<>(effects);
            StatusEffectInstance randomEffect = effectList.get(world.random.nextInt(effectList.size()));
            return user.removeStatusEffect(randomEffect.getEffectType());
        }

        return false;
    }
}
