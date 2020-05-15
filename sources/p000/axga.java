package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;

/* renamed from: axga */
public final /* synthetic */ class axga implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95897a;

    /* renamed from: b */
    private final ErrorDetails f95898b;

    public axga(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, ErrorDetails errorDetails) {
        this.f95897a = completeMoneyTransferChimeraActivity;
        this.f95898b = errorDetails;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95897a;
        ErrorDetails errorDetails = this.f95898b;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(errorDetails.f110807d);
        completeMoneyTransferChimeraActivity.startActivity(intent);
    }
}
