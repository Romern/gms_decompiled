package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserSignInChimeraActivity extends jwz implements jxc, jvd {

    /* renamed from: a */
    private static final imr f11356a = imr.m15727a("am_response");

    /* renamed from: b */
    private static final imr f11357b = imr.m15727a("url");

    /* renamed from: c */
    private static final imr f11358c = imr.m15727a("account_type");

    /* renamed from: d */
    private static final imr f11359d = imr.m15727a("account_name");

    /* renamed from: e */
    private AccountAuthenticatorResponse f11360e;

    /* renamed from: a */
    public static Intent m6949a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String str3, rrq rrq) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.BrowserSignInActivity");
        ims ims = new ims();
        ims.mo13148b(f11356a, accountAuthenticatorResponse);
        imr imr = f11357b;
        sdo.m34977c(str);
        ims.mo13148b(imr, str);
        imr imr2 = f11358c;
        sdo.m34977c(str2);
        ims.mo13148b(imr2, str2);
        ims.mo13148b(f11359d, str3);
        ims.mo13148b(jwz.f23429j, false);
        ims.mo13148b(jwz.f23428i, rrq.mo25045a());
        return className.putExtras(ims.f21367a);
    }

    /* renamed from: k */
    private final void m6950k() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11360e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(5, "add account failed");
        }
        setResult(0, new Intent().putExtra("errorCode", 5).putExtra("errorMessage", "add account failed"));
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "BrowserSignInActivity";
    }

    /* renamed from: c */
    public final void mo7860c() {
        m6950k();
    }

    /* renamed from: e */
    public final void mo7861e() {
        m6950k();
    }

    public final void onBackPressed() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11360e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "user canceled");
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11360e = (AccountAuthenticatorResponse) mo14202g().mo13146a(f11356a);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(16908290, jxd.m17456a()).commit();
        }
    }

    /* renamed from: a */
    public final void mo7858a(int i) {
        m6950k();
    }

    /* renamed from: a */
    public final void mo7859a(Account account, String str, boolean z, Intent intent, boolean z2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11360e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    /* renamed from: a */
    public final void mo7866a(jxd jxd) {
        Uri.Builder buildUpon = Uri.parse((String) mo14202g().mo13146a(f11357b)).buildUpon();
        String str = (String) mo14202g().mo13146a(f11359d);
        if (str != null) {
            buildUpon.appendQueryParameter("Email", str);
            buildUpon.appendQueryParameter("tmpl", "reauth");
        } else {
            buildUpon.appendQueryParameter("tmpl", "new_account");
        }
        String uri = buildUpon.build().toString();
        jym.m17513a().mo14229b();
        jxd.mo14197a(uri);
    }

    /* renamed from: a */
    public final void mo7867a(jyl jyl) {
        if (jyl.f23530a != null) {
            jve.m17392a(this, false, false, (String) mo14202g().mo13146a(f11358c), jyl.f23530a, jyl.f23531b, null, false, false, false);
        }
    }
}
