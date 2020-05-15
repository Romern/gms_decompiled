package p000;

import android.content.SyncResult;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: amvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvm {

    /* renamed from: a */
    public Exception f76023a;

    /* renamed from: b */
    public final anaz f76024b;

    /* renamed from: c */
    private final amwp f76025c;

    /* renamed from: d */
    private final Object f76026d = new Object();

    /* renamed from: e */
    private final Set f76027e = new HashSet();

    public amvm(amwp amwp, anaz anaz) {
        this.f76025c = amwp;
        this.f76024b = anaz;
        mo41391a(Thread.currentThread());
    }

    /* renamed from: b */
    private final boolean m63391b() {
        return this.f76023a != null;
    }

    /* renamed from: c */
    public static final void m63392c(Thread thread) {
        if (thread != null) {
            thread.getId();
        }
    }

    /* renamed from: a */
    public final void mo41389a() {
        synchronized (this.f76026d) {
            if (!m63391b()) {
                amwp amwp = this.f76025c;
                if (amwp != null) {
                    SyncResult syncResult = ((anbh) this.f76024b).f76541a;
                    synchronized (amwp.f76203a) {
                        if (amwp.f76204b != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - amwp.f76207e > 2000) {
                                amwp.mo41501a(amwp.f76204b, "still-working", syncResult);
                                amwp.f76207e = elapsedRealtime;
                            }
                        }
                    }
                }
            } else {
                throw new amyc(this.f76023a);
            }
        }
    }

    /* renamed from: b */
    public final void mo41392b(Thread thread) {
        synchronized (this.f76026d) {
            if (thread != null) {
                if (this.f76027e.remove(thread)) {
                    thread.getId();
                    this.f76027e.size();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41390a(Exception exc) {
        sdo.m34959a(exc);
        synchronized (this.f76026d) {
            if (!m63391b()) {
                this.f76023a = exc;
                if (this.f76027e.size() > 0) {
                    for (Thread thread : this.f76027e) {
                        thread.interrupt();
                    }
                    this.f76027e.size();
                    this.f76027e.clear();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41391a(Thread thread) {
        synchronized (this.f76026d) {
            if (!m63391b()) {
                if (thread != null) {
                    if (!this.f76027e.contains(thread)) {
                        this.f76027e.add(thread);
                        thread.getId();
                        this.f76027e.size();
                    }
                }
            }
        }
    }
}
