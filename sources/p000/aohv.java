package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aohv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        PersonEntity.ImageEntity imageEntity = null;
        PersonEntity.NameEntity nameEntity = null;
        String str4 = null;
        PersonEntity.StatusForViewerEntity statusForViewerEntity = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            String str7 = str6;
            if (a == 1) {
                i = sed.m35010g(parcel2, readInt);
                hashSet.add(1);
                str6 = str7;
            } else if (a == 9) {
                str = sed.m35020q(parcel2, readInt);
                hashSet.add(9);
                str6 = str7;
            } else if (a == 20) {
                nameEntity = (PersonEntity.NameEntity) sed.m34998a(parcel2, readInt, PersonEntity.NameEntity.CREATOR);
                hashSet.add(20);
                str6 = str7;
            } else if (a == 22) {
                str4 = sed.m35020q(parcel2, readInt);
                hashSet.add(22);
                str6 = str7;
            } else if (a == 32) {
                String q = sed.m35020q(parcel2, readInt);
                hashSet.add(32);
                str6 = q;
            } else if (a == 11) {
                arrayList = sed.m35005c(parcel2, readInt, PersonEntity.EmailsEntity.CREATOR);
                hashSet.add(11);
                str6 = str7;
            } else if (a == 12) {
                str2 = sed.m35020q(parcel2, readInt);
                hashSet.add(12);
                str6 = str7;
            } else if (a == 15) {
                str3 = sed.m35020q(parcel2, readInt);
                hashSet.add(15);
                str6 = str7;
            } else if (a == 16) {
                imageEntity = (PersonEntity.ImageEntity) sed.m34998a(parcel2, readInt, PersonEntity.ImageEntity.CREATOR);
                hashSet.add(16);
                str6 = str7;
            } else if (a == 29) {
                statusForViewerEntity = (PersonEntity.StatusForViewerEntity) sed.m34998a(parcel2, readInt, PersonEntity.StatusForViewerEntity.CREATOR);
                hashSet.add(29);
                str6 = str7;
            } else if (a != 30) {
                sed.m35002b(parcel2, readInt);
                str6 = str7;
            } else {
                str5 = sed.m35020q(parcel2, readInt);
                hashSet.add(30);
                str6 = str7;
            }
        }
        String str8 = str6;
        if (parcel.dataPosition() == b) {
            return new PersonEntity(hashSet, i, str, arrayList, str2, str3, imageEntity, nameEntity, str4, statusForViewerEntity, str5, str8);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
