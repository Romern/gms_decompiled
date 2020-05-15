package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;

/* renamed from: hyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyv extends dcj implements hyx {
    public hyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
    }

    /* renamed from: a */
    public final RequestResult mo12823a(String str, VerificationToken verificationToken) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, verificationToken);
        Parcel a = mo8526a(1, bj);
        RequestResult requestResult = (RequestResult) dcl.m8163a(a, RequestResult.CREATOR);
        a.recycle();
        return requestResult;
    }

    /* renamed from: a */
    public final void mo12824a(ConsentPromptUserResponse consentPromptUserResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, consentPromptUserResponse);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo12825a(SmsRetrieverEvent smsRetrieverEvent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, smsRetrieverEvent);
        mo8528b(3, bj);
    }
}
