package jp.ac.it_college.std.nakasone.selection

import jp.ac.it_college.std.nakasone.selection.item.ModItems
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Items
import net.minecraft.item.{Item, ItemStack}
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod.{EventBusSubscriber, EventHandler}
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import org.apache.logging.log4j.LogManager

@Mod(modid = Core.MOD_ID, name = Core.NAME, version = Core.VERSION, modLanguage = "scala")
@EventBusSubscriber
object Core {
  final val MOD_ID = "selection"
  final val NAME = "はじめてのもっぢんｇ"
  final val VERSION = "0.1"
  final val CLIENT_PROXY = "jp.ac.it_college.std.nakasone.selection.proxy.ClientProxy"
  final val SERVER_PROXY = "jp.ac.it_college.std.nakasone.selection.proxy.ServerProxy"
  final val log = LogManager.getLogger(Core.MOD_ID)

  val CREATIVE_TAB: CreativeTabs = new CreativeTabs("selection") {
    override def getTabIconItem: ItemStack = Items.CHICKEN.getDefaultInstance
  }

  @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY, modId = MOD_ID)
  var proxy: CommonProxy = _

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    proxy.preInit(event)
  }

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    proxy.init(event)
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent): Unit = {
    proxy.postInit(event)
  }

  @SubscribeEvent
  def registerItems(event: RegistryEvent.Register[Item]): Unit = {
    ModItems.registerItems(event)
  }

  @SubscribeEvent
  def registerModel(event: ModelRegistryEvent): Unit = {
    ModItems.registerItemModelResource
  }
}
