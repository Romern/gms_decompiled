package p000;

import android.content.ComponentName;

/* renamed from: fkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f16810a;

    /* renamed from: b */
    final /* synthetic */ fks f16811b;

    public fkr(fks fks, ComponentName componentName) {
        this.f16811b = fks;
        this.f16810a = componentName;
    }

    public final void run() {
        fkt fkt = this.f16811b.f16814c;
        ComponentName componentName = this.f16810a;
        fje.m11804a();
        if (fkt.f16816b != null) {
            fkt.f16816b = null;
            fkt.mo10926a("Disconnected from device AnalyticsService", componentName);
            fkt.mo10973v();
        }
    }
}
