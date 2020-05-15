package p000;

import android.os.IBinder;

/* renamed from: nmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nmh implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ nmi f36031a;

    /* renamed from: b */
    final nsm f36032b;

    /* renamed from: c */
    private volatile boolean f36033c = true;

    public nmh(nmi nmi, nsm nsm) {
        this.f36031a = nmi;
        this.f36032b = nsm;
    }

    /* renamed from: a */
    public final void mo21143a() {
        if (this.f36033c) {
            this.f36032b.f12819a.unlinkToDeath(this, 0);
            this.f36033c = false;
        }
    }

    public final void binderDied() {
        this.f36032b.f12819a.unlinkToDeath(this, 0);
        nmi nmi = this.f36031a;
        synchronized (nmi.f36034a) {
            mo21143a();
            nmi.f36035b.remove(this);
            nmi.f36035b.size();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nmh) && this.f36032b.f12819a == ((nmh) obj).f36032b.f12819a;
    }

    public final int hashCode() {
        return this.f36032b.f12819a.hashCode();
    }
}
