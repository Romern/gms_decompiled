package p000;

import android.view.View;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axfw */
final /* synthetic */ class axfw implements View.OnClickListener {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95892a;

    /* renamed from: b */
    private final byte[] f95893b;

    public axfw(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, byte[] bArr) {
        this.f95892a = completeMoneyTransferChimeraActivity;
        this.f95893b = bArr;
    }

    public void onClick(View view) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95892a;
        byte[] bArr = this.f95893b;
        completeMoneyTransferChimeraActivity.mo53238P(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        completeMoneyTransferChimeraActivity.f110661d.mo60211b(2);
        awlh awlh = new awlh(completeMoneyTransferChimeraActivity);
        awlh.mo52187a(axmb.m82713a(axmb.m82712a()) ? 1 : 0);
        awlh.mo52188a(completeMoneyTransferChimeraActivity.f110671p);
        awlh.mo52235a(new SecurePaymentsPayload(bArr, new SecurePaymentsData[0]));
        awlh.mo52191b();
        awlh.mo52190a(axmh.m82720a());
        awlh.mo52192b(3);
        completeMoneyTransferChimeraActivity.startActivityForResult(awlh.mo52186a(), 5);
    }
}
