package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.UserPresence;
import java.util.HashSet;

/* renamed from: aruw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aruw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserPresence[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                j = sed.m35012i(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                j2 = sed.m35012i(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserPresence(hashSet, z, z2, i, j, j2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
