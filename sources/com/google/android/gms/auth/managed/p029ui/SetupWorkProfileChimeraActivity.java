package com.google.android.gms.auth.managed.p029ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* renamed from: com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWorkProfileChimeraActivity extends rrd implements bjbh {

    /* renamed from: b */
    private Uri f11090b;

    /* renamed from: c */
    private rrr f11091c;

    /* renamed from: a */
    private final void m6734a(int i) {
        String string = getString(i);
        if (this.f11091c.mo25046a() instanceof SetupWizardLayout) {
            ((SetupWizardLayout) this.f11091c.mo25046a()).mo71377c().f151533a.setText(string);
        } else {
            ((biyn) ((GlifLayout) this.f11091c.mo25046a()).mo71342a(biyn.class)).f122314f.mo64887a((CharSequence) string);
        }
    }

    /* renamed from: c */
    private final void m6736c() {
        ((TextView) findViewById(C0126R.C0129id.auth_managed_setup_work_profile_description)).setText((int) C0126R.string.common_something_went_wrong);
        m6734a(C0126R.string.common_retry);
    }

    /* renamed from: bd */
    public final void mo7769bd() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        Intent intent2;
        if (i == 0) {
            if (i2 == -1) {
                jhl.m16704a();
                Uri uri = this.f11090b;
                if (uri == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (uri != null) {
                    str = uri.toString();
                } else {
                    str = null;
                }
                jhi a = jhl.m16703a(this, "com.google.android.apps.work.clouddpc", null, null, null, null, z, str);
                if (a.f22488a.f30115i != Status.f30107a.f30115i || (intent2 = a.f22489b) == null) {
                    m6736c();
                } else {
                    startActivityForResult(intent2, 1);
                }
            } else {
                m6736c();
            }
        } else if (i == 1 && i2 == -1) {
            finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity.a(android.content.Context, boolean):void
     arg types: [com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity, int]
     candidates:
      rrd.a(java.lang.String, boolean):void
      com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity.a(android.content.Context, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        if (!SetupWorkProfileSettingsIntentOperation.m6703a(this)) {
            m6735a((Context) this, false);
            finish();
            return;
        }
        this.f11090b = getIntent().getData();
        if (!rrp.m34306a(mo25039j())) {
            i = C0126R.C0128layout.setup_work_profile_activity;
        } else {
            i = C0126R.C0128layout.setup_work_profile_activity_glif;
        }
        rrr a = rrr.m34310a(this, i);
        this.f11091c = a;
        rrp.m34302a(a.mo25046a());
        this.f11091c.mo25047a(getString(C0126R.string.auth_device_management_setup_work_profile_settings_entry));
        setContentView(this.f11091c.mo25046a());
        if (this.f11091c.mo25046a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) this.f11091c.mo25046a();
            setupWizardLayout.mo71377c().mo71422a((bjbh) this);
            this.f11091c.mo25051c(false);
            setupWizardLayout.mo71376b(false);
        } else {
            biyo biyo = new biyo(this);
            biyo.f122327b = new jhf(this);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            ((biyn) ((GlifLayout) this.f11091c.mo25046a().findViewById(C0126R.C0129id.setup_wizard_layout)).mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
            this.f11091c.mo25048a(false);
        }
        Uri uri = this.f11090b;
        if (uri != null && uri.getQueryParameterNames().contains("et")) {
            ((TextView) findViewById(C0126R.C0129id.auth_managed_setup_work_profile_description)).setText((int) C0126R.string.f7383x5f67cd5a);
        }
        m6734a(C0126R.string.common_next);
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
    }

    /* renamed from: a */
    public static void m6735a(Context context, boolean z) {
        spn.m35856a(context, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity", z);
    }

    /* renamed from: a */
    public final void mo7768a() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        startActivityForResult(PhoneskyDpcInstallChimeraActivity.m6727a(this, "com.google.android.apps.work.clouddpc", false, extras), 0);
    }
}
