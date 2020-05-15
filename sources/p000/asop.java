package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.SeTransactionInfo;
import java.math.BigDecimal;

/* renamed from: asop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asop implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SeTransactionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        BigDecimal bigDecimal = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 2) {
                bigDecimal = sed.m35019p(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SeTransactionInfo(j, bigDecimal, str, j2, i);
    }
}
