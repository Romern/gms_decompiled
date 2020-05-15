package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoff implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity.ObjectEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ActivityEntity.ObjectEntity.ActorEntity actorEntity = null;
        ArrayList arrayList = null;
        String str = null;
        ActivityEntity.ObjectEntity.PlusonersEntity plusonersEntity = null;
        ActivityEntity.ObjectEntity.RepliesEntity repliesEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                actorEntity = (ActivityEntity.ObjectEntity.ActorEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.ActorEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.CREATOR);
                hashSet.add(3);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 9) {
                plusonersEntity = (ActivityEntity.ObjectEntity.PlusonersEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.PlusonersEntity.CREATOR);
                hashSet.add(9);
            } else if (a != 10) {
                sed.m35002b(parcel, readInt);
            } else {
                repliesEntity = (ActivityEntity.ObjectEntity.RepliesEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.RepliesEntity.CREATOR);
                hashSet.add(10);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityEntity.ObjectEntity(hashSet, i, actorEntity, arrayList, str, plusonersEntity, repliesEntity);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
