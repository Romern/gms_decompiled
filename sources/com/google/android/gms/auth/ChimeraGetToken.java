package com.google.android.gms.auth;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraGetToken extends Service {

    /* renamed from: a */
    public static final sek f9926a = ght.m13171a("GetToken");

    /* renamed from: b */
    public static final List f9927b = Arrays.asList("authAccount", "booleanResult", "accountType", "authtoken", "retry");

    /* renamed from: c */
    private ddx f9928c;

    public final IBinder onBind(Intent intent) {
        ddx ddx = this.f9928c;
        ddx.asBinder();
        return ddx;
    }

    public final void onCreate() {
        this.f9928c = new ddx(this);
    }
}
