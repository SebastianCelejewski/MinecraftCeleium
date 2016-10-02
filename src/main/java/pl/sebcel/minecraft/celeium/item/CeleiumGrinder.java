package pl.sebcel.minecraft.celeium.item;

import pl.sebcel.minecraft.celeium.CeleiumMod;
import pl.sebcel.minecraft.celeium.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CeleiumGrinder extends ItemBase {

    public CeleiumGrinder(String name) {
        super(name);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (block == Blocks.GRASS || block == Blocks.GRASS_PATH || block == Blocks.DIRT)
        {
            if (!worldIn.isRemote)
            {
                worldIn.setBlockState(pos, ModBlocks.stoneDirt.getDefaultState(), 11);
                stack.damageItem(1, playerIn);
            }
            
            return EnumActionResult.SUCCESS;
        }

        if (block == ModBlocks.stoneDirt)
        {
            if (!worldIn.isRemote)
            {
                worldIn.setBlockState(pos, Blocks.STONE.getDefaultState(), 11);
                stack.damageItem(1, playerIn);
            }
            
            return EnumActionResult.SUCCESS;
        }
        
        return EnumActionResult.PASS;
    }
}