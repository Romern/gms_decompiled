package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aojk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aojk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Emails[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, Person.Emails.Certificates.CREATOR);
                hashSet.add(2);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                mergedpeoplemetadata = (Mergedpeoplemetadata) sed.m34998a(parcel, readInt, Mergedpeoplemetadata.CREATOR);
                hashSet.add(5);
            } else if (a == 6) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(6);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(7);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.Emails(hashSet, arrayList, str, mergedpeoplemetadata, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
