package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* renamed from: gph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gph extends dcj implements gpj {
    public gph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    /* renamed from: a */
    public final void mo12106a(goo goo, Account account) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12107a(goo goo, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12108a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gos);
        dcl.m8165a(bj, accountChangeEventsRequest);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo12109a(gox gox, GetAccountsRequest getAccountsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gox);
        dcl.m8165a(bj, getAccountsRequest);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo12110a(gpg gpg, Account account, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, gpg);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo12111a(rnt rnt, ClearTokenRequest clearTokenRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, clearTokenRequest);
        mo8528b(2, bj);
    }
}
