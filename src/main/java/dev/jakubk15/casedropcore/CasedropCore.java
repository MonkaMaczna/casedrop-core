package dev.jakubk15.casedropcore;

import dev.jakubk15.casedropcore.cmds.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class CasedropCore extends JavaPlugin {

	@Override
	public void onEnable() {
		Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
		Objects.requireNonNull(getCommand("heal")).setExecutor(new HealCommand());
		Objects.requireNonNull(getCommand("fly")).setExecutor(new FlyCommand());
		Objects.requireNonNull(getCommand("ip")).setExecutor(new IPCommand());
		Objects.requireNonNull(getCommand("nick")).setExecutor(new NickCommand());
		Objects.requireNonNull(getCommand("gm")).setExecutor(new GamemodeCommand());
		Objects.requireNonNull(getCommand("ping")).setExecutor(new PingCommand());
		Objects.requireNonNull(getCommand("vanish")).setExecutor(new VanishCommand());
		Objects.requireNonNull(getCommand("kick")).setExecutor(new KickCommand());
		Objects.requireNonNull(getCommand("ac")).setExecutor(new AdminChatCommand());
		Objects.requireNonNull(getCommand("ban")).setExecutor(new BanCommand());
		Objects.requireNonNull(getCommand("banip")).setExecutor(new BanIPCommand());
		Objects.requireNonNull(getCommand("chat")).setExecutor(new ChatManager());

	}

}
