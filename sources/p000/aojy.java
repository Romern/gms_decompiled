package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeopleaffinities;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aojy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aojy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Metadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        ArrayList arrayList4 = null;
        Person.Metadata.IdentityInfo identityInfo = null;
        ArrayList arrayList5 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList6 = null;
        String str4 = null;
        Person.Metadata.ProfileOwnerStats profileOwnerStats = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList7 = null;
        ArrayList arrayList8 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel2, readInt, Mergedpeopleaffinities.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList7 = sed.m34992D(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    arrayList8 = sed.m34992D(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList2 = sed.m34992D(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayList4 = sed.m34992D(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    identityInfo = (Person.Metadata.IdentityInfo) sed.m34998a(parcel2, readInt, Person.Metadata.IdentityInfo.CREATOR);
                    hashSet.add(11);
                    break;
                case 12:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    arrayList5 = sed.m34992D(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    j = sed.m35012i(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(15);
                    break;
                case 16:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(16);
                    break;
                case 17:
                    arrayList6 = sed.m34992D(parcel2, readInt);
                    hashSet.add(17);
                    break;
                case 18:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(18);
                    break;
                case 19:
                    profileOwnerStats = (Person.Metadata.ProfileOwnerStats) sed.m34998a(parcel2, readInt, Person.Metadata.ProfileOwnerStats.CREATOR);
                    hashSet.add(19);
                    arrayList5 = arrayList5;
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        ArrayList arrayList9 = arrayList5;
        if (parcel.dataPosition() == b) {
            return new Person.Metadata(hashSet, arrayList, arrayList7, arrayList8, z, arrayList2, arrayList3, str, z2, arrayList4, identityInfo, z3, arrayList9, j, str2, str3, arrayList6, str4, profileOwnerStats);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
