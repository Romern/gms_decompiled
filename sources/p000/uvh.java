package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.Change;
import com.google.android.gms.drive.internal.model.ChangeList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangeList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, Change.CREATOR);
                hashSet.add(4);
            } else if (a == 6) {
                j = sed.m35012i(parcel, readInt);
                hashSet.add(6);
            } else if (a != 8) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(8);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangeList(hashSet, arrayList, j, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
