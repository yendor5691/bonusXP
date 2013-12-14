package com.massivecraft.bonusxp;

import org.bukkit.command.CommandSender;

import com.gmail.nossr50.datatypes.skills.SkillType;
import com.massivecraft.mcore.util.PermUtil;

public enum Perm
{
	// -------------------------------------------- //
	// ENUM
	// -------------------------------------------- //
	
	PERCENT5_ACROBATICS("percent5.acrobatics"),
	PERCENT5_ARCHERY("percent5.archery"),
	PERCENT5_AXES("percent5.axes"),
	PERCENT5_EXCAVATION("percent5.excavation"),
	PERCENT5_FISHING("percent5.fishing"),
	PERCENT5_HERBALISM("percent5.herbalism"),
	PERCENT5_MINING("percent5.mining"),
	PERCENT5_REPAIR("percent5.repair"),
	PERCENT5_SMELTING("percent5.smelting"),
	PERCENT5_SWORDS("percent5.swords"),
	PERCENT5_TAMING("percent5.taming"),
	PERCENT5_UNARMED("percent5.unarmed"),
	PERCENT5_WOODCUTTING("percent5.woodcutting"),
	PERCENT10_ACROBATICS("percent10.acrobatics"),
	PERCENT10_ARCHERY("percent10.archery"),
	PERCENT10_AXES("percent10.axes"),
	PERCENT10_EXCAVATION("percent10.excavation"),
	PERCENT10_FISHING("percent10.fishing"),
	PERCENT10_HERBALISM("percent10.herbalism"),
	PERCENT10_MINING("percent10.mining"),
	PERCENT10_REPAIR("percent10.repair"),
	PERCENT10_SMELTING("percent10.smelting"),
	PERCENT10_SWORDS("percent10.swords"),
	PERCENT10_TAMING("percent10.taming"),
	PERCENT10_UNARMED("percent10.unarmed"),
	PERCENT10_WOODCUTTING("percent10.woodcutting"),
	PERCENT15_ACROBATICS("percent15.acrobatics"),
	PERCENT15_ARCHERY("percent15.archery"),
	PERCENT15_AXES("percent15.axes"),
	PERCENT15_EXCAVATION("percent15.excavation"),
	PERCENT15_FISHING("percent15.fishing"),
	PERCENT15_HERBALISM("percent15.herbalism"),
	PERCENT15_MINING("percent15.mining"),
	PERCENT15_REPAIR("percent15.repair"),
	PERCENT15_SMELTING("percent15.smelting"),
	PERCENT15_SWORDS("percent15.swords"),
	PERCENT15_TAMING("percent15.taming"),
	PERCENT15_UNARMED("percent15.unarmed"),
	PERCENT15_WOODCUTTING("percent15.woodcutting"),
	PERCENT20_ACROBATICS("percent20.acrobatics"),
	PERCENT20_ARCHERY("percent20.archery"),
	PERCENT20_AXES("percent20.axes"),
	PERCENT20_EXCAVATION("percent20.excavation"),
	PERCENT20_FISHING("percent20.fishing"),
	PERCENT20_HERBALISM("percent20.herbalism"),
	PERCENT20_MINING("percent20.mining"),
	PERCENT20_REPAIR("percent20.repair"),
	PERCENT20_SMELTING("percent20.smelting"),
	PERCENT20_SWORDS("percent20.swords"),
	PERCENT20_TAMING("percent20.taming"),
	PERCENT20_UNARMED("percent20.unarmed"),
	PERCENT20_WOODCUTTING("percent20.woodcutting"),
	PERCENT25_ACROBATICS("percent25.acrobatics"),
	PERCENT25_ARCHERY("percent25.archery"),
	PERCENT25_AXES("percent25.axes"),
	PERCENT25_EXCAVATION("percent25.excavation"),
	PERCENT25_FISHING("percent25.fishing"),
	PERCENT25_HERBALISM("percent25.herbalism"),
	PERCENT25_MINING("percent25.mining"),
	PERCENT25_REPAIR("percent25.repair"),
	PERCENT25_SMELTING("percent25.smelting"),
	PERCENT25_SWORDS("percent25.swords"),
	PERCENT25_TAMING("percent25.taming"),
	PERCENT25_UNARMED("percent25.unarmed"),
	PERCENT25_WOODCUTTING("percent25.woodcutting"),
	PERCENT30_ACROBATICS("percent30.acrobatics"),
	PERCENT30_ARCHERY("percent30.archery"),
	PERCENT30_AXES("percent30.axes"),
	PERCENT30_EXCAVATION("percent30.excavation"),
	PERCENT30_FISHING("percent30.fishing"),
	PERCENT30_HERBALISM("percent30.herbalism"),
	PERCENT30_MINING("percent30.mining"),
	PERCENT30_REPAIR("percent30.repair"),
	PERCENT30_SMELTING("percent30.smelting"),
	PERCENT30_SWORDS("percent30.swords"),
	PERCENT30_TAMING("percent30.taming"),
	PERCENT30_UNARMED("percent30.unarmed"),
	PERCENT30_WOODCUTTING("percent30.woodcutting"),
	PERCENT35_ACROBATICS("percent35.acrobatics"),
	PERCENT35_ARCHERY("percent35.archery"),
	PERCENT35_AXES("percent35.axes"),
	PERCENT35_EXCAVATION("percent35.excavation"),
	PERCENT35_FISHING("percent35.fishing"),
	PERCENT35_HERBALISM("percent35.herbalism"),
	PERCENT35_MINING("percent35.mining"),
	PERCENT35_REPAIR("percent35.repair"),
	PERCENT35_SMELTING("percent35.smelting"),
	PERCENT35_SWORDS("percent35.swords"),
	PERCENT35_TAMING("percent35.taming"),
	PERCENT35_UNARMED("percent35.unarmed"),
	PERCENT35_WOODCUTTING("percent35.woodcutting"),
	PERCENT40_ACROBATICS("percent40.acrobatics"),
	PERCENT40_ARCHERY("percent40.archery"),
	PERCENT40_AXES("percent40.axes"),
	PERCENT40_EXCAVATION("percent40.excavation"),
	PERCENT40_FISHING("percent40.fishing"),
	PERCENT40_HERBALISM("percent40.herbalism"),
	PERCENT40_MINING("percent40.mining"),
	PERCENT40_REPAIR("percent40.repair"),
	PERCENT40_SMELTING("percent40.smelting"),
	PERCENT40_SWORDS("percent40.swords"),
	PERCENT40_TAMING("percent40.taming"),
	PERCENT40_UNARMED("percent40.unarmed"),
	PERCENT40_WOODCUTTING("percent40.woodcutting"),
	PERCENT45_ACROBATICS("percent45.acrobatics"),
	PERCENT45_ARCHERY("percent45.archery"),
	PERCENT45_AXES("percent45.axes"),
	PERCENT45_EXCAVATION("percent45.excavation"),
	PERCENT45_FISHING("percent45.fishing"),
	PERCENT45_HERBALISM("percent45.herbalism"),
	PERCENT45_MINING("percent45.mining"),
	PERCENT45_REPAIR("percent45.repair"),
	PERCENT45_SMELTING("percent45.smelting"),
	PERCENT45_SWORDS("percent45.swords"),
	PERCENT45_TAMING("percent45.taming"),
	PERCENT45_UNARMED("percent45.unarmed"),
	PERCENT45_WOODCUTTING("percent45.woodcutting"),
	
