package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.FloorChangeEvent;

/* renamed from: aegn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aegn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FloorChangeEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
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
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new FloorChangeEvent(i, i2, j, j2, j3, j4, f);
    }
}
