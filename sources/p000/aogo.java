package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity;
import java.util.HashSet;

/* renamed from: aogo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientOzEventEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        OzEventEntity ozEventEntity = null;
        long j = 0;
        ClientActionDataEntity clientActionDataEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                clientActionDataEntity = (ClientActionDataEntity) sed.m34998a(parcel, readInt, ClientActionDataEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
                hashSet.add(3);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                ozEventEntity = (OzEventEntity) sed.m34998a(parcel, readInt, OzEventEntity.CREATOR);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientOzEventEntity(hashSet, i, clientActionDataEntity, j, ozEventEntity);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
