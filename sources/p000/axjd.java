package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjd */
public final /* synthetic */ class axjd implements axls {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96034a;

    public axjd(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96034a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96034a;
        axlt axlt = (axlt) obj;
        if (!transferMoneyChimeraActivity.isDestroyed()) {
            transferMoneyChimeraActivity.mo53238P(45);
            bzvu bzvu = axlt.f96158b;
            if (bzvu == null) {
                int i = axlt.f96157a;
                if (i == 7) {
                    transferMoneyChimeraActivity.mo60187a(new axkb(transferMoneyChimeraActivity));
                } else if (i == 16501) {
                    transferMoneyChimeraActivity.mo60202q();
                } else {
                    transferMoneyChimeraActivity.mo60199n();
                }
            } else {
                transferMoneyChimeraActivity.mo60185a(axep.m82424a(transferMoneyChimeraActivity, bzvu));
            }
        }
    }
}
