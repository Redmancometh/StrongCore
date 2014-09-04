package sc;

import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Commands implements CommandExecutor
{
    public HashMap<String, Long> nv = new HashMap<String, Long>();
    public HashMap<String, Long> speed = new HashMap<String, Long>();
    public HashMap<String, Long> strength = new HashMap<String, Long>();
    public HashMap<String, Long> waterbreathing = new HashMap<String, Long>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
	if (cmd.getName().equalsIgnoreCase("nv") && (sender instanceof Player))
	{
	    if (!nv.containsKey(sender.getName()))
	    {
		PotionEffect nveff;
		nveff = new PotionEffect(PotionEffectType.NIGHT_VISION, 1400, 2);
		nveff.apply((LivingEntity) sender);
		sender.sendMessage(ChatColor.GREEN + "I Can See in the Dark");
		nv.put(sender.getName(), System.currentTimeMillis());
	    }
	    else
	    {
		long secondsLeft = ((nv.get(sender.getName()) / 1000) + 120) - (System.currentTimeMillis() / 1000);
		if (secondsLeft > 0)
		{
		    sender.sendMessage(ChatColor.RED + "Please wait " + secondsLeft + " more seconds to do this again!");
		}
		else
		{
		    PotionEffect nveff;
		    nveff = new PotionEffect(PotionEffectType.NIGHT_VISION, 1400, 2);
		    nveff.apply((LivingEntity) sender);
		    sender.sendMessage(ChatColor.GREEN + "I Can See in the Dark");
		    nv.put(sender.getName(), System.currentTimeMillis());
		}
	    }
	}
	if (cmd.getName().equalsIgnoreCase("strength") && (sender instanceof Player))
	{
	    if (sender.hasPermission("Strongcore.Strength"))
	    {
		if (!strength.containsKey(sender.getName()))
		{
		    strength.put(sender.getName(), System.currentTimeMillis());
		    PotionEffect streff;
		    streff = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 360, 1);
		    streff.apply((LivingEntity) sender);
		    sender.sendMessage(ChatColor.RED + "RAWWR!");
		    strength.put(sender.getName(), System.currentTimeMillis());
		}
		else
		{
		    long secondsLeft = ((strength.get(sender.getName()) / 1000) + 120) - (System.currentTimeMillis() / 1000);
		    if (secondsLeft > 0)
		    {
			sender.sendMessage(ChatColor.RED + "Please wait " + secondsLeft + " more seconds to do this again!");
		    }
		    else
		    {
			PotionEffect streff;
			streff = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 360, 1);
			streff.apply((LivingEntity) sender);
			sender.sendMessage(ChatColor.RED + "RAWWR!");
			strength.put(sender.getName(), System.currentTimeMillis());
		    }
		}
	    }
	    else
	    {
		sender.sendMessage(ChatColor.RED + "You do not have permission to do this..please donate to unlock this feature!");
	    }
	}
	if (cmd.getName().equalsIgnoreCase("speed"))
	{
	    if (sender.hasPermission("Strongcore.Speed"))
	    {
		if (!speed.containsKey(sender.getName()))
		{
		    PotionEffect speedeff;
		    speedeff = new PotionEffect(PotionEffectType.SPEED, 200, 1);
		    speedeff.apply((LivingEntity) sender);
		    sender.sendMessage(ChatColor.GREEN + "Warp speed engaged!");
		    speed.put(sender.getName(), System.currentTimeMillis());
		}
		else
		{
		    long secondsLeft = ((speed.get(sender.getName()) / 1000) + 120) - (System.currentTimeMillis() / 1000);
		    if (secondsLeft > 0)
		    {
			sender.sendMessage(ChatColor.RED + "Please wait " + secondsLeft + " more seconds to do this again!");
		    }
		    else
		    {
			PotionEffect speedeff;
			speedeff = new PotionEffect(PotionEffectType.SPEED, 200, 2);
			speedeff.apply((LivingEntity) sender);
			sender.sendMessage(ChatColor.GREEN + "Warp speed engaged!");
			speed.put(sender.getName(), System.currentTimeMillis());
		    }
		}
	    }
	    else
	    {
		sender.sendMessage(ChatColor.RED + "You do not have permission to do this..please donate to unlock this feature!");
	    }
	}
	if (cmd.getName().equalsIgnoreCase("wb"))
	{
	    if (!waterbreathing.containsKey(sender.getName()))
	    {
		PotionEffect wbeff;
		wbeff = new PotionEffect(PotionEffectType.WATER_BREATHING, 2400, 2);
		wbeff.apply((LivingEntity) sender);
		sender.sendMessage(ChatColor.GREEN + "I have gills...");
		waterbreathing.put(sender.getName(), System.currentTimeMillis());
	    }
	    else
	    {
		long secondsLeft = ((waterbreathing.get(sender.getName()) / 1000) + 120) - (System.currentTimeMillis() / 1000);
		if (secondsLeft > 0)
		{
		    sender.sendMessage(ChatColor.RED + "Please wait " + secondsLeft + " more seconds to do this again!");
		}
		else
		{
		    PotionEffect wbeff;
		    wbeff = new PotionEffect(PotionEffectType.WATER_BREATHING, 2400, 2);
		    wbeff.apply((LivingEntity) sender);
		    sender.sendMessage(ChatColor.GREEN + "I have gills...");
		    waterbreathing.put(sender.getName(), System.currentTimeMillis());
		}
	    }

	}
	return true;
    }
}