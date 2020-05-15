package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: awjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awjy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                walletCustomTheme = (WalletCustomTheme) sed.m34998a(parcel, readInt, WalletCustomTheme.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ExecuteBuyFlowRequest(bArr, bArr2, walletCustomTheme);
    }
}
