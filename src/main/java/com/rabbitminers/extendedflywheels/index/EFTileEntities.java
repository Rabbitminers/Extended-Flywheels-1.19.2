package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.wheel.WheelInstance;
import com.rabbitminers.extendedflywheels.wheel.WheelRenderer;
import com.rabbitminers.extendedflywheels.wheel.WheelTileEntity;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class EFTileEntities {
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate();

    // Naming Convention: [COLOUR][MATERIAL]WHEEL
    // Brass Flywheels

    // Default
    public static final BlockEntityEntry<WheelTileEntity> FLYWHEEL = REGISTRATE
            .tileEntity("flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.FLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Dyed

    public static final BlockEntityEntry<WheelTileEntity> BLACKBRASSWHEEL = REGISTRATE
            .tileEntity("black_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLACKBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GRAYBRASSWHEEL = REGISTRATE
            .tileEntity("gray_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GRAYBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_GRAYBRASSWHEEL = REGISTRATE
            .tileEntity("light_gray_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_GRAYBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> WHITEBRASSWHEEL = REGISTRATE
            .tileEntity("white_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHITEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> REDBRASSWHEEL = REGISTRATE
            .tileEntity("red_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.REDBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> ORANGEBRASSWHEEL = REGISTRATE
            .tileEntity("orange_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ORANGEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> YELLOWBRASSWHEEL = REGISTRATE
            .tileEntity("yellow_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.YELLOWBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIMEBRASSWHEEL = REGISTRATE
            .tileEntity("lime_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIMEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GREENBRASSWHEEL = REGISTRATE
            .tileEntity("green_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GREENBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> CYANBRASSWHEEL = REGISTRATE
            .tileEntity("cyan_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CYANBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_BLUEBRASSWHEEL = REGISTRATE
            .tileEntity("light_blue_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_BLUEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> BLUEBRASSWHEEL = REGISTRATE
            .tileEntity("blue_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLUEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> MAGENTABRASSWHEEL = REGISTRATE
            .tileEntity("magenta_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.MAGENTABRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PURPLEBRASSWHEEL = REGISTRATE
            .tileEntity("purple_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PURPLEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PINKBRASSWHEEL = REGISTRATE
            .tileEntity("pink_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PINKBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Steel Flywheels

    // Default
    public static final BlockEntityEntry<WheelTileEntity> STEELWHEEL = REGISTRATE
            .tileEntity("steelflywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.STEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Dyed

    public static final BlockEntityEntry<WheelTileEntity> BLACKSTEELWHEEL = REGISTRATE
            .tileEntity("black_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLACKSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GRAYSTEELWHEEL = REGISTRATE
            .tileEntity("gray_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GRAYSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_GRAYSTEELWHEEL = REGISTRATE
            .tileEntity("light_gray_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_GRAYSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> WHITESTEELWHEEL = REGISTRATE
            .tileEntity("white_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHITESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> REDSTEELWHEEL = REGISTRATE
            .tileEntity("red_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.REDSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> ORANGESTEELWHEEL = REGISTRATE
            .tileEntity("orange_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ORANGESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> YELLOWSTEELWHEEL = REGISTRATE
            .tileEntity("yellow_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.YELLOWSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIMESTEELWHEEL = REGISTRATE
            .tileEntity("lime_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIMESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GREENSTEELWHEEL = REGISTRATE
            .tileEntity("green_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GREENSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> CYANSTEELWHEEL = REGISTRATE
            .tileEntity("cyan_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CYANSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_BLUESTEELWHEEL = REGISTRATE
            .tileEntity("light_blue_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_BLUESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> BLUESTEELWHEEL = REGISTRATE
            .tileEntity("blue_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLUESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> MAGENTASTEELWHEEL = REGISTRATE
            .tileEntity("magenta_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.MAGENTASTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PURPLESTEELWHEEL = REGISTRATE
            .tileEntity("purple_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PURPLESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PINKSTEELWHEEL = REGISTRATE
            .tileEntity("pink_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PINKSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();


    // Iron Flywheels

    // Default
    public static final BlockEntityEntry<WheelTileEntity> IRONWHEEL = REGISTRATE
            .tileEntity("ironflywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.IRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Dyed

    public static final BlockEntityEntry<WheelTileEntity> BLACKIRONWHEEL = REGISTRATE
            .tileEntity("black_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLACKIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GRAYIRONWHEEL = REGISTRATE
            .tileEntity("gray_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GRAYIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_GRAYIRONWHEEL = REGISTRATE
            .tileEntity("light_gray_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_GRAYIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> WHITEIRONWHEEL = REGISTRATE
            .tileEntity("white_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHITEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> REDIRONWHEEL = REGISTRATE
            .tileEntity("red_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.REDIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> ORANGEIRONWHEEL = REGISTRATE
            .tileEntity("orange_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ORANGEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> YELLOWIRONWHEEL = REGISTRATE
            .tileEntity("yellow_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.YELLOWIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIMEIRONWHEEL = REGISTRATE
            .tileEntity("lime_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIMEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GREENIRONWHEEL = REGISTRATE
            .tileEntity("green_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GREENIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> CYANIRONWHEEL = REGISTRATE
            .tileEntity("cyan_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CYANIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_BLUEIRONWHEEL = REGISTRATE
            .tileEntity("light_blue_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_BLUEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> BLUEIRONWHEEL = REGISTRATE
            .tileEntity("blue_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLUEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> MAGENTAIRONWHEEL = REGISTRATE
            .tileEntity("magenta_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.MAGENTAIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PURPLEIRONWHEEL = REGISTRATE
            .tileEntity("purple_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PURPLEIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PINKIRONWHEEL = REGISTRATE
            .tileEntity("pink_iron_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PINKIRONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Wooden Flywheels

    // Dark Oak

    public static final BlockEntityEntry<WheelTileEntity> DARKOAKWHEEL = REGISTRATE
            .tileEntity("dark_oak_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.DARKOAKWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDDARKOAKWHEEL = REGISTRATE
            .tileEntity("dark_oak_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDDARKOAKWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();
    
    // Spruce

    public static final BlockEntityEntry<WheelTileEntity> SPRUCEWHEEL = REGISTRATE
            .tileEntity("spruce_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.SPRUCEWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDSPRUCEWHEEL = REGISTRATE
            .tileEntity("spruce_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDSPRUCEWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Oak

    public static final BlockEntityEntry<WheelTileEntity> OAKWHEEL = REGISTRATE
            .tileEntity("oak_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.OAKWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDOAKWHEEL = REGISTRATE
            .tileEntity("oak_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDOAKWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Birch

    public static final BlockEntityEntry<WheelTileEntity> BIRCHWHEEL = REGISTRATE
            .tileEntity("birch_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BIRCHWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDBIRCHWHEEL = REGISTRATE
            .tileEntity("birch_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDBIRCHWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Jungle

    public static final BlockEntityEntry<WheelTileEntity> JUNGLEWHEEL = REGISTRATE
            .tileEntity("jungle_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.JUNGLEWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDJUNGLEWHEEL = REGISTRATE
            .tileEntity("jungle_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDJUNGLEWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Acacia

    public static final BlockEntityEntry<WheelTileEntity> ACACIAWHEEL = REGISTRATE
            .tileEntity("acacia_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ACACIAWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDACACIAWHEEL = REGISTRATE
            .tileEntity("acacia_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDACACIAWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Crimson

    public static final BlockEntityEntry<WheelTileEntity> CRIMSONWHEEL = REGISTRATE
            .tileEntity("crimson_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CRIMSONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDCRIMSONWHEEL = REGISTRATE
            .tileEntity("crimson_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDCRIMSONWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Warped

    public static final BlockEntityEntry<WheelTileEntity> WARPEDWHEEL = REGISTRATE
            .tileEntity("warped_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WARPEDWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> PLATEDWARPEDWHEEL = REGISTRATE
            .tileEntity("warped_plated_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PLATEDWARPEDWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> LARGEDARKOAKFLYWHEEL = REGISTRATE
            .tileEntity("large_dark_oak_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEDARKOAKFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> LARGESPRUCEFLYWHEEL = REGISTRATE
            .tileEntity("large_spruce_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGESPRUCEFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> LARGEOAKFLYWHEEL = REGISTRATE
            .tileEntity("large_oak_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEOAKFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();


    public static final BlockEntityEntry<WheelTileEntity> LARGEBIRCHFLYWHEEL = REGISTRATE
            .tileEntity("large_birch_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEBIRCHFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();


    public static final BlockEntityEntry<WheelTileEntity> LARGEJUNGLEFLYWHEEL = REGISTRATE
            .tileEntity("large_jungle_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEJUNGLEFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();


    public static final BlockEntityEntry<WheelTileEntity> LARGEACACIAFLYWHEEL = REGISTRATE
            .tileEntity("large_acacia_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEACACIAFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();


    public static final BlockEntityEntry<WheelTileEntity> LARGECRIMSONFLYWHEEL = REGISTRATE
            .tileEntity("large_crimson_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGECRIMSONFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    public static final BlockEntityEntry<WheelTileEntity> LARGEWARPEDFLYWHEEL = REGISTRATE
            .tileEntity("large_warped_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LARGEWARPEDFLYWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static void register() {}
}
