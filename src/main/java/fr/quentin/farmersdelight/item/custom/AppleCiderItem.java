package fr.quentin.farmersdelight.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class AppleCiderItem extends Item {
    public AppleCiderItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.farmersdelight.effect.absorption_duration").formatted(Formatting.GRAY));
        tooltip.add(Text.empty());
        tooltip.add(Text.translatable("item.farmersdelight.effect.when_applied").formatted(Formatting.DARK_GRAY));
        tooltip.add(Text.translatable("item.farmersdelight.effect.max_absorption_bonus").formatted(Formatting.DARK_AQUA));
    }
}
