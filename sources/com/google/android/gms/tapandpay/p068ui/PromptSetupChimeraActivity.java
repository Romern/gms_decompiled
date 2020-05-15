package com.google.android.gms.tapandpay.p068ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClient;

/* renamed from: com.google.android.gms.tapandpay.ui.PromptSetupChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PromptSetupChimeraActivity extends atex implements View.OnClickListener, ateu {

    /* renamed from: b */
    private Button f108952b;

    /* renamed from: c */
    private Button f108953c;

    public void onClick(View view) {
        Intent intent;
        if (view == this.f108952b) {
            Intent flags = new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY").setFlags(268435456);
            if (atxn.m76506a(this, flags)) {
                startActivity(flags);
                finish();
                return;
            }
            if (!cgwn.f187872a.mo6606a().mo84619ag()) {
                intent = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity").setFlags(268435456);
            } else {
                atxm atxm = new atxm();
                atxm.mo50305a(MfiClient.ACCOUNT_ISSUER_GOOGLE, "no_app", "prompt_setup_activity");
                intent = atxm.mo50304a();
            }
            startActivity(intent);
            finish();
        } else if (view == this.f108953c) {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132018962);
        setContentView((int) C0126R.C0128layout.tp_activity_prompt_setup);
        int i = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        Button button = (Button) findViewById(C0126R.C0129id.setup_button);
        this.f108952b = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(C0126R.C0129id.no_thanks_button);
        this.f108953c = button2;
        button2.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Prompt Setup");
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        finish();
    }
}
