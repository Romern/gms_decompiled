package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.netrec.scoring.ConnectivityReport;
import com.google.android.gms.netrec.scoring.WifiNetworkKey;

/* renamed from: akkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectivityReport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        WifiNetworkKey wifiNetworkKey = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                wifiNetworkKey = (WifiNetworkKey) sed.m34998a(parcel, readInt, WifiNetworkKey.CREATOR);
            } else if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ConnectivityReport(wifiNetworkKey, z, i, i2);
    }
}
