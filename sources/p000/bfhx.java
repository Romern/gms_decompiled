package p000;

import android.hardware.SensorEvent;

/* renamed from: bfhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhx extends bfdl {

    /* renamed from: d */
    private final long f113979d;

    public bfhx(bfgs bfgs, bfev bfev, long j) {
        super(bfgs, bfev);
        this.f113979d = j;
    }

    /* renamed from: a */
    public final void mo61464a() {
        this.f113491c.postDelayed(this.f113489a, this.f113979d);
    }

    /* renamed from: a */
    public final void mo61465a(bfgt bfgt, long j, SensorEvent sensorEvent) {
    }

    /* renamed from: b */
    public final void mo61466b() {
        this.f113491c.removeCallbacks(this.f113489a);
    }
}
