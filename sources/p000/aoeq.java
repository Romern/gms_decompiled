package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.PlusAclentryResourceEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoeq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AclEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel2, readInt, PlusAclentryResourceEntity.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    z4 = sed.m35006c(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    z5 = sed.m35006c(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AclEntity(hashSet, i, str, str2, z, str3, arrayList, z2, z3, z4, z5, str4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
