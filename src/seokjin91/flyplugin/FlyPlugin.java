package seokjin91.flyplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import seokjin91.flyplugin.commands.Flycommand;
import seokjin91.flyplugin.commands.UnflyCommand;

public class FlyPlugin extends JavaPlugin {
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = ChatColor.AQUA+"["+pdffile.getName()+"]";
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(nombre +ChatColor.GREEN+ " El plugin ha sido activado Version: "+ version );
		registerCommands();
		
	}
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(nombre +ChatColor.GREEN+ " El plugin ha sido Desactivado Version: "+ version );
	}
	public void registerCommands() {
		this.getCommand("fly").setExecutor(new Flycommand(this));
		this.getCommand("unfly").setExecutor(new UnflyCommand(this));
	}
}
