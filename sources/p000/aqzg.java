package p000;

import java.util.concurrent.Future;

/* renamed from: aqzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzg extends aqzj {

    /* renamed from: a */
    final /* synthetic */ bzws f87145a;

    /* renamed from: b */
    final /* synthetic */ aqzk f87146b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqzg(aqzk aqzk, int i, int i2, float f, bzws bzws) {
        super(i, i2, f);
        this.f87146b = aqzk;
        this.f87145a = bzws;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo48296a(int i) {
        sek sek = aqzk.f87154b;
        bxvd da = bzwt.f171675d.mo74144da();
        bxvd da2 = bzwv.f171681c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzwv bzwv = (bzwv) da2.f164949b;
        bzwv.f171684b = i;
        bzwv.f171683a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzwt bzwt = (bzwt) da.f164949b;
        bzwv bzwv2 = (bzwv) da2.mo74062i();
        bzwv2.getClass();
        bzwt.f171679c = bzwv2;
        bzwt.f171677a |= 2;
        return (bzwt) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Future mo48297a() {
        return this.f87146b.mo48299a().mo48705a("post", cbxv.f178529a.mo6606a().mo75591e(), this.f87145a.mo73642k(), bzwt.f171675d);
    }
}
