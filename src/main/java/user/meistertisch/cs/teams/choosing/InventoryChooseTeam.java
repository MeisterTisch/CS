package user.meistertisch.cs.teams.choosing;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import user.meistertisch.cs.player.FilePlayer;

import java.util.Collections;
import java.util.ResourceBundle;

public class InventoryChooseTeam {
    public static void openInventory(Player player){
        ResourceBundle langBundle = ResourceBundle.getBundle("language_" + FilePlayer.getConfig().getString(player.getDisplayName() + ".lang"));

        Inventory inv = Bukkit.createInventory(null, 9, langBundle.getString("inventory.chooseTeam.title"));

        //TODO: add number to itemStack how much people in team are
        //Terrorists
        ItemStack t = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta tMeta = t.getItemMeta();
        Color tColor = Color.fromRGB(226, 208, 158);
        tMeta.setItemName(tColor + langBundle.getString("inventory.chooseTeam.terrorists.itemName"));
        tMeta.setLore(Collections.singletonList(langBundle.getString("inventory.chooseTeam.terrorists.itemDesc")));
        t.setItemMeta(tMeta);

        //Counterterrorists
        ItemStack ct = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta ctMeta = t.getItemMeta();
        Color ctColor = Color.fromRGB(183, 204, 226);
        ctMeta.setItemName(ctColor + langBundle.getString("inventory.chooseTeam.counterTerrorists.itemName"));
        ctMeta.setLore(Collections.singletonList(langBundle.getString("inventory.chooseTeam.counterTerrorists.itemDesc")));
        ct.setItemMeta(ctMeta);

        //Spectators
        ItemStack spec = new ItemStack(Material.IRON_BLOCK);
        ItemMeta specMeta = t.getItemMeta();
        Color specColor = Color.fromRGB(153, 153, 153);
        specMeta.setItemName(specColor + langBundle.getString("inventory.chooseTeam.counterTerrorists.itemName"));
        specMeta.setLore(Collections.singletonList(langBundle.getString("inventory.chooseTeam.counterTerrorists.itemDesc")));
        spec.setItemMeta(specMeta);

        inv.setItem(1,t);
        inv.setItem(4,spec);
        inv.setItem(7,ct);

        player.openInventory(inv);
    }
}
