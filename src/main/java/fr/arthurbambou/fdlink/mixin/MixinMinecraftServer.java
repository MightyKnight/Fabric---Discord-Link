package fr.arthurbambou.fdlink.mixin;

import fr.arthurbambou.fdlink.FDLink;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {

    @Inject(method = "<init>", at = @At("RETURN"))
    public void getServer(CallbackInfo ci) {
        FDLink.SERVER = (MinecraftServer)(Object)this;
    }
}
