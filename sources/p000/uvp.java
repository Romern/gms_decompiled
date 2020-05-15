package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Permission[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m34992D(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                case 6:
                case 8:
                case 12:
                case 14:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    str5 = sed.m35020q(parcel, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str6 = sed.m35020q(parcel, readInt);
                    hashSet.add(11);
                    break;
                case 13:
                    str7 = sed.m35020q(parcel, readInt);
                    hashSet.add(13);
                    break;
                case 15:
                    str8 = sed.m35020q(parcel, readInt);
                    hashSet.add(15);
                    break;
                case 16:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(16);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Permission(hashSet, arrayList, str, str2, str3, str4, str5, str6, str7, str8, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
