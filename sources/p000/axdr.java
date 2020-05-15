package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* renamed from: axdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) sed.m34998a(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) sed.m34998a(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }
}
