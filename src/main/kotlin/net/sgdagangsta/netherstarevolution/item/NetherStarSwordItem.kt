package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial

class NetherStarSwordItem(toolMaterial: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings): SwordItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}