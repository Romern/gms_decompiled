package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axiv */
public final /* synthetic */ class axiv implements axme {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96025a;

    /* renamed from: b */
    private final axhs f96026b;

    public axiv(TransferMoneyChimeraActivity transferMoneyChimeraActivity, axhs axhs) {
        this.f96025a = transferMoneyChimeraActivity;
        this.f96026b = axhs;
    }

    /* renamed from: a */
    public final void mo53167a() {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96025a;
        transferMoneyChimeraActivity.getSupportFragmentManager().beginTransaction().remove(this.f96026b).commitAllowingStateLoss();
        transferMoneyChimeraActivity.f110720h.mo60211b(0);
        transferMoneyChimeraActivity.mo60193h();
    }
}
