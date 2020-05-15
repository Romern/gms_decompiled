package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.ExternalDeviceInfoEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: jro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jro implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExternalDeviceInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ArrayList arrayList3 = null;
        String str5 = null;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    z5 = sed.m35006c(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList3 = sed.m35005c(parcel2, readInt, BeaconSeedEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList = sed.m34992D(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    j = sed.m35012i(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    arrayList2 = sed.m34992D(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    z4 = sed.m35006c(parcel2, readInt);
                    hashSet.add(15);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ExternalDeviceInfoEntity(hashSet, z5, arrayList3, str5, str, arrayList, str2, j, z, str3, z2, str4, arrayList2, z3, z4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
