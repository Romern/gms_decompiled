package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;
import java.util.HashSet;

/* renamed from: aoiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoiv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplefieldacl.Entries.Scope.Membership[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        Mergedpeoplefieldacl.Entries.Scope.Membership.Circle circle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                circle = (Mergedpeoplefieldacl.Entries.Scope.Membership.Circle) sed.m34998a(parcel, readInt, Mergedpeoplefieldacl.Entries.Scope.Membership.Circle.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplefieldacl.Entries.Scope.Membership(hashSet, circle);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
