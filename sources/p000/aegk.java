package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: aegk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aegk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        float[] fArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        byte b2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    fArr = sed.m35028y(parcel2, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 5:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    b2 = sed.m35008e(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DeviceOrientation(fArr, i, i2, f, f2, j, b2);
    }
}
