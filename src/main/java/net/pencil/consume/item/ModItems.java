package net.pencil.consume.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pencil.consume.Consume;



public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Consume.MOD_ID);

    public static final DeferredItem<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
