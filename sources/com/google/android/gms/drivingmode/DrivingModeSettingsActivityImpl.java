package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeSettingsActivityImpl extends deu implements vul, vuw {

    /* renamed from: b */
    vum f31230b;

    /* renamed from: c */
    vtz f31231c;

    /* renamed from: a */
    public final vum mo18365a() {
        return this.f31230b;
    }

    /* renamed from: a */
    public final void mo18367a(vtz vtz) {
        this.f31231c = vtz;
    }

    /* renamed from: b */
    public final Bundle mo18366b() {
        return new Bundle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (p000.vuk.m41325d(r3).mo28757b() != false) goto L_0x0078;
     */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getAction() != null && intent.getAction().equals("com.google.android.gms.drivingmode.Invoked_from_search")) {
            vuk.m41322a();
            vuk.m41326e(getApplicationContext()).mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_FROM_SEARCH);
        }
        vuk.m41322a();
        vtm h = vuk.m41329h(this);
        if (h.f49955a.getBoolean("force_frx_rerun_once", false)) {
            h.mo28837a(false);
        } else {
            if (!h.mo28838a() && !h.mo28839b()) {
                vuk.m41322a();
            }
            if (ccra.m131314f()) {
                h.mo28837a(true);
            }
            vum vum = new vum(this, mo8628aW());
            this.f31230b = vum;
            vum.mo28864a(new vuf());
            return;
        }
        vuk.m41322a();
        vuk.m41326e(this).mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS);
        startActivity(Intent.makeMainActivity(vqx.m41082c()));
        finish();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        vtz vtz = this.f31231c;
        if (vtz != null) {
            vuf vuf = vtz.f49976a;
            StringBuilder sb = new StringBuilder(49);
            sb.append("DrivingModeSettingsFragment#onFocusChanged: ");
            sb.append(z);
            sb.toString();
            if (z && vuf.f49985e.mo28794j() == 2) {
                vuf.mo17248d();
            }
        }
    }
}
