package com.SprintXXL.primitivetweaks.arri;

import com.SprintXXL.primitivetweaks.arri.custom.LogToPlanksRecipe;
import com.sprintxxl.ascentresourcerecipeindex.recipes.AscentRecipeIDs;
import com.sprintxxl.ascentresourcerecipeindex.recipes.shared.Category;
import com.sprintxxl.ascentresourcerecipeindex.recipes.types.crafting.CraftingRecipe;
import com.sprintxxl.ascentresourcerecipeindex.recipes.types.crafting.data.BasicRecipeData;
import com.sprintxxl.ascentresourcerecipeindex.recipes.types.crafting.shape.ShapedRecipe;
import com.sprintxxl.ascentresourcerecipeindex.recipes.types.custom.CustomRecipe;

import java.util.Map;

import static com.sprintxxl.ascentresourcerecipeindex.recipes.reciperesource.RecipeResource.resource;
import static com.sprintxxl.ascentresourcerecipeindex.recipes.reciperesource.RecipeResource.tag;
import static com.sprintxxl.ascentresourcerecipeindex.recipes.registry.AscentRecipeRegistry.register;
import static com.sprintxxl.ascentresourcerecipeindex.recipes.types.crafting.shape.ShapedRecipe.Pattern;
import static com.sprintxxl.ascentresourcerecipeindex.resources.definitions.ResourceCatalog.*;

public final class TweaksRecipes {

    private TweaksRecipes() {}

    public static void initTweaksRecipes() {

        // CRAFTING \\
        register(ASSEMBLE_CRAFTING_TABLE);
        register(ASSEMBLE_CHEST);
        register(ASSEMBLE_FURNACE);
        register(ASSEMBLE_HOPPER);
        register(ASSEMBLE_BUCKET);
        register(PROCESS_FLINT);
        register(PROCESS_STICK);

        // CUSTOM \\
        register(PROCESS_LOG_TO_PLANKS);
    }

    // CRAFTING \\
    public static final CraftingRecipe ASSEMBLE_CRAFTING_TABLE =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.ASSEMBLE_CRAFTING_TABLE,
                    Category.ASSEMBLY,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "FF",
                                            "LL"
                                    ),
                                    Map.of(
                                            'F', resource(FLINT),
                                            'L', tag("logWood")
                                    )
                            ),
                            resource(CRAFTING_TABLE)
                    )
            );
    public static final CraftingRecipe ASSEMBLE_CHEST =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.ASSEMBLE_CHEST,
                    Category.ASSEMBLY,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "LPL",
                                            "PFP",
                                            "LPL"
                                    ),
                                    Map.of(
                                            'L', tag("logWood"),
                                            'P', tag("plankWood"),
                                            'F', resource(FLINT)
                                    )
                            ),
                            resource(CHEST)
                    )
            );
    public static final CraftingRecipe ASSEMBLE_FURNACE =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.ASSEMBLE_FURNACE,
                    Category.ASSEMBLY,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "CFC",
                                            "F F",
                                            "CFC"
                                    ),
                                    Map.of(
                                            'C', resource(COBBLESTONE),
                                            'F', resource(FLINT)
                                    )
                            ),
                            resource(FURNACE)
                    )
            );
    public static final CraftingRecipe ASSEMBLE_HOPPER =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.ASSEMBLE_HOPPER,
                    Category.ASSEMBLY,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "P P",
                                            "PCP",
                                            " P "
                                    ),
                                    Map.of(
                                            'P', resource(IRON_PLATE),
                                            'C', resource(CHEST)
                                    )
                            ),
                            resource(HOPPER)
                    )
            );
    public static final CraftingRecipe ASSEMBLE_BUCKET =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.ASSEMBLE_BUCKET,
                    Category.ASSEMBLY,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "P P",
                                            " P "
                                    ),
                                    Map.of(
                                            'P', resource(IRON_PLATE)
                                    )
                            ),
                            resource(BUCKET)
                    )
            );
    public static final CraftingRecipe PROCESS_FLINT =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.PROCESS_FLINT,
                    Category.PROCESSING,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "G",
                                            "GG"
                                    ),
                                    Map.of(
                                            'G', resource(GRAVEL)
                                    )
                            ),
                            resource(FLINT)
                    )
            );
    public static final CraftingRecipe PROCESS_STICK =
            new CraftingRecipe(
                    AscentRecipeIDs.Tweaks.PROCESS_STICK,
                    Category.PROCESSING,
                    new BasicRecipeData(
                            new ShapedRecipe(
                                    Pattern(
                                            "P",
                                            "P"
                                    ),
                                    Map.of(
                                            'P', tag("plankWood")
                                    )
                            ),
                            resource(STICK)
                    )
            );

    // CUSTOM \\
    public static final CustomRecipe PROCESS_LOG_TO_PLANKS =
            new CustomRecipe(
                    AscentRecipeIDs.Tweaks.PROCESS_LOG_TO_PLANKS,
                    Category.PROCESSING,
                    LogToPlanksRecipe.class
            );
}