	// END OF LIST
	;

	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public final String node;
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	Perm(final String node)
	{
		this.node = "bonusxp."+node;
	}
	
	// -------------------------------------------- //
	// HAS
	// -------------------------------------------- //
	
	public boolean has(CommandSender sender, boolean informSenderIfNot)
	{
		return PermUtil.has(sender, this.node, informSenderIfNot);
	}
	
	public boolean has(CommandSender sender)
	{
		return has(sender, false);
	}
	
	// -------------------------------------------- //
	// HAS - XP Perks by skill
	// -------------------------------------------- //
	public static boolean percent5(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent5." + skill.toString().toLowerCase(), false); }
	public static boolean percent10(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent10." + skill.toString().toLowerCase(), false); }
	public static boolean percent15(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent15." + skill.toString().toLowerCase(), false); }
	public static boolean percent20(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent20." + skill.toString().toLowerCase(), false); }
	public static boolean percent25(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent25." + skill.toString().toLowerCase(), false); }
	public static boolean percent30(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent30." + skill.toString().toLowerCase(), false); }
	public static boolean percent35(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent35." + skill.toString().toLowerCase(), false); }
	public static boolean percent40(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent40." + skill.toString().toLowerCase(), false); }
	public static boolean percent45(CommandSender sender, SkillType skill) { return PermUtil.has(sender, "bonusxp.percent45." + skill.toString().toLowerCase(), false); }
	
}