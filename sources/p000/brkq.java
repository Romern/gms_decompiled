package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;

/* renamed from: brkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartMfaPhoneNumberSignInAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PhoneMultiFactorInfo phoneMultiFactorInfo = null;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) sed.m34998a(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new StartMfaPhoneNumberSignInAidlRequest(phoneMultiFactorInfo, str, str2, j, z, z2);
    }
}
