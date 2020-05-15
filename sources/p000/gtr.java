package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: gtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferMsg[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        AccountTransferProgress accountTransferProgress = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, AuthenticatorAnnotatedData.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
                hashSet.add(3);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                accountTransferProgress = (AccountTransferProgress) sed.m34998a(parcel, readInt, AccountTransferProgress.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountTransferMsg(hashSet, i, arrayList, i2, accountTransferProgress);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
