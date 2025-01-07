package me.xenon.hooks;

import com.mojang.authlib.minecraft.SocialInteractionsService;

import java.util.UUID;

public class SocialInteractionsServiceHook implements SocialInteractionsService {
    public boolean serversAllowed() {
        return true;
    }

    public boolean realmsAllowed() {
        return false;
    }

    public boolean chatAllowed() {
        return true;
    }

    public boolean isBlockedPlayer(UUID playerID) {
        return false;
    }
}