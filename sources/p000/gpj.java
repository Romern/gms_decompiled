package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* renamed from: gpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface gpj extends IInterface {
    /* renamed from: a */
    void mo12106a(goo goo, Account account);

    /* renamed from: a */
    void mo12107a(goo goo, String str);

    /* renamed from: a */
    void mo12108a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest);

    /* renamed from: a */
    void mo12109a(gox gox, GetAccountsRequest getAccountsRequest);

    /* renamed from: a */
    void mo12110a(gpg gpg, Account account, String str, Bundle bundle);

    /* renamed from: a */
    void mo12111a(rnt rnt, ClearTokenRequest clearTokenRequest);
}
