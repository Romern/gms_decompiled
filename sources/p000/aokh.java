package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: aokh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.PhoneNumbers[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 8) {
                str4 = sed.m35020q(parcel, readInt);
                hashSet.add(8);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                mergedpeoplemetadata = (Mergedpeoplemetadata) sed.m34998a(parcel, readInt, Mergedpeoplemetadata.CREATOR);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.PhoneNumbers(hashSet, str, str2, mergedpeoplemetadata, str3, str4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
