package dev.jakubk15.casedropcore.cmds;

import dev.jakubk15.casedropcore.utils.ChatColorUtil;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCommand implements CommandExecutor {
	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
			if (sender.hasPermission("essentials.gamemode")) {
				if (args[0].length() >= 1) {
					Player sender1 = (Player) sender;
					switch (args[0]) {
						case "0" -> {
							sender1.setGameMode(GameMode.SURVIVAL);
							sender.sendMessage(ChatColorUtil.fixColor("&3Twój tryb gry został zmieniony na " + sender1.getGameMode()));
						}
						case "1" -> {
							sender1.setGameMode(GameMode.CREATIVE);
							sender.sendMessage(ChatColorUtil.fixColor("&3Twój tryb gry został zmieniony na " + sender1.getGameMode()));
						}
						case "2" -> {
							sender1.setGameMode(GameMode.ADVENTURE);
							sender.sendMessage(ChatColorUtil.fixColor("&3Twój tryb gry został zmieniony na " + sender1.getGameMode()));
						}
						case "3" -> {
							sender1.setGameMode(GameMode.SPECTATOR);
							sender.sendMessage(ChatColorUtil.fixColor("&3Twój tryb gry został zmieniony na " + sender1.getGameMode()));
						}
					}
				} else {
					sender.sendMessage(ChatColorUtil.fixColor("&cPodaj argument 1!"));
				}
			} else {
				sender.sendMessage(ChatColorUtil.fixColor("&cBrak uprawnien!"));
			}
	return false;
	}

}
