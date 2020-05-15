package com.google.android.gms.ads.identifier.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.ads.identifier.internal.C0276c;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdvertisingIdChimeraBoundService extends BoundService {

    /* renamed from: a */
    private C0276c f7996a;

    public final IBinder onBind(Intent intent) {
        C0276c cVar = this.f7996a;
        cVar.asBinder();
        return cVar;
    }

    public final void onCreate() {
        this.f7996a = new C0276c(null);
    }
}
