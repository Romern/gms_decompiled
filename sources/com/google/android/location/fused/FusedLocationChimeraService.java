package com.google.android.location.fused;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusedLocationChimeraService extends Service {

    /* renamed from: a */
    private bfpq f150714a;

    public final IBinder onBind(Intent intent) {
        if (this.f150714a == null) {
            if (cevw.m138328m()) {
                this.f150714a = new bfpq(this);
            } else {
                this.f150714a = new bfpq(new aesh(this));
            }
            aesh aesh = this.f150714a.f114804a;
            if (aesh != null) {
                aesh.mo34501a();
            }
        }
        return this.f150714a.getBinder();
    }

    public final void onDestroy() {
        bfpq bfpq = this.f150714a;
        if (bfpq != null) {
            bfpq.f114806c.post(new bfpm(bfpq));
            this.f150714a = null;
        }
        super.onDestroy();
    }
}
