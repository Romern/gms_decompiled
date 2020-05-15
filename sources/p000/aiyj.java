package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: aiyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Strategy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        i2 = sed.m35010g(parcel, readInt);
                        continue;
                    case 2:
                        i3 = sed.m35010g(parcel, readInt);
                        continue;
                    case 3:
                        i4 = sed.m35010g(parcel, readInt);
                        continue;
                    case 4:
                        z = sed.m35006c(parcel, readInt);
                        continue;
                    case 5:
                        i5 = sed.m35010g(parcel, readInt);
                        continue;
                    case 6:
                        i6 = sed.m35010g(parcel, readInt);
                        continue;
                    case 7:
                        i7 = sed.m35010g(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Strategy(i, i2, i3, i4, z, i5, i6, i7);
    }
}
