package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* renamed from: xyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignResponseData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        String str = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr3 = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SignResponseData(bArr, str, bArr2, bArr3);
    }
}
