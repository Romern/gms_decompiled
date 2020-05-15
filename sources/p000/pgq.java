package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;

/* renamed from: pgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MediaTrack(j, i, str, str2, str3, str4, i2, str5);
    }
}
