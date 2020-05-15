package p000;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: edg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f14720a;

    /* renamed from: b */
    final /* synthetic */ Snapshot f14721b;

    /* renamed from: c */
    final /* synthetic */ edn f14722c;

    public edg(edn edn, int i, Snapshot snapshot) {
        this.f14722c = edn;
        this.f14720a = i;
        this.f14721b = snapshot;
    }

    public final void run() {
        this.f14722c.mo10005b(this.f14720a, this.f14721b);
    }
}
