package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: bign */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bign extends bhpv {

    /* renamed from: b */
    final /* synthetic */ aehm f120531b;

    /* renamed from: c */
    final /* synthetic */ bigu f120532c;

    /* renamed from: d */
    final /* synthetic */ bigx f120533d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bign(bigx bigx, rkb rkb, aehm aehm, bigu bigu) {
        super(rkb);
        this.f120533d = bigx;
        this.f120531b = aehm;
        this.f120532c = bigu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigx bigx = this.f120533d;
        aejs aejs = bigx.f120574x;
        rkb rkb = bigx.f120561k;
        return rkb.mo24795b(new aejp(rkb, this.f120531b.mo34149a(), this.f120533d.f120560j));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        super.mo9454a(status);
        this.f120533d.f120554d.post(new bigm(this, status));
    }
}
