package com.google.android.location.network;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkLocationChimeraService extends sno {

    /* renamed from: a */
    private NetworkLocationProvider f150822a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17286a(Intent intent) {
        if (intent != null) {
            Location a = bxbh.m122518a(intent);
            if (this.f150822a != null && a != null) {
                bxbh.m122520a(a, true);
                aeim.m51890a(a, "noGPSLocation", new Location(a));
                NetworkLocationProvider networkLocationProvider = this.f150822a;
                networkLocationProvider.f150828e.mo63540a();
                networkLocationProvider.reportLocation(a);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (rfx.m33540d(this)) {
            return null;
        }
        if (this.f150822a == null) {
            NetworkLocationProvider networkLocationProvider = new NetworkLocationProvider(getApplicationContext());
            this.f150822a = networkLocationProvider;
            networkLocationProvider.f150826c.mo34479a(networkLocationProvider.f150830g, networkLocationProvider.f150825b.getLooper());
            networkLocationProvider.f150826c.mo34485a(networkLocationProvider.f150829f, networkLocationProvider.f150825b.getLooper());
            networkLocationProvider.f150827d.mo63543a();
            networkLocationProvider.mo70879a();
        }
        beyc.m96082a(getApplicationContext());
        int i = Build.VERSION.SDK_INT;
        if (bhbm.m100588a(getApplicationContext())) {
            bhbr.m100591a(getApplicationContext()).mo63533a("com.google.android.gms.location.history");
        }
        return this.f150822a.getBinder();
    }

    public final void onDestroy() {
        NetworkLocationProvider networkLocationProvider = this.f150822a;
        if (networkLocationProvider != null) {
            networkLocationProvider.f150827d.mo63545b();
            networkLocationProvider.f150826c.mo34484a(networkLocationProvider.f150829f);
            networkLocationProvider.f150826c.mo34478a(networkLocationProvider.f150830g);
            this.f150822a = null;
        }
        super.onDestroy();
    }
}
