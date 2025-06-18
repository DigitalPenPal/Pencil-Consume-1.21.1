package net.pencil.consume.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class MoFoodProperties {

    public static final FoodProperties BLUEBERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();

    public static final FoodProperties POISONOUS_APPLE = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.15F)
            .effect(new MobEffectInstance(MobEffects.POISON, 160, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 220, 1), 1.0F)
            .build();

    public static final FoodProperties GOLDEN_SWEET_BERRIES = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.3F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 180, 0), 1.0F)
            .build();

    public static final FoodProperties GOLDEN_BEETROOT = new FoodProperties.Builder()
            .nutrition(3).saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 140, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 220, 0), 1.0F)
            .build();

    public static final FoodProperties GOLDEN_POTATO = new FoodProperties.Builder()
            .nutrition(5).saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 300, 0), 1.0F)
            .build();

    public static final FoodProperties CHOCOLATE = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(2.5F)
            .effect(new MobEffectInstance(MobEffects.SATURATION,160,0),1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION,120,1),0.35F)
            .build();
}

