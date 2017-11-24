package jp.ac.it_college.std.nakasone.selection

import jp.ac.it_college.std.nakasone.selection.Core.log
import jp.ac.it_college.std.nakasone.selection.item.ModItems
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}

class CommonProxy {
  def preInit(event: FMLPreInitializationEvent): Unit = {
    log.info("事前初期化")
    // register ore dict
    ModItems.registerOreDict()
  }

  def init(event: FMLInitializationEvent): Unit = {
    log.info("しょきか")
  }

  def postInit(event: FMLPostInitializationEvent): Unit = {
    log.info("事後初期化")
  }

}
