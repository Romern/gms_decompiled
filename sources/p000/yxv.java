package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Value;

/* renamed from: yxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Value[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Bundle bundle = null;
        int[] iArr = null;
        float[] fArr = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 3:
                    f = sed.m35015l(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 6:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 7:
                    fArr = sed.m35028y(parcel, readInt);
                    break;
                case 8:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Value(i, z, f, str, bundle, iArr, fArr, bArr);
    }
}
