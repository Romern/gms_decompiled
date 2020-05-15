package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;

/* renamed from: bghw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bghw implements GpsStatus.Listener {

    /* renamed from: a */
    private final LocationManager f116468a;

    /* renamed from: b */
    private int f116469b = -1;

    public bghw(LocationManager locationManager) {
        this.f116468a = locationManager;
    }

    /* renamed from: a */
    public final synchronized int mo62832a() {
        return this.f116469b;
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            synchronized (this) {
                GpsStatus gpsStatus = null;
                try {
                    gpsStatus = this.f116468a.getGpsStatus(null);
                } catch (NullPointerException e) {
                }
                int i2 = 0;
                if (gpsStatus != null) {
                    for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
                        if (gpsSatellite.usedInFix()) {
                            i2++;
                        }
                    }
                }
                this.f116469b = i2;
            }
        }
    }
}
