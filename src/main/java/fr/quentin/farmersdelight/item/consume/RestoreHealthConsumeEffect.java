package fr.quentin.farmersdelight.item.consume;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.ConsumeEffect;
import net.minecraft.world.World;

public record RestoreHealthConsumeEffect(int heartsToRestore) implements ConsumeEffect {
    @Override
    public ConsumeEffect.Type<?> getType() {
        return ConsumeEffect.Type.APPLY_EFFECTS;
    }

    @Override
    public boolean onConsume(World world, ItemStack stack, LivingEntity user) {
        if (!world.isClient) {
            float currentHealth = user.getHealth();
            float maxHealth = user.getMaxHealth();
            float healthToRestore = heartsToRestore * 2;

            float newHealth = Math.min(currentHealth + healthToRestore, maxHealth);
            user.setHealth(newHealth);

            return true;
        }
        return false;
    }
}
