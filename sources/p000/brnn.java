package p000;

import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;

/* renamed from: brnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnn extends brmj {

    /* renamed from: g */
    private final StartMfaPhoneNumberEnrollmentAidlRequest f143023g;

    public brnn(String str, String str2, brps brps, StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "VerifyPhoneNumberForMfaEnrollmentOperation");
        this.f143023g = startMfaPhoneNumberEnrollmentAidlRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest = this.f143023g;
        String str = startMfaPhoneNumberEnrollmentAidlRequest.f152465a;
        String str2 = startMfaPhoneNumberEnrollmentAidlRequest.f152466b;
        String str3 = startMfaPhoneNumberEnrollmentAidlRequest.f152467c;
        sdo.m34977c(str2);
        brre brre = new brre(str, "phone", str2, str3);
        String str4 = this.f142968d;
        brpj brpj = this.f142967a;
        StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest2 = this.f143023g;
        brlj.m114135a(brre, context, str4, brph, brpj, startMfaPhoneNumberEnrollmentAidlRequest2.f152466b, startMfaPhoneNumberEnrollmentAidlRequest2.f152468d, startMfaPhoneNumberEnrollmentAidlRequest2.f152469e, startMfaPhoneNumberEnrollmentAidlRequest2.f152470f);
    }
}
