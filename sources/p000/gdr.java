package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: gdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Encoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DsssEncoding dsssEncoding = null;
        DtmfEncoding dtmfEncoding = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                dsssEncoding = (DsssEncoding) sed.m34998a(parcel, readInt, DsssEncoding.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                dtmfEncoding = (DtmfEncoding) sed.m34998a(parcel, readInt, DtmfEncoding.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new Encoding(i, dsssEncoding, dtmfEncoding);
    }
}
