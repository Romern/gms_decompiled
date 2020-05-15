package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import java.util.HashSet;

/* renamed from: alyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alyh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.MetadataImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
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
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    z3 = sed.m35006c(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z4 = sed.m35006c(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(10);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonImpl.MetadataImpl(hashSet, str, str2, str3, str4, z, z2, z3, z4, i);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
