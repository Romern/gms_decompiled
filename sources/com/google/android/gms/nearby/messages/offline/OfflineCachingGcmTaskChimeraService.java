package com.google.android.gms.nearby.messages.offline;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OfflineCachingGcmTaskChimeraService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (cfoj.m141574x()) {
            startService(new Intent("com.google.android.gms.nearby.messages.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        }
        if (!cfoj.m141521B()) {
            return 0;
        }
        startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
        return 0;
    }
}
