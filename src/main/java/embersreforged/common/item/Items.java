package embersreforged.common.item;

import embersreforged.EmbersReforged;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmbersReforged.MODID);
	public static final RegistryObject<Item> INFUSED_SHARD = ITEMS.register("infused_shard", 
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
