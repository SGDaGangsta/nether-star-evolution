package net.sgdagangsta.netherstarevolution.item

import net.minecraft.item.ItemStack
import net.minecraft.item.ShovelItem
import net.minecraft.item.ToolMaterial

class NetherStarShovelItem(toolMaterial: ToolMaterial, attackDamage: Float, attackSpeed: Float, settings: Settings): ShovelItem(toolMaterial, attackDamage, attackSpeed, settings ) {

    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}