package com.gods.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = GodsMod.modid, name = "Gods Mod", version = "0.0.1 Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GodsMod 
{
    public static final String modid = "Gods_GodsMod";
    
    public static CreativeTabs GodsTab = new GodTab("The Gods Creative Tab");
    
    
    public static EnumToolMaterial EnumToolMaterialLightning = EnumHelper.addToolMaterial("Lightning", 3, 5000, 30.0F, 20, 19);
    
    
    public static Block CrackedMossyStone = new CrackedMossy(253, Material.rock).setUnlocalizedName("CrackedMossyStone").setHardness(10.0F).setStepSound(Block.soundWoodFootstep);
    public static Item Staff = new GodsItem(254, "Staff").setUnlocalizedName("Staff").setCreativeTab(GodsTab);
	public static Item Trident = new GodsItem(255, "Trident").setUnlocalizedName("Trident").setCreativeTab(GodsTab);
	public static Item LightningBolt = new Lightning(256, "LightningBolt").setUnlocalizedName("LightningBolt").setCreativeTab(GodsTab);
    
    
    
    
    @Init
    public void load(FMLInitializationEvent event) 
    {
		//Game Registry
		GameRegistry.registerBlock(CrackedMossyStone, "CrackedMossyStone");	
       
        
        // Language registry
		LanguageRegistry.addName(CrackedMossyStone, "Cracked Mossy Stone");
		LanguageRegistry.addName(Staff, "Staff");
		LanguageRegistry.addName(Trident, "Trident");
		LanguageRegistry.addName(LightningBolt, "Lightning Bolt");
		LanguageRegistry.instance().addStringLocalization("itemGroup.The Gods Creative Tab", "en_US", "The Gods Mod");
    }
}
