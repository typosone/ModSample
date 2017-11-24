package jp.ac.it_college.std.nakasone.selection.proxy

import jp.ac.it_college.std.nakasone.selection.{CommonProxy, Core}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

class ServerProxy extends CommonProxy {
  override def preInit(event: FMLPreInitializationEvent): Unit = {
    super.preInit(event)
    Core.log.info("サーバー事前初期化")
  }

  override def init(event: FMLInitializationEvent): Unit = {
    super.init(event)
    Core.log.info("サーバー初期化")
  }

  override def postInit(event: FMLPostInitializationEvent): Unit = {
    super.postInit(event)
    Core.log.info("サーバー事後初期化")
  }
}
