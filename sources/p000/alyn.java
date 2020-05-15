package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: alyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alyn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        String str2 = null;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        String str3 = null;
        ArrayList arrayList10 = null;
        ArrayList arrayList11 = null;
        String str4 = null;
        PersonImpl.LegacyFieldsImpl legacyFieldsImpl = null;
        ArrayList arrayList12 = null;
        ArrayList arrayList13 = null;
        PersonImpl.PersonMetadataImpl personMetadataImpl = null;
        ArrayList arrayList14 = null;
        ArrayList arrayList15 = null;
        ArrayList arrayList16 = null;
        ArrayList arrayList17 = null;
        ArrayList arrayList18 = null;
        ArrayList arrayList19 = null;
        String str5 = null;
        ArrayList arrayList20 = null;
        ArrayList arrayList21 = null;
        ArrayList arrayList22 = null;
        ArrayList arrayList23 = null;
        PersonImpl.SortKeysImpl sortKeysImpl = null;
        ArrayList arrayList24 = null;
        ArrayList arrayList25 = null;
        ArrayList arrayList26 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel2, readInt, PersonImpl.AboutsImpl.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList2 = sed.m35005c(parcel2, readInt, PersonImpl.AddressesImpl.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    arrayList3 = sed.m35005c(parcel2, readInt, PersonImpl.BirthdaysImpl.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList4 = sed.m35005c(parcel2, readInt, PersonImpl.BraggingRightsImpl.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                    arrayList5 = sed.m35005c(parcel2, readInt, PersonImpl.CoverPhotosImpl.CREATOR);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayList6 = sed.m35005c(parcel2, readInt, PersonImpl.CustomFieldsImpl.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    arrayList7 = sed.m35005c(parcel2, readInt, PersonImpl.EmailsImpl.CREATOR);
                    hashSet.add(9);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    arrayList8 = sed.m35005c(parcel2, readInt, PersonImpl.EventsImpl.CREATOR);
                    hashSet.add(11);
                    break;
                case 12:
                    arrayList9 = sed.m35005c(parcel2, readInt, PersonImpl.GendersImpl.CREATOR);
                    hashSet.add(12);
                    break;
                case 13:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    arrayList10 = sed.m35005c(parcel2, readInt, PersonImpl.ImagesImpl.CREATOR);
                    hashSet.add(14);
                    str3 = str3;
                    break;
                case 15:
                    arrayList11 = sed.m35005c(parcel2, readInt, PersonImpl.InstantMessagingImpl.CREATOR);
                    hashSet.add(15);
                    str3 = str3;
                    break;
                case 16:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(16);
                    break;
                case 17:
                    legacyFieldsImpl = (PersonImpl.LegacyFieldsImpl) sed.m34998a(parcel2, readInt, PersonImpl.LegacyFieldsImpl.CREATOR);
                    hashSet.add(17);
                    str3 = str3;
                    break;
                case 18:
                    arrayList12 = sed.m35005c(parcel2, readInt, PersonImpl.CREATOR);
                    hashSet.add(18);
                    str3 = str3;
                    break;
                case 19:
                    arrayList13 = sed.m35005c(parcel2, readInt, PersonImpl.MembershipsImpl.CREATOR);
                    hashSet.add(19);
                    str3 = str3;
                    break;
                case 20:
                    personMetadataImpl = (PersonImpl.PersonMetadataImpl) sed.m34998a(parcel2, readInt, PersonImpl.PersonMetadataImpl.CREATOR);
                    hashSet.add(20);
                    str3 = str3;
                    break;
                case 21:
                    arrayList14 = sed.m35005c(parcel2, readInt, PersonImpl.NamesImpl.CREATOR);
                    hashSet.add(21);
                    str3 = str3;
                    break;
                case 22:
                    arrayList15 = sed.m35005c(parcel2, readInt, PersonImpl.NicknamesImpl.CREATOR);
                    hashSet.add(22);
                    str3 = str3;
                    break;
                case 23:
                    arrayList16 = sed.m35005c(parcel2, readInt, PersonImpl.OccupationsImpl.CREATOR);
                    hashSet.add(23);
                    str3 = str3;
                    break;
                case 24:
                    arrayList17 = sed.m35005c(parcel2, readInt, PersonImpl.OrganizationsImpl.CREATOR);
                    hashSet.add(24);
                    str3 = str3;
                    break;
                case 25:
                    arrayList18 = sed.m35005c(parcel2, readInt, PersonImpl.PhoneNumbersImpl.CREATOR);
                    hashSet.add(25);
                    str3 = str3;
                    break;
                case 26:
                    arrayList19 = sed.m35005c(parcel2, readInt, PersonImpl.PlacesLivedImpl.CREATOR);
                    hashSet.add(26);
                    str3 = str3;
                    break;
                case 27:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayList20 = sed.m35005c(parcel2, readInt, PersonImpl.RelationsImpl.CREATOR);
                    hashSet.add(28);
                    str3 = str3;
                    break;
                case 29:
                    arrayList21 = sed.m35005c(parcel2, readInt, PersonImpl.RelationshipInterestsImpl.CREATOR);
                    hashSet.add(29);
                    str3 = str3;
                    break;
                case 30:
                    arrayList22 = sed.m35005c(parcel2, readInt, PersonImpl.RelationshipStatusesImpl.CREATOR);
                    hashSet.add(30);
                    str3 = str3;
                    break;
                case 31:
                    arrayList23 = sed.m35005c(parcel2, readInt, PersonImpl.SkillsImpl.CREATOR);
                    hashSet.add(31);
                    str3 = str3;
                    break;
                case 32:
                    sortKeysImpl = (PersonImpl.SortKeysImpl) sed.m34998a(parcel2, readInt, PersonImpl.SortKeysImpl.CREATOR);
                    hashSet.add(32);
                    str3 = str3;
                    break;
                case 33:
                    arrayList24 = sed.m35005c(parcel2, readInt, PersonImpl.TaglinesImpl.CREATOR);
                    hashSet.add(33);
                    str3 = str3;
                    break;
                case 34:
                    arrayList25 = sed.m35005c(parcel2, readInt, PersonImpl.UrlsImpl.CREATOR);
                    hashSet.add(34);
                    str3 = str3;
                    break;
                case 35:
                    arrayList26 = sed.m35005c(parcel2, readInt, PersonImpl.NotesImpl.CREATOR);
                    hashSet.add(35);
                    str3 = str3;
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        String str6 = str3;
        if (parcel.dataPosition() == b) {
            return new PersonImpl(hashSet, arrayList, arrayList2, str, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, str2, arrayList8, arrayList9, str6, arrayList10, arrayList11, str4, legacyFieldsImpl, arrayList12, arrayList13, personMetadataImpl, arrayList14, arrayList15, arrayList16, arrayList17, arrayList18, arrayList19, str5, arrayList20, arrayList21, arrayList22, arrayList23, sortKeysImpl, arrayList24, arrayList25, arrayList26);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
