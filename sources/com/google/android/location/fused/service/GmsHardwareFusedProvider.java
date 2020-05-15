package com.google.android.location.fused.service;

import android.os.Binder;
import com.android.location.provider.FusedLocationHardware;
import com.android.location.provider.FusedProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsHardwareFusedProvider extends FusedProvider {

    /* renamed from: a */
    private static volatile boolean f150769a = false;

    /* renamed from: b */
    private volatile FusedLocationHardware f150770b;

    private GmsHardwareFusedProvider() {
    }

    public void setFusedLocationHardware(FusedLocationHardware fusedLocationHardware) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != 1000) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Ignoring calls from non-system server. Uid:");
            sb.append(callingUid);
            sb.toString();
            return;
        }
        this.f150770b = fusedLocationHardware;
        boolean z = bfvs.f115440a;
    }
}
