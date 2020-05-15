package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import java.util.HashSet;

/* renamed from: gtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAnnotatedData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        AuthenticatorTransferInfo authenticatorTransferInfo = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                authenticatorTransferInfo = (AuthenticatorTransferInfo) sed.m34998a(parcel, readInt, AuthenticatorTransferInfo.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthenticatorAnnotatedData(hashSet, i, authenticatorTransferInfo, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
