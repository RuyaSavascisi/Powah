package owmii.powah.lib.client.wiki.page.panel;

import java.util.List;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import owmii.powah.lib.client.screen.Texture;
import owmii.powah.lib.client.screen.wiki.WikiScreen;
import owmii.powah.lib.client.util.Text;
import owmii.powah.lib.client.wiki.Section;

public class EnergyPanel<T extends ItemLike> extends ItemPanel<T> {
    public EnergyPanel(Section parent) {
        super(parent);
    }

    public EnergyPanel(T item, Section parent) {
        super(item, parent);
    }

    public EnergyPanel(List<T> items, Section parent) {
        super(items, parent);
    }

    public EnergyPanel(ItemLike[] items, Section parent) {
        super(items, parent);
    }

    @Override
    public void render(GuiGraphics gui, int x, int y, int mx, int my, float pt, Font font, WikiScreen screen) {
        super.render(gui, x, y, mx, my, pt, font, screen);
        if (getItem() instanceof InfoBox.IInfoBoxHolder) {
            int i = 0;
            InfoBox.IInfoBoxHolder holder = (InfoBox.IInfoBoxHolder) getItem();
            InfoBox box = holder.getInfoBox(new ItemStack(getItem()), new InfoBox(0xff0000, 0x3d3d3d));
            for (var entry : box.getLines().entrySet()) {
                Texture.WIKI_INF_LN_BG.draw(gui, x + 9, y + 80 + (i * 12));
                Texture.WIKI_INF_LN_BG.draw(gui, x + 9, y + 102 + (i * 12));
                gui.drawString(font, entry.getKey().append(Text.COLON), x + 15, y + 86 + (i * 12), 0x7C898B, false);
                gui.drawString(font, entry.getValue().setStyle(Text.color(0x3F535B)), x + 15, y + 108 + (i * 12), 0x000000, false);
                y += 32;
                i++;
            }
        }
    }
}
