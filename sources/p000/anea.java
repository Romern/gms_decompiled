package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import java.util.HashSet;

/* renamed from: anea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anea implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        String str2 = null;
        byte[] bArr = null;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    j = sed.m35012i(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    d = sed.m35017n(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Flag(hashSet, str, j, z, d, str2, bArr, i, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
