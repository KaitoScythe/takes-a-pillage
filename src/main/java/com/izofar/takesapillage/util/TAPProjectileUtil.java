package com.izofar.takesapillage.util;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;

import java.util.function.Predicate;

public class TAPProjectileUtil {
    public static InteractionHand getWeaponHoldingHand(LivingEntity livingEntity, Predicate<Item> itemPredicate) {
        return itemPredicate.test(livingEntity.getMainHandItem().getItem()) ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND;
    }
}
