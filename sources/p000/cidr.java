package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cidr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidr extends chst {

    /* renamed from: a */
    public final chss f189927a;

    /* renamed from: b */
    final /* synthetic */ cids f189928b;

    /* renamed from: c */
    private final AtomicBoolean f189929c = new AtomicBoolean(false);

    public cidr(cids cids, chss chss) {
        this.f189928b = cids;
        bmxy.m108582a(chss, "subchannel");
        this.f189927a = chss;
    }

    /* renamed from: a */
    public final chso mo85609a() {
        if (this.f189929c.compareAndSet(false, true)) {
            ((cick) this.f189928b.f189930c).f189771b.f189837l.execute(new cidq(this));
        }
        return chso.f189100a;
    }
}
