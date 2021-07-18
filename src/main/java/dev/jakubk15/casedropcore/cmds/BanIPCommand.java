package dev.jakubk15.casedropcore.cmds;

import dev.jakubk15.casedropcore.utils.ChatColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BanIPCommand implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		Player p = (Player) sender;
		if (p.hasPermission("essentials.banip")) {
			if (args[0] != null) {
				Player cel = Bukkit.getPlayerExact(args[0]);
				if (args[1] != null) {
					cel.banPlayerFull(ChatColorUtil.fixColor("&cZostałeś zbanowany na IP!\n\nPrzez administratora: " + p.getName() + "\n\n&cPowód: " + args[1]));
					p.sendMessage(ChatColorUtil.fixColor("&3Zbanowano gracza " + cel.getName() + "\n&3Powód: " + args[1]));
				} else {
					cel.banPlayerFull(ChatColorUtil.fixColor("&cZostałeś zbanowany na IP!\n\nPrzez administratora: " + p.getName()));
					p.sendMessage(ChatColorUtil.fixColor("&3Zbanowano gracza (IP) " + cel.getName()));
				}
			} else {
				p.sendMessage(ChatColorUtil.fixColor("&cPodaj nick gracza!"));
			}
		} else {
			p.sendMessage(ChatColorUtil.fixColor("&cBrak uprawnien!"));
		}
		return false;
	}
}
