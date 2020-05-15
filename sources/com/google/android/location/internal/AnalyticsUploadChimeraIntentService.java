package com.google.android.location.internal;

import android.content.Intent;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AnalyticsUploadChimeraIntentService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Boolean bool;
        Boolean bool2;
        if (bfkq.m97139a(ceze.f183524a.mo6606a().reportSystemWideSettings())) {
            boolean z = true;
            boolean z2 = bhcc.m100622a(this) == 2;
            LocationManager locationManager = (LocationManager) getSystemService("location");
            try {
                if (locationManager.isProviderEnabled("network")) {
                    try {
                        if (aymk.m84257a(getContentResolver(), "network_location_opt_in", -1) != 1) {
                            z = false;
                        }
                    } catch (Exception e) {
                    }
                    bool = Boolean.valueOf(z);
                    bool2 = Boolean.valueOf(locationManager.isProviderEnabled("gps"));
                    bgkx bgkx = bgkx.f116729g;
                    Boolean valueOf = Boolean.valueOf(((PowerManager) getSystemService("power")).isDeviceIdleMode());
                    Boolean valueOf2 = Boolean.valueOf(bgkx.mo62944a((WifiManager) getApplicationContext().getSystemService("wifi"), this));
                    Boolean valueOf3 = Boolean.valueOf(srs.m36149a(this));
                    bgbr a = bgbr.m98545a(this);
                    a.mo62627a(Boolean.valueOf(z2), bool2, bool, valueOf2, valueOf3, valueOf);
                    a.mo62624a();
                }
                z = false;
                bool = Boolean.valueOf(z);
            } catch (Exception e2) {
                bool = null;
            }
            try {
                bool2 = Boolean.valueOf(locationManager.isProviderEnabled("gps"));
            } catch (Exception e3) {
                bool2 = null;
            }
            bgkx bgkx2 = bgkx.f116729g;
            Boolean valueOf4 = Boolean.valueOf(((PowerManager) getSystemService("power")).isDeviceIdleMode());
            Boolean valueOf22 = Boolean.valueOf(bgkx2.mo62944a((WifiManager) getApplicationContext().getSystemService("wifi"), this));
            Boolean valueOf32 = Boolean.valueOf(srs.m36149a(this));
            bgbr a2 = bgbr.m98545a(this);
            a2.mo62627a(Boolean.valueOf(z2), bool2, bool, valueOf22, valueOf32, valueOf4);
            a2.mo62624a();
        }
    }
}
