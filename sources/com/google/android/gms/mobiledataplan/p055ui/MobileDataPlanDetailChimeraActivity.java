package com.google.android.gms.mobiledataplan.p055ui;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;

/* renamed from: com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataPlanDetailChimeraActivity extends deu {

    /* renamed from: h */
    private static final srn f80322h = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    @Deprecated

    /* renamed from: b */
    public Button f80323b;
    @Deprecated

    /* renamed from: c */
    public Button f80324c;
    @Deprecated

    /* renamed from: d */
    public ConsentWebView f80325d;

    /* renamed from: e */
    public int f80326e = 0;
    @Deprecated

    /* renamed from: f */
    private ConsentAgreementText f80327f;
    @Deprecated

    /* renamed from: g */
    private boolean f80328g = true;

    /* renamed from: a */
    public final void mo44112a(boolean z) {
        int i;
        if (!TextUtils.isEmpty(this.f80327f.f80265d)) {
            this.f80323b.setText(this.f80327f.f80265d);
        } else {
            this.f80323b.setText((int) C0126R.string.consent_agree_button_text);
        }
        this.f80323b.setOnClickListener(new ague(this));
        if (cfmq.m140239j()) {
            boolean z2 = false;
            if (z || (this.f80325d.canScrollVertically(-1) && this.f80328g)) {
                z2 = true;
            }
            if (!z2) {
                i = 48;
            } else {
                i = 49;
            }
            agrl.m54942a().mo35987a(i, this.f80323b.getText().toString(), agvn.m55186b(this.f80325d), z2 ? bygd.CONSENT_BUTTON_CHANGED : bygd.CONSENT_SHOWS_AGREE_ON_LOAD, System.currentTimeMillis(), Integer.valueOf(this.f80326e));
        }
    }

    /* renamed from: b */
    public final void mo44113b(boolean z) {
        setResult(!z ? 0 : -1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        Fragment fragment;
        super.onCreate(bundle);
        if (cfnm.m140634e()) {
            setContentView((int) C0126R.C0128layout.detail_activity);
            if (bundle == null) {
                if ("com.google.android.gms.mobiledataplan.ui.SETTINGS".equals(getIntent().getAction()) || "com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY".equals(getIntent().getAction())) {
                    fragment = new agum(this, getIntent());
                } else {
                    fragment = new agub(this, getIntent());
                }
                getSupportFragmentManager().beginTransaction().add((int) C0126R.C0129id.container, fragment).commit();
                int i = Build.VERSION.SDK_INT;
                new agrq().mo36032c();
                return;
            }
            return;
        }
        if (cfmq.m140234e()) {
            this.f80326e = getIntent().getIntExtra("EventFlowId", agrl.m54949c());
        }
        if (cflx.f184311a.mo6606a().mo81428f()) {
            Intent intent = getIntent();
            String stringExtra = intent != null ? intent.getStringExtra("ComeFrom") : null;
            if (stringExtra == null) {
                ComponentName callingActivity = getCallingActivity();
                if (callingActivity != null) {
                    str = callingActivity.flattenToString();
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    Uri referrer = getReferrer();
                    if (referrer != null) {
                        str = referrer.toString();
                    } else {
                        str = stringExtra;
                    }
                }
                agrl.m54942a().mo35987a(39, str, "R.layout.consent_activity", bygd.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.f80326e));
            } else if (stringExtra.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                agrl.m54942a().mo35987a(38, stringExtra, "R.layout.consent_activity", bygd.ENTER_CONSENT_UI_VIA_MDP, System.currentTimeMillis(), Integer.valueOf(this.f80326e));
            } else {
                agrl.m54942a().mo35987a(39, stringExtra, "R.layout.consent_activity", bygd.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.f80326e));
            }
        }
        setContentView((int) C0126R.C0128layout.consent_fragment);
        mo8628aW().mo15862e();
        this.f80323b = (Button) findViewById(C0126R.C0129id.agree_button);
        this.f80324c = (Button) findViewById(C0126R.C0129id.decline_button);
        this.f80325d = (ConsentWebView) findViewById(C0126R.C0129id.consent_html_view);
        ConsentAgreementText consentAgreementText = (ConsentAgreementText) sef.m35067a(getIntent(), "AgreementText", ConsentAgreementText.CREATOR);
        this.f80327f = consentAgreementText;
        if (consentAgreementText == null) {
            ((bnsl) f80322h.mo68388c()).mo68405a("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
            setResult(0);
            finish();
        }
        this.f80325d.mo44110a(this.f80327f);
        int i3 = Build.VERSION.SDK_INT;
        this.f80325d.f80320a = new aguf(this);
        if (!TextUtils.isEmpty(this.f80327f.f80267f)) {
            this.f80323b.setText(this.f80327f.f80267f);
            this.f80323b.setOnClickListener(new aguc(this));
        } else {
            this.f80328g = false;
            mo44112a(false);
        }
        if (!TextUtils.isEmpty(this.f80327f.f80266e)) {
            this.f80324c.setText(this.f80327f.f80266e);
        }
        this.f80324c.setOnClickListener(new agud(this));
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && cfmq.m140245p()) {
            agrl.m54942a().mo35987a(43, "consentActivity", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), Integer.valueOf(this.f80326e));
        }
    }
}
