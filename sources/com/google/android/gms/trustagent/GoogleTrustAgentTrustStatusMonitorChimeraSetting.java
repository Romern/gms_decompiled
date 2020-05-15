package com.google.android.gms.trustagent;

import android.os.Bundle;
import android.view.MenuItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentTrustStatusMonitorChimeraSetting extends deu {

    /* renamed from: b */
    public static final aumh f109123b = new auks();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo8628aW().mo15853b(true);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(16908290, new aulh()).commit();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
