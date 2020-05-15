package p000;

import com.google.android.gms.auth.proximity.firstparty.Subscription;

/* renamed from: jqr */
final /* synthetic */ class jqr implements Runnable {

    /* renamed from: a */
    private final jqw f23076a;

    /* renamed from: b */
    private final Subscription f23077b;

    public jqr(jqw jqw, Subscription subscription) {
        this.f23076a = jqw;
        this.f23077b = subscription;
    }

    public final void run() {
        jqw jqw = this.f23076a;
        jqw.f23086a.mo25067b(this.f23077b);
    }
}
