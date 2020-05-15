package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.HashSet;

/* renamed from: aqzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new D2DDevice[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        int i = 0;
        byte b2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    b2 = sed.m35008e(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    hashSet.add(9);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new D2DDevice(hashSet, i, str, str2, b2, str3, bArr, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
