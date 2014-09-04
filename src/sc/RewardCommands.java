package sc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RewardCommands implements CommandExecutor
{
	@Override
    	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
    	{
	    Player p = (Player)sender;
	    if(cmd.getName().equalsIgnoreCase("vote"))
	    {
		p.sendMessage(ChatColor.GOLD+"-----------------------------------------");
		p.sendMessage(ChatColor.AQUA+"Vote at http://goo.gl/OUjdLe");	
		p.sendMessage(ChatColor.GOLD+"Or vote at goo.gl/O7AgG7");
		p.sendMessage(ChatColor.AQUA+"Use /rewards to check out the rewards you can get!");
		p.sendMessage(ChatColor.GOLD+"-----------------------------------------");
	    }
	    if(cmd.getName().equalsIgnoreCase("rewards"))
	    {
		p.sendMessage(ChatColor.GOLD+"-----------------------------------------");
		p.sendMessage(ChatColor.AQUA+"Extra rewards:");
		p.sendMessage(ChatColor.AQUA+"3% Chance: 5 diamonds, 5 xp bottles, 1 ender chest");
		p.sendMessage(ChatColor.GOLD+"5% Chance: 5 xp bottles, 1 nether star");
		p.sendMessage(ChatColor.AQUA+"10% Chance: 5 xp bottles, 1 nether star");
		p.sendMessage(ChatColor.GOLD+"-----------------------------------------");
	    }
	    return true;
    	}
}
