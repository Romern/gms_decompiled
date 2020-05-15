package p000;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqo */
final /* synthetic */ class ajqo implements View.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71157a;

    /* renamed from: b */
    private final Account f71158b;

    public ajqo(SetupChimeraActivity setupChimeraActivity, Account account) {
        this.f71157a = setupChimeraActivity;
        this.f71158b = account;
    }

    public void onClick(View view) {
        akhu.m59730a(this.f71158b, this.f71157a);
    }
}
