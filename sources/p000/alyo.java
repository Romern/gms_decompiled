package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: alyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alyo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.PersonMetadataImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList7 = null;
        String str3 = null;
        PersonImpl.ProfileOwnerStatsImpl profileOwnerStatsImpl = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m34992D(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList2 = sed.m34992D(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    arrayList4 = sed.m34992D(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList5 = sed.m34992D(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    arrayList6 = sed.m34992D(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayList7 = sed.m34992D(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    profileOwnerStatsImpl = (PersonImpl.ProfileOwnerStatsImpl) sed.m34998a(parcel2, readInt, PersonImpl.ProfileOwnerStatsImpl.CREATOR);
                    hashSet.add(12);
                    break;
                case 13:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(15);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonImpl.PersonMetadataImpl(hashSet, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, str, str2, arrayList7, str3, profileOwnerStatsImpl, z, z2, z3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
