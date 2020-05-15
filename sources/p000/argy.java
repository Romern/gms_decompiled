package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.concurrent.CountDownLatch;

/* renamed from: argy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argy implements aubq {

    /* renamed from: a */
    final /* synthetic */ Account f87709a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f87710b;

    public argy(Account account, CountDownLatch countDownLatch) {
        this.f87709a = account;
        this.f87710b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            argz.f87712b.mo25409a("Registration for %s complete %s", this.f87709a, ((KeyRegistrationResult) aucb.mo50386d()).f10542b);
        } else {
            argz.f87712b.mo25409a("Registration for %s failed %s", this.f87709a, aucb.mo50387e());
        }
        this.f87710b.countDown();
    }
}
