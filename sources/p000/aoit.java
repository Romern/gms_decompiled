package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;
import java.util.HashSet;

/* renamed from: aoit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoit implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplefieldacl.Entries[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        Mergedpeoplefieldacl.Entries.Scope scope = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                scope = (Mergedpeoplefieldacl.Entries.Scope) sed.m34998a(parcel, readInt, Mergedpeoplefieldacl.Entries.Scope.CREATOR);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplefieldacl.Entries(hashSet, str, scope);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
