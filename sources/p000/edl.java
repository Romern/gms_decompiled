package p000;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: edl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edl extends dqi {

    /* renamed from: a */
    final /* synthetic */ long f14729a;

    /* renamed from: b */
    final /* synthetic */ edm f14730b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public edl(edm edm, String str, Object[] objArr, long j) {
        super(str, objArr);
        this.f14730b = edm;
        this.f14729a = j;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f14730b.f14733c.mo10003a(13, (Snapshot) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        Void voidR = (Void) obj;
        dwq.m9667k().mo9434a(this.f14730b, this.f14729a, dqy.m9123a("BeaconSnapshotSubscribeTimeout"));
    }
}
