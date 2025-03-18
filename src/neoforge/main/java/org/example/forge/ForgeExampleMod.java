package org.example.forge;

import net.neoforged.fml.common.Mod;
import org.example.ExampleMod;

@Mod("example")
public class ForgeExampleMod {
    public ForgeExampleMod() {
        ExampleMod.initialize();
    }
}
