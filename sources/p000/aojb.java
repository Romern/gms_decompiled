package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aojb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aojb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        String str = null;
        ArrayList arrayList10 = null;
        Person.ExtendedData extendedData = null;
        ArrayList arrayList11 = null;
        ArrayList arrayList12 = null;
        String str2 = null;
        ArrayList arrayList13 = null;
        ArrayList arrayList14 = null;
        ArrayList arrayList15 = null;
        String str3 = null;
        ArrayList arrayList16 = null;
        Person.LegacyFields legacyFields = null;
        ArrayList arrayList17 = null;
        Person.Metadata metadata = null;
        ArrayList arrayList18 = null;
        ArrayList arrayList19 = null;
        ArrayList arrayList20 = null;
        ArrayList arrayList21 = null;
        ArrayList arrayList22 = null;
        ArrayList arrayList23 = null;
        ArrayList arrayList24 = null;
        String str4 = null;
        ArrayList arrayList25 = null;
        ArrayList arrayList26 = null;
        ArrayList arrayList27 = null;
        Person.SortKeys sortKeys = null;
        ArrayList arrayList28 = null;
        ArrayList arrayList29 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel2, readInt, Person.Abouts.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList2 = sed.m35005c(parcel2, readInt, Person.Addresses.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                case 16:
                case 20:
                case 23:
                case 27:
                case 35:
                case FelicaException.TYPE_NOT_CLOSED:
                case 41:
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 5:
                    arrayList3 = sed.m35005c(parcel2, readInt, Person.Birthdays.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList4 = sed.m35005c(parcel2, readInt, Person.BraggingRights.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                    arrayList5 = sed.m35005c(parcel2, readInt, Person.Calendars.CREATOR);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayList6 = sed.m35005c(parcel2, readInt, Person.ClientData.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    arrayList7 = sed.m35005c(parcel2, readInt, Person.CoverPhotos.CREATOR);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayList8 = sed.m35005c(parcel2, readInt, Person.CustomFields.CREATOR);
                    hashSet.add(10);
                    break;
                case 11:
                    arrayList9 = sed.m35005c(parcel2, readInt, Person.Emails.CREATOR);
                    hashSet.add(11);
                    break;
                case 12:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    arrayList10 = sed.m35005c(parcel2, readInt, Person.Events.CREATOR);
                    hashSet.add(13);
                    break;
                case 14:
                    extendedData = (Person.ExtendedData) sed.m34998a(parcel2, readInt, Person.ExtendedData.CREATOR);
                    hashSet.add(14);
                    break;
                case 15:
                    arrayList11 = sed.m35005c(parcel2, readInt, Person.ExternalIds.CREATOR);
                    hashSet.add(15);
                    extendedData = extendedData;
                    break;
                case 17:
                    arrayList12 = sed.m35005c(parcel2, readInt, Person.Genders.CREATOR);
                    hashSet.add(17);
                    extendedData = extendedData;
                    break;
                case 18:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(18);
                    break;
                case 19:
                    arrayList13 = sed.m35005c(parcel2, readInt, Person.Images.CREATOR);
                    hashSet.add(19);
                    extendedData = extendedData;
                    break;
                case 21:
                    arrayList14 = sed.m35005c(parcel2, readInt, Person.InstantMessaging.CREATOR);
                    hashSet.add(21);
                    extendedData = extendedData;
                    break;
                case 22:
                    arrayList15 = sed.m35005c(parcel2, readInt, Person.Interests.CREATOR);
                    hashSet.add(22);
                    extendedData = extendedData;
                    break;
                case 24:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(24);
                    break;
                case 25:
                    arrayList16 = sed.m35005c(parcel2, readInt, Person.Languages.CREATOR);
                    hashSet.add(25);
                    extendedData = extendedData;
                    break;
                case 26:
                    legacyFields = (Person.LegacyFields) sed.m34998a(parcel2, readInt, Person.LegacyFields.CREATOR);
                    hashSet.add(26);
                    extendedData = extendedData;
                    break;
                case 28:
                    arrayList17 = sed.m35005c(parcel2, readInt, Person.Memberships.CREATOR);
                    hashSet.add(28);
                    extendedData = extendedData;
                    break;
                case 29:
                    metadata = (Person.Metadata) sed.m34998a(parcel2, readInt, Person.Metadata.CREATOR);
                    hashSet.add(29);
                    extendedData = extendedData;
                    break;
                case 30:
                    arrayList18 = sed.m35005c(parcel2, readInt, Person.Names.CREATOR);
                    hashSet.add(30);
                    extendedData = extendedData;
                    break;
                case 31:
                    arrayList19 = sed.m35005c(parcel2, readInt, Person.Nicknames.CREATOR);
                    hashSet.add(31);
                    extendedData = extendedData;
                    break;
                case 32:
                    arrayList20 = sed.m35005c(parcel2, readInt, Person.Occupations.CREATOR);
                    hashSet.add(32);
                    extendedData = extendedData;
                    break;
                case 33:
                    arrayList21 = sed.m35005c(parcel2, readInt, Person.Organizations.CREATOR);
                    hashSet.add(33);
                    extendedData = extendedData;
                    break;
                case 34:
                    arrayList22 = sed.m35005c(parcel2, readInt, Person.OtherKeywords.CREATOR);
                    hashSet.add(34);
                    extendedData = extendedData;
                    break;
                case 36:
                    arrayList23 = sed.m35005c(parcel2, readInt, Person.PhoneNumbers.CREATOR);
                    hashSet.add(36);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    arrayList24 = sed.m35005c(parcel2, readInt, Person.PlacesLived.CREATOR);
                    hashSet.add(38);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(39);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    arrayList25 = sed.m35005c(parcel2, readInt, Person.Relations.CREATOR);
                    hashSet.add(40);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    arrayList26 = sed.m35005c(parcel2, readInt, Person.SipAddress.CREATOR);
                    hashSet.add(43);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    arrayList27 = sed.m35005c(parcel2, readInt, Person.Skills.CREATOR);
                    hashSet.add(44);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    sortKeys = (Person.SortKeys) sed.m34998a(parcel2, readInt, Person.SortKeys.CREATOR);
                    hashSet.add(45);
                    extendedData = extendedData;
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    arrayList28 = sed.m35005c(parcel2, readInt, Person.Taglines.CREATOR);
                    hashSet.add(46);
                    extendedData = extendedData;
                    break;
                case 47:
                    arrayList29 = sed.m35005c(parcel2, readInt, Person.Urls.CREATOR);
                    hashSet.add(47);
                    extendedData = extendedData;
                    break;
            }
        }
        Person.ExtendedData extendedData2 = extendedData;
        if (parcel.dataPosition() == b) {
            return new Person(hashSet, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, str, arrayList10, extendedData2, arrayList11, arrayList12, str2, arrayList13, arrayList14, arrayList15, str3, arrayList16, legacyFields, arrayList17, metadata, arrayList18, arrayList19, arrayList20, arrayList21, arrayList22, arrayList23, arrayList24, str4, arrayList25, arrayList26, arrayList27, sortKeys, arrayList28, arrayList29);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
