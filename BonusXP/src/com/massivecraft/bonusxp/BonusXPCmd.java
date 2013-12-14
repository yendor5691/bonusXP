package com.massivecraft.bonusxp;

import java.util.List;

import com.gmail.nossr50.datatypes.skills.SkillType;
import com.massivecraft.mcore.cmd.MCommand;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;
import com.massivecraft.mcore.util.Txt;

public class BonusXPCmd extends MCommand
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //

	public BonusXPCmd()
	{
		// Requirements
		this.addRequirements(ReqIsPlayer.get());
		this.setErrorOnToManyArgs(false);
	}

	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //

	@Override
	public List<String> getAliases()
	{
		return MConf.get().aliasesBonusXP;
	}

	@Override
	public void perform()
	{
		for (SkillType skill : SkillType.values())
		{
			Double bonusxp = 100.0 * BonusXP.BonusXPCalc(me, skill);
			String bc = Txt.parse(
					"<i>You earn mcMMO XP at a rate of <h>%.0f%%<i> for <h>",
					bonusxp) + skill.getName();
			sender.sendMessage(bc);
		}
	}
}
