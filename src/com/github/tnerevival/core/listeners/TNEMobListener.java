package com.github.tnerevival.core.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.github.tnerevival.TheNewEconomy;

public class TNEMobListener implements Listener {
	private TheNewEconomy plugin;
	
	public TNEMobListener(TheNewEconomy instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		
	}
}