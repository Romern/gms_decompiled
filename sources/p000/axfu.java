package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;

/* renamed from: axfu */
final /* synthetic */ class axfu implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95890a;

    public axfu(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95890a = completeMoneyTransferChimeraActivity;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95890a;
        Instrument instrument = completeMoneyTransferChimeraActivity.f110668m;
        if (instrument == null || instrument.f110826g == null) {
            completeMoneyTransferChimeraActivity.mo53238P(80);
            return;
        }
        completeMoneyTransferChimeraActivity.mo53238P(81);
        completeMoneyTransferChimeraActivity.f110661d.mo60211b(2);
        awlh awlh = new awlh(completeMoneyTransferChimeraActivity);
        awlh.mo52187a(axmb.m82713a(axmb.m82712a()) ? 1 : 0);
        awlh.mo52188a(completeMoneyTransferChimeraActivity.f110671p);
        awlh.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", completeMoneyTransferChimeraActivity.f110668m.f110826g);
        awlh.mo52191b();
        awlh.mo52190a(axmh.m82720a());
        awlh.mo52192b(3);
        completeMoneyTransferChimeraActivity.startActivityForResult(awlh.mo52186a(), 4);
    }
}
