/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnet.bridge.event.bukkit;

import de.dytanic.cloudnet.lib.CloudNetwork;
import lombok.AllArgsConstructor;
import org.bukkit.event.HandlerList;

/**
 * Calls if the cloudnetwork objective was updated
 */
@AllArgsConstructor
public class BukkitCloudNetworkUpdateEvent extends BukkitCloudEvent {

    private static HandlerList handlerList = new HandlerList();

    private CloudNetwork cloudNetwork;

    public CloudNetwork getCloudNetwork()
    {
        return cloudNetwork;
    }

    public static HandlerList getHandlerList()
    {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers()
    {
        return handlerList;
    }
}