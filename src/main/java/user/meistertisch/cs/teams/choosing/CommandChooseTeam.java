package user.meistertisch.cs.teams.choosing;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import user.meistertisch.cs.player.FilePlayer;

import java.util.List;
import java.util.ResourceBundle;

public class CommandChooseTeam implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(sender instanceof Player player){
            ResourceBundle langBundle = ResourceBundle.getBundle("language_" + FilePlayer.getConfig().getString(player.getDisplayName() + ".lang"));

            if(strings.length == 0){
                InventoryChooseTeam.openInventory(player);
            } else if(strings.length == 1){

            } else {

            }
        } else {
            sender.sendMessage(ChatColor.RED + ResourceBundle.getBundle("language_en").getString("command.noAdmin"));
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length == 0){
            return List.of("terrorist", "counterterrorist");
        }
        return List.of();
    }
}
