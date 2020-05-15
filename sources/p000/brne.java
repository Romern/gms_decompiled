package p000;

import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: brne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brne extends brmj {

    /* renamed from: g */
    private final brrl f143008g;

    public brne(String str, String str2, brps brps, SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "SignInWithCustomToken");
        this.f143008g = new brrl(signInWithCustomTokenAidlRequest.f152457a, signInWithCustomTokenAidlRequest.f152458b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        brrl brrl = this.f143008g;
        brpj brpj = this.f142967a;
        sdo.m34959a(brrl);
        sdo.m34959a(brpj);
        brph.f143125b.mo69774a(brrl, new VerifyCustomTokenResponse(), cdxz.m135248c(), "verifyCustomToken").mo50371a(new brly(new brop(brph, brpj)));
    }
}
