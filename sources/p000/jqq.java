package p000;

import com.google.android.gms.auth.proximity.firstparty.Subscription;

/* renamed from: jqq */
final /* synthetic */ class jqq implements Runnable {

    /* renamed from: a */
    private final jqw f23074a;

    /* renamed from: b */
    private final Subscription f23075b;

    public jqq(jqw jqw, Subscription subscription) {
        this.f23074a = jqw;
        this.f23075b = subscription;
    }

    public final void run() {
        jqw jqw = this.f23074a;
        jqw.f23086a.mo25062a(this.f23075b);
    }
}
