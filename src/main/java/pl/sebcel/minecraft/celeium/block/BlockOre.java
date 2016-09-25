package pl.sebcel.minecraft.celeium.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import pl.sebcel.minecraft.celeium.item.ModItems;

public class BlockOre extends BlockBase {
    
    private Item drop;

    public BlockOre(String name, float hardness, float resistance, Item drop) {
        super(Material.ROCK, name);
        setHardness(hardness);
        setResistance(resistance);
        this.drop = drop;
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        System.out.println("Block is destroyed");
        super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(drop, 1));
        return drops;        
    }
}