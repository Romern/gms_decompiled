package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: afco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afco implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    b2 = sed.m35008e(parcel2, readInt);
                    break;
                case 3:
                    b3 = sed.m35008e(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) sed.m34998a(parcel2, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = sed.m35008e(parcel2, readInt);
                    break;
                case 7:
                    b5 = sed.m35008e(parcel2, readInt);
                    break;
                case 8:
                    b6 = sed.m35008e(parcel2, readInt);
                    break;
                case 9:
                    b7 = sed.m35008e(parcel2, readInt);
                    break;
                case 10:
                    b8 = sed.m35008e(parcel2, readInt);
                    break;
                case 11:
                    b9 = sed.m35008e(parcel2, readInt);
                    break;
                case 12:
                    b10 = sed.m35008e(parcel2, readInt);
                    break;
                case 13:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 14:
                    b11 = sed.m35008e(parcel2, readInt);
                    break;
                case 15:
                    b12 = sed.m35008e(parcel2, readInt);
                    break;
                case 16:
                    f = sed.m35016m(parcel2, readInt);
                    break;
                case 17:
                    f2 = sed.m35016m(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) sed.m34998a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b13 = sed.m35008e(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds, b13);
    }
}
