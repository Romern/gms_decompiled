package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import java.util.ArrayList;

/* renamed from: aspc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aspc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransactionData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    arrayList = sed.m34990B(parcel2, readInt);
                    break;
                case 8:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TransactionData(j, j2, str, i, arrayList, i2, z);
    }
}
