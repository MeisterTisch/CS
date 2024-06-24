package user.meistertisch.cs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import user.meistertisch.cs.language.CommandLanguage;
import user.meistertisch.cs.player.FilePlayer;
import user.meistertisch.cs.teams.choosing.CommandChooseTeam;

public final class Main extends JavaPlugin {
    private static Main plugin;
    PluginManager pluginManager;

    @Override
    public void onEnable() {
        //First
        plugin = this;
        pluginManager = Bukkit.getPluginManager();

        //Files
        this.saveDefaultConfig();
//        this.saveResource("language_de.properties", true);
//        this.saveResource("language_en.properties", true);
        FilePlayer.setup();

        //COMMANDS
        getCommand("chooseTeam").setExecutor(new CommandChooseTeam());
        getCommand("language").setExecutor(new CommandLanguage());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    //Some static getters
    public static Main getPlugin() {
        return plugin;
    }
}
