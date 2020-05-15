package p000;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdgp implements bdgt {

    /* renamed from: a */
    public volatile bdfi f105596a;

    /* renamed from: b */
    public final Queue f105597b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final bmxv f105598c;

    public bdgp(bmxv bmxv) {
        new AtomicReference();
        new AtomicReference();
        this.f105598c = bmxv;
    }

    /* renamed from: a */
    private final void m90752a(bdgo bdgo) {
        synchronized (this.f105597b) {
            if (this.f105596a == null) {
                this.f105597b.add(bdgo);
            } else {
                bdgo.mo58022a(this.f105596a);
            }
        }
    }

    /* renamed from: a */
    public final void mo57993a(bdii bdii, cinu cinu, cimz cimz) {
    }

    /* renamed from: b */
    public final void mo57999b() {
        this.f105597b.clear();
    }

    /* renamed from: c */
    public final void mo58002c() {
        m90752a(bdgk.f105588a);
    }

    /* renamed from: d */
    public final bdij mo58003d() {
        return !this.f105598c.mo66813a() ? bdij.f105693c : bdij.m90859a();
    }

    /* renamed from: e */
    public final void mo58004e() {
        m90752a(bdgj.f105587a);
    }

    /* renamed from: a */
    public final void mo58023a(bdfi bdfi) {
        bdgo bdgo = (bdgo) this.f105597b.poll();
        while (bdgo != null) {
            bdgo.mo58022a(bdfi);
            bdgo = (bdgo) this.f105597b.poll();
        }
    }

    /* renamed from: a */
    public final void mo57994a(bdij bdij, String str, boolean z) {
        if (!bdij.m90860a(bdij)) {
            bdij.mo58070b();
            m90752a(new bdgi(bdij, str, z));
        }
    }

    /* renamed from: a */
    public final void mo57995a(bdil bdil, String str, long j, long j2, cimz cimz) {
        m90752a(new bdgn(bdil, str, j, j2, cimz));
    }

    /* renamed from: a */
    public final void mo57996a(bdnd bdnd) {
        m90752a(new bdgm(bdnd));
    }

    /* renamed from: a */
    public final void mo57997a(String str) {
        m90752a(new bdgl(str));
    }
}
