package p000;

import android.view.View;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;

/* renamed from: gsi */
public final /* synthetic */ class gsi implements View.OnClickListener {

    /* renamed from: a */
    private final RequestAccountsAccessChimeraActivity f18951a;

    public gsi(RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity) {
        this.f18951a = requestAccountsAccessChimeraActivity;
    }

    public void onClick(View view) {
        RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = this.f18951a;
        requestAccountsAccessChimeraActivity.setResult(0);
        requestAccountsAccessChimeraActivity.finish();
    }
}
