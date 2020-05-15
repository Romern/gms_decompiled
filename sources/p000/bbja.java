package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbja {

    /* renamed from: a */
    private final belh f102763a;

    public bbja(belh belh) {
        this.f102763a = belh;
    }

    /* renamed from: a */
    public final bqgg mo56161a(bqeh bqeh, Executor executor) {
        AtomicReference atomicReference = new AtomicReference();
        return bqdx.m112674a(this.f102763a.mo60778a(new bbiy(bqeh, atomicReference), executor), new bbiz(atomicReference), bqfb.INSTANCE);
    }
}
