package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfs */
final /* synthetic */ class axfs implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95887a;

    /* renamed from: b */
    private final btsj f95888b;

    public axfs(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, btsj btsj) {
        this.f95887a = completeMoneyTransferChimeraActivity;
        this.f95888b = btsj;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95887a;
        btsj btsj = this.f95888b;
        completeMoneyTransferChimeraActivity.f110670o.clear();
        completeMoneyTransferChimeraActivity.f110670o.addAll(btsj.f150221b);
        completeMoneyTransferChimeraActivity.mo53238P(177);
        completeMoneyTransferChimeraActivity.f110661d.mo60212c(0);
        completeMoneyTransferChimeraActivity.f110660c.mo70856a(false);
        completeMoneyTransferChimeraActivity.mo60168b(completeMoneyTransferChimeraActivity.f110673r);
    }
}
