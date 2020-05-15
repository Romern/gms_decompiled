package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.DtmfEncoding;

/* renamed from: gdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DtmfEncoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        AdsrParams adsrParams = null;
        float[] fArr = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    i5 = sed.m35010g(parcel, readInt);
                    break;
                case 9:
                    adsrParams = (AdsrParams) sed.m34998a(parcel, readInt, AdsrParams.CREATOR);
                    break;
                case 10:
                    fArr = sed.m35028y(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DtmfEncoding(i, z, f, i2, i3, i4, i5, adsrParams, fArr);
    }
}
