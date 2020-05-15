package com.google.android.gms.usagereporting.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageReportingChimeraActivity extends deu implements View.OnClickListener, sux {

    /* renamed from: b */
    private SwitchBar f109544b;

    /* renamed from: c */
    private TextView f109545c;

    /* renamed from: d */
    private TextView f109546d;

    /* renamed from: e */
    private boolean f109547e;

    /* renamed from: f */
    private avub f109548f;

    /* renamed from: g */
    private rjx f109549g;

    /* renamed from: a */
    private final View m93767a(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Could not find view: id=");
        sb.append(i);
        Log.e("UsageReportingActivity", sb.toString());
        return null;
    }

    /* renamed from: b */
    public final void mo59692b(boolean z) {
        SwitchBar switchBar = this.f109544b;
        if (switchBar != null) {
            switchBar.setChecked(z);
        }
    }

    /* renamed from: e */
    public final void mo59693e() {
        this.f109549g.mo24673E().mo50371a(new avvp(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo59694g() {
        startActivity(new Intent("android.intent.action.VIEW").setData(aymu.m84284a(this, "usage-reporting")));
    }

    public void onClick(View view) {
        if (view == null) {
            throw null;
        } else if (view == this.f109546d) {
            mo59694g();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (chdn.m148522c()) {
            avvn a = avvn.m79436a();
            if (!avvm.m79434a()) {
                synchronized (a.f93986a) {
                    SharedPreferences b = a.mo51647b();
                    rzz.m34727a(b, "Unexpected null from getPrefs.");
                    z = b.contains("OptInUsageReporting");
                }
            } else {
                z = true;
            }
            this.f109547e = !z;
        }
        setContentView((int) C0126R.C0128layout.usage_reporting);
        C1341rz aW = mo8628aW();
        aW.mo15853b(true);
        if (soz.m35800c(this)) {
            aW.mo15850b((int) C0126R.C0127drawable.common_red_banner_settings_icon);
        }
        this.f109544b = null;
        int i = Build.VERSION.SDK_INT;
        SwitchBar switchBar = (SwitchBar) m93767a((int) C0126R.C0129id.switch_bar);
        this.f109544b = switchBar;
        if (switchBar != null) {
            switchBar.setEnabled(false);
            if (!this.f109547e) {
                this.f109544b.f30418a = this;
            }
        }
        if (chdn.m148522c()) {
            int i2 = Build.VERSION.SDK_INT;
            UserManager userManager = (UserManager) getSystemService("user");
            if (userManager == null || userManager.getUserCount() <= 1) {
                View a2 = m93767a((int) C0126R.C0129id.multi_user_info);
                if (a2 != null) {
                    a2.setVisibility(8);
                }
            } else {
                TextView textView = (TextView) m93767a((int) C0126R.C0129id.multi_user_info);
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText((int) C0126R.string.usage_reporting_dialog_multi_user_message);
                }
            }
        }
        TextView textView2 = (TextView) m93767a(16908304);
        this.f109545c = textView2;
        if (textView2 != null) {
            textView2.setText(getString(C0126R.string.usage_reporting_dialog_message) + "\n\n" + getString(C0126R.string.usage_reporting_dialog_more_message) + "\n\n" + getString(C0126R.string.usage_and_diagnostics_consent_message));
        }
        TextView textView3 = (TextView) m93767a((int) C0126R.C0129id.learn_more_text);
        this.f109546d = textView3;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        this.f109549g = avtz.m79336a(this, new avty());
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.usage_reporting_settings_menu, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.settings_help) {
            mo59694g();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public final void onStart() {
        super.onStart();
        if (this.f109547e) {
            mo59692b(avvm.m79435a(this));
            SwitchBar switchBar = this.f109544b;
            if (switchBar != null) {
                switchBar.setEnabled(false);
                return;
            }
            return;
        }
        SwitchBar switchBar2 = this.f109544b;
        if (switchBar2 != null) {
            switchBar2.setEnabled(true);
        }
        avvq avvq = new avvq(this);
        this.f109548f = avvq;
        this.f109549g.mo24680a((avub) avvq);
        mo59693e();
    }

    public final void onStop() {
        avub avub;
        if (!this.f109547e && (avub = this.f109548f) != null) {
            rjx rjx = this.f109549g;
            rob rob = roe.m34172a(avub, rjx.f43163B, avub.class.getSimpleName()).f43429b;
            sdo.m34966a(rob, "Key must not be null");
            rjx.mo24698a(rob);
        }
        super.onStop();
    }

    /* renamed from: a */
    public final void mo15271a(boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f109549g.mo24690a(new UsageReportingOptInOptions(i));
        if (!z) {
            aoob a = aonx.m66186a(this);
            roz b = rpa.m34196b();
            b.f43472a = new aonz();
            a.mo24732b(b.mo24977a());
        }
    }
}
