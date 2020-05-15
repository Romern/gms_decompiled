package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: anwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        PersonEntity.AgeRangeEntity ageRangeEntity = null;
        String str2 = null;
        String str3 = null;
        PersonEntity.CoverEntity coverEntity = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PersonEntity.ImageEntity imageEntity = null;
        String str7 = null;
        PersonEntity.NameEntity nameEntity = null;
        String str8 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    ageRangeEntity = (PersonEntity.AgeRangeEntity) sed.m34998a(parcel2, readInt, PersonEntity.AgeRangeEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    coverEntity = (PersonEntity.CoverEntity) sed.m34998a(parcel2, readInt, PersonEntity.CoverEntity.CREATOR);
                    hashSet.add(7);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                case 11:
                case 13:
                case 17:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 14:
                    str6 = sed.m35020q(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    imageEntity = (PersonEntity.ImageEntity) sed.m34998a(parcel2, readInt, PersonEntity.ImageEntity.CREATOR);
                    hashSet.add(15);
                    break;
                case 16:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(16);
                    break;
                case 18:
                    str7 = sed.m35020q(parcel2, readInt);
                    hashSet.add(18);
                    break;
                case 19:
                    nameEntity = (PersonEntity.NameEntity) sed.m34998a(parcel2, readInt, PersonEntity.NameEntity.CREATOR);
                    hashSet.add(19);
                    imageEntity = imageEntity;
                    break;
                case 20:
                    str8 = sed.m35020q(parcel2, readInt);
                    hashSet.add(20);
                    break;
                case 21:
                    i4 = sed.m35010g(parcel2, readInt);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayList = sed.m35005c(parcel2, readInt, PersonEntity.OrganizationsEntity.CREATOR);
                    hashSet.add(22);
                    imageEntity = imageEntity;
                    break;
                case 23:
                    arrayList2 = sed.m35005c(parcel2, readInt, PersonEntity.PlacesLivedEntity.CREATOR);
                    hashSet.add(23);
                    imageEntity = imageEntity;
                    break;
                case 24:
                    i5 = sed.m35010g(parcel2, readInt);
                    hashSet.add(24);
                    break;
                case 25:
                    i6 = sed.m35010g(parcel2, readInt);
                    hashSet.add(25);
                    break;
                case 26:
                    str9 = sed.m35020q(parcel2, readInt);
                    hashSet.add(26);
                    break;
                case 27:
                    str10 = sed.m35020q(parcel2, readInt);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayList3 = sed.m35005c(parcel2, readInt, PersonEntity.UrlsEntity.CREATOR);
                    hashSet.add(28);
                    imageEntity = imageEntity;
                    break;
                case 29:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(29);
                    break;
            }
        }
        PersonEntity.ImageEntity imageEntity2 = imageEntity;
        if (parcel.dataPosition() == b) {
            return new PersonEntity(hashSet, i, str, ageRangeEntity, str2, str3, i2, coverEntity, str4, str5, i3, str6, imageEntity2, z, str7, nameEntity, str8, i4, arrayList, arrayList2, i5, i6, str9, str10, arrayList3, z2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
