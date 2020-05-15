package com.google.android.location.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.setupwizardlib.GlifLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityRecognitionPermissionChimeraActivity extends deu {
    /* renamed from: e */
    public static final void m117337e() {
        if (ceyj.f183510a.mo6606a().bypassDndNotificationPermissionPreOmr1()) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (ceyj.f183510a.mo6606a().dndNotificationSwitchTheme()) {
            setTheme(bnc.m3376a(stn.m36304a("setupwizard.theme", "")));
        }
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.dnd_notification_information);
        getApplicationContext().getContentResolver();
        GlifLayout glifLayout = (GlifLayout) findViewById(C0126R.C0129id.setup_wizard_layout);
        Button button = (Button) findViewById(C0126R.C0129id.next_button);
        Button button2 = (Button) findViewById(C0126R.C0129id.back_button);
        TextView textView = (TextView) findViewById(C0126R.C0129id.body);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.illustration);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.footer_text);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        }
        Bundle extras = intent.getExtras();
        boolean z2 = true;
        if (extras == null || !extras.getBoolean("ruleAdded")) {
            z = false;
        } else {
            z = true;
        }
        if (extras == null || !extras.getBoolean("secondIntroPage")) {
            z2 = false;
        }
        Context applicationContext = getApplicationContext();
        if (z) {
            glifLayout.mo4079b(C0126R.string.dnd_title_rule_added);
            textView.setText((int) C0126R.string.dnd_text_rule_added);
            imageView.setImageResource(C0126R.C0127drawable.dnd_driving_done);
            button2.setVisibility(8);
            i = C0126R.string.common_done;
        } else {
            if (ceyj.m138428b()) {
                bewq.m95998a(applicationContext).mo61203a(2);
            }
            if (!z2) {
                m117337e();
                glifLayout.mo4079b(C0126R.string.dnd_title_intro);
                textView.setText((int) C0126R.string.dnd_text_intro);
                imageView.setImageResource(C0126R.C0127drawable.dnd_driving_intro);
                ((RelativeLayout) findViewById(C0126R.C0129id.footerLayout)).setVisibility(8);
                i = C0126R.string.dnd_button_setup;
            } else {
                glifLayout.mo4079b(C0126R.string.dnd_title_continue);
                textView.setText((int) C0126R.string.dnd_text_continue);
                imageView.setImageResource(C0126R.C0127drawable.dnd_driving_grant_permission);
                i = C0126R.string.common_continue;
            }
        }
        button.setText(i);
        button.setOnClickListener(new bgzu(this, z, z2, applicationContext));
        button2.setText((int) C0126R.string.common_cancel);
        button2.setOnClickListener(new bgzv(this, applicationContext));
    }
}
