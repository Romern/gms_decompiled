package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.netrec.scoring.NetworkScore;
import com.google.android.gms.netrec.scoring.RssiScoreCurve;
import com.google.android.gms.netrec.scoring.WifiNetworkKey;

/* renamed from: akks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akks implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NetworkScore[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        WifiNetworkKey wifiNetworkKey = null;
        RssiScoreCurve rssiScoreCurve = null;
        Bundle bundle = null;
        RssiScoreCurve rssiScoreCurve2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                wifiNetworkKey = (WifiNetworkKey) sed.m34998a(parcel, readInt, WifiNetworkKey.CREATOR);
            } else if (a == 2) {
                rssiScoreCurve = (RssiScoreCurve) sed.m34998a(parcel, readInt, RssiScoreCurve.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                bundle = sed.m35022s(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                rssiScoreCurve2 = (RssiScoreCurve) sed.m34998a(parcel, readInt, RssiScoreCurve.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new NetworkScore(wifiNetworkKey, rssiScoreCurve, z, bundle, rssiScoreCurve2);
    }
}
