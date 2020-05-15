package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;

/* renamed from: brjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brjy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinalizeMfaSignInAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                phoneAuthCredential = (PhoneAuthCredential) sed.m34998a(parcel, readInt, PhoneAuthCredential.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FinalizeMfaSignInAidlRequest(phoneAuthCredential, str);
    }
}
