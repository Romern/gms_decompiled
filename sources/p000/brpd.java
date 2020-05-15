package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpd implements brpv {

    /* renamed from: a */
    final /* synthetic */ String f143116a;

    /* renamed from: b */
    final /* synthetic */ brpj f143117b;

    /* renamed from: c */
    final /* synthetic */ brph f143118c;

    public brpd(brph brph, String str, brpj brpj) {
        this.f143118c = brph;
        this.f143116a = str;
        this.f143117b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        brra brra = new brra();
        brra.mo69812c(getTokenResponse.f152527b);
        brra.mo69811b(this.f143116a);
        this.f143118c.mo69751a(this.f143117b, getTokenResponse, brra, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143117b.mo69680a(brrv.m114516a(str));
    }
}
