package p000;

import android.os.IInterface;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;

/* renamed from: hyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface hyx extends IInterface {
    /* renamed from: a */
    RequestResult mo12823a(String str, VerificationToken verificationToken);

    /* renamed from: a */
    void mo12824a(ConsentPromptUserResponse consentPromptUserResponse);

    /* renamed from: a */
    void mo12825a(SmsRetrieverEvent smsRetrieverEvent);
}
