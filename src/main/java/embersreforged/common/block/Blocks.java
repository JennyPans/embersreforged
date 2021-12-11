package embersreforged.common.block;

import embersreforged.EmbersReforged;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EmbersReforged.MODID);
    public static final RegistryObject<Block> ELECTRIC_FURNACE = BLOCKS.register(
            "electric_furnace",
            () -> new ElectricFurnaceBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER))
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
