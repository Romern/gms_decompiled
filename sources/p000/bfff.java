package p000;

import android.hardware.SensorEvent;

/* renamed from: bfff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfff extends bfdl {

    /* renamed from: d */
    private final bfgy f113632d;

    /* renamed from: e */
    private int f113633e = 0;

    /* renamed from: f */
    private long f113634f = -1;

    public bfff(bfgs bfgs, bfev bfev, bfgy bfgy) {
        super(bfgs, bfev);
        this.f113632d = bfgy;
    }

    /* renamed from: a */
    public final void mo61464a() {
        this.f113491c.postDelayed(this.f113489a, this.f113632d.f113852b);
    }

    /* renamed from: b */
    public final void mo61466b() {
        this.f113491c.removeCallbacks(this.f113489a);
    }

    /* renamed from: a */
    public final void mo61465a(bfgt bfgt, long j, SensorEvent sensorEvent) {
        if (bfgt == bfgt.f113814d) {
            int i = this.f113633e;
            bfgy bfgy = this.f113632d;
            int i2 = bfgy.f113851a;
            if (i < i2) {
                int i3 = i + 1;
                this.f113633e = i3;
                if (i3 >= i2) {
                    this.f113491c.removeCallbacks(this.f113489a);
                    this.f113491c.postDelayed(this.f113489a, this.f113632d.f113853c + 60);
                    return;
                }
                return;
            }
            long j2 = this.f113634f;
            if (j2 < 0) {
                this.f113634f = j;
            } else if (j - j2 >= bfgy.f113853c) {
                this.f113491c.postAtFrontOfQueue(this.f113489a);
            }
        }
    }
}
