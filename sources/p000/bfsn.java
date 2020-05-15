package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: bfsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsn extends aaco {

    /* renamed from: a */
    public final SensorManager f115148a;

    /* renamed from: b */
    public final Sensor f115149b;

    /* renamed from: c */
    public final Handler f115150c;

    /* renamed from: d */
    public bscv f115151d;

    /* renamed from: e */
    private final adyq f115152e = new adyq(1500, 750, 50, 0.7f, 0.6f);

    public bfsn(SensorManager sensorManager, adyr adyr, Handler handler) {
        super("StepDetector", "location");
        this.f115148a = sensorManager;
        this.f115149b = sensorManager.getDefaultSensor(1);
        this.f115152e.f62924a = adyr;
        this.f115150c = handler;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        bscv bscv;
        if (sensorEvent.sensor.getType() == 1 && this.f115152e != null && (bscv = this.f115151d) != null) {
            long j = sensorEvent.timestamp;
            long j2 = bscv.f144124a;
            if (j2 == -1) {
                bscv.f144124a = j + 20000000;
            } else if (j >= j2) {
                bscv.f144124a = Math.max(j2 + 20000000, j);
            } else {
                return;
            }
            this.f115152e.mo33941a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()), sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
        }
    }
}
