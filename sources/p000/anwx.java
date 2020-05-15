package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.HashSet;

/* renamed from: anwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        ItemScopeEntity itemScopeEntity = null;
        String str2 = null;
        ItemScopeEntity itemScopeEntity2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 4) {
                itemScopeEntity = (ItemScopeEntity) sed.m34998a(parcel, readInt, ItemScopeEntity.CREATOR);
                hashSet.add(4);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            } else if (a == 6) {
                itemScopeEntity2 = (ItemScopeEntity) sed.m34998a(parcel, readInt, ItemScopeEntity.CREATOR);
                hashSet.add(6);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(7);
            }
        }
        if (parcel.dataPosition() == b) {
            return new MomentEntity(hashSet, i, str, itemScopeEntity, str2, itemScopeEntity2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
