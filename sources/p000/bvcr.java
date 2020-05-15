package p000;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcr implements bvat {

    /* renamed from: a */
    final /* synthetic */ bvct f155603a;

    public bvcr(bvct bvct) {
        this.f155603a = bvct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        bvai bvai = (bvai) bxxc;
        bxvd bxvd = (bxvd) bvai.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bvai);
        bvah bvah = (bvah) bxvd;
        bvaa d = this.f155603a.mo73288d();
        if (bvah.f164950c) {
            bvah.mo74035c();
            bvah.f164950c = false;
        }
        bvai bvai2 = (bvai) bvah.f164949b;
        bvai bvai3 = bvai.f155480d;
        d.getClass();
        bvai2.f155483b = d;
        bvai2.f155482a |= 1;
        bvai bvai4 = (bvai) bvah.mo74062i();
        bxvd da = bvbc.f155522h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbc bvbc = (bvbc) da.f164949b;
        bvbc.f155525b = 5;
        int i = bvbc.f155524a | 1;
        bvbc.f155524a = i;
        bvai4.getClass();
        bvbc.f155529f = bvai4;
        bvbc.f155524a = i | 16;
        this.f155603a.mo73316a(new OperationStatus((bvbc) da.mo74062i()));
    }
}
