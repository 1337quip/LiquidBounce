/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */

package net.ccbluex.liquidbounce.api.minecraft.client.settings

import net.ccbluex.liquidbounce.api.minecraft.client.entity.player.WEnumPlayerModelParts

interface IGameSettings {
    val modelParts: Set<WEnumPlayerModelParts>
    val mouseSensitivity: Float

    val keyBindAttack: IKeyBinding
    val keyBindUseItem: IKeyBinding
    val keyBindJump: IKeyBinding
    val keyBindSneak: IKeyBinding

    fun isKeyDown(key: IKeyBinding): Boolean
    fun setModelPartEnabled(modelParts: WEnumPlayerModelParts, enabled: Boolean)
}