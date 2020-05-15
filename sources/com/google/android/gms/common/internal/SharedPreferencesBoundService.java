package com.google.android.gms.common.internal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharedPreferencesBoundService extends BoundService {

    /* renamed from: a */
    private scv f30248a;

    public final IBinder onBind(Intent intent) {
        scv scv = this.f30248a;
        scv.asBinder();
        return scv;
    }

    public final void onCreate() {
        this.f30248a = new scv(getApplicationContext());
    }
}
