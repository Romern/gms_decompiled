package p000;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvco implements bvat {

    /* renamed from: a */
    final /* synthetic */ bvct f155600a;

    public bvco(bvct bvct) {
        this.f155600a = bvct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        buzl buzl = (buzl) bxxc;
        bxvd bxvd = (bxvd) buzl.mo74142c(5);
        bxvd.mo73625a((bxvk) buzl);
        bvaa d = this.f155600a.mo73288d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buzl buzl2 = (buzl) bxvd.f164949b;
        buzl buzl3 = buzl.f155397g;
        d.getClass();
        buzl2.f155400b = d;
        buzl2.f155399a |= 1;
        buzl buzl4 = (buzl) bxvd.mo74062i();
        bxvd da = bvbc.f155522h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbc bvbc = (bvbc) da.f164949b;
        bvbc.f155525b = 2;
        int i = bvbc.f155524a | 1;
        bvbc.f155524a = i;
        buzl4.getClass();
        bvbc.f155526c = buzl4;
        bvbc.f155524a = i | 2;
        this.f155600a.mo73316a(new OperationStatus((bvbc) da.mo74062i()));
    }
}
