package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;

/* renamed from: iad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iad extends hyw implements aaai {

    /* renamed from: a */
    private final Context f20624a;

    /* renamed from: b */
    private final aaag f20625b;

    public iad(Context context, aaag aaag) {
        bmxy.m108581a(context);
        this.f20624a = context.getApplicationContext();
        bmxy.m108581a(aaag);
        this.f20625b = aaag;
    }

    /* renamed from: a */
    public final RequestResult mo12823a(String str, VerificationToken verificationToken) {
        if (!TextUtils.isEmpty(str)) {
            return hzw.m15099a(this.f20624a, str, verificationToken);
        }
        hzn hzn = new hzn();
        hzn.mo12836a(0);
        return hzn.f20603a;
    }

    /* renamed from: a */
    public final void mo12824a(ConsentPromptUserResponse consentPromptUserResponse) {
        if (consentPromptUserResponse != null) {
            hzw.m15100a(this.f20624a, consentPromptUserResponse);
        }
    }

    /* renamed from: a */
    public final void mo12825a(SmsRetrieverEvent smsRetrieverEvent) {
        this.f20625b.mo16658a(new ial(new qws(this.f20624a, "ANDROID_AUTH", null), smsRetrieverEvent));
    }
}
