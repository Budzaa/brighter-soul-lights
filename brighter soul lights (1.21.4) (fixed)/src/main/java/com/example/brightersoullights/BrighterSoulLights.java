package com.example.brightersoullights;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.TorchBlock;

public class BrighterSoulLights implements ModInitializer {
    @Override
    public void onInitialize() {
        // Adjust luminance for 1.21.4
        ((TorchBlock)Blocks.SOUL_TORCH).getDefaultState()
            .getBlock()
            .settings()
            .luminance(state -> 14);
        ((LanternBlock)Blocks.SOUL_LANTERN).getDefaultState()
            .getBlock()
            .settings()
            .luminance(state -> 15);
        ((CampfireBlock)Blocks.SOUL_CAMPFIRE).getDefaultState()
            .getBlock()
            .settings()
            .luminance(state -> 15);
    }
}