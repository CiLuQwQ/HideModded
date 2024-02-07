package github.ciluqwq.hidemodded.mixin.client;

import net.minecraft.util.ModStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;

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
