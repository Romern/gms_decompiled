package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: ixn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ixn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GplusInfoRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        CaptchaSolution captchaSolution = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                captchaSolution = (CaptchaSolution) sed.m34998a(parcel, readInt, CaptchaSolution.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GplusInfoRequest(i, str, captchaSolution, account);
    }
}
