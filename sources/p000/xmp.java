package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new KeyData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String str = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        int i = 0;
        boolean z = false;
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
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 4:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 5:
                    bArr3 = sed.m35023t(parcel, readInt);
                    break;
                case 6:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    bArr4 = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    bArr5 = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new KeyData(i, z, bArr, bArr2, bArr3, str, bArr4, bArr5);
    }
}
