package org.example.observer.view;

import org.example.observer.model.*;
import org.example.observer.controller.EventDispatcher;
import org.example.observer.controller.AudioSystem;
import org.example.observer.controller.ISystem;
import org.example.observer.controller.UISystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Main theApp = new Main();
            theApp.run();
        }

        public void run()
        {
            //at game start, instanciate all systems
            ISystem audio = new AudioSystem();
            ISystem ui = new UISystem();

            //instantiate player
            Player p = new Player("Max");

            //collide with ammo, key
            AmmoItem plasmaRifleAmmo = new AmmoItem(CollectibleType.Ammo, "plasma rifle ammo", 25 );
            KeyItem dungeonKey = new KeyItem(CollectibleType.Key, "dungeon key", 101);

            //some time later...

            //apply mods to player
            dungeonKey.modify(p);
            plasmaRifleAmmo.modify(p);

            //show player state
            System.out.println(p);
        }
}
