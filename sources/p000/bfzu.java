package p000;

import android.hardware.location.GeofenceHardware;
import android.os.Binder;
import android.util.Log;
import com.android.location.provider.GeofenceProvider;

/* renamed from: bfzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfzu extends GeofenceProvider implements bfzv {

    /* renamed from: a */
    public static final bfzu f115822a = new bfzu();

    /* renamed from: b */
    private final Object f115823b = new Object();

    /* renamed from: c */
    private bfyu f115824c = null;

    /* renamed from: a */
    public final bfyu mo62517a() {
        bfyu bfyu;
        synchronized (this.f115823b) {
            bfyu = this.f115824c;
        }
        return bfyu;
    }

    public final void onGeofenceHardwareChange(GeofenceHardware geofenceHardware) {
        bfzt bfzt;
        bfyu bfyu;
        int callingUid = Binder.getCallingUid();
        if (callingUid == 1000) {
            synchronized (this.f115823b) {
                boolean z = bfxc.f115575a;
                int i = bfzt.f115788E;
                synchronized (bfzt.class) {
                    bfzt = bfzt.f115787A;
                }
                if (geofenceHardware != null) {
                    bfyu = new bfyu(geofenceHardware);
                } else {
                    bfyu = null;
                }
                this.f115824c = bfyu;
                if (bfzt != null) {
                    synchronized (bfzt.f115806k) {
                        boolean z2 = bfxc.f115575a;
                        bfzt.mo62553d(12);
                    }
                }
            }
        } else if (Log.isLoggable("GmsCoreGeofenceProvider", 5)) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Ignoring calls from non-system server. Uid=");
            sb.append(callingUid);
            bfxc.m98134c("GmsCoreGeofenceProvider", sb.toString());
        }
    }
}
