package jp.ac.it_college.std.nakasone.selection.item

import jp.ac.it_college.std.nakasone.selection.Core
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.item.Item.ToolMaterial
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.common.util.EnumHelper
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder
import net.minecraftforge.oredict.OreDictionary

@ObjectHolder(Core.MOD_ID)
object ModItems {
  // material
  val material_steel: ToolMaterial = EnumHelper.addToolMaterial(
    "STEEL",  // 識別名
    3,        // 収穫レベル: 0:木 1:石 2:鉄 3:ダイヤ
    1000,     // 耐久値(最大使用回数)
    12.0f,    // 採掘速度: 2.0f:木 4.0f:石 6.0f:鉄 8.0f:ダイヤ 12.0f:金
    2.5F,     // 攻撃力: 1.0f:石 2.0f:鉄 3.0f:ダイヤ (剣は+4)
    80        // エンチャントの何か
  )

  // items
  val steel_ingot: Item = new ItemBase("steel_ingot")
  val steel_pickaxe: Item = new Pickaxe(material_steel, "steel_pickaxe")

  /**
    * アイテムを登録するイベント
    * @param event RegistryEvent.Register[Item]
    */
  def registerItems(event: RegistryEvent.Register[Item]): Unit = {
    event.getRegistry.registerAll(
      steel_ingot, steel_pickaxe
    )
  }

  /**
    * アイテムのモデルを登録するイベント
    */
  def registerItemModelResource(): Unit = {
    ModelLoader.setCustomModelResourceLocation(steel_ingot, 0,
      new ModelResourceLocation(steel_ingot.getRegistryName, "inventory"))

    ModelLoader.setCustomModelResourceLocation(steel_pickaxe, 0,
      new ModelResourceLocation(steel_pickaxe.getRegistryName, "inventory"))
  }

  /**
    * アイテムを鉱石辞書に登録するイベント
    */
  def registerOreDict(): Unit = {
    OreDictionary.registerOre("ingotSteel", steel_ingot)
  }
}
