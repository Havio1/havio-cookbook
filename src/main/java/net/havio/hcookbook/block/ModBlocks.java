package net.havio.hcookbook.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.havio.hcookbook.HavioCookbook;
import net.minecraft.block.Block;
import net.minecraft.block.CauldronBlock;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MUSHROOM_STEW_CAULDRON = registerBlock("mushroom_stew_cauldron",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(HavioCookbook.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        HavioCookbook.LOGGER.debug("Registering ModBlocks for " + HavioCookbook.MOD_ID);
    }
}
