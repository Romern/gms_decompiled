package p000;

import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjo */
public final /* synthetic */ class axjo implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96050a;

    public axjo(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96050a = transferMoneyChimeraActivity;
    }

    public void onClick(View view) {
        this.f96050a.onBackPressed();
    }
}
