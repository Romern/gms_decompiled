package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgg */
final /* synthetic */ class axgg implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95906a;

    public axgg(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95906a = completeMoneyTransferChimeraActivity;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95906a;
        completeMoneyTransferChimeraActivity.mo53238P(92);
        completeMoneyTransferChimeraActivity.f110661d.mo60211b(2);
        completeMoneyTransferChimeraActivity.mo53238P(107);
        rjx rjx = completeMoneyTransferChimeraActivity.f110677v;
        String stringExtra = completeMoneyTransferChimeraActivity.getIntent().getStringExtra("account_name");
        roz b = rpa.m34196b();
        b.f43472a = new axef(stringExtra);
        aucb a = rjx.mo24701a(b.mo24977a());
        a.mo50376a(completeMoneyTransferChimeraActivity, new axgm(completeMoneyTransferChimeraActivity));
        a.mo50375a(completeMoneyTransferChimeraActivity, new axgn(completeMoneyTransferChimeraActivity));
    }
}
