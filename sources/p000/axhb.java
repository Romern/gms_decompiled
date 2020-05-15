package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.feature.widgets.alertpage.AlertPage;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axhb */
public final /* synthetic */ class axhb implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95936a;

    public axhb(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95936a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        aux aux;
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95936a;
        btsj btsj = (btsj) obj;
        if (btsj == null || btsj.f150220a == null) {
            completeMoneyTransferChimeraActivity.mo53238P(174);
            completeMoneyTransferChimeraActivity.mo60169c(completeMoneyTransferChimeraActivity.f110673r);
            return;
        }
        completeMoneyTransferChimeraActivity.mo53238P(175);
        btsk btsk = btsj.f150220a;
        if (btsk == null) {
            btsk = btsk.f150222f;
        }
        AlertPage alertPage = completeMoneyTransferChimeraActivity.f110659b;
        int i = btsk.f150228e;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 - 2 != 1) {
            aux = aux.m2149a(completeMoneyTransferChimeraActivity.getResources(), C0126R.C0127drawable.quantum_ic_warning_vd_theme_24, completeMoneyTransferChimeraActivity.getTheme());
        } else {
            aux = aux.m2149a(completeMoneyTransferChimeraActivity.getResources(), C0126R.C0127drawable.quantum_ic_hourglass_empty_vd_theme_24, completeMoneyTransferChimeraActivity.getTheme());
        }
        alertPage.mo60203a(aux, btsk.f150224a, btsk.f150225b, btsk.f150227d, new axfr(completeMoneyTransferChimeraActivity), btsk.f150226c, new axfs(completeMoneyTransferChimeraActivity, btsj));
        completeMoneyTransferChimeraActivity.mo53238P(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
        completeMoneyTransferChimeraActivity.f110661d.mo60211b(1);
    }
}
