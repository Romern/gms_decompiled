package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TokenChimeraActivity extends Activity {

    /* renamed from: a */
    private boolean f9936a = false;

    /* renamed from: b */
    private String f9937b;

    /* renamed from: c */
    private String f9938c;

    /* renamed from: d */
    private Bundle f9939d = new Bundle();

    /* renamed from: e */
    private AppDescription f9940e;

    /* renamed from: f */
    private String f9941f = null;

    /* renamed from: g */
    private ilq f9942g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7361a(Intent intent, boolean z) {
        String stringExtra;
        Intent intent2 = new Intent();
        Intent intent3 = getIntent();
        intent2.putExtra("authAccount", this.f9937b);
        intent2.putExtra("service", this.f9938c);
        intent2.putExtra("callerExtras", this.f9939d);
        if (z) {
            ilu.f21315b.mo13126b(intent2);
            setResult(0, intent2);
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            finish();
            return;
        }
        izj a = ilu.m15676a(intent);
        if (a != null) {
            ilu.m15675a(a).mo13126b(intent2);
        }
        if (!(intent == null || (stringExtra = intent.getStringExtra("authtoken")) == null || !this.f9936a)) {
            intent2.putExtra("authtoken", stringExtra);
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
        if (accountAuthenticatorResponse2 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("retry", true);
            accountAuthenticatorResponse2.onResult(bundle);
        }
        setResult(-1, intent2);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            mo7361a(intent, true);
        } else if (i == 1001) {
            mo7361a(intent, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        this.f9942g = new ilq(this);
        if (bundle != null) {
            mo7362a(bundle);
            return;
        }
        mo7362a(getIntent().getExtras());
        String string = this.f9939d.getString(gie.f18286b);
        if (string != null) {
            int a = this.f9942g.mo13122a(string);
            String a2 = spn.m35852a((Activity) this);
            this.f9936a = true;
            if (a2 == null) {
                if (this.f9939d.containsKey("clientPackageName")) {
                    a2 = this.f9939d.getString("clientPackageName");
                } else {
                    a2 = this.f9942g.f21309d;
                }
                this.f9936a = false;
            }
            this.f9939d.putString("clientPackageName", a2);
            this.f9940e = ((ilo) ilo.f21297a.mo13145b()).mo13121a(getApplicationInfo().uid, this.f9942g.mo13122a(a2), string, a, this.f9942g);
        }
        String str = this.f9937b;
        String str2 = this.f9938c;
        AppDescription appDescription = this.f9940e;
        if (str == null || str2 == null || appDescription == null || appDescription.f10838b == 0 || !soz.m35791a(this, new Account(str, "com.google"))) {
            setResult(0);
            finish();
            return;
        }
        new gip(this, this.f9941f, this.f9937b, this.f9938c, this.f9939d, this.f9940e).execute(new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("authAccount", this.f9937b);
        bundle.putString("service", this.f9938c);
        bundle.putBundle("callerExtras", this.f9939d);
        bundle.putBoolean("is_for_result", this.f9936a);
    }

    /* renamed from: a */
    public final void mo7362a(Bundle bundle) {
        this.f9938c = bundle.getString("service");
        this.f9939d = bundle.getBundle("callerExtras");
        this.f9937b = bundle.getString("authAccount");
        this.f9936a = bundle.getBoolean("is_for_result");
        this.f9941f = this.f9939d.getString("request_visible_actions");
    }
}
