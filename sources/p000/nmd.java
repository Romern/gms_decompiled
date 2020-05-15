package p000;

import android.os.IBinder;

/* renamed from: nmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nmd implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final int f36010a;

    /* renamed from: b */
    final /* synthetic */ nme f36011b;

    /* renamed from: c */
    public final nsd f36012c;

    public nmd(nme nme, int i, nsd nsd) {
        this.f36011b = nme;
        this.f36012c = nsd;
        this.f36010a = i;
    }

    public final void binderDied() {
        synchronized (this.f36011b.f36014b) {
            this.f36011b.mo21107a(this);
        }
    }
}
