package p000;

import android.accounts.Account;
import com.android.volley.Response;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.List;

/* renamed from: afyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyv extends enx implements NetworkCallbacks {
    private afyv(String str, Account account, Response.Listener listener, Response.ErrorListener errorListener, bxxk bxxk, bxxc bxxc) {
        super(rpr.m34216b(), str, listener, errorListener, bxxk, bxxc, "https://www.googleapis.com/auth/android_device_manager", account);
    }

    /* renamed from: a */
    public static afyv m53688a(String str, boolean z, Response.Listener listener, Response.ErrorListener errorListener, bxxk bxxk, bxxc bxxc) {
        Account account;
        Account account2 = null;
        if (z) {
            rpr b = rpr.m34216b();
            List d = soz.m35801d(b, b.getPackageName());
            if (d.isEmpty()) {
                agac.m53790a("want to send authenticated request, but no Google account on device", new Object[0]);
                account = null;
                return new afyv(str, account, listener, errorListener, bxxk, bxxc);
            }
            account2 = (Account) d.get(0);
        }
        account = account2;
        return new afyv(str, account, listener, errorListener, bxxk, bxxc);
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(6150);
    }
}
