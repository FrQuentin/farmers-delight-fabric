package fr.quentin.farmersdelight;

import fr.quentin.farmersdelight.item.ModItemGroups;
import fr.quentin.farmersdelight.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmersDelight implements ModInitializer {
	public static final String MOD_ID = "farmers-delight";
	public static final Logger LOGGER = LoggerFactory.getLogger("Farmer's Delight");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModItemGroups.initialize();
	}
}
