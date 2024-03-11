package com.yuri.yuridiscordintegration;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class YuriDiscordIntegrationPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(YuriDiscordIntegrationPlugin.class);
		RuneLite.main(args);
	}
}