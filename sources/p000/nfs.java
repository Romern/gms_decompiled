package p000;

import android.os.Looper;

/* renamed from: nfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfs {

    /* renamed from: a */
    public static volatile nfs f35464a;

    /* renamed from: b */
    private final C1245ok f35465b = new C1245ok();

    /* renamed from: a */
    public final synchronized int mo20566a() {
        return this.f35465b.f26809h;
    }

    /* renamed from: a */
    public final synchronized nfu mo20567a(int i) {
        return (nfu) this.f35465b.mo8152d(i);
    }

    /* renamed from: a */
    public final synchronized nfu mo20568a(rod rod, nej nej) {
        nfu nfu;
        nfu = (nfu) this.f35465b.get(nej);
        if (nfu == null) {
            nfu = new nfu(rod);
            this.f35465b.put(nej, nfu);
        }
        return nfu;
    }

    /* renamed from: a */
    public final synchronized rod mo20569a(nej nej, String str) {
        nfu nfu;
        nfu = (nfu) this.f35465b.get(nej);
        return nfu == null ? roe.m34172a(nej, Looper.getMainLooper(), str) : nfu.f35466a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized rod mo20570a(rkb rkb, nej nej) {
        nfu nfu = (nfu) this.f35465b.get(nej);
        if (nfu != null) {
            return nfu.f35466a;
        }
        return rkb.mo24788a(nej);
    }

    /* renamed from: a */
    public final synchronized void mo20571a(nej nej) {
        nfu nfu = (nfu) this.f35465b.remove(nej);
        if (nfu != null) {
            nfu.f35466a.mo24967a();
        }
    }
}
