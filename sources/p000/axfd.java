package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfd */
final /* synthetic */ class axfd implements axls {

    /* renamed from: a */
    private final axhe f95877a;

    public axfd(axhe axhe) {
        this.f95877a = axhe;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        axhe axhe = this.f95877a;
        axio axio = (axio) obj;
        if (axio.f96017a) {
            String str = axio.f96018b;
            String str2 = axio.f96019c;
            if (!axhe.f95941b.isDestroyed()) {
                axhe.f95941b.mo53238P(68);
                CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = axhe.f95941b;
                completeMoneyTransferChimeraActivity.mo53238P(75);
                completeMoneyTransferChimeraActivity.f110659b.mo60203a(aux.m2149a(completeMoneyTransferChimeraActivity.getResources(), C0126R.C0127drawable.quantum_ic_hourglass_empty_vd_theme_24, completeMoneyTransferChimeraActivity.getTheme()), str, str2, completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_go_back), new axfp(completeMoneyTransferChimeraActivity), completeMoneyTransferChimeraActivity.getString(C0126R.string.walletp2p_continue_anyway), new axfq(completeMoneyTransferChimeraActivity));
                completeMoneyTransferChimeraActivity.f110661d.mo60211b(1);
                return;
            }
            return;
        }
        axhe.mo53148a();
    }
}
