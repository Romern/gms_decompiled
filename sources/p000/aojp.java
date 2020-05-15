package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: aojp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aojp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.ExtendedData.HangoutsExtendedData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                z2 = sed.m35006c(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                z3 = sed.m35006c(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.ExtendedData.HangoutsExtendedData(hashSet, str, str2, z, z2, z3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
