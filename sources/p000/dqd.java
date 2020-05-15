package p000;

import java.util.concurrent.Executor;

/* renamed from: dqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqd implements dqb {

    /* renamed from: a */
    public sns f13808a = null;

    /* renamed from: b */
    public dqb f13809b = null;

    /* renamed from: c */
    private final void m9073c() {
        if (!mo9437a()) {
            throw new IllegalStateException("Internal thread is not running.");
        }
    }

    /* renamed from: a */
    public final Executor mo9432a(dqx dqx) {
        return new dqc(this, dqx);
    }

    /* renamed from: a */
    public final boolean mo9437a() {
        return this.f13809b != null;
    }

    /* renamed from: b */
    public final void mo9438b() {
        if (!mo9437a()) {
            sns sns = new sns(9);
            this.f13808a = sns;
            sns.start();
            this.f13809b = new dqg(this.f13808a);
        }
    }

    /* renamed from: a */
    public final void mo9433a(Runnable runnable) {
        if (mo9437a()) {
            this.f13809b.mo9433a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo9434a(Runnable runnable, long j, dqx dqx) {
        m9073c();
        this.f13809b.mo9434a(runnable, j, dqx);
    }

    /* renamed from: a */
    public final void mo9435a(Runnable runnable, dqx dqx) {
        dqx.mo9462a();
        m9073c();
        this.f13809b.mo9435a(runnable, dqx);
    }
}
