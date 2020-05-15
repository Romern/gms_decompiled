package p000;

import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcq implements bvat {

    /* renamed from: a */
    final /* synthetic */ bvct f155602a;

    public bvcq(bvct bvct) {
        this.f155602a = bvct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        buyr buyr = (buyr) bxxc;
        bxvd bxvd = (bxvd) buyr.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) buyr);
        bvaa d = this.f155602a.mo73288d();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buyr buyr2 = (buyr) bxvd.f164949b;
        buyr buyr3 = buyr.f155331c;
        d.getClass();
        buyr2.f155334b = d;
        buyr2.f155333a |= 1;
        buyr buyr4 = (buyr) bxvd.mo74062i();
        bxvd da = bvbc.f155522h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvbc bvbc = (bvbc) da.f164949b;
        bvbc.f155525b = 4;
        int i = bvbc.f155524a | 1;
        bvbc.f155524a = i;
        buyr4.getClass();
        bvbc.f155528e = buyr4;
        bvbc.f155524a = i | 8;
        this.f155602a.mo73316a(new OperationStatus((bvbc) da.mo74062i()));
    }
}
