package p000;

import android.text.TextUtils;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brnt implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143033a;

    /* renamed from: b */
    final /* synthetic */ brph f143034b;

    public brnt(brph brph, brpj brpj) {
        this.f143034b = brph;
        this.f143033a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brqd brqd = (brqd) obj;
        if (TextUtils.isEmpty(brqd.f143160f)) {
            this.f143034b.m114351a(new GetTokenResponse(brqd.f143156b, brqd.f143155a, Long.valueOf(brqd.f143158d), "Bearer"), null, null, Boolean.valueOf(brqd.f143157c), null, this.f143033a, this);
        } else if (this.f143034b.f143126c.mo69758b()) {
            this.f143033a.mo69760a(new OnFailedMfaSignInAidlResponse(brqd.f143160f, brqd.f143159e, null));
        } else {
            brph.f143124a.mo25418e("Need to do multi-factor auth, but either the SDK does not support it, or the flag is disabled.", new Object[0]);
            mo69750a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143033a.mo69680a(brrv.m114516a(str));
    }
}
