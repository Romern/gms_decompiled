package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.telephonyspam.CallSpamOptions;

/* renamed from: aucv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aucv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CallSpamOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                j2 = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CallSpamOptions(i, str, j, i2, j2);
    }
}
