package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;

/* renamed from: awmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awmb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WalletFragmentOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 1;
        WalletFragmentStyle walletFragmentStyle = null;
        int i2 = 1;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                walletFragmentStyle = (WalletFragmentStyle) sed.m34998a(parcel, readInt, WalletFragmentStyle.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new WalletFragmentOptions(i, i3, walletFragmentStyle, i2);
    }
}
