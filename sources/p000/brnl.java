package p000;

import android.content.Context;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: brnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnl extends brmj {

    /* renamed from: g */
    private final String f143020g;

    /* renamed from: h */
    private final UserProfileChangeRequest f143021h;

    public brnl(String str, String str2, brps brps, String str3, UserProfileChangeRequest userProfileChangeRequest, brpp brpp) {
        super(str, str2, brps, brpp, "UpdateProfile");
        this.f143020g = str3;
        this.f143021h = userProfileChangeRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f143020g;
        UserProfileChangeRequest userProfileChangeRequest = this.f143021h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(userProfileChangeRequest);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new brpc(brph, userProfileChangeRequest, brpj));
    }
}
