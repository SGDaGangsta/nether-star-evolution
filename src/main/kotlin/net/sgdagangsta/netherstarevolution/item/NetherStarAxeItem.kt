package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.AxeItem
import net.minecraft.item.ItemStack
import net.minecraft.item.ToolMaterial

class NetherStarAxeItem(toolMaterial: ToolMaterial, attackDamage: Float, attackSpeed: Float, settings: Settings): AxeItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}