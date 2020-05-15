package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FrpInterstitialChimeraActivity extends jem implements blv {

    /* renamed from: a */
    public String f10943a;

    /* renamed from: m */
    private AsyncTask f10944m;

    /* renamed from: n */
    private bjbx f10945n;

    /* renamed from: o */
    private View f10946o;

    /* renamed from: a */
    private final void m6639a(Bundle bundle) {
        this.f10943a = bundle.getString("account_id");
    }

    /* renamed from: i */
    private final void m6640i() {
        this.f10946o = this.f10945n.mo64985a();
    }

    /* renamed from: j */
    private final synchronized void m6641j() {
        AsyncTask asyncTask = this.f10944m;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.f10944m = null;
        }
    }

    /* renamed from: b */
    public final void mo3253b() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bjbx bjbx = this.f10945n;
        if (bjbx != null) {
            bjbx.removeView(this.f10946o);
            m6640i();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            m6639a(getIntent().getExtras());
        } else {
            m6639a(bundle);
        }
        if (mo13658e() == null) {
            bjbx bjbx = new bjbx(this);
            this.f10945n = bjbx;
            setContentView(bjbx);
            this.f10944m = new jdt(this).execute(new Void[0]);
        }
        m6640i();
    }

    public final void onDestroy() {
        m6641j();
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_id", this.f10943a);
    }

    /* renamed from: a */
    public final void mo3251a() {
        m6641j();
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo3252a(SetupWizardNavBar setupWizardNavBar) {
        boolean z = this.f22282e;
        setupWizardNavBar.mo4069a(z, z);
        setupWizardNavBar.f7192a.setVisibility(4);
    }
}
