package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

/* renamed from: afhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList2 = sed.m35005c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    f2 = sed.m35015l(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 11:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 12:
                    arrayList3 = sed.m35005c(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }
}
