package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.ListPreference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ConditionProviderService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.widget.phone.SwitchBar;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bhay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhay extends deu implements sux, bevy {

    /* renamed from: b */
    static final String f118220b;

    /* renamed from: c */
    private SwitchBar f118221c;

    /* renamed from: d */
    private bevz f118222d;

    static {
        String valueOf = String.valueOf(bevz.class.getSimpleName());
        f118220b = valueOf.length() == 0 ? new String("ZenRuleConAct-") : "ZenRuleConAct-".concat(valueOf);
    }

    /* renamed from: a */
    public final void mo61186a(String str) {
        int i;
        bhav i2 = mo63509i();
        if (!getResources().getString(C0126R.string.interruption_option_no_interruptions).equals(str)) {
            i = getResources().getString(C0126R.string.interruption_option_alarms).equals(str) ? 4 : 2;
        } else {
            i = 3;
        }
        i2.f118216c = i;
        mo63510j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo63505b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo63506e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo63507g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract ComponentName mo63508h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract bhav mo63509i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo63510j() {
        sex a = sex.m35104a(this);
        if (a != null) {
            bhav i = mo63509i();
            String str = i.f118214a;
            if (str != null) {
                a.mo25446a(str, i.mo63496a(this));
            }
            if (i.f118215b) {
                int i2 = Build.VERSION.SDK_INT;
                ConditionProviderService.requestRebind(mo63508h());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.activity_zen_mode_rule_config);
        if (!ccra.m131312d() || (!ccra.f179780a.mo6606a().mo76665a() && (!ceyg.f183508a.mo6606a().routeDndRuleToDrivingModeForAuto() || !bhaw.m100532a(this)))) {
            mo8628aW().mo15853b(true);
            this.f118221c = (SwitchBar) findViewById(C0126R.C0129id.switch_bar);
            TextView textView = (TextView) findViewById(C0126R.C0129id.rule_description);
            if (textView != null) {
                textView.setText(mo63506e());
            }
            findViewById(C0126R.C0129id.btn_delete).setOnClickListener(new bhax(this));
            mo63505b(getIntent().getStringExtra("android.service.notification.extra.RULE_ID"));
            mo63510j();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            bevz bevz = new bevz();
            this.f118222d = bevz;
            beginTransaction.add(C0126R.C0129id.fragment_interruption_preference, bevz, f118220b);
            beginTransaction.commitAllowingStateLoss();
            bevz bevz2 = this.f118222d;
            if (bevz2 != null) {
                bevz2.f112774d = this;
            }
            bhav i = mo63509i();
            bevz bevz3 = this.f118222d;
            if (bevz3 != null) {
                int i2 = i.f118216c;
                if (i2 == 2) {
                    str = getResources().getString(C0126R.string.interruption_option_important_interruptions);
                } else if (i2 == 3) {
                    str = getResources().getString(C0126R.string.interruption_option_no_interruptions);
                } else if (i2 == 4) {
                    str = getResources().getString(C0126R.string.interruption_option_alarms);
                } else {
                    throw new IllegalArgumentException("invalid interruption filter");
                }
                ListPreference listPreference = bevz3.f112773c;
                if (listPreference != null) {
                    listPreference.mo1967a(str);
                    listPreference.mo1966a((CharSequence) str);
                }
            }
            SwitchBar switchBar = this.f118221c;
            if (switchBar != null) {
                switchBar.setChecked(mo63509i().f118215b);
            }
            int i3 = Build.VERSION.SDK_INT;
            SwitchBar switchBar2 = this.f118221c;
            if (switchBar2 != null) {
                switchBar2.mo17942a().setTextColor(-16777216);
                return;
            }
            return;
        }
        sex a = sex.m35104a(this);
        ComponentName componentName = new ComponentName(getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        Iterator it = a.mo25454f().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (componentName.equals(((AutomaticZenRule) ((Map.Entry) it.next()).getValue()).getOwner())) {
                    break;
                }
            } else {
                bhae.m100522a(this, a, false);
                break;
            }
        }
        Intent intent = new Intent();
        intent.setComponent(vqx.m41081b());
        intent.addFlags(268468224);
        startActivity(intent);
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        SwitchBar switchBar = this.f118221c;
        if (switchBar != null) {
            switchBar.f30418a = this;
        } else {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo15271a(boolean z) {
        mo63509i().f118215b = z;
        mo63510j();
        if (z) {
            Toast.makeText(this, mo63507g(), 0).show();
        }
    }
}
