package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;

/* renamed from: axiz */
public final /* synthetic */ class axiz implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96030a;

    public axiz(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96030a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96030a;
        transferMoneyChimeraActivity.mo53238P(28);
        if (!transferMoneyChimeraActivity.f110729q.isEmpty()) {
            transferMoneyChimeraActivity.mo60186a((InstrumentCreationToken) transferMoneyChimeraActivity.f110729q.get(0));
        }
    }
}
