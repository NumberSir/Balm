package net.blay09.mods.balm.api.event;

import net.minecraft.world.item.crafting.RecipeManager;

public class RecipesUpdatedEvent extends BalmEvent {
    private final RecipeManager recipeManager;

    public RecipesUpdatedEvent(RecipeManager recipeManager) {
        this.recipeManager = recipeManager;
    }

    public RecipeManager getRecipeManager() {
        return recipeManager;
    }
}
