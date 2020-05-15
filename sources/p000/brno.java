package p000;

import android.content.Context;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;

/* renamed from: brno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brno extends brmj {

    /* renamed from: g */
    private final StartMfaPhoneNumberSignInAidlRequest f143024g;

    public brno(String str, String str2, brps brps, StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "VerifyPhoneNumberForMfaSignInOperation");
        this.f143024g = startMfaPhoneNumberSignInAidlRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str;
        StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest = this.f143024g;
        String str2 = startMfaPhoneNumberSignInAidlRequest.f152472b;
        PhoneMultiFactorInfo phoneMultiFactorInfo = startMfaPhoneNumberSignInAidlRequest.f152471a;
        String str3 = phoneMultiFactorInfo.f152408a;
        String str4 = phoneMultiFactorInfo.f152411d;
        String str5 = startMfaPhoneNumberSignInAidlRequest.f152473c;
        sdo.m34977c(str4);
        brrg brrg = new brrg("phone", str2, str3, str4, str5);
        String a = brla.f142902a.mo69671a(context, brrg.f143228a, brrg.f143229b);
        if (a != null) {
            str = a;
        } else {
            str = brrg.f143231d;
        }
        String str6 = this.f142968d;
        brpj brpj = this.f142967a;
        StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest2 = this.f143024g;
        brlj.m114135a(brrg, context, str6, brph, brpj, str, startMfaPhoneNumberSignInAidlRequest2.f152474d, startMfaPhoneNumberSignInAidlRequest2.f152475e, startMfaPhoneNumberSignInAidlRequest2.f152476f);
    }
}
