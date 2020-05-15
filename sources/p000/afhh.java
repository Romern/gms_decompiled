package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: afhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    latLng = (LatLng) sed.m34998a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 6:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 7:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    f3 = sed.m35015l(parcel2, readInt);
                    break;
                case 12:
                    f4 = sed.m35015l(parcel2, readInt);
                    break;
                case 13:
                    f5 = sed.m35015l(parcel2, readInt);
                    break;
                case 14:
                    f6 = sed.m35015l(parcel2, readInt);
                    break;
                case 15:
                    f7 = sed.m35015l(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }
}
