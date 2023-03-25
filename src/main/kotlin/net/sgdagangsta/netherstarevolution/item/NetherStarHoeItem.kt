package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.HoeItem
import net.minecraft.item.ItemStack
import net.minecraft.item.ToolMaterial

class NetherStarHoeItem(toolMaterial: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings): HoeItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}