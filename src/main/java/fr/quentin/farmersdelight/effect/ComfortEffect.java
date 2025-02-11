package fr.quentin.farmersdelight.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class ComfortEffect extends StatusEffect {
    public ComfortEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 80 == 0;
    }

    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {
        if (!entity.hasStatusEffect(StatusEffects.REGENERATION) &&
                (!(entity instanceof PlayerEntity player) || player.getHungerManager().getSaturationLevel() <= 0.0F) &&
                entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0F);
        }
        return true;
    }
}
