package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: bgoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgoa implements SensorEventListener {

    /* renamed from: a */
    private final bgob f116894a;

    /* renamed from: b */
    private final bgod f116895b;

    public bgoa(bgns bgns, bgod bgod) {
        this.f116894a = new bgob(bgns, bgod);
        this.f116895b = bgod;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f116895b.f116901c.unregisterListener(this);
        this.f116894a.mo63030a();
    }
}
