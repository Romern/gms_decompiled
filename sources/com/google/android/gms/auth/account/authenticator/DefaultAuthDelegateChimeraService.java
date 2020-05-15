package com.google.android.gms.auth.account.authenticator;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DefaultAuthDelegateChimeraService extends Service {

    /* renamed from: a */
    public static final sek f9969a = ght.m13171a("DefaultAuthDelegateChimeraService");

    public final IBinder onBind(Intent intent) {
        return new iyn(this);
    }
}
