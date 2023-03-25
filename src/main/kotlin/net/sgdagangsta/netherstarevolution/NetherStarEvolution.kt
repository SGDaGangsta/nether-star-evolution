package net.sgdagangsta.netherstarevolution

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.sgdagangsta.netherstarevolution.item.*


object NetherStarEvolution: ModInitializer {
    private const val MOD_ID = "netherstarevolution"

    private val ITEM_GROUP : ItemGroup = FabricItemGroupBuilder.build(Identifier(MOD_ID, "nether_star_evolution")) { ItemStack(NETHER_STAR_SHARD) }

    val NETHER_STAR_SHARD = NetherStarShardItem(FabricItemSettings().group(ITEM_GROUP))

    private val NETHER_STAR_AXE = NetherStarAxeItem(NetherStarMaterial, 6.0F, -2.0F, FabricItemSettings().group(ITEM_GROUP))
    private val NETHER_STAR_HOE = NetherStarHoeItem(NetherStarMaterial, -5, 0.0F, FabricItemSettings().group(ITEM_GROUP))
    private val NETHER_STAR_PICKAXE = NetherStarPickaxeItem(NetherStarMaterial, 2, 1F , FabricItemSettings().group(ITEM_GROUP))
    private val NETHER_STAR_SHOVEL = NetherStarShovelItem(NetherStarMaterial, 1.5F, -2.0F, FabricItemSettings().group(ITEM_GROUP))
    private val NETHER_STAR_SWORD = NetherStarSwordItem(NetherStarMaterial, 3, -1F , FabricItemSettings().group(ITEM_GROUP))

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_shard"), NETHER_STAR_SHARD)

        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_axe"), NETHER_STAR_AXE)
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_hoe"), NETHER_STAR_HOE)
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_pickaxe"), NETHER_STAR_PICKAXE)
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_shovel"), NETHER_STAR_SHOVEL)
        Registry.register(Registry.ITEM, Identifier(MOD_ID, "nether_star_sword"), NETHER_STAR_SWORD)
    }
}