package p000;

import android.os.Bundle;

/* renamed from: argk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f87663a;

    /* renamed from: b */
    final /* synthetic */ String f87664b;

    /* renamed from: c */
    final /* synthetic */ argm f87665c;

    public argk(argm argm, int i, String str) {
        this.f87665c = argm;
        this.f87663a = i;
        this.f87664b = str;
    }

    public final void run() {
        argm argm = this.f87665c;
        if (!argm.f87689t) {
            argm.f87679j.mo48402a(this.f87663a);
            this.f87665c.f87683n.mo48746a(2051, Bundle.EMPTY);
            this.f87665c.f87680k.mo48306a(this.f87663a, this.f87664b);
            this.f87665c.mo48242a();
            return;
        }
        argm.f87667h.mo25412b("Dropping error %s", araj.m72321a(this.f87663a));
    }
}
