package sc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import ScoreBoard.ScoreboardListener;

public class StrongCore extends JavaPlugin implements Listener
{
    public HashMap<String, Long> nv = new HashMap<String, Long>();
    public HashMap<String, Long> speed = new HashMap<String, Long>();
    public HashMap<String, Long> strength = new HashMap<String, Long>();
    public HashMap<String, Long> waterbreathing = new HashMap<String, Long>();
    public static Plugin pl;
    public void onEnable()
    {
	pl=this;
	BarStuff.Messages.setMessage();
	getCommand("nv").setExecutor(new Commands());
	getCommand("wb").setExecutor(new Commands());
	getCommand("strength").setExecutor(new Commands());
	getCommand("speed").setExecutor(new Commands());
	getCommand("vote").setExecutor(new RewardCommands());
	getCommand("rewards").setExecutor(new RewardCommands());
	PluginManager pm = getServer().getPluginManager();
	pm.registerEvents(new ItemListeners(this), this);
	pm.registerEvents(new TradeListener(), this);
	pm.registerEvents(new VoteListener(), this);
	getLogger().info("StrongholdCore Has Started STRONGCORELAWL!");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
	ItemStack saddle = new ItemStack(Material.SADDLE);
	ItemMeta sm = saddle.getItemMeta();
	List<String> lore = new ArrayList<String>();
	Player p = (Player) sender;
	if (p.isOp())
	{
	    if (cmd.getName().equalsIgnoreCase("saddle1"))
	    {
		lore.add("Summons a Chestnut Mare");
		sm.setDisplayName("Basic Saddle");
		sm.setLore(lore);
		saddle.setItemMeta(sm);
	    }
	    if (cmd.getName().equalsIgnoreCase("saddle2"))
	    {
		lore.add("Summons a Black Charger");
		sm.setDisplayName("Riveted Saddle");
		sm.setLore(lore);
		saddle.setItemMeta(sm);
	    }
	    if (cmd.getName().equalsIgnoreCase("saddle3"))
	    {
		lore.add("Summons a Skeletal charger");
		sm.setDisplayName("Reigns of the Skeletal Stallion");
		sm.setLore(lore);
		saddle.setItemMeta(sm);
	    }
	    if (cmd.getName().equalsIgnoreCase("saddle4"))
	    {
		lore.add("Summons a Deathchaerger");
		sm.setDisplayName("Reigns of the Deathcharger");
		sm.setLore(lore);
		saddle.setItemMeta(sm);
	    }
	    if (cmd.getName().equalsIgnoreCase("saddle5"))
	    {
		sm.setDisplayName("Basic Saddle");
		saddle.setItemMeta(sm);
	    }
	}
	lore.clear();
	p.getInventory().addItem(saddle);
	return false;
    }
}
