package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileLocalId;
import com.google.android.gms.drive.internal.model.ParentReference;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.internal.model.Property;
import com.google.android.gms.drive.internal.model.User;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new File[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ArrayList arrayList2 = null;
        String str10 = null;
        String str11 = null;
        File.IndexableText indexableText = null;
        File.Labels labels = null;
        User user = null;
        String str12 = null;
        FileLocalId fileLocalId = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        User user2 = null;
        ArrayList arrayList8 = null;
        File.Thumbnail thumbnail = null;
        String str21 = null;
        String str22 = null;
        Permission permission = null;
        String str23 = null;
        String str24 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            boolean z9 = z4;
            if (parcel.dataPosition() < b) {
                int readInt = parcel.readInt();
                switch (sed.m34995a(readInt)) {
                    case 2:
                        str = sed.m35020q(parcel2, readInt);
                        hashSet.add(2);
                        z4 = z9;
                        break;
                    case 3:
                        z = sed.m35006c(parcel2, readInt);
                        hashSet.add(3);
                        z4 = z9;
                        break;
                    case 4:
                        arrayList = sed.m34992D(parcel2, readInt);
                        hashSet.add(4);
                        z4 = z9;
                        break;
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case 15:
                    case 19:
                    case 22:
                    case 23:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                    case 33:
                    case 35:
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    case 41:
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    case 48:
                    case 53:
                    case FelicaException.TYPE_ACTIVATE_FAILED:
                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    case FelicaException.TYPE_MFC_NOT_FOUND:
                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    case 62:
                    case 66:
                    case KeyInformation.AES128_DES112:
                    case 70:
                    case 76:
                    default:
                        sed.m35002b(parcel2, readInt);
                        z4 = z9;
                        break;
                    case 6:
                        z2 = sed.m35006c(parcel2, readInt);
                        hashSet.add(6);
                        z4 = z9;
                        break;
                    case 7:
                        str2 = sed.m35020q(parcel2, readInt);
                        hashSet.add(7);
                        z4 = z9;
                        break;
                    case 8:
                        str3 = sed.m35020q(parcel2, readInt);
                        hashSet.add(8);
                        z4 = z9;
                        break;
                    case 11:
                        str4 = sed.m35020q(parcel2, readInt);
                        hashSet.add(11);
                        z4 = z9;
                        break;
                    case 12:
                        str5 = sed.m35020q(parcel2, readInt);
                        hashSet.add(12);
                        z4 = z9;
                        break;
                    case 14:
                        z3 = sed.m35006c(parcel2, readInt);
                        hashSet.add(14);
                        z4 = z9;
                        break;
                    case 16:
                        str6 = sed.m35020q(parcel2, readInt);
                        hashSet.add(16);
                        z4 = z9;
                        break;
                    case 17:
                        str7 = sed.m35020q(parcel2, readInt);
                        hashSet.add(17);
                        z4 = z9;
                        break;
                    case 18:
                        z4 = sed.m35006c(parcel2, readInt);
                        hashSet.add(18);
                        break;
                    case 20:
                        str8 = sed.m35020q(parcel2, readInt);
                        hashSet.add(20);
                        z4 = z9;
                        break;
                    case 21:
                        j = sed.m35012i(parcel2, readInt);
                        hashSet.add(21);
                        z4 = z9;
                        break;
                    case 24:
                        str9 = sed.m35020q(parcel2, readInt);
                        hashSet.add(24);
                        z4 = z9;
                        break;
                    case 25:
                        arrayList2 = sed.m34992D(parcel2, readInt);
                        hashSet.add(25);
                        z4 = z9;
                        break;
                    case 26:
                        z5 = sed.m35006c(parcel2, readInt);
                        hashSet.add(26);
                        z4 = z9;
                        break;
                    case 30:
                        str10 = sed.m35020q(parcel2, readInt);
                        hashSet.add(30);
                        z4 = z9;
                        break;
                    case 32:
                        str11 = sed.m35020q(parcel2, readInt);
                        hashSet.add(32);
                        z4 = z9;
                        break;
                    case 34:
                        indexableText = (File.IndexableText) sed.m34998a(parcel2, readInt, File.IndexableText.CREATOR);
                        hashSet.add(34);
                        z4 = z9;
                        break;
                    case 36:
                        labels = (File.Labels) sed.m34998a(parcel2, readInt, File.Labels.CREATOR);
                        hashSet.add(36);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_NOT_CLOSED:
                        user = (User) sed.m34998a(parcel2, readInt, User.CREATOR);
                        hashSet.add(37);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        str12 = sed.m35020q(parcel2, readInt);
                        hashSet.add(39);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_PUSH_FAILED:
                        fileLocalId = (FileLocalId) sed.m34998a(parcel2, readInt, FileLocalId.CREATOR);
                        hashSet.add(40);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                        str13 = sed.m35020q(parcel2, readInt);
                        hashSet.add(42);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                        str14 = sed.m35020q(parcel2, readInt);
                        hashSet.add(43);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_RESET_FAILED:
                        str15 = sed.m35020q(parcel2, readInt);
                        hashSet.add(44);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        str16 = sed.m35020q(parcel2, readInt);
                        hashSet.add(45);
                        z4 = z9;
                        break;
                    case 47:
                        str17 = sed.m35020q(parcel2, readInt);
                        hashSet.add(47);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        arrayList3 = sed.m34992D(parcel2, readInt);
                        hashSet.add(49);
                        z4 = z9;
                        break;
                    case 50:
                        arrayList4 = sed.m35005c(parcel2, readInt, User.CREATOR);
                        hashSet.add(50);
                        z4 = z9;
                        break;
                    case 51:
                        arrayList5 = sed.m35005c(parcel2, readInt, ParentReference.CREATOR);
                        hashSet.add(51);
                        z4 = z9;
                        break;
                    case 52:
                        arrayList6 = sed.m35005c(parcel2, readInt, Permission.CREATOR);
                        hashSet.add(52);
                        z4 = z9;
                        break;
                    case 54:
                        arrayList7 = sed.m35005c(parcel2, readInt, Property.CREATOR);
                        hashSet.add(54);
                        z4 = z9;
                        break;
                    case 55:
                        j2 = sed.m35012i(parcel2, readInt);
                        hashSet.add(55);
                        z4 = z9;
                        break;
                    case 57:
                        str18 = sed.m35020q(parcel2, readInt);
                        hashSet.add(57);
                        z4 = z9;
                        break;
                    case FelicaException.TYPE_OFFLINE_CANCELED:
                        str19 = sed.m35020q(parcel2, readInt);
                        hashSet.add(58);
                        z4 = z9;
                        break;
                    case 63:
                        z6 = sed.m35006c(parcel2, readInt);
                        hashSet.add(63);
                        z4 = z9;
                        break;
                    case 64:
                        str20 = sed.m35020q(parcel2, readInt);
                        hashSet.add(64);
                        z4 = z9;
                        break;
                    case KeyInformation.AES128_DES56:
                        user2 = (User) sed.m34998a(parcel2, readInt, User.CREATOR);
                        hashSet.add(65);
                        z4 = z9;
                        break;
                    case 68:
                        arrayList8 = sed.m34992D(parcel2, readInt);
                        hashSet.add(68);
                        z4 = z9;
                        break;
                    case 69:
                        z7 = sed.m35006c(parcel2, readInt);
                        hashSet.add(69);
                        z4 = z9;
                        break;
                    case 71:
                        thumbnail = (File.Thumbnail) sed.m34998a(parcel2, readInt, File.Thumbnail.CREATOR);
                        hashSet.add(71);
                        z4 = z9;
                        break;
                    case 72:
                        str21 = sed.m35020q(parcel2, readInt);
                        hashSet.add(72);
                        z4 = z9;
                        break;
                    case 73:
                        str22 = sed.m35020q(parcel2, readInt);
                        hashSet.add(73);
                        z4 = z9;
                        break;
                    case 74:
                        permission = (Permission) sed.m34998a(parcel2, readInt, Permission.CREATOR);
                        hashSet.add(74);
                        z4 = z9;
                        break;
                    case 75:
                        j3 = sed.m35012i(parcel2, readInt);
                        hashSet.add(75);
                        z4 = z9;
                        break;
                    case 77:
                        str23 = sed.m35020q(parcel2, readInt);
                        hashSet.add(77);
                        z4 = z9;
                        break;
                    case 78:
                        str24 = sed.m35020q(parcel2, readInt);
                        hashSet.add(78);
                        z4 = z9;
                        break;
                    case KeyInformation.AES128:
                        z8 = sed.m35006c(parcel2, readInt);
                        hashSet.add(79);
                        z4 = z9;
                        break;
                }
            } else if (parcel.dataPosition() == b) {
                return new File(hashSet, str, z, arrayList, z2, str2, str3, str4, str5, z3, str6, str7, z9, str8, j, str9, arrayList2, z5, str10, str11, indexableText, labels, user, str12, fileLocalId, str13, str14, str15, str16, str17, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, j2, str18, str19, z6, str20, user2, arrayList8, z7, thumbnail, str21, str22, permission, j3, str23, str24, z8);
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Overread allowed size end=");
                sb.append(b);
                throw new sec(sb.toString(), parcel2);
            }
        }
    }
}
