package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.account.p067ui.SelectAccountChimeraActivity;

/* renamed from: asjd */
public final /* synthetic */ class asjd implements rkl {

    /* renamed from: a */
    private final SelectAccountChimeraActivity f89062a;

    public asjd(SelectAccountChimeraActivity selectAccountChimeraActivity) {
        this.f89062a = selectAccountChimeraActivity;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        SelectAccountChimeraActivity selectAccountChimeraActivity = this.f89062a;
        if (!((Status) rkk).mo17710c()) {
            selectAccountChimeraActivity.mo59207e();
            return;
        }
        selectAccountChimeraActivity.f108312d.setText((int) C0126R.string.tp_wear_account_finalize);
        aucb x = selectAccountChimeraActivity.f108314f.mo24770x();
        x.mo50369a(selectAccountChimeraActivity.getContainerActivity(), new asje(selectAccountChimeraActivity));
        x.mo50368a(selectAccountChimeraActivity.getContainerActivity(), new asjf(selectAccountChimeraActivity));
    }
}
