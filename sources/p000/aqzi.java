package p000;

import com.android.volley.RetryPolicy;
import java.util.concurrent.Future;

/* renamed from: aqzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzi extends aqzj {

    /* renamed from: a */
    final /* synthetic */ bzwy f87149a;

    /* renamed from: b */
    final /* synthetic */ aqzk f87150b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqzi(aqzk aqzk, int i, int i2, float f, bzwy bzwy) {
        super(i, i2, f);
        this.f87150b = aqzk;
        this.f87149a = bzwy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo48296a(int i) {
        sek sek = aqzk.f87154b;
        bxvd da = bzwz.f171704e.mo74144da();
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
        bzwz bzwz = (bzwz) da.f164949b;
        bzwv bzwv2 = (bzwv) da2.mo74062i();
        bzwv2.getClass();
        bzwz.f171708c = bzwv2;
        bzwz.f171706a |= 2;
        return (bzwz) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Future mo48297a() {
        RetryPolicy retryPolicy = this.f87150b.f87155c;
        rpr b = rpr.m34216b();
        return new aroh(b, b.getRequestQueue(), retryPolicy).mo48705a("post", cbxv.f178529a.mo6606a().mo75590d(), this.f87149a.mo73642k(), bzwz.f171704e);
    }
}
