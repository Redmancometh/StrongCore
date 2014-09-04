package BarStuff;

import me.confuser.barapi.BarAPI;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

import sc.StrongCore;

public class Messages
{
    public static void setMessage()
    {
	new BukkitRunnable()
	{
	    int flasher = 0;
	    int switcher = 0;
	    ChatColor word;

	    public void run()
	    {
		if (switcher == 0)
		{
		    if (flasher % 2 == 0)
		    {
			word = ChatColor.AQUA;
		    }
		    else
		    {
			word = ChatColor.GOLD;
		    }
		    BarAPI.setMessage(ChatColor.GOLD + "Vote for the server! Use " + word + "/vote!");
		    flasher++;
		    if (flasher >= 25)
		    {
			switcher++;
			flasher = 0;
		    }
		}
		if (switcher == 1)
		{
		    if (flasher % 2 == 0)
		    {
			word = ChatColor.GOLD;
		    }
		    else
		    {
			word = ChatColor.AQUA;
		    }
		    BarAPI.setMessage(ChatColor.AQUA + "Random extra voting rewards! Use " + word + "/rewards" + ChatColor.AQUA + " to see!");
		    flasher++;
		    if (flasher >= 25)
		    {
			switcher++;
			flasher = 0;
		    }
		}
		if (switcher == 2)
		{
		    if (flasher % 2 == 0)
		    {
			word = ChatColor.AQUA;
		    }
		    else
		    {
			word = ChatColor.GOLD;
		    }
		    BarAPI.setMessage(ChatColor.GOLD + "Use " + word + "/nv " + ChatColor.GOLD + "for nightvision and " + word + "/wb" + ChatColor.GOLD + " for waterbreathing!");
		    flasher++;
		    if (flasher >= 25)
		    {
			switcher = 0;
			flasher = 0;
		    }
		}
	    }
	}.runTaskTimer(StrongCore.pl, 10, 8);
    }
}
