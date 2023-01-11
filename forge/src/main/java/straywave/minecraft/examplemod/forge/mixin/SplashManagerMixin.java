package straywave.minecraft.examplemod.forge.mixin;

import net.minecraft.client.resources.SplashManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashManager.class)
public class SplashManagerMixin {
    @Inject(method = "getSplash", at = @At("HEAD"), cancellable = true)
    private void setSplash(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("§9ExampleMod Forge!");
    }
}
