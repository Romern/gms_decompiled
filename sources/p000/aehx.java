package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;

/* renamed from: aehx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        NetworkLocationStatus[] networkLocationStatusArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                networkLocationStatusArr = (NetworkLocationStatus[]) sed.m35004b(parcel, readInt, NetworkLocationStatus.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LocationAvailability(i, i2, i3, j, networkLocationStatusArr);
    }
}
