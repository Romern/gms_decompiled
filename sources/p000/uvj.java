package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FileList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, File.CREATOR);
                hashSet.add(4);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(7);
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileList(hashSet, arrayList, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
