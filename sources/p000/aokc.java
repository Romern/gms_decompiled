package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: aokc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Names[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    mergedpeoplemetadata = (Mergedpeoplemetadata) sed.m34998a(parcel2, readInt, Mergedpeoplemetadata.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    str7 = sed.m35020q(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    str8 = sed.m35020q(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str9 = sed.m35020q(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str10 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    str11 = sed.m35020q(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    str12 = sed.m35020q(parcel2, readInt);
                    hashSet.add(14);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.Names(hashSet, str, str2, str3, str4, str5, str6, mergedpeoplemetadata, str7, str8, str9, str10, str11, str12);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
