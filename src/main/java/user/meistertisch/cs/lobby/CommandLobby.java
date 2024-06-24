package user.meistertisch.cs.lobby;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class CommandLobby implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        switch (strings.length){
            case 0 -> {
                //TODO: Check for Player being InGame or not

            }
            case 1 -> {
                switch(strings[0]){
                    case "set" -> {
                        //TODO: Check for Admin
                    }
                }
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {

        return List.of();
    }
}
