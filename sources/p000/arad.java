package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.util.HashSet;

/* renamed from: arad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PostTransferAction[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str4 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PostTransferAction(hashSet, str, str2, str3, str4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
