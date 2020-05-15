package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* renamed from: xpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAssertionResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a == 4) {
                bArr3 = sed.m35023t(parcel, readInt);
            } else if (a == 5) {
                bArr4 = sed.m35023t(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr5 = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AuthenticatorAssertionResponse(bArr, bArr2, bArr3, bArr4, bArr5);
    }
}
