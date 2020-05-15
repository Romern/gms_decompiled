package p000;

import android.os.SystemClock;

/* renamed from: voh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voh implements Runnable {

    /* renamed from: a */
    long f49644a;

    /* renamed from: b */
    long f49645b;

    /* renamed from: c */
    final /* synthetic */ voi f49646c;

    public voh(voi voi) {
        this.f49646c = voi;
    }

    /* renamed from: a */
    public final int mo28687a() {
        if (this.f49646c.f49667r != 4) {
            return 208;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f49644a;
        long j2 = this.f49645b;
        if (uptimeMillis <= j + j2) {
            return (int) (208 - (((uptimeMillis - j) * 208) / j2));
        }
        return 0;
    }

    public final void run() {
        if (this.f49646c.f49667r != 4) {
            this.f49645b = 200;
            this.f49644a = SystemClock.uptimeMillis();
            this.f49646c.mo28690a(4);
        } else if (mo28687a() > 0) {
            this.f49646c.f49672w.invalidate();
        } else {
            this.f49646c.mo28690a(0);
        }
    }
}
