package com.google.android.gms.carsetup;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarDataChimeraService extends BoundService {

    /* renamed from: a */
    private npd f29537a;

    public final IBinder onBind(Intent intent) {
        oty oty = new oty(getApplicationContext(), this.f29537a);
        return oty.getInterfaceDescriptor() != null ? new nww(oty) : oty;
    }

    public final void onCreate() {
        this.f29537a = npd.m27127a(this);
    }
}
