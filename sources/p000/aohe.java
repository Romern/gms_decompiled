package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import java.util.HashSet;

/* renamed from: aohe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ItemScope[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 33) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(33);
            } else if (a != 54) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(54);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ItemScope(hashSet, i, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
