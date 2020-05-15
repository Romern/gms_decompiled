package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* renamed from: sjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse$Field[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ConverterWrapper converterWrapper = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    i4 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) sed.m34998a(parcel, readInt, ConverterWrapper.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FastJsonResponse$Field(i, i2, z, i3, z2, str, i4, str2, converterWrapper);
    }
}
