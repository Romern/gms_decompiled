package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.TextTrackStyle;

/* renamed from: pgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TextTrackStyle[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    i7 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    i8 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    i9 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }
}
