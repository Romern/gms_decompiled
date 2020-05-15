package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity;
import java.util.HashSet;

/* renamed from: aohn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OzDeviceInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    i4 = sed.m35010g(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OzDeviceInfoEntity(hashSet, i, i2, z, z2, str, str2, str3, i3, i4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
