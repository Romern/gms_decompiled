package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;

/* renamed from: aofe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        AclEntity aclEntity = null;
        String str = null;
        String str2 = null;
        ActivityEntity.ObjectEntity objectEntity = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel2, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                aclEntity = (AclEntity) sed.m34998a(parcel2, readInt, AclEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 5) {
                str = sed.m35020q(parcel2, readInt);
                hashSet.add(5);
            } else if (a == 10) {
                str2 = sed.m35020q(parcel2, readInt);
                hashSet.add(10);
            } else if (a == 15) {
                objectEntity = (ActivityEntity.ObjectEntity) sed.m34998a(parcel2, readInt, ActivityEntity.ObjectEntity.CREATOR);
                hashSet.add(15);
            } else if (a == 17) {
                str3 = sed.m35020q(parcel2, readInt);
                hashSet.add(17);
            } else if (a != 19) {
                switch (a) {
                    case 23:
                        str5 = sed.m35020q(parcel2, readInt);
                        hashSet.add(23);
                        continue;
                    case 24:
                        str6 = sed.m35020q(parcel2, readInt);
                        hashSet.add(24);
                        continue;
                    case 25:
                        str7 = sed.m35020q(parcel2, readInt);
                        hashSet.add(25);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                str4 = sed.m35020q(parcel2, readInt);
                hashSet.add(19);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityEntity(hashSet, i, aclEntity, str, str2, objectEntity, str3, str4, str5, str6, str7);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
