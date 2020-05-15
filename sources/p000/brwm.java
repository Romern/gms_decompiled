package p000;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: brwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brwm extends chqs {

    /* renamed from: a */
    public final Queue f143527a = new ArrayDeque();

    /* renamed from: b */
    public chqs f143528b = null;

    /* renamed from: c */
    public chqr f143529c;

    /* renamed from: d */
    public boolean f143530d = false;

    /* renamed from: e */
    private final bqgg f143531e;

    /* renamed from: f */
    private final Executor f143532f = bqgs.m112813a(bqfb.INSTANCE);

    public brwm(bqgg bqgg) {
        this.f143531e = bqgg;
    }

    /* renamed from: a */
    private final void m114799a(Runnable runnable) {
        this.f143532f.execute(new brwk(this, runnable));
    }

    /* renamed from: b */
    public final void mo70032b() {
        m114799a((Runnable) new brwi(this));
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f143528b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo70029a(int i) {
        m114799a((Runnable) new brwg(this, i));
    }

    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        this.f143529c = chqr;
        bqga.m112781a(this.f143531e, new brwl(this, chqr), this.f143532f);
        m114799a((Runnable) new brwf(this, chqr, chtr));
    }

    /* renamed from: a */
    public final void mo70030a(Object obj) {
        m114799a((Runnable) new brwj(this, obj));
    }

    /* renamed from: a */
    public final void mo70031a(String str, Throwable th) {
        m114799a((Runnable) new brwh(this, str, th));
    }
}
