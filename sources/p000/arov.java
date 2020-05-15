package p000;

import android.os.Bundle;

/* renamed from: arov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arov implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arok f88034a;

    /* renamed from: b */
    final /* synthetic */ int f88035b;

    /* renamed from: c */
    final /* synthetic */ Bundle f88036c;

    /* renamed from: d */
    final /* synthetic */ arow f88037d;

    public arov(arow arow, arok arok, int i, Bundle bundle) {
        this.f88037d = arow;
        this.f88034a = arok;
        this.f88035b = i;
        this.f88036c = bundle;
    }

    public final void run() {
        C1240of ofVar;
        Object obj;
        this.f88034a.mo48707b(this.f88035b, this.f88036c);
        arow arow = this.f88037d;
        arok arok = arow.f88039b;
        if (arok != null && (ofVar = (C1240of) arow.f88038a.poll()) != null && (obj = ofVar.f26798a) != null && ofVar.f26799b != null) {
            this.f88037d.mo48724a(arok, ((Integer) obj).intValue(), (Bundle) ofVar.f26799b);
        }
    }
}
