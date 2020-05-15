package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;

/* renamed from: hyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class hyw extends dck implements hyx {
    public hyw() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            RequestResult a = mo12823a(parcel.readString(), (VerificationToken) dcl.m8163a(parcel, VerificationToken.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            mo12824a((ConsentPromptUserResponse) dcl.m8163a(parcel, ConsentPromptUserResponse.CREATOR));
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            mo12825a((SmsRetrieverEvent) dcl.m8163a(parcel, SmsRetrieverEvent.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
