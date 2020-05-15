package com.google.android.gms.tapandpay.p068ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: com.google.android.gms.tapandpay.ui.ShowSecurityPromptChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShowSecurityPromptChimeraActivity extends atex implements auat {

    /* renamed from: b */
    private AccountInfo f108962b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        if (i == -1) {
            Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_ENABLE_SECURE_KEYGUARD");
            intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
            startActivityForResult(intent, 2);
            return;
        }
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        auau auau;
        super.onCreate(bundle);
        this.f108962b = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (getIntent().getBooleanExtra("com.google.android.gms.tapandpay.ui.EXTRA_IS_ADMIN_PROMPT", true)) {
            auar auar = new auar();
            auar.f91333a = 1;
            auar.f91334b = getString(C0126R.string.tp_device_admin_prompt_title);
            auar.f91335c = getString(C0126R.string.tp_device_admin_prompt_body);
            auar.f91336d = getString(C0126R.string.tp_device_admin_prompt_button);
            auar.f91340h = bpan.SHOW_SECURITY_DEVICE_ADMIN;
            auar.f91341i = this.f108962b;
            auau = auar.mo50344a();
        } else {
            sre.m36089i(this);
            String string = getString(C0126R.string.tp_secure_keyguard_prompt_body);
            auar auar2 = new auar();
            auar2.f91333a = 1;
            auar2.f91334b = getString(C0126R.string.tp_secure_keyguard_prompt_title);
            auar2.f91335c = string;
            auar2.f91336d = getString(C0126R.string.tp_secure_keyguard_prompt_button);
            auar2.f91340h = bpan.SHOW_SECURITY_SECURE_KEYGUARD;
            auar2.f91341i = this.f108962b;
            auau = auar2.mo50344a();
        }
        auau.show(getSupportFragmentManager(), "ShowSecurityPrompt.adminPromptDialog");
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (asjk.m74228b(this)) {
            atah.m75278c();
            setResult(-1);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Setup Security");
    }
}
