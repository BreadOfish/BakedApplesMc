package com.breadofish.baked.items;
import com.breadofish.baked.baked;
import com.breadofish.baked.world.bakedFoods;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

//Link to NeoForge documentation on items: https://docs.neoforged.net/docs/items/
public class bakedItems {
    //Create the Differed register to pass along the items to NeoForge
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(baked.MODID);

    //Defining items:
    public static final DeferredItem<Item> BAKEDAPPLE = ITEMS.register("bakedapple",
            () -> new Item(new Item.Properties().food(bakedFoods.BAKEDAPPLE)));
    public static final DeferredItem<Item> BURNTAPPLE = ITEMS.register("burntapple",
            () -> new Item(new Item.Properties().food(bakedFoods.BURNTAPPLE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
