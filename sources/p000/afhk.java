package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;

/* renamed from: afhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    cap = (Cap) sed.m34998a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) sed.m34998a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    arrayList2 = sed.m35005c(parcel2, readInt, PatternItem.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }
}
