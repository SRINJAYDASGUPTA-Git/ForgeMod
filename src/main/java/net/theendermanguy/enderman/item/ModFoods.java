package net.theendermanguy.enderman.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.8F).build();
    public static final FoodProperties HAMBURGER = (new FoodProperties.Builder()).nutrition(5).saturationMod(4F).build();

}
