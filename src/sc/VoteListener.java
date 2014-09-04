package sc;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.vexsoftware.votifier.Votifier;
import com.vexsoftware.votifier.model.VotifierEvent;

public class VoteListener implements Listener
{
    @EventHandler
    public void onVote(VotifierEvent e)
    {
	Player p = Bukkit.getPlayer(e.getVote().getUsername());
	//if(p!=null)
	//{
	    double random = Math.random();
	    if(random>.10&&random<.15)
	    {
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		Bukkit.broadcastMessage(ChatColor.DARK_PURPLE+p.getDisplayName()+ChatColor.GOLD+" Voted at "+e.getVote().getServiceName()+" and got an extra reward of 5 exp bottles and a nether star (5% chance!)");
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		Bukkit.broadcastMessage(ChatColor.GOLD+" Check out all the random rewards with /rewards!");
		p.getInventory().addItem(new ItemStack(Material.EXP_BOTTLE, 5));
		p.getInventory().addItem(new ItemStack(Material.NETHER_STAR));
	    }
	    if(random>.15&&random<.25)
	    {
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		Bukkit.broadcastMessage(ChatColor.DARK_PURPLE+p.getDisplayName()+ChatColor.GOLD+" Voted at "+e.getVote().getServiceName()+" and got an extra reward of a nether star (10% chance!)");
		Bukkit.broadcastMessage(ChatColor.GOLD+" Check out all the random rewards with /rewards!");
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		p.getInventory().addItem(new ItemStack(Material.NETHER_STAR));
	    }
	    if(random>.30&&random<.33)
	    {
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		Bukkit.broadcastMessage(ChatColor.DARK_PURPLE+p.getDisplayName()+ChatColor.GOLD+" Voted at "+e.getVote().getServiceName()+" and got an extra reward of 5 diamonds, 5 extra diamonds, and an ender chest!");
		Bukkit.broadcastMessage(ChatColor.GOLD+"------------------------------------------------------------------");
		Bukkit.broadcastMessage(ChatColor.GOLD+" Check out all the random rewards with /rewards!");
		p.getInventory().addItem(new ItemStack(Material.DIAMOND, 5));
		p.getInventory().addItem(new ItemStack(Material.EXP_BOTTLE, 5));
		p.getInventory().addItem(new ItemStack(Material.ENDER_CHEST));
	    }
	//}
    }
}
