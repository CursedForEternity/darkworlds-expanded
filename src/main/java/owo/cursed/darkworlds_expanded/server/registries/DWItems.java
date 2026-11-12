package owo.cursed.darkworlds_expanded.server.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import owo.cursed.darkworlds_expanded.Darkworlds_expanded;

public class DWItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Darkworlds_expanded.MODID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
