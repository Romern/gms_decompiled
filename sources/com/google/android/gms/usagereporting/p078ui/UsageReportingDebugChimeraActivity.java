package com.google.android.gms.usagereporting.p078ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: com.google.android.gms.usagereporting.ui.UsageReportingDebugChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageReportingDebugChimeraActivity extends Activity {

    /* renamed from: com.google.android.gms.usagereporting.ui.UsageReportingDebugChimeraActivity$UsageReportingDebugOperation */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UsageReportingDebugOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.usagereporting.UR_SETTINGS"), 2, getResources().getString(C0126R.string.usage_reporting_debug_title), 59);
            googleSettingsItem.f29961g = true;
            return googleSettingsItem;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.usage_reporting_debug_settings);
        Button button = (Button) findViewById(C0126R.C0129id.crash_button);
        button.getBackground().setColorFilter(-65536, PorterDuff.Mode.MULTIPLY);
        button.setOnClickListener(new avvr());
        ((Button) findViewById(C0126R.C0129id.reset_button)).setOnClickListener(new avvs());
        setTitle((int) C0126R.string.usage_reporting_debug_title);
    }
}
