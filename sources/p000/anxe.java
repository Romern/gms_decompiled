package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;

/* renamed from: anxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity.NameEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonEntity.NameEntity(hashSet, i, str, str2, str3, str4, str5, str6);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
