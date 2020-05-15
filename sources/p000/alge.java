package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;

/* renamed from: alge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alge implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectPayGlobalActionCardRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        Account account = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SelectPayGlobalActionCardRequest(account, i, str, i2);
    }
}
