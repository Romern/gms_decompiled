package p000;

import android.hardware.SensorEvent;
import android.os.Looper;

/* renamed from: bfgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bfgs {

    /* renamed from: a */
    private volatile boolean f113801a = false;

    /* renamed from: b */
    private volatile boolean f113802b = false;

    /* renamed from: c */
    private volatile bfgr f113803c;

    /* renamed from: g */
    protected final bhdb f113804g;

    /* renamed from: h */
    public final bfev f113805h;

    /* renamed from: i */
    protected final bfew f113806i;

    /* renamed from: j */
    protected final bfkx f113807j;

    /* renamed from: k */
    protected volatile bfdl f113808k;

    public bfgs(bfev bfev, bfew bfew, bhdb bhdb) {
        boolean z = false;
        bmxy.m108582a(bfev, "No Handler specified!");
        this.f113805h = bfev;
        this.f113804g = bfib.m96837a(bhdb);
        this.f113807j = new bfkx(getClass().getSimpleName());
        Looper looper = bfev.getLooper();
        if (looper != null) {
            bmxy.m108589a(this.f113807j.f114324a == looper.getThread() ? true : z, "Scanner should be called in handler's thread.");
        }
        this.f113806i = bfew;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61527a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61670a(bfdl bfdl, bfgr bfgr) {
        this.f113807j.mo61864a();
        bmxy.m108589a(!this.f113801a, "Start should be called only once!");
        this.f113808k = bfdl;
        if (bfdl != null) {
            bfdl.mo61464a();
        }
        this.f113803c = bfgr;
        mo61527a();
        this.f113801a = true;
        new Object[1][0] = getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo61529b();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo61673h() {
        bmxy.m108589a(this.f113801a, "Call start before calling stop!");
        if (!this.f113802b) {
            this.f113802b = true;
            if (this.f113808k != null) {
                this.f113808k.mo61466b();
            }
            mo61529b();
            new Object[1][0] = getClass().getSimpleName();
            return;
        }
        new Object[1][0] = getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final synchronized boolean mo61674i() {
        return this.f113802b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo61671a(bfgr bfgr) {
        mo61670a(null, bfgr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61672a(bfgt bfgt, long j, SensorEvent sensorEvent) {
        if (this.f113803c != null) {
            bfey bfey = (bfey) this.f113803c;
            if (bfey.f113808k != null) {
                bfey.f113808k.mo61465a(bfgt, j, sensorEvent);
            }
        }
    }
}
