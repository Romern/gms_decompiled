package p000;

import android.accounts.Account;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqx */
public final /* synthetic */ class ajqx implements aubw {

    /* renamed from: a */
    private final SetupChimeraActivity f71168a;

    public ajqx(SetupChimeraActivity setupChimeraActivity) {
        this.f71168a = setupChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.f71168a;
        Account account = (Account) obj;
        if (account == null) {
            setupChimeraActivity.f80983n.mo60577a((Object) null);
            setupChimeraActivity.f80983n.setOnClickListener(new ajqn(setupChimeraActivity));
        } else if (!account.equals(setupChimeraActivity.f80983n.getTag(C0126R.C0129id.change_account))) {
            setupChimeraActivity.f80983n.setTag(C0126R.C0129id.change_account, account);
            setupChimeraActivity.f80983n.setOnClickListener(new ajqo(setupChimeraActivity, account));
            setupChimeraActivity.f80983n.mo60577a((Object) null);
            aucb b = akhu.m59733b(setupChimeraActivity, account);
            b.mo50373a(new ajqp(setupChimeraActivity, account));
            b.mo50372a(ajqq.f71161a);
        }
    }
}
