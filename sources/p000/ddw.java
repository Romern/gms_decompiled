package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: ddw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddw extends dcj implements ddy {
    public ddw(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: a */
    public final Bundle mo8546a(Account account, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(5, bj);
        Bundle bundle2 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo8547a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(6, bj);
        Bundle bundle2 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo8548a(String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        Parcel a = mo8526a(2, bj);
        Bundle bundle2 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final AccountChangeEventsResponse mo8549a(AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, accountChangeEventsRequest);
        Parcel a = mo8526a(3, bj);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) dcl.m8163a(a, AccountChangeEventsResponse.CREATOR);
        a.recycle();
        return accountChangeEventsResponse;
    }
}
