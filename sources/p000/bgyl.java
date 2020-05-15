package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: bgyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        Conditions conditions = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i2 = 0;
        boolean z7 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 11:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    conditions = (Conditions) sed.m34998a(parcel2, readInt, Conditions.CREATOR);
                    break;
                case 15:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 16:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                case 18:
                    l2 = sed.m35013j(parcel2, readInt);
                    break;
                case 19:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AccountConfig(account, z, j, z2, z3, str, z4, str2, j2, i, z5, z6, conditions, i2, str3, l, l2, z7, i3);
    }
}
