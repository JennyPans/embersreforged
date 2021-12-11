package embersreforged.common.item;

import embersreforged.Tabs;
import embersreforged.EmbersReforged;
import embersreforged.common.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmbersReforged.MODID);
    public static final RegistryObject<Item> INFUSED_SHARD = ITEMS.register("infused_shard", () -> new Item(new Item.Properties().tab(Tabs.EMBERS_REFORGED_TAB)));
    public static final RegistryObject<BlockItem> ELECTRIC_FURNACE = ITEMS.register("electric_furnace", () -> new BlockItem(Blocks.ELECTRIC_FURNACE.get(), new Item.Properties().tab(Tabs.EMBERS_REFORGED_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
