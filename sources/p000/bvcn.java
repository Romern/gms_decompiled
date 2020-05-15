package p000;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcn implements bvat {

    /* renamed from: a */
    final /* synthetic */ bvct f155599a;

    public bvcn(bvct bvct) {
        this.f155599a = bvct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        buyn buyn = (buyn) bxxc;
        bxvd bxvd = (bxvd) buyn.mo74142c(5);
        bxvd.mo73625a((bxvk) buyn);
        bvaa d = this.f155599a.mo73288d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buyn buyn2 = (buyn) bxvd.f164949b;
        buyn buyn3 = buyn.f155316e;
        d.getClass();
        buyn2.f155319b = d;
        buyn2.f155318a |= 1;
        buyn buyn4 = (buyn) bxvd.mo74062i();
        bxvd da = bvbc.f155522h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbc bvbc = (bvbc) da.f164949b;
        bvbc.f155525b = 8;
        int i = bvbc.f155524a | 1;
        bvbc.f155524a = i;
        buyn4.getClass();
        bvbc.f155530g = buyn4;
        bvbc.f155524a = i | 32;
        this.f155599a.mo73316a(new OperationStatus((bvbc) da.mo74062i()));
    }
}
