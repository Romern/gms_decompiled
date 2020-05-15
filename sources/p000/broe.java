package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: broe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class broe implements brpv {

    /* renamed from: a */
    final /* synthetic */ String f143060a;

    /* renamed from: b */
    final /* synthetic */ String f143061b;

    /* renamed from: c */
    final /* synthetic */ brpj f143062c;

    /* renamed from: d */
    final /* synthetic */ brph f143063d;

    public broe(brph brph, String str, String str2, brpj brpj) {
        this.f143063d = brph;
        this.f143060a = str;
        this.f143061b = str2;
        this.f143062c = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        brra brra = new brra();
        brra.mo69812c(getTokenResponse.f152527b);
        brra.mo69811b(this.f143060a);
        brra.mo69813d(this.f143061b);
        this.f143063d.mo69751a(this.f143062c, getTokenResponse, brra, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143062c.mo69680a(brrv.m114516a(str));
    }
}
