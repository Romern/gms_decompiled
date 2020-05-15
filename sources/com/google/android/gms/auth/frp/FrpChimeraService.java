package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FrpChimeraService extends Service {

    /* renamed from: a */
    private jdy f10942a;

    static {
        new sek("GLSActivity", "FrpService");
    }

    public final IBinder onBind(Intent intent) {
        jdy jdy = this.f10942a;
        jdy.asBinder();
        return jdy;
    }

    public final void onCreate() {
        this.f10942a = new jdy(this);
    }
}
