package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* renamed from: axdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                timeInterval = (TimeInterval) sed.m34998a(parcel, readInt, TimeInterval.CREATOR);
            } else if (a == 5) {
                uriData = (UriData) sed.m34998a(parcel, readInt, UriData.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                uriData2 = (UriData) sed.m34998a(parcel, readInt, UriData.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }
}
