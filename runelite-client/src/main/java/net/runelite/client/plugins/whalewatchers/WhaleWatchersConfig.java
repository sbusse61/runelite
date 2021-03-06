package net.runelite.client.plugins.whalewatchers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("WhaleWatchers")
public interface WhaleWatchersConfig extends Config
{

	@ConfigItem(
		position = 1,
		keyName = "protectItemWarning",
		name = "Protect Item Warning",
		description = "Warns you when you are skulled and don't have protect item turned on."
	)
	default boolean protectItemWarning()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "showDamageCounter",
		name = "Damage Counter",
		description = "Shows damage you've done and damage your opponent has done to you while in a fight"
	)
	default boolean showDamageCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "smiteableWarning",
		name = "Smite Warning",
		description = "Displays a warning overlay when your prayer is at a smiteable level"
	)
	default boolean smiteableWarning()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "gloryWarning",
		name = "Glory Warning",
		description = "Displays a warning box while you are wearing an uncharged glory"
	)
	default boolean gloryWarning()
	{
		return true;
	}
}
