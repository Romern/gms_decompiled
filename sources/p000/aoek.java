package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;

/* renamed from: aoek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoek implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField.ValueEntity.NameEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountField.ValueEntity.NameEntity(hashSet, i, str, str2, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
