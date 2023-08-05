package com.riceliker.movelight;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod(ExampleMod.MODID)
public class PlayerPositionListener {
    @SubscribeEvent
    public static void onPlayTick(TickEvent.PlayerTickEvent event){
        if (event.phase != TickEvent.Phase.START || event.side.isClient()) {
            return;
        }
        if (event.player == null) {
            return;
        }
        double playerX = event.player.position().x;
        double playerY = event.player.position().y;
        double playerZ = event.player.position().z;
    }
}
