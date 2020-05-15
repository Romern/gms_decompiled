package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;

/* renamed from: axge */
public final /* synthetic */ class axge implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95903a;

    /* renamed from: b */
    private final Instrument f95904b;

    public axge(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, Instrument instrument) {
        this.f95903a = completeMoneyTransferChimeraActivity;
        this.f95904b = instrument;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95903a;
        Instrument instrument = this.f95904b;
        completeMoneyTransferChimeraActivity.mo53238P(89);
        awle awle = new awle(completeMoneyTransferChimeraActivity);
        awle.mo52187a(axmb.m82713a(axmb.m82712a()) ? 1 : 0);
        awle.mo52188a(completeMoneyTransferChimeraActivity.f110671p);
        awle.mo52234a(instrument.f110825f);
        awle.mo52191b();
        awle.mo52190a(axmh.m82720a());
        awle.mo52192b(3);
        completeMoneyTransferChimeraActivity.startActivityForResult(awle.mo52186a(), 3);
    }
}
