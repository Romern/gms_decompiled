package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.quake.ShakeVettingHints;

/* renamed from: bgsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShakeVettingHints[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        double d6 = 0.0d;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 3:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    d = sed.m35017n(parcel2, readInt);
                    break;
                case 5:
                    d2 = sed.m35017n(parcel2, readInt);
                    break;
                case 6:
                    d3 = sed.m35017n(parcel2, readInt);
                    break;
                case 7:
                    d4 = sed.m35017n(parcel2, readInt);
                    break;
                case 8:
                    d5 = sed.m35017n(parcel2, readInt);
                    break;
                case 9:
                    d6 = sed.m35017n(parcel2, readInt);
                    break;
                case 10:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ShakeVettingHints(j, z, z2, d, d2, d3, d4, d5, d6, i);
    }
}
