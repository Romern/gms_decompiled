package p000;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarWindowLayoutParams;

/* renamed from: ntl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ntl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarWindowLayoutParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Rect rect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        i2 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 2:
                        i3 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 3:
                        i4 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 4:
                        i5 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 5:
                        i6 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 6:
                        i7 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 7:
                        i8 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 8:
                        i9 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 9:
                        i10 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 10:
                        i11 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 11:
                        i12 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 12:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    case 13:
                        i13 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 14:
                        i14 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 15:
                        i15 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 16:
                        rect = (Rect) sed.m34998a(parcel2, readInt, Rect.CREATOR);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new CarWindowLayoutParams(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, z, i13, i14, i15, rect);
    }
}
