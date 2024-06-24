package user.meistertisch.cs.language;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import user.meistertisch.cs.player.FilePlayer;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class CommandLanguage implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player player){
            ResourceBundle langBundle = ResourceBundle.getBundle("language_" + FilePlayer.getConfig().getString(player.getDisplayName() + ".lang"));
            if(args.length == 0){

            } else if(args.length == 1) {
                try {
                    FilePlayer.getConfig().set(player.getDisplayName() + ".lang", Languages.valueOf(args[0].toUpperCase(Locale.ROOT)).getLang());
                    FilePlayer.saveConfig();
                    langBundle = ResourceBundle.getBundle("language_" + FilePlayer.getConfig().getString(player.getDisplayName() + ".lang"));
                    player.sendMessage(ChatColor.GREEN + langBundle.getString("command.language.changedLanguage"));
                } catch (IllegalArgumentException e) {
                    player.sendMessage(ChatColor.RED + langBundle.getString("command.language.invalidLanguage"));
                }
            } else {

            }
        } else {

        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return List.of();
    }
}
