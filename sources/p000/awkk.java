package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: awkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awkk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetClientTokenRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        WalletCustomTheme walletCustomTheme = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                walletCustomTheme = (WalletCustomTheme) sed.m34998a(parcel, readInt, WalletCustomTheme.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GetClientTokenRequest(walletCustomTheme, z);
    }
}
