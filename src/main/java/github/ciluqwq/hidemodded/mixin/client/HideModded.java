package github.ciluqwq.hidemodded.mixin.client;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftClient.class)
public class HideModded {
    /**
     * @author CiLuQwQ
     * @reason
     */
    @Overwrite
    public boolean isModded() {
        return false;
    }
}
