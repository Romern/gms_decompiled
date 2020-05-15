package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgo */
public final /* synthetic */ class axgo implements Runnable {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95915a;

    /* renamed from: b */
    private final String f95916b;

    public axgo(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, String str) {
        this.f95915a = completeMoneyTransferChimeraActivity;
        this.f95916b = str;
    }

    public final void run() {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95915a;
        String str = this.f95916b;
        if (!completeMoneyTransferChimeraActivity.isDestroyed() && !completeMoneyTransferChimeraActivity.isFinishing()) {
            completeMoneyTransferChimeraActivity.mo60166a(str);
        }
    }
}
