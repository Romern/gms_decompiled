package p000;

import android.content.Context;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* renamed from: brnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnp extends brmj {

    /* renamed from: g */
    private final SendVerificationCodeRequest f143025g;

    public brnp(String str, String str2, brps brps, SendVerificationCodeRequest sendVerificationCodeRequest, brpp brpp) {
        super(str, str2, brps, brpp, "VerifyPhoneNumberOperation");
        this.f143025g = sendVerificationCodeRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        SendVerificationCodeRequest sendVerificationCodeRequest = this.f143025g;
        brlj.m114135a(sendVerificationCodeRequest, context, this.f142968d, brph, this.f142967a, sendVerificationCodeRequest.f152548a, sendVerificationCodeRequest.f152549b, sendVerificationCodeRequest.f152550c, false);
    }
}
