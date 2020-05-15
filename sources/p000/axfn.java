package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axfn */
public final /* synthetic */ class axfn implements axls {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95882a;

    public axfn(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95882a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95882a;
        bzwe bzwe = (bzwe) obj;
        completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
        if (bzwe != null && bzwe.f171610a) {
            axic axic = new axic();
            Bundle bundle = new Bundle();
            bundle.putString("pin_reset_url", bzwe.f171611b);
            axic.setArguments(bundle);
            completeMoneyTransferChimeraActivity.getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.VerifyPinContent, axic, "verify_pin_frag").commit();
            completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_NO_ACCOUNT_INFO);
            completeMoneyTransferChimeraActivity.f110661d.mo60211b(3);
            return;
        }
        completeMoneyTransferChimeraActivity.mo53238P(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA);
        completeMoneyTransferChimeraActivity.mo60171g();
    }
}
