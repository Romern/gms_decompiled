package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;

/* renamed from: jpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpq {

    /* renamed from: a */
    public static final /* synthetic */ int f22996a = 0;

    /* renamed from: b */
    private static final Logger f22997b = jsy.m17256a("ForceCryptauthSyncHelper");

    /* renamed from: a */
    public static final boolean m17076a(Context context, Account account) {
        jta a = jsz.m17257a();
        try {
            jom.m17029a(context).mo13945a(account, 9);
            a.mo14060p(0);
            return true;
        } catch (jon e) {
            f22997b.mo25418e("Failed to sync devices.", new Object[0]);
            CryptauthDeviceSyncGcmTaskService.m6785a(context.getApplicationContext(), account);
            a.mo14060p(2);
            return false;
        }
    }
}
