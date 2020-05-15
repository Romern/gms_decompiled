package p000;

import com.google.android.gms.smartdevice.setup.p066ui.views.AccountChallengeWebView;
import java.util.concurrent.Semaphore;

/* renamed from: asbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccountChallengeWebView f88645a;

    public asbd(AccountChallengeWebView accountChallengeWebView) {
        this.f88645a = accountChallengeWebView;
    }

    public final void run() {
        AccountChallengeWebView accountChallengeWebView = this.f88645a;
        accountChallengeWebView.f108248h = new Semaphore(accountChallengeWebView.f108247g - accountChallengeWebView.f108249i);
        this.f88645a.mo59181f();
    }
}
