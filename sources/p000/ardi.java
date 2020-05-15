package p000;

import android.os.Bundle;

/* renamed from: ardi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f87422a;

    /* renamed from: b */
    final /* synthetic */ String f87423b;

    /* renamed from: c */
    final /* synthetic */ ardn f87424c;

    public ardi(ardn ardn, int i, String str) {
        this.f87424c = ardn;
        this.f87422a = i;
        this.f87423b = str;
    }

    public final void run() {
        ardn ardn = this.f87424c;
        if (!ardn.f87456t) {
            ardn.f87447k.mo48402a(this.f87422a);
            this.f87424c.f87451o.mo48746a(1013, Bundle.EMPTY);
            this.f87424c.f87449m.mo48306a(this.f87422a, this.f87423b);
            this.f87424c.mo48242a();
            return;
        }
        ardn.f87438h.mo25412b("Transfer canceled; dropping error %s", araj.m72321a(this.f87422a));
    }
}
