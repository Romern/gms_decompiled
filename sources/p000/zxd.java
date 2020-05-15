package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FontMatchSpec[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    f2 = sed.m35015l(parcel, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FontMatchSpec(i, str, f, i2, f2, z);
    }
}
