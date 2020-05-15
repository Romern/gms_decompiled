package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;

/* renamed from: fso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fso implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        int[] iArr = null;
        byte[] bArr = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArr2 = null;
        String[] strArr = null;
        byte[] bArr2 = null;
        double[] dArr = null;
        Bundle bundle = null;
        long[] jArr = null;
        long[] jArr2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArr3 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    iArr = sed.m35026w(parcel2, readInt);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 4:
                    bundleArr = (Bundle[]) sed.m35004b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) sed.m35004b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) sed.m35004b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    iArr2 = sed.m35026w(parcel2, readInt);
                    break;
                case 9:
                    strArr = sed.m34989A(parcel2, readInt);
                    break;
                case 10:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 11:
                    dArr = sed.m35029z(parcel2, readInt);
                    break;
                case 12:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 13:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    jArr = sed.m35027x(parcel2, readInt);
                    break;
                case 15:
                    jArr2 = sed.m35027x(parcel2, readInt);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) sed.m35004b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 17:
                    iArr3 = sed.m35026w(parcel2, readInt);
                    break;
                case 18:
                    bArr3 = sed.m35023t(parcel2, readInt);
                    break;
                case 19:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SearchResults(str, iArr, bArr, bundleArr, bundleArr2, bundleArr3, i, iArr2, strArr, bArr2, dArr, bundle, i2, jArr, jArr2, bundleArr4, iArr3, bArr3, z);
    }
}
