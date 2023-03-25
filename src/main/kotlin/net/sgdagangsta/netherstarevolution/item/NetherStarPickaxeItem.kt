package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.ItemStack
import net.minecraft.item.PickaxeItem
import net.minecraft.item.ToolMaterial

class NetherStarPickaxeItem(toolMaterial: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings): PickaxeItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}