package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.AtomInfo;

/* renamed from: adfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AtomInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        int[] iArr = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 6:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AtomInfo(str, str2, strArr, iArr, i, bArr, z);
    }
}
