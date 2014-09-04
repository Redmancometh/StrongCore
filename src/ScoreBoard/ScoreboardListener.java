package ScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import com.massivecraft.factions.entity.BoardColls;
import com.massivecraft.factions.entity.UPlayer;

public class ScoreboardListener implements Listener
{
    @EventHandler
    public void checkMovement(com.massivecraft.factions.event.FactionsEventChunkChange e)
    {
	Bukkit.broadcastMessage("CHANGED");
	ScoreboardManager manager = Bukkit.getScoreboardManager();
	Scoreboard board = manager.getNewScoreboard();
	Objective objective = board.registerNewObjective("test", "dummy");   
	objective.setDisplaySlot(DisplaySlot.SIDEBAR);
	objective.setDisplayName(ChatColor.LIGHT_PURPLE+"Quest Objectives");
	Score score = objective.getScore(Bukkit.getOfflinePlayer("TEST"+":"));
	e.getUSender().getPlayer().setScoreboard(board);;
    }
}
