package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: alib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alib implements alhx {

    /* renamed from: a */
    rjx f73528a;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final alhy mo40360a(Context context) {
        if (!cfuf.f185724a.mo6606a().mo82739e()) {
            return new alhy(false, 5);
        }
        try {
            if (this.f73528a == null) {
                this.f73528a = rjx.m33696b(context);
            }
            AccountInfo accountInfo = (AccountInfo) aucu.m76783a(this.f73528a.mo24770x(), 10, TimeUnit.SECONDS);
            if (accountInfo == null) {
                return new alhy(false, 5);
            }
            return new alhy(((GetAllCardsResponse) aucu.m76783a(this.f73528a.mo24742e(new Account(accountInfo.f108326b, "com.google")), 10, TimeUnit.SECONDS)).f108369a.length > 0, 5);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return new alhy(false, 5);
        }
    }
}
