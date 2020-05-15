package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: brjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brjj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DefaultOAuthCredential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        VerifyAssertionRequest verifyAssertionRequest = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    verifyAssertionRequest = (VerifyAssertionRequest) sed.m34998a(parcel, readInt, VerifyAssertionRequest.CREATOR);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DefaultOAuthCredential(str, str2, str3, verifyAssertionRequest, str4, str5, str6);
    }
}
