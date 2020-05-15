package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.DsssEncoding;

/* renamed from: gdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DsssEncoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        float f2 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 10:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i7 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    i8 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DsssEncoding(i, z, z2, i2, i3, f, i4, f2, i5, i6, i7, i8);
    }
}
