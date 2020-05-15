package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarUiInfo;

/* renamed from: npf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarUiInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int[] iArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 2:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 6:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    z6 = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 10:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new CarUiInfo(z, z2, z3, z4, iArr, z5, i, z6, i2, i3);
    }
}
