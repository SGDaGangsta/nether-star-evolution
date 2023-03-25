package net.sgdagangsta.netherstarevolution

import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

object NetherStarMaterial: ToolMaterial {

    override fun getDurability(): Int {
        return 3000
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 12.0F
    }

    override fun getAttackDamage(): Float {
        return 5.0F
    }

    override fun getMiningLevel(): Int {
        return 5
    }

    override fun getEnchantability(): Int {
        return 25
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(NetherStarEvolution.NETHER_STAR_SHARD)
    }
}