package straywave.minecraft.examplemod.mixin;

import net.minecraft.client.gui.components.LogoRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LogoRenderer.class)
public class LogoRendererMixin {
    @Mutable
    @Shadow @Final private boolean showEasterEgg;

    @Inject(method = "<init>(Z)V", at = @At("RETURN"))
    private void setEasterEgg(CallbackInfo ci) {
        this.showEasterEgg = true; // Minceraft!
    }
}
