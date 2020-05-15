package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountAddedChimeraActivity extends jxx implements bjbh {
    /* renamed from: a */
    public static Intent m6903a(Context context, boolean z, rrq rrq) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AccountAddedActivity");
        ims ims = new ims();
        ims.mo13148b(jwz.f23429j, Boolean.valueOf(z));
        imr imr = jwz.f23428i;
        if (rrq != null) {
            bundle = rrq.mo25045a();
        } else {
            bundle = null;
        }
        ims.mo13148b(imr, bundle);
        return className.putExtras(ims.f21367a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bizb.a(android.view.Window, boolean):void
     arg types: [android.view.Window, int]
     candidates:
      bizb.a(android.view.Window, int):void
      bizb.a(android.view.Window, biyz):void
      bizb.a(android.view.Window, boolean):void */
    /* renamed from: c */
    private final void m6904c() {
        bizb.m103020a(getWindow(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "AccountAddedActivity";
    }

    /* renamed from: bd */
    public final void mo7769bd() {
    }

    public final void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (!rrp.m34306a(mo14203f().f43552a)) {
            i = C0126R.C0128layout.auth_account_added_activity;
        } else {
            i = C0126R.C0128layout.auth_account_added_glif_activity;
        }
        rrr a = rrr.m34310a(this, i);
        setContentView(a.mo25046a());
        a.mo25047a(getTitle());
        if (a.mo25046a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) a.mo25046a();
            setupWizardLayout.mo71377c().mo71422a((bjbh) this);
            setupWizardLayout.mo71377c().f151534b.setVisibility(4);
            m6904c();
        } else {
            biyo biyo = new biyo(this);
            biyo.mo64883a(C0126R.string.sud_next_button_label);
            biyo.f122327b = new jux(this);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            ((biyn) ((GlifLayout) a.mo25046a().findViewById(C0126R.C0129id.setup_wizard_layout)).mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
        }
        rrp.m34302a(a.mo25046a());
    }

    public final void onResume() {
        super.onResume();
        m6904c();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m6904c();
    }

    /* renamed from: a */
    public final void mo7768a() {
        mo7874a(-1, null);
    }
}
