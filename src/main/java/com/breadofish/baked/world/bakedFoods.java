package com.breadofish.baked.world;

import net.minecraft.world.food.FoodProperties;

public class bakedFoods {
    public static final FoodProperties BAKEDAPPLE = (new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6F).build();
    public static final FoodProperties BURNTAPPLE = (new FoodProperties.Builder()).nutrition(-7).alwaysEdible().build();

}
