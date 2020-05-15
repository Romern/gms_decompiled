package p000;

import java.util.concurrent.Callable;

/* renamed from: biaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biaj implements Runnable {

    /* renamed from: a */
    public final bial f120048a;

    /* renamed from: b */
    final /* synthetic */ biak f120049b;

    /* renamed from: c */
    private final Callable f120050c;

    public biaj(biak biak, Callable callable, bial bial) {
        this.f120049b = biak;
        this.f120048a = bial;
        this.f120050c = callable;
    }

    /* renamed from: a */
    private final void m101854a(Throwable th) {
        this.f120049b.f120051a.post(new biah(this, th));
    }

    public final void run() {
        try {
            Object call = this.f120050c.call();
            if (call != null) {
                this.f120049b.f120051a.post(new biai(this, call));
            } else {
                m101854a(new NullPointerException());
            }
        } catch (Exception e) {
            m101854a(e);
        }
    }
}
