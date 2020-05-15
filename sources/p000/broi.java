package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: broi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class broi implements brpv {

    /* renamed from: a */
    final /* synthetic */ VerifyAssertionRequest f143072a;

    /* renamed from: b */
    final /* synthetic */ brpj f143073b;

    /* renamed from: c */
    final /* synthetic */ brph f143074c;

    public broi(brph brph, VerifyAssertionRequest verifyAssertionRequest, brpj brpj) {
        this.f143074c = brph;
        this.f143072a = verifyAssertionRequest;
        this.f143073b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        if (this.f143074c.f143126c.mo69757a()) {
            this.f143072a.mo72421b();
        }
        VerifyAssertionRequest verifyAssertionRequest = this.f143072a;
        String str = getTokenResponse.f152527b;
        sdo.m34977c(str);
        verifyAssertionRequest.f152557b = str;
        this.f143074c.f143125b.mo69779a((Context) null, this.f143072a, new broh(this, this));
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143073b.mo69680a(brrv.m114516a(str));
    }
}
