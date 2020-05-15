package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.About;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new About[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        long j = 0;
        long j2 = 0;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 8) {
                arrayList2 = sed.m34992D(parcel, readInt);
                hashSet.add(8);
            } else if (a == 24) {
                j = sed.m35012i(parcel, readInt);
                hashSet.add(24);
            } else if (a == 13) {
                j2 = sed.m35012i(parcel, readInt);
                hashSet.add(13);
            } else if (a != 14) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, About.MaxUploadSizes.CREATOR);
                hashSet.add(14);
            }
        }
        if (parcel.dataPosition() == b) {
            return new About(hashSet, arrayList2, j2, arrayList, j);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
