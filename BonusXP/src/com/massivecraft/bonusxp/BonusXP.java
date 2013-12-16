package com.massivecraft.bonusxp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

import com.gmail.nossr50.datatypes.skills.SkillType;
import com.gmail.nossr50.events.experience.McMMOPlayerXpGainEvent;
import com.gmail.nossr50.util.Misc;
import com.gmail.nossr50.util.Permissions;
import com.massivecraft.mcore.MPlugin;

public class BonusXP extends MPlugin
{

	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //

	private static BonusXP i;

	public static BonusXP get()
	{
		return i;
	}

	public BonusXP()
	{
		BonusXP.i = this;
	}

	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //

	// Commands
	private BonusXPCmd bonusxp;

	public BonusXPCmd getbonusxp()
	{
		return this.bonusxp;
	}

	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //

	@Override
	public void onEnable()
	{
		if (!preEnable()) return;

		// Collections
		MConfColl.get().init();

		// Commands
		this.bonusxp = new BonusXPCmd();
		this.bonusxp.register();

		postEnable();
	}

	// -------------------------------------------- //
	// LISTENER
	// -------------------------------------------- //

	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
	public void onMcMMOPlayerXPGain(McMMOPlayerXpGainEvent event)
	{
		Player player = event.getPlayer();
		SkillType skill = event.getSkill();

		// Must be a player with the corresponding mcMMO Skill enabled
		if (Misc.isNPCEntity(player)
				|| !Permissions.skillEnabled(player, skill)) return;

		float bonusMult;
		if ((bonusMult = BonusXPCalc(player, skill)) > 1.46) return;
		event.setRawXpGained(event.getRawXpGained() * bonusMult);

		return;

	}

	public static float BonusXPCalc(Player player, SkillType skill)
	{
		if (skill == null)
		{
			return (float) 1.0;
		}
		if (Permissions.quadrupleXp(player, skill))
		{
			return (float) 4.0;
		}
		if (Permissions.tripleXp(player, skill))
		{
			return (float) 3.0;
		}
		if (Permissions.doubleAndOneHalfXp(player, skill))
		{
			return (float) 2.5;
		}
		if (Permissions.doubleXp(player, skill))
		{
			return (float) 2.0;
		}
		if (Permissions.oneAndOneHalfXp(player, skill))
		{
			return (float) 1.5;
		}
		if (Perm.percent45(player, skill))
		{
			return (float) 1.45;
		}
		if (Perm.percent40(player, skill))
		{
			return (float) 1.40;
		}
		if (Perm.percent35(player, skill))
		{
			return (float) 1.35;
		}
		if (Perm.percent30(player, skill))
		{
			return (float) 1.30;
		}
		if (Perm.percent25(player, skill))
		{
			return (float) 1.25;
		}
		if (Perm.percent20(player, skill))
		{
			return (float) 1.20;
		}
		if (Perm.percent15(player, skill))
		{
			return (float) 1.15;
		}
		if (Perm.percent10(player, skill))
		{
			return (float) 1.10;
		}
		if (Perm.percent5(player, skill))
		{
			return (float) 1.05;
		}
		return (float) 1.0;
	}
}
