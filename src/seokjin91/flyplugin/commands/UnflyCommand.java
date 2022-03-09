package seokjin91.flyplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import seokjin91.flyplugin.FlyPlugin;

public class UnflyCommand implements CommandExecutor {
	private FlyPlugin plugin;
	
	public UnflyCommand (FlyPlugin plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command commando, String label, String[] args) {
	if(!(sender instanceof Player)) {
		Bukkit.getConsoleSender().sendMessage(plugin.nombre+ ChatColor.RED+ " Debes ejecutar este comando como un jugador!");
		return false;
	}else {
		
		Player Jugador = (Player) sender;
		Jugador.setAllowFlight(false);
		Jugador.setFlying(false);
		Jugador.sendMessage(ChatColor.RED+ " Has desactivado el modo de vuelo!");
		
		return true;
	}
}
}