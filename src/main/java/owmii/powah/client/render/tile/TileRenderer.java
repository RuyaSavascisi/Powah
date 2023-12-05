package owmii.powah.client.render.tile;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import owmii.powah.block.Tiles;

public class TileRenderer {
    public static void register() {
        BlockEntityRenderers.register(Tiles.CABLE.get(), CableRenderer::new);
        BlockEntityRenderers.register(Tiles.ENERGIZING_ORB.get(), EnergizingOrbRenderer::new);
        BlockEntityRenderers.register(Tiles.ENERGIZING_ROD.get(), EnergizingRodRenderer::new);
        BlockEntityRenderers.register(Tiles.FURNATOR.get(), FurnatorRenderer::new);
        BlockEntityRenderers.register(Tiles.MAGMATOR.get(), MagmatorRenderer::new);
        BlockEntityRenderers.register(Tiles.REACTOR.get(), ReactorRenderer::new);
        BlockEntityRenderers.register(Tiles.REACTOR_PART.get(), ReactorPartRenderer::new);
    }
}
