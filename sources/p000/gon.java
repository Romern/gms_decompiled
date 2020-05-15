package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: gon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface gon extends IInterface {
    /* renamed from: a */
    void mo12096a(gop gop, ClearTokenRequest clearTokenRequest);

    /* renamed from: a */
    void mo12097a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest);

    /* renamed from: a */
    void mo12098a(got got, String str);

    /* renamed from: a */
    void mo12099a(gou gou, Account account);

    /* renamed from: a */
    void mo12100a(gpa gpa, Account account);

    /* renamed from: a */
    void mo12101a(gpb gpb, Account account);

    /* renamed from: a */
    void mo12102a(gpc gpc, TokenRequest tokenRequest);

    /* renamed from: a */
    void mo12103a(gpd gpd, String str);

    /* renamed from: a */
    void mo12104a(rnt rnt, Account account, boolean z);
}
