package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aogt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CommentEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        CommentEntity.ActorEntity actorEntity = null;
        String str = null;
        ArrayList arrayList = null;
        CommentEntity.ObjectEntity objectEntity = null;
        CommentEntity.PlusonersEntity plusonersEntity = null;
        String str2 = null;
        CommentEntity.StatusForViewerEntity statusForViewerEntity = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    actorEntity = (CommentEntity.ActorEntity) sed.m34998a(parcel, readInt, CommentEntity.ActorEntity.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                case 6:
                case 10:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel, readInt, CommentEntity.InReplyToEntity.CREATOR);
                    hashSet.add(5);
                    break;
                case 7:
                    objectEntity = (CommentEntity.ObjectEntity) sed.m34998a(parcel, readInt, CommentEntity.ObjectEntity.CREATOR);
                    hashSet.add(7);
                    break;
                case 8:
                    plusonersEntity = (CommentEntity.PlusonersEntity) sed.m34998a(parcel, readInt, CommentEntity.PlusonersEntity.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 11:
                    statusForViewerEntity = (CommentEntity.StatusForViewerEntity) sed.m34998a(parcel, readInt, CommentEntity.StatusForViewerEntity.CREATOR);
                    hashSet.add(11);
                    break;
                case 12:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(12);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CommentEntity(hashSet, i, actorEntity, str, arrayList, objectEntity, plusonersEntity, str2, statusForViewerEntity, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
