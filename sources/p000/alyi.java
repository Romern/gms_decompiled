package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import java.util.HashSet;

/* renamed from: alyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alyi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.NamesImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        PersonImpl.MetadataImpl metadataImpl = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    metadataImpl = (PersonImpl.MetadataImpl) sed.m34998a(parcel2, readInt, PersonImpl.MetadataImpl.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
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
                    str4 = sed.m35020q(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str6 = sed.m35020q(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    str7 = sed.m35020q(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    str8 = sed.m35020q(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str9 = sed.m35020q(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    str10 = sed.m35020q(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    str11 = sed.m35020q(parcel2, readInt);
                    hashSet.add(13);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonImpl.NamesImpl(hashSet, metadataImpl, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
