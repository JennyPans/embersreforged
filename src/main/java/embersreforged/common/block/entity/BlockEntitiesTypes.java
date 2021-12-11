package embersreforged.common.block.entity;

import embersreforged.EmbersReforged;
import embersreforged.common.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntitiesTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, EmbersReforged.MODID);
    public static final RegistryObject<BlockEntityType<ElectricFurnaceBlockEntity>> ELECTRIC_FURNACE = BLOCKS_ENTITIES.register("electric_furnace",
            () -> BlockEntityType.Builder.of(ElectricFurnaceBlockEntity::new, Blocks.ELECTRIC_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCKS_ENTITIES.register(eventBus);
    }
}
