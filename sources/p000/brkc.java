package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LinkFederatedCredentialAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        VerifyAssertionRequest verifyAssertionRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                verifyAssertionRequest = (VerifyAssertionRequest) sed.m34998a(parcel, readInt, VerifyAssertionRequest.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LinkFederatedCredentialAidlRequest(str, verifyAssertionRequest);
    }
}
