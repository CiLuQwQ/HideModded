package github.ciluqwq.hidemodded.mixin.client;

import net.minecraft.util.ModStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
@Mixin(ModStatus.class)
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
