package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* renamed from: adej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adej {

    /* renamed from: a */
    public final adkn f61489a;

    /* renamed from: b */
    private final adei f61490b;

    public adej(adei adei, adkn adkn) {
        this.f61490b = adei;
        this.f61489a = adkn;
    }

    /* renamed from: a */
    public final String mo33389a(Account account) {
        try {
            adei adei = this.f61490b;
            String valueOf = String.valueOf(cepl.f183185a.mo6606a().mo79519C());
            String str = valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
            adfb a = adei.f61488b.mo33411a();
            String c = adei.f61487a.mo33924c(account, str);
            a.mo33409a("GmsAccountManager.blockingGetAuthToken");
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
            throw new AuthenticatorException("Null/empty token");
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("InstantApps", "getTokenWithNotification failed", e);
            throw new adev("getTokenWithNotification failed", e);
        }
    }
}
