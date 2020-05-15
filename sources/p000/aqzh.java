package p000;

import java.util.concurrent.Future;

/* renamed from: aqzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzh extends aqzj {

    /* renamed from: a */
    final /* synthetic */ bzww f87147a;

    /* renamed from: b */
    final /* synthetic */ aqzk f87148b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqzh(aqzk aqzk, int i, int i2, float f, bzww bzww) {
        super(i, i2, f);
        this.f87148b = aqzk;
        this.f87147a = bzww;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo48296a(int i) {
        sek sek = aqzk.f87154b;
        bxvd da = bzwx.f171692g.mo74144da();
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
        bzwx bzwx = (bzwx) da.f164949b;
        bzwv bzwv2 = (bzwv) da2.mo74062i();
        bzwv2.getClass();
        bzwx.f171696c = bzwv2;
        bzwx.f171694a |= 2;
        return (bzwx) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Future mo48297a() {
        return this.f87148b.mo48299a().mo48705a("post", cbxv.f178529a.mo6606a().mo75589c(), this.f87147a.mo73642k(), bzwx.f171692g);
    }
}
