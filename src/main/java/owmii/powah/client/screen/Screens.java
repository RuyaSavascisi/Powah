package owmii.powah.client.screen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import owmii.powah.client.book.PowahBook;
import owmii.powah.client.screen.container.*;
import owmii.powah.inventory.Containers;
import owmii.powah.lib.client.screen.wiki.WikiScreen;

public class Screens {
    public static void register(RegisterMenuScreensEvent event) {
        event.register(Containers.ENERGY_CELL.get(), EnergyCellScreen::new);
        event.register(Containers.ENDER_CELL.get(), EnderCellScreen::new);
        event.register(Containers.FURNATOR.get(), FurnatorScreen::new);
        event.register(Containers.MAGMATOR.get(), MagmatorScreen::new);
        event.register(Containers.PLAYER_TRANSMITTER.get(), PlayerTransmitterScreen::new);
        event.register(Containers.ENERGY_HOPPER.get(), EnergyHopperScreen::new);
        event.register(Containers.CABLE.get(), CableScreen::new);
        event.register(Containers.REACTOR.get(), ReactorScreen::new);
        event.register(Containers.SOLAR.get(), SolarScreen::new);
        event.register(Containers.THERMO.get(), ThermoScreen::new);
        event.register(Containers.DISCHARGER.get(), DischargerScreen::new);
    }

    public static void openManualScreen() {
        WikiScreen.open(PowahBook.WIKI.getCategories().get(0));
    }
}
