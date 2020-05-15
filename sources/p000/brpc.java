package p000;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpc implements brpv {

    /* renamed from: a */
    final /* synthetic */ UserProfileChangeRequest f143113a;

    /* renamed from: b */
    final /* synthetic */ brpj f143114b;

    /* renamed from: c */
    final /* synthetic */ brph f143115c;

    public brpc(brph brph, UserProfileChangeRequest userProfileChangeRequest, brpj brpj) {
        this.f143115c = brph;
        this.f143113a = userProfileChangeRequest;
        this.f143114b = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        brra brra = new brra();
        brra.mo69812c(getTokenResponse.f152527b);
        UserProfileChangeRequest userProfileChangeRequest = this.f143113a;
        if (userProfileChangeRequest.f152414c || userProfileChangeRequest.f152412a != null) {
            String str = userProfileChangeRequest.f152412a;
            if (str == null) {
                brra.f143208f.f152555b.add("DISPLAY_NAME");
            } else {
                brra.f143205c = str;
            }
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.f143113a;
        if (userProfileChangeRequest2.f152415d || userProfileChangeRequest2.f152416e != null) {
            String str2 = userProfileChangeRequest2.f152413b;
            if (str2 == null) {
                brra.f143208f.f152555b.add("PHOTO_URL");
            } else {
                brra.f143206d = str2;
            }
        }
        this.f143115c.mo69751a(this.f143114b, getTokenResponse, brra, this);
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143114b.mo69680a(brrv.m114516a(str));
    }
}
