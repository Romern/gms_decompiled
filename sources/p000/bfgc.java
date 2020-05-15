package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.location.collectionlib.RealCollectorConfig;

/* renamed from: bfgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgc implements SensorEventListener {

    /* renamed from: a */
    private final int f113739a;

    /* renamed from: b */
    private bfgb f113740b = null;

    /* renamed from: c */
    private final bffr f113741c;

    public bfgc(Context context, int i) {
        int i2 = bfib.f113998b;
        this.f113739a = i;
        bffr bffr = new bffr(context);
        this.f113741c = bffr;
        bffr.f113711a.registerListener(this, bffr.mo61623a(this.f113739a), 3);
    }

    /* renamed from: a */
    public final synchronized bfgb mo61641a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 100;
        while (this.f113740b == null && SystemClock.elapsedRealtime() < elapsedRealtime) {
            try {
                wait(100);
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Error reading sensor value: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        if (this.f113740b == null) {
            int i = this.f113739a;
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Reading sensor value timed out for sensor ");
            sb2.append(i);
            sb2.append(" after 100 ms");
            sb2.toString();
            this.f113741c.mo61625a(this);
        }
        return this.f113740b;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final synchronized void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == this.f113739a) {
            this.f113740b = new bfgb();
            bfgt bfgt = (bfgt) RealCollectorConfig.f150690b.get(Integer.valueOf(this.f113739a));
            if (bfgt != null) {
                bfgb bfgb = this.f113740b;
                bmxy.m108581a(bfgb);
                bfgb.f113735a = new float[bfgt.f113834A];
                for (int i = 0; i < bfgt.f113834A; i++) {
                    bfgb.f113735a[i] = sensorEvent.values[i];
                }
                bfgb.f113736b = sensorEvent.sensor;
                bfgb.f113737c = sensorEvent.timestamp;
                int i2 = Build.VERSION.SDK_INT;
                bfgb.f113738d = SystemClock.elapsedRealtimeNanos();
                String valueOf = String.valueOf(bfgb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                sb.append("Sensor value retrieved from OnChangeSensorSignalCollector: ");
                sb.append(valueOf);
                sb.toString();
                notifyAll();
                this.f113741c.mo61625a(this);
            }
        }
    }
}
