package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;

/* renamed from: axkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkk extends axle {

    /* renamed from: a */
    final /* synthetic */ TransferMoneyChimeraActivity f96078a;

    public axkk(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96078a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53197a(Instrument instrument) {
        this.f96078a.mo53238P(25);
        this.f96136d = instrument;
        mo171aJ();
        if (!chlq.m148935b()) {
            TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96078a;
            transferMoneyChimeraActivity.f110735w = instrument;
            transferMoneyChimeraActivity.f110717e.setText(transferMoneyChimeraActivity.f110736x.mo53074a(transferMoneyChimeraActivity, transferMoneyChimeraActivity.f110735w.f110821b));
            TransferMoneyChimeraActivity transferMoneyChimeraActivity2 = this.f96078a;
            transferMoneyChimeraActivity2.f110717e.setContentDescription(transferMoneyChimeraActivity2.getString(C0126R.string.walletp2p_selected_payment_method_cd, new Object[]{transferMoneyChimeraActivity2.f110735w.f110821b}));
            if (!stm.m36302d(this.f96136d.f110824e)) {
                this.f96078a.f110716d.mo60205a(this.f96136d.f110824e, axkz.m82688a(), false, false);
            }
            this.f96078a.f110720h.mo60212c(1);
        }
    }

    /* renamed from: a */
    public final void mo53198a(InstrumentCreationToken instrumentCreationToken) {
        this.f96078a.mo53238P(26);
        this.f96078a.mo60186a(instrumentCreationToken);
    }
}
