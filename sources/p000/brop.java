package p000;

import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: brop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brop implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143088a;

    /* renamed from: b */
    final /* synthetic */ brph f143089b;

    public brop(brph brph, brpj brpj) {
        this.f143089b = brph;
        this.f143088a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        VerifyCustomTokenResponse verifyCustomTokenResponse = (VerifyCustomTokenResponse) obj;
        this.f143089b.m114351a(new GetTokenResponse(verifyCustomTokenResponse.f152573b, verifyCustomTokenResponse.f152572a, Long.valueOf(verifyCustomTokenResponse.f152574c), "Bearer"), null, null, Boolean.valueOf(verifyCustomTokenResponse.f152575d), null, this.f143088a, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143088a.mo69680a(brrv.m114516a(str));
    }
}
