package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aocy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusonesEntity.MetadataEntity.GlobalCountsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                d = sed.m35017n(parcel, readInt);
                hashSet.add(2);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, PlusonesEntity.MetadataEntity.GlobalCountsEntity.PersonEntity.CREATOR);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlusonesEntity.MetadataEntity.GlobalCountsEntity(hashSet, i, d, arrayList);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
