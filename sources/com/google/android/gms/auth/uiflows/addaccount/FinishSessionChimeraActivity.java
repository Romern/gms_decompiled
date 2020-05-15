package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FinishSessionChimeraActivity extends Activity {

    /* renamed from: a */
    static final imr f11405a = imr.m15727a("am_response");

    /* renamed from: b */
    static final imr f11406b = imr.m15727a("session_type");

    /* renamed from: c */
    static final imr f11407c = imr.m15727a("is_setup_wizard");

    /* renamed from: d */
    static final imr f11408d = imr.m15727a("use_immersive_mode");

    /* renamed from: e */
    static final imr f11409e = imr.m15727a("ui_parameters");

    /* renamed from: f */
    static final imr f11410f = imr.m15727a("auth_code");

    /* renamed from: g */
    static final imr f11411g = imr.m15727a("obfuscated_gaia_id");

    /* renamed from: h */
    static final imr f11412h = imr.m15727a("terms_of_service_accepted");

    /* renamed from: i */
    static final imr f11413i = imr.m15727a("is_new_account");

    /* renamed from: j */
    static final imr f11414j = imr.m15727a("account");

    /* renamed from: k */
    static final imr f11415k = imr.m15727a("account_type");

    /* renamed from: l */
    static final imr f11416l = imr.m15727a("account_name");

    /* renamed from: m */
    private static final sek f11417m = ght.m13171a("FinishSessionChimeraActivity");

    /* renamed from: n */
    private static final imr f11418n = imr.m15727a("accountSessionBundle");

    /* renamed from: o */
    private AccountAuthenticatorResponse f11419o;

    /* renamed from: a */
    public static Intent m6983a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity");
        ims ims = new ims();
        ims.mo13148b(f11405a, accountAuthenticatorResponse);
        ims.mo13148b(f11415k, str);
        ims.mo13148b(f11418n, bundle);
        return className.putExtras(ims.f21367a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        jxy jxy;
        super.onCreate(bundle);
        ims ims = new ims(getIntent().getExtras());
        this.f11419o = (AccountAuthenticatorResponse) ims.mo13146a(f11405a);
        Bundle bundle2 = (Bundle) ims.mo13146a(f11418n);
        if (bundle2 == null) {
            f11417m.mo25416d("Session bundle cannot be null!", new Object[0]);
            m6986a("Session bundle cannot be null!");
            return;
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11419o;
        String str = (String) new ims(bundle2).mo13146a(f11406b);
        FinishUpdateCredentialsSessionController finishUpdateCredentialsSessionController = null;
        if (!"finish_add_account_session_type".equals(str)) {
            if ("finish_update_credentials_session_type".equals(str)) {
                ims ims2 = new ims(bundle2);
                if ("finish_update_credentials_session_type".equals((String) ims2.mo13146a(f11406b))) {
                    jxy = null;
                    finishUpdateCredentialsSessionController = new FinishUpdateCredentialsSessionController(accountAuthenticatorResponse, (Account) ims2.mo13146a(f11414j), ((Boolean) ims2.mo13146a(f11408d)).booleanValue(), rrq.m34308a((Bundle) ims2.mo13146a(f11409e)), (String) ims2.mo13146a(f11410f), null);
                }
            }
            jxy = null;
        } else {
            ims ims3 = new ims(bundle2);
            if ("finish_add_account_session_type".equals((String) ims3.mo13146a(f11406b))) {
                String str2 = (String) ims3.mo13146a(f11415k);
                String str3 = (String) ims3.mo13146a(f11416l);
                jxy = null;
                finishUpdateCredentialsSessionController = new FinishAddAccountSessionController(accountAuthenticatorResponse, str2, ((Boolean) ims3.mo13146a(f11407c)).booleanValue(), ((Boolean) ims3.mo13146a(f11408d)).booleanValue(), rrq.m34308a((Bundle) ims3.mo13146a(f11409e)), str3, (String) ims3.mo13146a(f11410f), (String) ims3.mo13146a(f11411g), ((Boolean) ims3.mo13146a(f11412h)).booleanValue(), ((Boolean) ims3.mo13146a(f11413i)).booleanValue(), null, false, false, false, null, null, false, false, false, null);
            } else {
                jxy = null;
            }
        }
        if (finishUpdateCredentialsSessionController != null) {
            jxx.m17490a(this, finishUpdateCredentialsSessionController, finishUpdateCredentialsSessionController.mo7862a(jxy));
            finish();
            return;
        }
        m6986a("Failed to create controller from session bundle!");
    }

    /* renamed from: a */
    public static Bundle m6984a(boolean z, rrq rrq, String str, Account account) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f11408d.f21366a, z);
        bundle.putParcelable(f11409e.f21366a, rrq.mo25045a());
        bundle.putString(f11410f.f21366a, str);
        bundle.putParcelable(f11414j.f21366a, account);
        bundle.putString(f11406b.f21366a, "finish_update_credentials_session_type");
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m6985a(boolean z, boolean z2, rrq rrq, String str, String str2, boolean z3, boolean z4, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f11407c.f21366a, z);
        bundle.putBoolean(f11408d.f21366a, z2);
        bundle.putParcelable(f11409e.f21366a, rrq.mo25045a());
        bundle.putString(f11410f.f21366a, str);
        bundle.putString(f11411g.f21366a, str2);
        bundle.putBoolean(f11412h.f21366a, z3);
        bundle.putBoolean(f11413i.f21366a, z4);
        bundle.putString(f11415k.f21366a, str4);
        bundle.putString(f11416l.f21366a, str3);
        bundle.putString(f11406b.f21366a, "finish_add_account_session_type");
        return bundle;
    }

    /* renamed from: a */
    private final void m6986a(String str) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f11419o;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(8, str);
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", 8);
        intent.putExtra("errorMessage", str);
        setResult(0, intent);
        finish();
    }
}
