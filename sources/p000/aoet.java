package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.LoggedProfileEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoet implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActionTargetEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        AclDetailsEntity aclDetailsEntity = null;
        String str = null;
        ArrayList arrayList = null;
        LoggedProfileEntity loggedProfileEntity = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                aclDetailsEntity = (AclDetailsEntity) sed.m34998a(parcel, readInt, AclDetailsEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 5) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            } else if (a == 6) {
                i2 = sed.m35010g(parcel, readInt);
                hashSet.add(6);
            } else if (a == 25) {
                arrayList = sed.m34992D(parcel, readInt);
                hashSet.add(25);
            } else if (a == 89) {
                arrayList2 = sed.m34992D(parcel, readInt);
                hashSet.add(89);
            } else if (a == 61) {
                loggedProfileEntity = (LoggedProfileEntity) sed.m34998a(parcel, readInt, LoggedProfileEntity.CREATOR);
                hashSet.add(61);
            } else if (a != 62) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(62);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActionTargetEntity(hashSet, i, aclDetailsEntity, str, i2, arrayList, loggedProfileEntity, str2, arrayList2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
