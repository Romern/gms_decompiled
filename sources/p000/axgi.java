package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgi */
public final /* synthetic */ class axgi implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95908a;

    /* renamed from: b */
    private final Runnable f95909b;

    public axgi(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, Runnable runnable) {
        this.f95908a = completeMoneyTransferChimeraActivity;
        this.f95909b = runnable;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95908a;
        Runnable runnable = this.f95909b;
        completeMoneyTransferChimeraActivity.mo53238P(95);
        completeMoneyTransferChimeraActivity.f110661d.mo60212c(0);
        completeMoneyTransferChimeraActivity.f110665j.postDelayed(runnable, 500);
    }
}
