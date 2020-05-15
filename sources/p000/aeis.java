package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepClassifyEvent;

/* renamed from: aeis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeis implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    i5 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    i6 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    i7 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    i8 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }
}
