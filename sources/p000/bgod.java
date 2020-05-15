package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: bgod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgod implements bgnu {

    /* renamed from: a */
    public final String f116899a;

    /* renamed from: b */
    public final Object f116900b;

    /* renamed from: c */
    public final SensorManager f116901c;

    /* renamed from: d */
    public final boolean f116902d;

    /* renamed from: e */
    public final bfor f116903e;

    /* renamed from: f */
    public final bfos f116904f;

    /* renamed from: g */
    public bgnt f116905g;

    /* renamed from: h */
    private final Sensor f116906h;

    /* renamed from: i */
    private final boolean f116907i;

    /* renamed from: j */
    private final bgns f116908j;

    /* renamed from: k */
    private bgoc f116909k;

    /* renamed from: l */
    private bgoa f116910l;

    public bgod(SensorManager sensorManager, int i, boolean z, boolean z2, bgns bgns, bfor bfor, bfos bfos, String str) {
        this.f116900b = new Object();
        this.f116901c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        this.f116906h = defaultSensor;
        this.f116907i = z;
        this.f116908j = bgns;
        this.f116903e = bfor;
        this.f116904f = bfos;
        boolean z3 = false;
        if (defaultSensor != null && z2) {
            z3 = true;
        }
        this.f116902d = z3;
        this.f116899a = str;
    }

    /* renamed from: a */
    public final boolean mo63024a() {
        return this.f116902d;
    }

    /* renamed from: b */
    public final boolean mo63026b() {
        boolean z;
        synchronized (this.f116900b) {
            z = this.f116905g != null;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo63027c() {
        synchronized (this.f116900b) {
            if (this.f116905g != null) {
                this.f116905g = null;
                if (this.f116907i) {
                    this.f116901c.cancelTriggerSensor(this.f116909k, this.f116906h);
                } else {
                    this.f116901c.unregisterListener(this.f116910l);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo63025a(bgnt bgnt) {
        boolean z;
        synchronized (this.f116900b) {
            if (!this.f116902d) {
                throw new IllegalArgumentException("This trigger sensor is not supported on this device");
            } else if (!mo63026b()) {
                this.f116905g = bgnt;
                if (!this.f116907i) {
                    bgoa bgoa = new bgoa(this.f116908j, this);
                    this.f116910l = bgoa;
                    z = this.f116901c.registerListener(bgoa, this.f116906h, 0);
                } else {
                    bgoc bgoc = new bgoc(this.f116908j, this);
                    this.f116909k = bgoc;
                    z = this.f116901c.requestTriggerSensor(bgoc, this.f116906h);
                }
                if (z) {
                    return true;
                }
                return false;
            } else {
                throw new IllegalArgumentException("This trigger sensor is already enabled");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bgod(SensorManager sensorManager, boolean z) {
        this(sensorManager, 17, true, z, null, null, null, r0.toString());
        StringBuilder sb = new StringBuilder(33);
        sb.append("HardwareTriggerSensor.17");
    }
}
