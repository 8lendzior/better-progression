package net.blendzior.betterprogression;

import net.blendzior.betterprogression.item.BetterProgressionItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterProgression implements ModInitializer {
	public static final String MOD_ID = "better-progression";
    public static final Logger LOGGER = LoggerFactory.getLogger("better-progression");

	@Override
	public void onInitialize() {
		BetterProgressionItems.registerModItems();
	}
}