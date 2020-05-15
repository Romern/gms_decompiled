package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.lso.AuthApps;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: sel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sel implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthApps[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, AuthApps.Api_scopes.CREATOR);
                hashSet.add(2);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList2 = sed.m35005c(parcel, readInt, AuthApps.Apps.CREATOR);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthApps(hashSet, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
