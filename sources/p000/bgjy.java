package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* renamed from: bgjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjy {

    /* renamed from: a */
    public final bgns f116670a;

    /* renamed from: b */
    public final bfor f116671b;

    /* renamed from: c */
    public bgnw f116672c;

    /* renamed from: d */
    private final SensorManager f116673d;

    /* renamed from: e */
    private final Sensor f116674e;

    /* renamed from: f */
    private final boolean f116675f;

    /* renamed from: g */
    private bgjx f116676g;

    public bgjy(SensorManager sensorManager, bgns bgns, bfor bfor) {
        this.f116673d = sensorManager;
        this.f116674e = sensorManager.getDefaultSensor(22);
        this.f116670a = bgns;
        this.f116671b = bfor;
        boolean z = false;
        if (cese.f183399a.mo6606a().wakeUpTiltDetectorEnabled() && this.f116674e != null) {
            z = true;
        }
        this.f116675f = z;
        StringBuilder sb = new StringBuilder(50);
        sb.append("HardwareWakeUpTiltDetector.isSupportedDevice=");
        sb.append(z);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo62931a() {
        if (this.f116672c != null) {
            this.f116672c = null;
            this.f116673d.unregisterListener(this.f116676g);
        }
    }

    /* renamed from: b */
    public final boolean mo62933b() {
        return this.f116675f;
    }

    /* renamed from: a */
    public final void mo62932a(bgnw bgnw) {
        if (this.f116675f) {
            bgnw bgnw2 = this.f116672c;
            if (bgnw2 == null) {
                this.f116672c = bgnw;
                bgjx bgjx = new bgjx(this, SystemClock.elapsedRealtime());
                this.f116676g = bgjx;
                this.f116673d.registerListener(bgjx, this.f116674e, 0);
            } else if (bgnw2 != bgnw) {
                throw new UnsupportedOperationException("Tilt detector already enabled");
            }
        } else {
            throw new UnsupportedOperationException("Tilt detector is not supported on this device");
        }
    }
}
