package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfz */
final /* synthetic */ class axfz implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95896a;

    public axfz(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95896a = completeMoneyTransferChimeraActivity;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95896a;
        completeMoneyTransferChimeraActivity.mo53238P(84);
        completeMoneyTransferChimeraActivity.f110661d.mo60211b(2);
        completeMoneyTransferChimeraActivity.startActivityForResult(completeMoneyTransferChimeraActivity.f110666k.createConfirmDeviceCredentialIntent(null, null), 2);
    }
}
