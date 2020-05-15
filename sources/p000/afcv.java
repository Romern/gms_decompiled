package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: afcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) sed.m34998a(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) sed.m34998a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 6:
                    b2 = sed.m35008e(parcel, readInt);
                    break;
                case 7:
                    b3 = sed.m35008e(parcel, readInt);
                    break;
                case 8:
                    b4 = sed.m35008e(parcel, readInt);
                    break;
                case 9:
                    b5 = sed.m35008e(parcel, readInt);
                    break;
                case 10:
                    b6 = sed.m35008e(parcel, readInt);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) sed.m34998a(parcel, readInt, StreetViewSource.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
    }
}
