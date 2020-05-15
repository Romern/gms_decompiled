package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpe implements brpv {

    /* renamed from: a */
    final /* synthetic */ String f143119a;

    /* renamed from: b */
    final /* synthetic */ brpj f143120b;

    /* renamed from: c */
    final /* synthetic */ brph f143121c;

    public brpe(brph brph, String str, brpj brpj) {
        this.f143121c = brph;
        this.f143119a = str;
        this.f143120b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        String str = getTokenResponse.f152527b;
        brra brra = new brra();
        brra.mo69812c(str);
        brra.mo69813d(this.f143119a);
        this.f143121c.mo69751a(this.f143120b, getTokenResponse, brra, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143120b.mo69680a(brrv.m114516a(str));
    }
}
