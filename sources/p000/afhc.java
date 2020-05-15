package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 3:
                    latLng = (LatLng) sed.m34998a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 5:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) sed.m34998a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    f4 = sed.m35015l(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    f5 = sed.m35015l(parcel2, readInt);
                    break;
                case 11:
                    f6 = sed.m35015l(parcel2, readInt);
                    break;
                case 12:
                    f7 = sed.m35015l(parcel2, readInt);
                    break;
                case 13:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }
}
