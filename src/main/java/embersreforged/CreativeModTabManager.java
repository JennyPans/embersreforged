package embersreforged;

import embersreforged.common.item.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModTabManager {

    public static final CreativeModeTab EMBERS_REFORGED_TAB = new CreativeModeTab("embersReforgedTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.INFUSED_SHARD.get());
        }
    };
}
