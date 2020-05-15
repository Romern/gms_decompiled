package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.places.p095ui.autocomplete.SessionLogger;

/* renamed from: bile */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bile implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionLogger[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    i7 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    i8 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    i9 = sed.m35010g(parcel2, readInt);
                    break;
                case 16:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SessionLogger(i, i2, z, z2, z3, z4, i3, i4, i5, i6, str, i7, i8, z5, i9, j);
    }
}
