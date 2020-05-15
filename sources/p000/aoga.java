package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoga implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientActionDataEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ClientAclDetailsEntity clientAclDetailsEntity = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ClientLoggedRhsComponentEntity clientLoggedRhsComponentEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                clientAclDetailsEntity = (ClientAclDetailsEntity) sed.m34998a(parcel, readInt, ClientAclDetailsEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 7) {
                arrayList = sed.m35005c(parcel, readInt, ClientLoggedCircleEntity.CREATOR);
                hashSet.add(7);
            } else if (a == 8) {
                arrayList2 = sed.m35005c(parcel, readInt, ClientLoggedCircleMemberEntity.CREATOR);
                hashSet.add(8);
            } else if (a == 13) {
                arrayList3 = sed.m34992D(parcel, readInt);
                hashSet.add(13);
            } else if (a != 20) {
                sed.m35002b(parcel, readInt);
            } else {
                clientLoggedRhsComponentEntity = (ClientLoggedRhsComponentEntity) sed.m34998a(parcel, readInt, ClientLoggedRhsComponentEntity.CREATOR);
                hashSet.add(20);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientActionDataEntity(hashSet, i, clientAclDetailsEntity, arrayList, arrayList2, arrayList3, clientLoggedRhsComponentEntity);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
