package pl.chomiciak.pluginamtch;

import java.awt.Color;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginAMTChMain extends JavaPlugin implements Listener {

	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		
	}
	
	@Override
	public void onDisable(){
		
	}
	
	
	@EventHandler
	public void OnServerJoin(PlayerJoinEvent event){
		/*ItemStack is = new ItemStack(Material.STONE_SWORD);
		is.setAmount(1);
		event.getPlayer().getInventory().addItem(is);
		
		event.getPlayer().sendMessage("Dosta³eœ miecz! Baw siê dobrze!");
		
		getServer().broadcastMessage(
				"Gracz " + event.getPlayer().getDisplayName() + " do³¹czy³! Bêdzie zabija³!");
		*/
		
		Inventory inv = getServer().createInventory(event.getPlayer(), 9, org.bukkit.Color.GREEN.toString()+"Itemy Startowe!");
		inv.setItem(4, new ItemStack(Material.DIAMOND_SWORD));
		inv.setItem(5, new ItemStack(Material.DIAMOND_AXE));
		inv.setItem(6, new ItemStack(Material.DIAMOND_PICKAXE));
		
		
		
		event.getPlayer().openInventory(inv);
		
	}
}
