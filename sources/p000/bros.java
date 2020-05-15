package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: bros */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bros implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143095a;

    /* renamed from: b */
    final /* synthetic */ brph f143096b;

    public bros(brph brph, brpj brpj) {
        this.f143096b = brph;
        this.f143095a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brqh brqh = (brqh) obj;
        this.f143096b.m114351a(new GetTokenResponse(brqh.f143180b, brqh.f143179a, Long.valueOf(brqr.m114478a(brqh.f143179a)), "Bearer"), null, null, false, null, this.f143095a, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143095a.mo69680a(brrv.m114516a(str));
    }
}
