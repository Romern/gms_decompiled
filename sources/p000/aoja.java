package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoja implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PeopleList[i];
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
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, Person.CREATOR);
                hashSet.add(3);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            } else if (a == 6) {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(6);
            } else if (a == 7) {
                str4 = sed.m35020q(parcel, readInt);
                hashSet.add(7);
            } else if (a != 8) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(8);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PeopleList(hashSet, str, arrayList, str2, str3, str4, i);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
