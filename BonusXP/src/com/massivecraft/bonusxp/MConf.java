package com.massivecraft.bonusxp;

import java.util.List;

import com.massivecraft.mcore.store.Entity;
import com.massivecraft.mcore.util.MUtil;

public class MConf extends Entity<MConf>
{
	// ---------------------------------------------------//
	// META
	// ---------------------------------------------------//

	protected static transient MConf i;

	public static MConf get()
	{
		return i;
	}

	// ---------------------------------------------------//
	// META
	// ---------------------------------------------------//

	public List<String> aliasesBonusXP = MUtil.list("bonusxp");
}
