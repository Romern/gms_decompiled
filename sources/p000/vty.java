package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* renamed from: vty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vty implements SensorEventListener {

    /* renamed from: a */
    public final Sensor f49972a;

    /* renamed from: b */
    public final SensorManager f49973b;

    /* renamed from: c */
    public vrd f49974c;

    /* renamed from: d */
    private final float f49975d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public vty(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f49973b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.f49972a = defaultSensor;
        if (defaultSensor != null) {
            this.f49975d = Math.min(defaultSensor.getMaximumRange(), 5.0f);
            return;
        }
        this.f49975d = 5.0f;
        vuk.m41322a();
        vuk.m41326e(context).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    /* renamed from: a */
    public final void mo28859a() {
        this.f49974c = null;
        this.f49973b.unregisterListener(this);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        vrd vrd;
        if (sensorEvent.values[0] >= this.f49975d && (vrd = this.f49974c) != null) {
            vrh vrh = vrd.f49838a;
            if (SystemClock.elapsedRealtime() <= vrh.f49851f) {
                vrh.mo28766c();
            }
            mo28859a();
        }
    }
}
