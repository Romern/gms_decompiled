package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bgle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgle implements bglk {

    /* renamed from: a */
    public final ReentrantLock f116750a;

    /* renamed from: b */
    public final Condition f116751b;

    /* renamed from: c */
    public Boolean f116752c = null;

    /* renamed from: d */
    public List f116753d = Collections.emptyList();

    /* renamed from: e */
    private final bgll f116754e;

    public bgle(bgll bgll) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f116750a = reentrantLock;
        this.f116751b = reentrantLock.newCondition();
        this.f116754e = bgll;
        bgll.f116769e = this;
    }

    /* renamed from: a */
    public final boolean mo62973a() {
        this.f116750a.lock();
        try {
            mo62974b();
            return this.f116752c.booleanValue();
        } finally {
            this.f116750a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo62974b() {
        if (this.f116752c == null) {
            try {
                if (mo62975c()) {
                    long nanos = TimeUnit.SECONDS.toNanos(1);
                    while (this.f116752c == null && nanos > 0) {
                        nanos = this.f116751b.awaitNanos(nanos);
                    }
                }
                if (this.f116752c != null) {
                    return;
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Interrupted while waiting for query response: ");
                } else {
                    "Interrupted while waiting for query response: ".concat(valueOf);
                }
                if (this.f116752c != null) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f116752c == null) {
                    this.f116752c = false;
                    this.f116753d = Collections.emptyList();
                }
                throw th;
            }
            this.f116752c = false;
            this.f116753d = Collections.emptyList();
        }
    }

    /* renamed from: c */
    public final boolean mo62975c() {
        return this.f116754e.mo62982a(bgld.m99231a(bubs.QUERY));
    }

    /* renamed from: d */
    public final void mo62976d() {
        this.f116750a.lock();
        try {
            this.f116752c = null;
            this.f116753d = Collections.emptyList();
        } finally {
            this.f116750a.unlock();
        }
    }

    /* renamed from: e */
    public final int[] mo62977e() {
        return ((long) this.f116754e.mo62983b()) >= cety.m138243d() ? bgmw.f116832o : bgmw.f116831n;
    }
}
