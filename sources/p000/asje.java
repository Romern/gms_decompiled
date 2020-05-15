package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.account.p067ui.SelectAccountChimeraActivity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: asje */
final /* synthetic */ class asje implements aubw {

    /* renamed from: a */
    private final SelectAccountChimeraActivity f89063a;

    public asje(SelectAccountChimeraActivity selectAccountChimeraActivity) {
        this.f89063a = selectAccountChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SelectAccountChimeraActivity selectAccountChimeraActivity = this.f89063a;
        AccountInfo accountInfo = (AccountInfo) obj;
        atam atam = new atam(selectAccountChimeraActivity, accountInfo);
        String str = selectAccountChimeraActivity.f108313e;
        bxvd g = atam.mo49765g(53);
        if (str != null) {
            bxvd da = boxo.f135271c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boxo boxo = (boxo) da.f164949b;
            str.getClass();
            boxo.f135273a |= 1;
            boxo.f135274b = str;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            boxo boxo2 = (boxo) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            boxo2.getClass();
            bpbx.f135676v = boxo2;
            bpbx.f135655a |= 4194304;
        }
        atam.mo49741a((bpbx) g.mo74062i());
        if (selectAccountChimeraActivity.getIntent().hasExtra("extra_next_intent")) {
            Intent intent = (Intent) selectAccountChimeraActivity.getIntent().getParcelableExtra("extra_next_intent");
            intent.putExtra("extra_account_info", accountInfo);
            intent.addFlags(33554432);
            selectAccountChimeraActivity.startActivity(intent);
            selectAccountChimeraActivity.finish();
            return;
        }
        if (rfz.m33557a(selectAccountChimeraActivity).mo24610b(selectAccountChimeraActivity.f108313e)) {
            selectAccountChimeraActivity.setResult(-1, new Intent().putExtra("extra_account_info", accountInfo));
        } else {
            selectAccountChimeraActivity.setResult(-1);
        }
        selectAccountChimeraActivity.finish();
    }
}
