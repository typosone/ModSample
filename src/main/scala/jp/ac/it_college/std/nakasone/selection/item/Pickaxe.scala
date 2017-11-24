package jp.ac.it_college.std.nakasone.selection.item

import jp.ac.it_college.std.nakasone.selection.Core
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemPickaxe

class Pickaxe(_material: ToolMaterial, _name: String)
  extends ItemPickaxe(_material) {

  protected val name: String = _name
  setUnlocalizedName(name)
  setRegistryName(name)
  setCreativeTab(Core.CREATIVE_TAB)
}
