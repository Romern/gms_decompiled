package p000;

import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnr implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143028a;

    /* renamed from: b */
    final /* synthetic */ brph f143029b;

    public brnr(brph brph, brpj brpj) {
        this.f143029b = brph;
        this.f143028a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brro brro = (brro) obj;
        if (!brro.mo69822b()) {
            this.f143029b.m114351a(new GetTokenResponse(brro.f143256b, brro.f143255a, Long.valueOf(brro.f143257c), "Bearer"), null, null, false, null, this.f143028a, this);
        } else if (this.f143029b.f143126c.mo69758b()) {
            this.f143028a.mo69760a(new OnFailedMfaSignInAidlResponse(brro.f143259e, brro.f143258d, null));
        } else {
            brph.f143124a.mo25418e("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
            mo69750a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143028a.mo69680a(brrv.m114516a(str));
    }
}
