package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmw extends brmj {

    /* renamed from: g */
    private final String f142995g;

    /* renamed from: h */
    private final VerifyAssertionRequest f142996h;

    public brmw(String str, String str2, brps brps, String str3, VerifyAssertionRequest verifyAssertionRequest, brpp brpp) {
        super(str, str2, brps, brpp, "LinkFederatedCredential");
        this.f142995g = str3;
        this.f142996h = verifyAssertionRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142995g;
        VerifyAssertionRequest verifyAssertionRequest = this.f142996h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(verifyAssertionRequest);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new broi(brph, verifyAssertionRequest, brpj));
    }
}
