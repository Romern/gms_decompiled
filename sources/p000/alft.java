package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;

/* renamed from: alft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alft implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PerformPaymentMethodServerActionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        ProtoSafeParcelable protoSafeParcelable = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                protoSafeParcelable = (ProtoSafeParcelable) sed.m34998a(parcel, readInt, ProtoSafeParcelable.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PerformPaymentMethodServerActionRequest(account, protoSafeParcelable, str);
    }
}
