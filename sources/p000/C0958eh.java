package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0958eh {

    /* renamed from: a */
    private final AtomicBoolean f14898a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C0953ec f14899b;

    /* renamed from: c */
    private volatile C0939dp f14900c;

    public C0958eh(C0953ec ecVar) {
        this.f14899b = ecVar;
    }

    /* renamed from: c */
    private final C0939dp m10397c() {
        return this.f14899b.mo9938a(mo10122a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo10122a();

    /* renamed from: a */
    public final void mo10123a(C0939dp dpVar) {
        if (dpVar == this.f14900c) {
            this.f14898a.set(false);
        }
    }

    /* renamed from: b */
    public final C0939dp mo10124b() {
        C0953ec.m10086j();
        if (!this.f14898a.compareAndSet(false, true)) {
            return m10397c();
        }
        if (this.f14900c == null) {
            this.f14900c = m10397c();
        }
        return this.f14900c;
    }
}
