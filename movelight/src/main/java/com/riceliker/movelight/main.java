package com.riceliker.movelight;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(ExampleMod.MODID)
public class main {
    @Mod.EventBusSubscriber(modid = "movelight",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents{
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event){
            MinecraftForge.EVENT_BUS.register(new PlayerPositionListener());
        }
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){}
    }

}
