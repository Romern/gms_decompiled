package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;

/* renamed from: adfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DiagnosticInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        Account[] accountArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 5) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                accountArr = (Account[]) sed.m35004b(parcel, readInt, Account.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DiagnosticInfo(i, j, i2, account, accountArr);
    }
}
