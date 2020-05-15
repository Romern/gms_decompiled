package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: afhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afhq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                f = sed.m35015l(parcel, readInt);
            } else if (a == 5) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                f2 = sed.m35015l(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }
}
