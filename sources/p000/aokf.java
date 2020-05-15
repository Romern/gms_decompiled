package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: aokf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Organizations[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                case 13:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    mergedpeoplemetadata = (Mergedpeoplemetadata) sed.m34998a(parcel2, readInt, Mergedpeoplemetadata.CREATOR);
                    hashSet.add(9);
                    break;
                case 10:
                    str6 = sed.m35020q(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str7 = sed.m35020q(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str8 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 14:
                    str9 = sed.m35020q(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    str10 = sed.m35020q(parcel2, readInt);
                    hashSet.add(15);
                    break;
                case 16:
                    str11 = sed.m35020q(parcel2, readInt);
                    hashSet.add(16);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.Organizations(hashSet, z, str, str2, str3, str4, str5, mergedpeoplemetadata, str6, str7, str8, str9, str10, str11);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
