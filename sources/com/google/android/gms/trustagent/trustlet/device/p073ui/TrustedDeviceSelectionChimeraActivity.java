package com.google.android.gms.trustagent.trustlet.device.p073ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.ui.TrustedDeviceSelectionChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustedDeviceSelectionChimeraActivity extends aupe {

    /* renamed from: b */
    private dns f109208b;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo8628aW().mo15853b(true);
        this.f109208b = new auuh();
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f109208b).commit();
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = 10;
        bohi.f133071a |= 4096;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!getIntent().getExtras().getBoolean("bluetooth_is_enabled_for_security", true)) {
            getMenuInflater().inflate(C0126R.C0130menu.trusted_devices_actions, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            setResult(0);
            onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.trusted_devices_actions_help) {
            return false;
        } else {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(C0126R.string.auth_trust_agent_bluetooth_disabled_help_link))));
            return true;
        }
    }
}
