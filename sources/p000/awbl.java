package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.PaymentMethodToken;

/* renamed from: awbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awbl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentMethodToken[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PaymentMethodToken(i, str);
    }
}