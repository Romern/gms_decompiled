package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.AdsrParams;

/* renamed from: gcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gcc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdsrParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                j3 = sed.m35012i(parcel, readInt);
            } else if (a == 5) {
                j4 = sed.m35012i(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                f = sed.m35015l(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AdsrParams(j, j2, j3, j4, f);
    }
}
