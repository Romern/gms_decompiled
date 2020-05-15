package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: aojl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aojl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Emails.Certificates[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        Person.Emails.Certificates.Status status = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 3) {
                mergedpeoplemetadata = (Mergedpeoplemetadata) sed.m34998a(parcel, readInt, Mergedpeoplemetadata.CREATOR);
                hashSet.add(3);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                status = (Person.Emails.Certificates.Status) sed.m34998a(parcel, readInt, Person.Emails.Certificates.Status.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.Emails.Certificates(hashSet, mergedpeoplemetadata, status);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
