package GodsMod.common.com.gods.mod;


import The_Slayer.ExtremeDesertBiome;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
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
    
   
  
    public static Block WhiteGrass = new WhiteGrass(560, 0).setUnlocalizedName("WhiteGrass").setHardness(2.0F).setStepSound(Block.soundGrassFootstep);
	public static Block WhiteDirt = new GodDirt(561, 0, "WhiteGrass_Bottom").setUnlocalizedName("WhiteDirt").setHardness(2.0F).setStepSound(Block.soundGrassFootstep);
    public static Block CrackedMossyStone = new CrackedMossy(562, Material.rock).setUnlocalizedName("CrackedMossyStone").setHardness(10.0F).setStepSound(Block.soundStoneFootstep);
    public static Block ZeusBlock = new ZeusBlock(566, Material.rock).setUnlocalizedName("ZeusBlock").setHardness(10.0F);
    
    
    public static Item Staff = new GodsItem(563, "Staff").setUnlocalizedName("Staff").setCreativeTab(GodsTab);
	public static Item Trident = new GodsItem(564, "Trident").setUnlocalizedName("Trident").setCreativeTab(GodsTab);
	public static Item LightningBolt = new Lightning(565, "LightningBolt").setUnlocalizedName("LightningBolt").setCreativeTab(GodsTab);
	
	
	
	
	
	public BiomeGenBase WhiteBiome = new WhiteBiome(40);
    
    @Init
    public void load(FMLInitializationEvent event) 
    {
		//Game Registry
		GameRegistry.registerBlock(CrackedMossyStone, "CrackedMossyStone");	
		GameRegistry.registerBlock(WhiteGrass, "White Grass");	
		GameRegistry.registerBlock(ZeusBlock, "ZeusBlock");	
		GameRegistry.registerBlock(WhiteDirt, "White Dirt");	
		GameRegistry.addBiome(WhiteBiome);
		
	
        
        // Language registry
		LanguageRegistry.addName(CrackedMossyStone, "Cracked Mossy Stone");
		LanguageRegistry.addName(Staff, "Staff");
		LanguageRegistry.addName(Trident, "Trident");
		LanguageRegistry.addName(ZeusBlock, "Zeus Block");
		LanguageRegistry.addName(WhiteGrass, "White Grass");
		LanguageRegistry.addName(WhiteDirt, "White Dirt");
		LanguageRegistry.addName(LightningBolt, "Lightning Bolt");
		LanguageRegistry.instance().addStringLocalization("itemGroup.The Gods Creative Tab", "en_US", "The Gods Mod");
		LanguageRegistry.instance().addStringLocalization("itemGroup.The Gods Creative Tab", "nl_NL", "De Goden Mod");
    }
}
