package com.google.android.gms.auth.api.phone.p024ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.auth.api.phone.ui.AutofillSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillSettingsChimeraActivity extends deu {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.sms_code_autofill_settings_activity);
        if (cceb.m129363g()) {
            str = getString(C0126R.string.f7406x9d36d85c);
        } else {
            str = getString(C0126R.string.sms_code_autofill_settings_title_v2);
        }
        setTitle(str);
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15845a(str);
            aW.mo15853b(true);
        }
        iaq iaq = new iaq();
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.main_content, iaq, iaq.getClass().getName()).commit();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
