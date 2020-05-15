package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: agmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmb extends agcu {

    /* renamed from: b */
    public Handler f65919b;

    /* renamed from: c */
    protected final agma f65920c = new agma(this);

    /* renamed from: d */
    protected final aglz f65921d = new aglz(this);

    /* renamed from: e */
    protected final aglx f65922e = new aglx(this);

    public agmb(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    public final boolean mo35651a(boolean z, boolean z2, long j) {
        return this.f65921d.mo35647a(z, z2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo35247n() {
        return false;
    }

    /* renamed from: o */
    public final void mo35652o() {
        mo35241h();
        if (this.f65919b == null) {
            this.f65919b = new adzt(Looper.getMainLooper());
        }
    }
}
