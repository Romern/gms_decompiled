package com.google.android.gms.wallet.service.address;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddressChimeraService extends Service {

    /* renamed from: a */
    public awvy f110338a;

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.identity.service.BIND".equals(intent.getAction())) {
            return new awpz(this, this);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f110338a = new awvy(this, new awgj(rpr.m34216b().getRequestQueue()));
    }
}
