package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: bfsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsd extends aaco {

    /* renamed from: a */
    public final SensorManager f115104a;

    /* renamed from: b */
    public final Sensor f115105b;

    /* renamed from: c */
    public final Handler f115106c;

    /* renamed from: d */
    public final bfpj f115107d;

    /* renamed from: e */
    public int f115108e;

    /* renamed from: f */
    private final bfsc f115109f;

    public bfsd(SensorManager sensorManager, bfsc bfsc, Handler handler, bfpj bfpj) {
        super("PressureProvider", "location");
        this.f115104a = sensorManager;
        this.f115105b = sensorManager.getDefaultSensor(6);
        this.f115109f = bfsc;
        this.f115106c = handler;
        this.f115107d = bfpj;
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 6) {
            ((bfqs) this.f115109f).f114919d.mo70207a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()), sensorEvent.values[0]);
            this.f115108e++;
        }
    }
}
