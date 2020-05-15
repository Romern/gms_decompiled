package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;

/* renamed from: atck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atck implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CryptoParameters[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            btli btli = (btli) bxvk.m124016a(btli.f149372c, bArr, bxus.m123744c());
            byte[] bArr2 = new byte[parcel.readInt()];
            parcel.readByteArray(bArr2);
            return new CryptoParameters(btli, bArr2);
        } catch (bxwf e) {
            return null;
        }
    }
}
