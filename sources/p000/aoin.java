package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoin implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpgradeAccountEntity.DescriptionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
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
                arrayList = sed.m35005c(parcel, readInt, UpgradeAccountEntity.DescriptionEntity.ReferencesEntity.CREATOR);
                hashSet.add(3);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpgradeAccountEntity.DescriptionEntity(hashSet, i, str, arrayList, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
