package seokjin91.flyplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import seokjin91.flyplugin.FlyPlugin;

public class Flycommand implements CommandExecutor {
	
	private FlyPlugin plugin;
	
	public Flycommand (FlyPlugin plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command commando, String label, String[] args) {
	if(!(sender instanceof Player)) {
		Bukkit.getConsoleSender().sendMessage(plugin.nombre+ ChatColor.RED+ " Debes ejecutar este comando como un jugador!");
		return false;
	}else {
		
		Player Jugador = (Player) sender;
		Jugador.setAllowFlight(true);
		Jugador.setFlying(true);
		Jugador.sendMessage(ChatColor.GREEN+ " Has activado el modo de vuelo!");
		
		return true;
	}
}
}
