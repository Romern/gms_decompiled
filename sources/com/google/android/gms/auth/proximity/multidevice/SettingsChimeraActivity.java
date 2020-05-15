package com.google.android.gms.auth.proximity.multidevice;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChimeraActivity extends deu {

    /* renamed from: b */
    public static final sek f11252b = jsy.m17256a("BetterTogetherSettings");

    /* renamed from: c */
    public bqgg f11253c;

    /* renamed from: d */
    public bqgg f11254d;

    /* renamed from: e */
    public jlg f11255e;

    /* renamed from: f */
    public suo f11256f;

    /* renamed from: g */
    private FeatureEnabledReceiver f11257g;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FeatureEnabledReceiver extends aacn {
        public FeatureEnabledReceiver() {
            super("auth_proximity");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE".equals(intent.getAction())) {
                SettingsChimeraActivity settingsChimeraActivity = SettingsChimeraActivity.this;
                sek sek = SettingsChimeraActivity.f11252b;
                String a = settingsChimeraActivity.f11256f.mo26114a();
                if (a != null && bsni.BETTER_TOGETHER_HOST.name().equals(intent.getStringExtra("EXTRA_FEATURE_NAME")) && a.equals(intent.getStringExtra("EXTRA_ACCOUNT_NAME"))) {
                    SettingsChimeraActivity.this.mo7850a(new Account(a, "com.google"));
                }
            }
        }
    }

    /* renamed from: e */
    public static String m6881e() {
        return "com.google.android.gms.auth.proximity.multidevice.SettingsActivity";
    }

    /* renamed from: a */
    public final void mo7850a(Account account) {
        bqgg a = bqga.m112779a(bqgs.m112811a(jtl.m17300a()).mo25819b(new jte(this, account)), bqgs.m112811a(jtl.m17300a()).mo25819b(new jtf(this, account)));
        this.f11253c = a;
        bqga.m112781a(a, new jtj(this, account), jtl.m17300a());
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11255e = jlf.m16865a(this);
        FeatureEnabledReceiver featureEnabledReceiver = new FeatureEnabledReceiver();
        this.f11257g = featureEnabledReceiver;
        registerReceiver(featureEnabledReceiver, new IntentFilter("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE"));
        setContentView((int) C0126R.C0128layout.better_together_settings_activity);
        bqgg b = bqgs.m112811a(jtl.m17300a()).mo25819b(new jtg(this));
        this.f11254d = b;
        bqga.m112781a(b, new jtk(this), jtl.m17300a());
        C1341rz aW = mo8628aW();
        aW.mo15853b(true);
        sun sun = new sun(aW);
        sun.f45175a = new jth(this);
        sun.mo26112a(C0126R.string.auth_settings_activity_title);
        this.f11256f = sun.mo26111a();
    }

    public final void onDestroy() {
        bqgg bqgg = this.f11253c;
        if (bqgg != null) {
            bqgg.cancel(true);
            this.f11253c = null;
        }
        FeatureEnabledReceiver featureEnabledReceiver = this.f11257g;
        if (featureEnabledReceiver != null) {
            unregisterReceiver(featureEnabledReceiver);
            this.f11257g = null;
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!ccig.f179039a.mo6606a().mo76021r() || (intent = getIntent()) == null || intent.getBooleanExtra("FROM_BETTER_TOGETHER_NOTIFICATION", false)) {
            Intent intent2 = new Intent();
            int i = Build.VERSION.SDK_INT;
            intent2.setAction("com.android.settings.ADVANCED_CONNECTED_DEVICE_SETTINGS");
            intent2.addFlags(553648128);
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException e) {
                onBackPressed();
            }
            finish();
            return true;
        }
        onBackPressed();
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f11256f.mo26120c(this.f11256f.mo26114a());
        if (this.f11256f.mo26114a() == null) {
            f11252b.mo25416d("The account spinner was not able to select a new account after refresh.", new Object[0]);
            mo7850a((Account) null);
        }
    }
}
