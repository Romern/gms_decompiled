package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aohl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentsFeed[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, MomentEntity.CREATOR);
                hashSet.add(4);
            } else if (a == 7) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(7);
            } else if (a != 9) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(9);
            }
        }
        if (parcel.dataPosition() == b) {
            return new MomentsFeed(hashSet, i, arrayList, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
