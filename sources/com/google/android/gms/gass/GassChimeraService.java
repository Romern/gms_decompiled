package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GassChimeraService extends Service {

    /* renamed from: a */
    private aagr f32749a;

    /* renamed from: b */
    private aagi f32750b;

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.gass.START")) {
            return new aagj(this, this.f32749a, this.f32750b);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (cebd.m135899c()) {
            Context applicationContext = getApplicationContext();
            if (cebd.f182201a.mo6606a().mo78715b()) {
                aagq.m21238a();
            }
            this.f32749a = new aagr(qws.m33019a(applicationContext, "GLINE"));
        }
        if (cebg.m135923b()) {
            this.f32750b = aagi.m21209a(getApplicationContext());
        }
    }
}
