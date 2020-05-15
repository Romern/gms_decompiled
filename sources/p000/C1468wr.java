package p000;

import android.view.View;

/* renamed from: wr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1468wr implements C1286py {

    /* renamed from: a */
    int f27529a;

    /* renamed from: b */
    final /* synthetic */ C1469ws f27530b;

    /* renamed from: c */
    private boolean f27531c = false;

    protected C1468wr(C1469ws wsVar) {
        this.f27530b = wsVar;
    }

    /* renamed from: a */
    public final void mo483a() {
        this.f27531c = true;
    }

    /* renamed from: a */
    public final void mo16447a(C1285px pxVar, int i) {
        this.f27530b.f27537f = pxVar;
        this.f27529a = i;
    }

    /* renamed from: b */
    public final void mo485b() {
        C1468wr.super.setVisibility(0);
        this.f27531c = false;
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        if (!this.f27531c) {
            C1469ws wsVar = this.f27530b;
            wsVar.f27537f = null;
            C1468wr.super.setVisibility(this.f27529a);
        }
    }
}
