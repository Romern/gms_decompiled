package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.PendingAccountData;
import java.util.ArrayList;

/* renamed from: aqyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqyo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapCompletionResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        BootstrapAccount bootstrapAccount = null;
        ArrayList arrayList2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    arrayList = sed.m35005c(parcel, readInt, BootstrapAccount.CREATOR);
                    break;
                case 5:
                    bootstrapAccount = (BootstrapAccount) sed.m34998a(parcel, readInt, BootstrapAccount.CREATOR);
                    break;
                case 6:
                    arrayList2 = sed.m35005c(parcel, readInt, PendingAccountData.CREATOR);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 8:
                    j = sed.m35012i(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new BootstrapCompletionResult(i, str, arrayList, bootstrapAccount, arrayList2, i2, j);
    }
}
