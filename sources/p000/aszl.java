package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: aszl */
public final /* synthetic */ class aszl implements aubw {

    /* renamed from: a */
    private final RequestTokenizeChimeraActivity f89919a;

    public aszl(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity) {
        this.f89919a = requestTokenizeChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity = this.f89919a;
        AccountInfo accountInfo = (AccountInfo) obj;
        if (accountInfo != null && accountInfo.f108326b.equals(requestTokenizeChimeraActivity.f108579d.f108326b)) {
            requestTokenizeChimeraActivity.mo59371g();
            return;
        }
        auar auar = new auar();
        auar.f91333a = 1001;
        auar.f91334b = requestTokenizeChimeraActivity.getString(C0126R.string.tp_switch_account_dialog_title);
        auar.f91335c = requestTokenizeChimeraActivity.getString(C0126R.string.tp_switch_account_dialog_message, new Object[]{requestTokenizeChimeraActivity.f108579d.f108326b});
        auar.f91336d = requestTokenizeChimeraActivity.getString(C0126R.string.tp_switch_account_button_label);
        auar.f91337e = requestTokenizeChimeraActivity.getString(C0126R.string.common_cancel);
        auar.mo50344a().show(requestTokenizeChimeraActivity.getSupportFragmentManager(), "RequestTokenizeAct");
    }
}
