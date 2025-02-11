package fr.quentin.farmersdelight.effect;

import fr.quentin.farmersdelight.FarmersDelight;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final RegistryEntry<StatusEffect> COMFORT = register("comfort", new ComfortEffect(StatusEffectCategory.BENEFICIAL, 0xE3D26F));

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(FarmersDelight.MOD_ID, id), statusEffect);
    }

    public static void initialize() {
        FarmersDelight.LOGGER.info("Status Effects initialization");
    }
}
