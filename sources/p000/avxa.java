package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;

/* renamed from: avxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserLocationNearbyAlertFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m34992D(parcel, readInt);
            } else if (a == 2) {
                arrayList2 = sed.m34990B(parcel, readInt);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserLocationNearbyAlertFilter(arrayList, arrayList2, str, z);
    }
}
