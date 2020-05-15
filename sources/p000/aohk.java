package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import java.util.HashSet;

/* renamed from: aohk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        AclEntity aclEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ItemScope itemScope = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 10) {
                str5 = sed.m35020q(parcel, readInt);
                hashSet.add(10);
            } else if (a != 11) {
                switch (a) {
                    case 1:
                        i = sed.m35010g(parcel, readInt);
                        hashSet.add(1);
                        continue;
                    case 2:
                        aclEntity = (AclEntity) sed.m34998a(parcel, readInt, AclEntity.CREATOR);
                        hashSet.add(2);
                        continue;
                    case 3:
                        str = sed.m35020q(parcel, readInt);
                        hashSet.add(3);
                        continue;
                    case 4:
                        str2 = sed.m35020q(parcel, readInt);
                        hashSet.add(4);
                        continue;
                    case 5:
                        str3 = sed.m35020q(parcel, readInt);
                        hashSet.add(5);
                        continue;
                    case 6:
                        str4 = sed.m35020q(parcel, readInt);
                        hashSet.add(6);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                itemScope = (ItemScope) sed.m34998a(parcel, readInt, ItemScope.CREATOR);
                hashSet.add(11);
            }
        }
        if (parcel.dataPosition() == b) {
            return new MomentEntity(hashSet, i, aclEntity, str, str2, str3, str4, str5, itemScope);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
