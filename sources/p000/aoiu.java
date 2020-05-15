package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;
import java.util.HashSet;

/* renamed from: aoiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoiu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplefieldacl.Entries.Scope[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        Mergedpeoplefieldacl.Entries.Scope.Membership membership = null;
        Mergedpeoplefieldacl.Entries.Scope.Person person = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                membership = (Mergedpeoplefieldacl.Entries.Scope.Membership) sed.m34998a(parcel, readInt, Mergedpeoplefieldacl.Entries.Scope.Membership.CREATOR);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                person = (Mergedpeoplefieldacl.Entries.Scope.Person) sed.m34998a(parcel, readInt, Mergedpeoplefieldacl.Entries.Scope.Person.CREATOR);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplefieldacl.Entries.Scope(hashSet, z, z2, membership, person);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
