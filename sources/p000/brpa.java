package p000;

import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;

/* renamed from: brpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpa implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143109a;

    /* renamed from: b */
    final /* synthetic */ brph f143110b;

    public brpa(brph brph, brpj brpj) {
        this.f143110b = brph;
        this.f143109a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrk brrk = (brrk) obj;
        if (!brrk.mo69818b()) {
            this.f143110b.mo69755a(brrk, this.f143109a, this);
        } else if (this.f143110b.f143126c.mo69758b()) {
            this.f143109a.mo69760a(new OnFailedMfaSignInAidlResponse(brrk.f143245l, brrk.f143244k, brrk.mo69819c()));
        } else {
            brph.f143124a.mo25418e("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
            mo69750a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143109a.mo69680a(brrv.m114516a(str));
    }
}
