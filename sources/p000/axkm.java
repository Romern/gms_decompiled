package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;

/* renamed from: axkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkm extends axle {

    /* renamed from: a */
    final /* synthetic */ TransferMoneyChimeraActivity f96081a;

    public axkm(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96081a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53197a(Instrument instrument) {
        this.f96081a.mo53238P(25);
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96081a;
        transferMoneyChimeraActivity.f110735w = instrument;
        transferMoneyChimeraActivity.f110717e.setText(transferMoneyChimeraActivity.f110736x.mo53074a(transferMoneyChimeraActivity, transferMoneyChimeraActivity.f110735w.f110821b));
        TransferMoneyChimeraActivity transferMoneyChimeraActivity2 = this.f96081a;
        transferMoneyChimeraActivity2.f110717e.setContentDescription(transferMoneyChimeraActivity2.getString(C0126R.string.walletp2p_selected_payment_method_cd, new Object[]{transferMoneyChimeraActivity2.f110735w.f110821b}));
        if (!stm.m36302d(this.f96136d.f110824e)) {
            this.f96081a.f110716d.mo60205a(this.f96136d.f110824e, axkz.m82688a(), false, false);
        }
        this.f96081a.f110720h.mo60212c(1);
    }

    /* renamed from: a */
    public final void mo53198a(InstrumentCreationToken instrumentCreationToken) {
        this.f96081a.mo53238P(26);
        this.f96081a.mo60186a(instrumentCreationToken);
    }
}
