package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* renamed from: ddo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ddo extends bntm {

    /* renamed from: a */
    private volatile bnsx f12941a;

    public ddo(String str, bnsx bnsx) {
        super(str);
        this.f12941a = bnsx;
        new AtomicBoolean(true);
    }

    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        this.f12941a.mo8544a(bnsw);
    }

    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        bntp bntp = ddp.f12942a;
        return this.f12941a.mo8545a(level);
    }
}
