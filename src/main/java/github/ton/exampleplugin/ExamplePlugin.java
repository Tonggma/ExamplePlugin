package github.ton.exampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //getLogger(); 不会
        System.out.println("Hello Server");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Bye Server");
    }
}
