package embersreforged;

import embersreforged.common.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EmbersReforged.MODID)
public class EmbersReforged {
	
	public static final String MODID = "embersreforged";
	
	public EmbersReforged() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		Items.register(eventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
