package jp.ac.it_college.std.nakasone.selection.item

import jp.ac.it_college.std.nakasone.selection.Core
import net.minecraft.item.Item

class ItemBase(_name: String) extends Item {
  protected val name: String = _name
  setUnlocalizedName(name)
  setRegistryName(name)
  setCreativeTab(Core.CREATIVE_TAB)
}
