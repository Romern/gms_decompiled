package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnd extends brmj {

    /* renamed from: g */
    private final VerifyAssertionRequest f143007g;

    public brnd(String str, String str2, brps brps, VerifyAssertionRequest verifyAssertionRequest, brpp brpp) {
        super(str, str2, brps, brpp, "SignInWithCredential");
        this.f143007g = verifyAssertionRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        VerifyAssertionRequest verifyAssertionRequest = this.f143007g;
        brpj brpj = this.f142967a;
        sdo.m34959a(verifyAssertionRequest);
        sdo.m34959a(brpj);
        if (brph.f143126c.mo69757a()) {
            verifyAssertionRequest.mo72421b();
        }
        brph.f143125b.mo69779a(context, verifyAssertionRequest, new brpa(brph, brpj));
    }
}
