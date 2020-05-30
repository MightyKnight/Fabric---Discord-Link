package fr.arthurbambou.fdlink.mixin;

import fr.arthurbambou.fdlink.FDLink;
import net.minecraft.packet.ChatMessageS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatMessageS2CPacket.class)
public class MixinChatMessageS2CPacket {

    @Inject(method = "<init>(Ljava/lang/String;)V", at = @At("RETURN"))
    public void getMessage(String text_1, CallbackInfo ci) {
        FDLink.getDiscordBot().sendMessage(text_1);
    }
}
