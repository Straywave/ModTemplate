package straywave.minecraft.examplemod.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Mutable
    @Shadow @Final private boolean minceraftEasterEgg;

    @Inject(method = "<init>(Z)V", at = @At("RETURN"))
    private void setEasterEgg(CallbackInfo ci) {
        this.minceraftEasterEgg = true; // Minceraft!
    }
}
