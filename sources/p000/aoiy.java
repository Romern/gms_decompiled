package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeopleaffinities;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoiy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplemetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        Mergedpeoplefieldacl mergedpeoplefieldacl = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel2, readInt, Mergedpeopleaffinities.CREATOR);
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
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayList2 = sed.m35005c(parcel2, readInt, Mergedpeoplemetadata.EdgeKeyInfo.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    mergedpeoplefieldacl = (Mergedpeoplefieldacl) sed.m34998a(parcel2, readInt, Mergedpeoplefieldacl.CREATOR);
                    hashSet.add(9);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    z4 = sed.m35006c(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    z5 = sed.m35006c(parcel2, readInt);
                    hashSet.add(13);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplemetadata(hashSet, arrayList, str, str2, str3, z, z2, arrayList2, mergedpeoplefieldacl, z3, z4, str4, z5);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
