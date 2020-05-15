package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.WorkSource;
import java.util.concurrent.Executor;

/* renamed from: bgkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgkj extends bgki {

    /* renamed from: a */
    private static boolean f116708a = false;

    /* renamed from: b */
    private boolean f116709b;

    /* renamed from: a */
    public final int mo62945a(SensorManager sensorManager, int i) {
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        if (defaultSensor != null) {
            return defaultSensor.getFifoMaxEventCount();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo62946a(AlarmManager alarmManager, long j, PendingIntent pendingIntent, bgmj bgmj) {
        bgmj bgmj2 = bgmj;
        if (bgmj2 instanceof bhcv) {
            WorkSource workSource = ((bhcw) bgmj2).f118316a;
            if (workSource != null) {
                try {
                    alarmManager.set(2, j, -1, 0, pendingIntent, workSource);
                    return;
                } catch (Exception e) {
                }
            } else {
                super.mo62946a(alarmManager, j, pendingIntent, bgmj);
                return;
            }
        }
        try {
            super.mo62946a(alarmManager, j, pendingIntent, bgmj);
        } catch (SecurityException e2) {
        }
    }

    /* renamed from: a */
    public void mo62947a(Context context, bgkg bgkg, boolean z, bgmj bgmj, boolean z2, bfor bfor, Executor executor) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (bgmj instanceof bhcv) {
            WorkSource workSource = ((bhcw) bgmj).f118316a;
            if (workSource == null) {
                try {
                    wifiManager.startScan();
                    return;
                } catch (Exception e) {
                }
            } else {
                wifiManager.startScan(workSource);
                return;
            }
        }
        try {
            wifiManager.startScan();
        } catch (NullPointerException e2) {
        }
    }

    /* renamed from: a */
    public final void mo62948a(Context context, String str, LocationListener locationListener, Looper looper) {
        boolean z;
        if (!this.f116709b) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (!f116708a) {
                if (svr.m36484b(context).mo26169a("android.permission.UPDATE_APP_OPS_STATS") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                f116708a = z;
            }
            if (f116708a) {
                try {
                    LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, 0, 0.0f, false);
                    createFromDeprecatedProvider.setHideFromAppOps(true);
                    locationManager.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
                    return;
                } catch (Exception e) {
                }
            }
            try {
                locationManager.requestLocationUpdates(str, 0, 0.0f, locationListener);
            } catch (NullPointerException e2) {
                this.f116709b = true;
                super.mo62948a(context, str, locationListener, looper);
            }
        } else {
            super.mo62948a(context, str, locationListener, looper);
        }
    }
}
