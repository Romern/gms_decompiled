package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axgr */
public final /* synthetic */ class axgr implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95919a;

    public axgr(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95919a = completeMoneyTransferChimeraActivity;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95919a;
        completeMoneyTransferChimeraActivity.mo53238P(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
        completeMoneyTransferChimeraActivity.finish();
    }
}
