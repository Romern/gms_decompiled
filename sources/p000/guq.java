package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;

/* renamed from: guq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class guq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendDataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SendDataRequest(str, bArr);
    }
}
