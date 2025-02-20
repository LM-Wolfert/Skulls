/*
 * Skulls
 * Copyright 2022 Kiran Hart
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ca.tweetzy.skulls.settings;

import ca.tweetzy.flight.comp.enums.CompMaterial;
import ca.tweetzy.flight.config.ConfigEntry;
import ca.tweetzy.flight.settings.FlightSettings;
import ca.tweetzy.skulls.Skulls;
import lombok.SneakyThrows;

/**
 * Date Created: April 04 2022
 * Time Created: 9:22 p.m.
 *
 * @author Kiran Hart
 */
public final class Settings extends FlightSettings {

	public static final ConfigEntry LANG = create("language", "english").withComment("Default language file");
	public static final ConfigEntry PREFIX = create("prefix", "<GRADIENT:DD5E89>&lSkulls</GRADIENT:fbc7d4>&r &8»").withComment("Prefix to be used in chat");
	public static final ConfigEntry CHARGE_FOR_HEADS = create("charge for heads", true).withComment("Should skulls charge users without permission for heads?");
	public static final ConfigEntry ECONOMY = create("economy", "Vault").withComment("You can use Vault or Item");
	public static final ConfigEntry ITEM_ECONOMY_ITEM = create("item economy item", CompMaterial.GOLD_INGOT.name());
	public static final ConfigEntry MAIN_MENU_REQUIRES_NO_PERM = create("main menu requires no permission", true);
	public static final ConfigEntry GENERAL_USAGE_REQUIRES_NO_PERM = create("general usage requires no permission", false, "If true, no permission is required to use except for admin stuff");
	public static final ConfigEntry TELL_OP_PATREON_LINK = create("tell ops patron on join", true);

	public static final ConfigEntry CATEGORIES_ALPHABET_ENABLED = create("enabled categories.alphabet", true);
	public static final ConfigEntry CATEGORIES_ANIMALS_ENABLED = create("enabled categories.animals", true);
	public static final ConfigEntry CATEGORIES_BLOCKS_ENABLED = create("enabled categories.blocks", true);
	public static final ConfigEntry CATEGORIES_DECORATION_ENABLED = create("enabled categories.decoration", true);
	public static final ConfigEntry CATEGORIES_FOOD_AND_DRINKS_ENABLED = create("enabled categories.food and drinks", true);
	public static final ConfigEntry CATEGORIES_HUMANS_ENABLED = create("enabled categories.humans", true);
	public static final ConfigEntry CATEGORIES_HUMANOID_ENABLED = create("enabled categories.humanoids", true);
	public static final ConfigEntry CATEGORIES_MISC_ENABLED = create("enabled categories.misc", true);
	public static final ConfigEntry CATEGORIES_MONSTERS_ENABLED = create("enabled categories.monsters", true);
	public static final ConfigEntry CATEGORIES_PLANTS_ENABLED = create("enabled categories.plants", true);

	public static final ConfigEntry PLAYER_HEAD_NAME = create("player head.name", "&e%player_name%");
	public static final ConfigEntry PLAYER_HEAD_DROP = create("player head.drop enabled", true);
	public static final ConfigEntry PLAYER_HEAD_DROP_CHANCE = create("player head.drop chance", 50);

	/*
	==================== GUI END ====================
	 */
	public static final ConfigEntry GUI_MAIN_ITEMS_ALPHABET_SLOT = create("gui.main.items.alphabet.slot", 11);
	public static final ConfigEntry GUI_MAIN_ITEMS_ANIMALS_SLOT = create("gui.main.items.animals.slot", 12);
	public static final ConfigEntry GUI_MAIN_ITEMS_BLOCKS_SLOT = create("gui.main.items.blocks.slot", 13);
	public static final ConfigEntry GUI_MAIN_ITEMS_DECORATION_SLOT = create("gui.main.items.decoration.slot", 14);
	public static final ConfigEntry GUI_MAIN_ITEMS_FOOD_AND_DRINKS_SLOT = create("gui.main.items.food and drinks.slot", 15);
	public static final ConfigEntry GUI_MAIN_ITEMS_HUMANS_SLOT = create("gui.main.items.humans.slot", 20);
	public static final ConfigEntry GUI_MAIN_ITEMS_HUMANOID_SLOT = create("gui.main.items.humanoids.slot", 21);
	public static final ConfigEntry GUI_MAIN_ITEMS_MISC_SLOT = create("gui.main.items.misc.slot", 22);
	public static final ConfigEntry GUI_MAIN_ITEMS_MONSTERS_SLOT = create("gui.main.items.monsters.slot", 23);
	public static final ConfigEntry GUI_MAIN_ITEMS_PLANTS_SLOT = create("gui.main.items.plants.slot", 24);


	public static final ConfigEntry DEFAULT_PRICES_ALPHABET = create("default prices.alphabet", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_ANIMALS = create("default prices.animals", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_BLOCKS = create("default prices.blocks", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_DECORATION = create("default prices.decoration", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_FOOD_AND_DRINKS = create("default prices.food and drinks", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_HUMANS = create("default prices.humans", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_HUMANOID = create("default prices.humanoids", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_MISC = create("default prices.misc", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_MONSTERS = create("default prices.monsters", 1.0);
	public static final ConfigEntry DEFAULT_PRICES_PLANTS = create("default prices.plants", 1.0);

	@SneakyThrows
	public static void setup() {
		Skulls.getCoreConfig().init();
	}
}
