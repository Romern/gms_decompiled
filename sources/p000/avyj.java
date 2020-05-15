package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: avyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avyj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    i5 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    i6 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    str = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Barcode.CalendarDateTime(i, i2, i3, i4, i5, i6, z, str);
    }
}
