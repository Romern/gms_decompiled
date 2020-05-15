package p000;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcp implements bvat {

    /* renamed from: a */
    final /* synthetic */ bvct f155601a;

    public bvcp(bvct bvct) {
        this.f155601a = bvct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        bvam bvam = (bvam) bxxc;
        bxvd bxvd = (bxvd) bvam.mo74142c(5);
        bxvd.mo73625a((bxvk) bvam);
        bvaa d = this.f155601a.mo73288d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvam bvam2 = (bvam) bxvd.f164949b;
        bvam bvam3 = bvam.f155493c;
        d.getClass();
        bvam2.f155496b = d;
        bvam2.f155495a |= 1;
        bvam bvam4 = (bvam) bxvd.mo74062i();
        bxvd da = bvbc.f155522h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbc bvbc = (bvbc) da.f164949b;
        bvbc.f155525b = 3;
        int i = bvbc.f155524a | 1;
        bvbc.f155524a = i;
        bvam4.getClass();
        bvbc.f155527d = bvam4;
        bvbc.f155524a = i | 4;
        this.f155601a.mo73316a(new OperationStatus((bvbc) da.mo74062i()));
    }
}
