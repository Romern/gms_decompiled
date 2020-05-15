package com.google.android.location.settings;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingChimeraActivity extends bhay {

    /* renamed from: c */
    private bhav f150919c;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo63506e() {
        return getString(C0126R.string.dnd_desc_driving);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo63507g() {
        return getString(C0126R.string.dnd_driving_activated);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final ComponentName mo63508h() {
        return new ComponentName(getApplicationContext().getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ bhav mo63509i() {
        bhav bhav = this.f150919c;
        if (bhav != null) {
            return bhav;
        }
        throw new IllegalStateException("Must call createRule before getRule");
    }

    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo63505b(String str) {
        sex a = sex.m35104a(this);
        if (str != null) {
            if (str.length() == 0) {
                new String("DNDChimeraActivity: rule id = ");
            } else {
                "DNDChimeraActivity: rule id = ".concat(str);
            }
            int i = Build.VERSION.SDK_INT;
            AutomaticZenRule automaticZenRule = a.f44099a.getAutomaticZenRule(str);
            if (automaticZenRule != null) {
                bhav a2 = bhav.m100529a(automaticZenRule.getConditionId());
                this.f150919c = a2;
                a2.f118214a = str;
                a2.f118215b = automaticZenRule.isEnabled();
                return;
            }
        }
        bhav bhav = new bhav(true, (int) ceyg.m138422c());
        this.f150919c = bhav;
        try {
            bhav.f118214a = a.mo25438a(bhav.mo63496a(this));
        } catch (Exception e) {
            Log.wtf("DrivingChimeraAct", "DNDChimeraActivity: unable to add rule", e);
        }
    }
}
