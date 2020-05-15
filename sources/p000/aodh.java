package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.service.p063v1.PeopleFeed;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aodh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PeopleFeed[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
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
                    arrayList = sed.m35005c(parcel, readInt, PersonEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i2 = sed.m35010g(parcel, readInt);
                    hashSet.add(8);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PeopleFeed(hashSet, i, str, arrayList, str2, str3, str4, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
