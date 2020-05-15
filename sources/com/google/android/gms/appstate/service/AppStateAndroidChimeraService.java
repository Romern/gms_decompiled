package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppStateAndroidChimeraService extends Service {

    /* renamed from: a */
    public static final HashMap f9811a = new HashMap();

    /* renamed from: b */
    public static final Object f9812b = new Object();

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.appstate.service.START".equals(intent.getAction())) {
            return new gah(this, this);
        }
        return null;
    }
}
