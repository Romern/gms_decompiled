package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.accounts.security.EncryptedAccountData;

/* renamed from: acxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EncryptedAccountData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 2) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                bArr3 = sed.m35023t(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new EncryptedAccountData(i, bArr, bArr2, bArr3);
    }
}
