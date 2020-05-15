package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceDetailChimeraService extends BoundService {

    /* renamed from: a */
    private ayqb f80528a;

    public final IBinder onBind(Intent intent) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Device detail service bound to intent %s", intent);
        if (!cfoj.f184966a.mo6606a().mo82068S()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Device detail service not enabled");
            return null;
        } else if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_DEVICE_DETAIL".equals(intent.getAction())) {
            return null;
        } else {
            if (this.f80528a == null) {
                this.f80528a = new ayqb(this);
            }
            return this.f80528a;
        }
    }

    public final boolean onUnbind(Intent intent) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Device detail service unbind to intent %s", intent);
        return super.onUnbind(intent);
    }
}
