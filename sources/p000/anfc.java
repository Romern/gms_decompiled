package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: anfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegistrationInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String[] strArr = null;
        byte[] bArr = null;
        int[] iArr = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 4:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new RegistrationInfo(str, i, strArr, bArr, z, iArr, str2);
    }
}
