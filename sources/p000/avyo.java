package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: avyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Barcode.GeoPoint[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                d = sed.m35017n(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                d2 = sed.m35017n(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Barcode.GeoPoint(d, d2);
    }
}
