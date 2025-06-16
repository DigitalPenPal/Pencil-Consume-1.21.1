package net.pencil.consume.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pencil.consume.Consume;
import net.pencil.consume.item.custom.sweet_berry_juice;


public class MoItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Consume.MOD_ID);

    public static final DeferredItem<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new Item(new Item.Properties().food(MoFoodProperties.BLUEBERRIES)));

    public static final DeferredItem<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice",
            () -> new sweet_berry_juice(new Item.Properties()));

    public static final DeferredItem<Item> GOLDEN_SWEET_BERRIES = ITEMS.register("golden_sweet_berries",
            () -> new Item(new Item.Properties().food(MoFoodProperties.GOLDEN_SWEET_BERRIES)));

    public static final DeferredItem<Item> GOLDEN_BEETROOT = ITEMS.register("golden_beetroot",
            () -> new Item(new Item.Properties().food(MoFoodProperties.GOLDEN_BEETROOT)));

    public static final DeferredItem<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item(new Item.Properties().food(MoFoodProperties.GOLDEN_POTATO)));

    public static final DeferredItem<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(MoFoodProperties.CHOCOLATE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
