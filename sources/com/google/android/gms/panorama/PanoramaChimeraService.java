package com.google.android.gms.panorama;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PanoramaChimeraService extends BoundService {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.panorama.service.START".equals(intent.getAction())) {
            return new alap(this, this);
        }
        return null;
    }
}
