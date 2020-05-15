package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: awya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        Account account = null;
        Bundle bundle = null;
        WalletCustomTheme walletCustomTheme = null;
        int i = 1;
        boolean z = false;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) sed.m34998a(parcel2, readInt, WalletCustomTheme.CREATOR);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 10:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                case 11:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ApplicationParameters(i, account, bundle, z, i2, walletCustomTheme, i3, d, d2, i4, i5);
    }
}
