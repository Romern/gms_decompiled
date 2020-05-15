package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aofh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity actionEntity = null;
        String str = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity deepLinkEntity = null;
        String str2 = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity imageEntity = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                actionEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                deepLinkEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity.CREATOR);
                hashSet.add(5);
            } else if (a == 6) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(6);
            } else if (a == 10) {
                imageEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity) sed.m34998a(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity.CREATOR);
                hashSet.add(10);
            } else if (a == 11) {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(11);
            } else if (a == 13) {
                arrayList = sed.m35005c(parcel, readInt, ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.CREATOR);
                hashSet.add(13);
            } else if (a != 14) {
                sed.m35002b(parcel, readInt);
            } else {
                str4 = sed.m35020q(parcel, readInt);
                hashSet.add(14);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityEntity.ObjectEntity.AttachmentsEntity(hashSet, i, actionEntity, str, deepLinkEntity, str2, imageEntity, str3, arrayList, str4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
