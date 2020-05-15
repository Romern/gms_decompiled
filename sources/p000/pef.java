package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;

/* renamed from: pef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pef implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdBreakStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                j3 = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AdBreakStatus(j, j2, str, str2, j3);
    }
}
