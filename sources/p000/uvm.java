package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.File;
import java.util.HashSet;

/* renamed from: uvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new File.Labels[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 3) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                z2 = sed.m35006c(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                z3 = sed.m35006c(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                z4 = sed.m35006c(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new File.Labels(hashSet, z, z2, z3, z4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
