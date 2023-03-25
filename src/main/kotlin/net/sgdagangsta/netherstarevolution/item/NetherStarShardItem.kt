package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.Item
import net.minecraft.item.ItemStack

class NetherStarShardItem(settings: Settings): Item(settings) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}