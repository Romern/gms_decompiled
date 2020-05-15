package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;

/* renamed from: aofm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity imageEntity = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 4) {
                imageEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity.CREATOR);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity(hashSet, i, imageEntity, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
