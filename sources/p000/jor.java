package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import java.util.ArrayList;

/* renamed from: jor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jor implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        ArrayList arrayList = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    bool = sed.m35007d(parcel, readInt);
                    break;
                case 2:
                    bool2 = sed.m35007d(parcel, readInt);
                    break;
                case 3:
                    bool3 = sed.m35007d(parcel, readInt);
                    break;
                case 4:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 5:
                    bool4 = sed.m35007d(parcel, readInt);
                    break;
                case 6:
                    bool5 = sed.m35007d(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
                case 8:
                    arrayList3 = sed.m34992D(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DeviceFilter(bool, bool2, bool3, arrayList, bool4, bool5, arrayList2, arrayList3);
    }
}
