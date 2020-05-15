package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axjl */
public final /* synthetic */ class axjl implements View.OnClickListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96046a;

    /* renamed from: b */
    private final ErrorDetails f96047b;

    public axjl(TransferMoneyChimeraActivity transferMoneyChimeraActivity, ErrorDetails errorDetails) {
        this.f96046a = transferMoneyChimeraActivity;
        this.f96047b = errorDetails;
    }

    public void onClick(View view) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96046a;
        ErrorDetails errorDetails = this.f96047b;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(errorDetails.f110807d);
        transferMoneyChimeraActivity.startActivity(intent);
    }
}
