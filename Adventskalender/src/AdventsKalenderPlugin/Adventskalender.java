package AdventsKalenderPlugin;





import java.util.Random;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Adventskalender extends JavaPlugin implements CommandExecutor, Listener {
	
	@Override
	public void onEnable() {
		super.onEnable();
		PluginManager pm = getServer().getPluginManager();
		this.getCommand("adventskalender").setExecutor(this);
		pm.registerEvents((Listener) this, this);
		
	
	} 
		
		@org.bukkit.event.EventHandler
		
		public void onChestUse(PlayerInteractEvent event) {
			
			Player player;
			if (event.getPlayer() instanceof Player) {
				player = (Player)event.getPlayer();
			if (event.getItem().getItemMeta().getDisplayName().equals("Adventskalender") ) 
				player.getInventory().addItem(randomItem()); }
			if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
				
			}
			}
			
			
		private ItemStack randomItem() { 
			  int pick = new       Random().nextInt(Material.values().length);    return new ItemStack (Material.values()[pick],1); 
			}
			
		
				
			
			
			
			
			
			
			
	
	
		
		
		
		
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player player;
		if(sender instanceof Player) {
			player = (Player) sender;
			ItemStack avKiste = new ItemStack (Material.CHEST, 1 );
			
			ItemMeta avKisteMeta = avKiste.getItemMeta();
			avKisteMeta.setDisplayName("Adventskalender");
			avKiste.setItemMeta(avKisteMeta);
			player.getInventory().addItem(avKiste);
			
			
			
			
		
			
			
			
			
			
			
			
			
				
			
			
		}
		return true;
	}
}
