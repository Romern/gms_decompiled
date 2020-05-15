package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;

/* renamed from: geg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class geg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Snoop$Params[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Encoding[] encodingArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                encodingArr = (Encoding[]) sed.m35004b(parcel, readInt, Encoding.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Snoop$Params(encodingArr, z, z2, j);
    }
}
