package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;

/* renamed from: bgjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgjx implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ bgjy f116668a;

    /* renamed from: b */
    private final long f116669b;

    public bgjx(bgjy bgjy, long j) {
        this.f116668a = bgjy;
        this.f116669b = j;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (SystemClock.elapsedRealtime() - this.f116669b >= 1000) {
            this.f116668a.f116671b.mo62048a(bfos.WAKE_UP_TILT);
            this.f116668a.f116670a.mo62921a((Runnable) new bgjw(this));
        }
    }
}
