package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjq */
public final /* synthetic */ class axjq implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96052a;

    /* renamed from: b */
    private final Runnable f96053b;

    public axjq(TransferMoneyChimeraActivity transferMoneyChimeraActivity, Runnable runnable) {
        this.f96052a = transferMoneyChimeraActivity;
        this.f96053b = runnable;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96052a;
        Runnable runnable = this.f96053b;
        transferMoneyChimeraActivity.f110720h.mo60211b(0);
        transferMoneyChimeraActivity.f110737y.postDelayed(runnable, 300);
    }
}
