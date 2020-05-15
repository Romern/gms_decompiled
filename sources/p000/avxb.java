package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;

/* renamed from: avxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserLocationNearbyAlertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = null;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        int i4 = 110;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                userLocationNearbyAlertFilter = (UserLocationNearbyAlertFilter) sed.m34998a(parcel, readInt, UserLocationNearbyAlertFilter.CREATOR);
            } else if (a == 5) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 6) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                i4 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserLocationNearbyAlertRequest(i, i2, userLocationNearbyAlertFilter, z, i3, i4);
    }
}
