package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: aeia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeia implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }
}
