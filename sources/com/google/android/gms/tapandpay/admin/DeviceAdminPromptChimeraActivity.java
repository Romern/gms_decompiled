package com.google.android.gms.tapandpay.admin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceAdminPromptChimeraActivity extends atex {

    /* renamed from: b */
    public atam f108316b;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        atam atam = this.f108316b;
        if (!asjk.m74232f(this)) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        atam.mo49755b(i3);
        setResult(i2);
        finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void
     arg types: [android.widget.TextView, java.lang.String, int, android.view.View$OnClickListener[]]
     candidates:
      atyg.a(android.content.Context, android.widget.TextView, java.lang.String, android.content.Intent[]):void
      atyg.a(java.lang.String, java.lang.String, android.widget.TextView, android.content.Intent):void
      atyg.a(android.widget.TextView, java.lang.String, boolean, android.view.View$OnClickListener[]):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTheme(2132018962);
        setContentView((int) C0126R.C0128layout.tp_device_admin_prompt_activity);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (this.f108316b == null) {
            this.f108316b = new atam(this, accountInfo);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/androidpay/?p=lock_required"));
        findViewById(C0126R.C0129id.Button).setOnClickListener(new asjh(this));
        TextView textView = (TextView) findViewById(C0126R.C0129id.Title);
        String string = getString(C0126R.string.tp_google_pay);
        if (getIntent().getStringExtra("extra_alt_brand_name") != null) {
            string = getIntent().getStringExtra("extra_alt_brand_name");
        }
        textView.setText(getString(C0126R.string.tp_screen_lock_prompt_title, new Object[]{string}));
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.Body);
        if (!getIntent().getBooleanExtra("extra_us_mode", false)) {
            i = C0126R.string.tp_screen_lock_body_text_nonus;
        } else {
            i = C0126R.string.tp_screen_lock_body_text_us;
        }
        atyg.m76551a(textView2, getString(i), false, new atxj(this, intent), new asji(this));
        ((TextView) findViewById(C0126R.C0129id.Button)).setText(getString(C0126R.string.tp_button_setup));
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Setup Device Admin");
        atam atam = this.f108316b;
        atam.mo49741a(atam.mo49734a(39));
    }
}
