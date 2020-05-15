package p000;

import android.text.TextUtils;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brom implements brpv {

    /* renamed from: a */
    final /* synthetic */ bron f143083a;

    public brom(bron bron) {
        this.f143083a = bron;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrs brrs = (brrs) obj;
        if (TextUtils.isEmpty(brrs.f143279a) || TextUtils.isEmpty(brrs.f143280b)) {
            this.f143083a.f143085b.mo69680a(brrv.m114516a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.f143083a.f143086c.m114351a(new GetTokenResponse(brrs.f143280b, brrs.f143279a, Long.valueOf(brqr.m114478a(brrs.f143279a)), "Bearer"), null, null, false, null, this.f143083a.f143085b, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143083a.f143085b.mo69680a(brrv.m114516a(str));
    }
}
