package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmr extends brmj {

    /* renamed from: g */
    private final FinalizeMfaEnrollmentAidlRequest f142987g;

    public brmr(String str, String str2, brps brps, FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "FinishMfaPhoneNumberEnrollment");
        this.f142987g = finalizeMfaEnrollmentAidlRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        brqe brqe;
        Context context2 = context;
        brph brph2 = brph;
        FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest = this.f142987g;
        PhoneAuthCredential phoneAuthCredential = finalizeMfaEnrollmentAidlRequest.f152432a;
        String str = finalizeMfaEnrollmentAidlRequest.f152434c;
        String str2 = GetTokenResponse.m118899a(finalizeMfaEnrollmentAidlRequest.f152433b).f152527b;
        String str3 = phoneAuthCredential.f152404d;
        if (!phoneAuthCredential.f152403c) {
            String str4 = phoneAuthCredential.f152401a;
            String str5 = phoneAuthCredential.f152402b;
            sdo.m34977c(str5);
            sdo.m34977c(str4);
            brqe = new brqe("phone", str2, str4, str5, null, null, str);
        } else if (brky.m114106a(context2, str3, "FinishMfaPhoneNumberEnrollment")) {
            String a = brla.f142902a.mo69670a(context2, str3);
            String str6 = finalizeMfaEnrollmentAidlRequest.f152434c;
            sdo.m34977c(a);
            sdo.m34977c(str3);
            brqe = new brqe("phone", str2, null, null, a, str3, str6);
        } else {
            brqe = null;
        }
        if (brqe != null) {
            String str7 = this.f142987g.f152433b;
            brpj brpj = this.f142967a;
            sdo.m34959a(brqe);
            sdo.m34959a(brpj);
            brph2.mo69756a(str7, new bror(brph2, brqe, context2, brpj));
            return;
        }
        this.f142967a.mo69680a(new Status(17499, "Phone Number instant validation failed!"));
    }
}
