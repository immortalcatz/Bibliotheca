package com.ewyboy.bibliotheca.proxy;

import com.ewyboy.bibliotheca.client.InternalModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {

    @Override
    public Side getSide() { return Side.CLIENT; }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        InternalModelLoader.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
