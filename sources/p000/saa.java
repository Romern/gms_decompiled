package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

/* renamed from: saa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class saa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    iBinder = sed.m35021r(parcel, readInt);
                    break;
                case 3:
                    scopeArr = (Scope[]) sed.m35004b(parcel, readInt, Scope.CREATOR);
                    break;
                case 4:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 5:
                    num2 = sed.m35011h(parcel, readInt);
                    break;
                case 6:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
    }
}
