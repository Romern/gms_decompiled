package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;
import com.google.android.gms.auth.account.visibility.WhitelistApplicationForGoogleAccountsIntentOperation;

/* renamed from: gsj */
public final /* synthetic */ class gsj implements View.OnClickListener {

    /* renamed from: a */
    private final RequestAccountsAccessChimeraActivity f18952a;

    public gsj(RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity) {
        this.f18952a = requestAccountsAccessChimeraActivity;
    }

    public void onClick(View view) {
        RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = this.f18952a;
        requestAccountsAccessChimeraActivity.setResult(-1);
        Intent a = WhitelistApplicationForGoogleAccountsIntentOperation.m6315a(requestAccountsAccessChimeraActivity, requestAccountsAccessChimeraActivity.f10036b);
        if (a != null) {
            requestAccountsAccessChimeraActivity.startService(a);
        } else {
            RequestAccountsAccessChimeraActivity.f10035a.mo25416d("IntentOperation null", new Object[0]);
        }
        requestAccountsAccessChimeraActivity.finish();
    }
}
