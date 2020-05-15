package com.google.android.gms.trustagent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentPersonalUnlockingChimeraSettings extends aupg implements auoi {

    /* renamed from: c */
    private final auol f109122c = auol.m77454a();

    /* renamed from: i */
    private final void m93397i() {
        TrustAgentOnboardingChimeraActivity.m93404a(this, this.f109122c);
    }

    /* renamed from: a */
    public final void mo59548a(int i) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        String stringExtra = getIntent().getStringExtra("extra_intent_from");
        if (stringExtra != null) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            stringExtra.getClass();
            bohi2.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bohi2.f133093w = stringExtra;
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final dns mo50789e() {
        if (!getIntent().getBooleanExtra("extra_check_started", false)) {
            return new aukv();
        }
        return new aukk(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50790g() {
        return "PersonalUnlockingSettingsFragment";
    }

    /* renamed from: h */
    public final void mo50722h() {
        m93397i();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109122c.mo50726a(this);
        if (!aurh.f92310c.equals(getIntent().getAction()) && this.f109122c.mo50734b()) {
            m93397i();
        }
        mo59548a(4);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(C0126R.C0130menu.personal_unlocking_actions, menu);
        if (cgzt.m147783h()) {
            menuInflater.inflate(C0126R.C0130menu.smart_lock_status_monitor_actions, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f109122c.mo50730b(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.action_personal_unlocking_how_it_works) {
            TrustAgentOnboardingChimeraActivity.m93403a(this);
            return true;
        } else if (menuItem.getItemId() == C0126R.C0129id.action_personal_unlocking_help) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=personal_unlocking")));
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_smart_lock_status_monitor) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Intent intent = new Intent();
            intent.setClassName(getApplicationContext(), "com.google.android.gms.trustagent.GoogleTrustAgentTrustStatusMonitorSetting");
            startActivity(intent);
            return true;
        }
    }
}
