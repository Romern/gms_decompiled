package p000;

import android.hardware.SensorEvent;

/* renamed from: bfdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfdl {

    /* renamed from: a */
    protected final Runnable f113489a = new bfdk(this);

    /* renamed from: b */
    public final bfgs f113490b;

    /* renamed from: c */
    public final bfev f113491c;

    public bfdl(bfgs bfgs, bfev bfev) {
        this.f113490b = bfgs;
        this.f113491c = bfev;
    }

    /* renamed from: a */
    public abstract void mo61464a();

    /* renamed from: a */
    public abstract void mo61465a(bfgt bfgt, long j, SensorEvent sensorEvent);

    /* renamed from: b */
    public abstract void mo61466b();
}
