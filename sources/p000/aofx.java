package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aofx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientAclDetailsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, ClientLoggedCircleEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 4) {
                arrayList2 = sed.m35005c(parcel, readInt, ClientLoggedCircleMemberEntity.CREATOR);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList3 = sed.m34992D(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientAclDetailsEntity(hashSet, i, arrayList, arrayList2, arrayList3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
