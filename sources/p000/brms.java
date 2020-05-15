package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;

/* renamed from: brms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brms extends brmj {

    /* renamed from: g */
    private final FinalizeMfaSignInAidlRequest f142988g;

    public brms(String str, String str2, brps brps, FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "FinishMfaPhoneNumberEnrollment");
        this.f142988g = finalizeMfaSignInAidlRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest = this.f142988g;
        PhoneAuthCredential phoneAuthCredential = finalizeMfaSignInAidlRequest.f152435a;
        String str = finalizeMfaSignInAidlRequest.f152436b;
        brqg brqg = null;
        if (phoneAuthCredential.f152403c && !TextUtils.isEmpty(phoneAuthCredential.f152407g)) {
            String a = brla.f142902a.mo69671a(context, str, phoneAuthCredential.f152407g);
            if (!TextUtils.isEmpty(a) && brky.m114106a(context, a, "FinishMfaPhoneNumberEnrollment")) {
                String a2 = brla.f142902a.mo69670a(context, a);
                sdo.m34977c(a2);
                sdo.m34977c(a);
                brqg = new brqg("phone", str, null, null, a2, a);
            }
        } else if (!TextUtils.isEmpty(phoneAuthCredential.f152401a) && !TextUtils.isEmpty(phoneAuthCredential.f152402b)) {
            String str2 = phoneAuthCredential.f152401a;
            String str3 = phoneAuthCredential.f152402b;
            sdo.m34977c(str3);
            sdo.m34977c(str2);
            brqg = new brqg("phone", str, str2, str3, null, null);
        }
        if (brqg != null) {
            brpj brpj = this.f142967a;
            sdo.m34959a(brqg);
            sdo.m34959a(brpj);
            brpw brpw = brph.f143125b;
            brpw.mo69774a(brqg, new brqh(), cdyc.m135275c(), "mfaSignIn:finalize").mo50371a(new brlt(brpw, context, brqg, new bros(brph, brpj)));
            return;
        }
        this.f142967a.mo69680a(new Status(17499, "Phone Number instant validation failed!"));
    }
}
