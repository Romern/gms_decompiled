package com.google.android.gms.auth.api.credentials.assistedsignin.p017ui;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: com.google.android.gms.auth.api.credentials.assistedsignin.ui.AssistedSignInChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AssistedSignInChimeraActivity extends adcc {

    /* renamed from: b */
    public qws f10123b;

    /* renamed from: c */
    public String f10124c;

    /* renamed from: d */
    private gzz f10125d;

    /* renamed from: a */
    public final void mo7414a(haz haz) {
        setResult(haz.mo12370b(), haz.mo12371c());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(C0126R.style.ThemeTranslucent);
        super.onCreate(bundle);
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) sef.m35067a(getIntent(), "begin_sign_in_request", BeginSignInRequest.CREATOR);
        String stringExtra = getIntent().getStringExtra("session_id");
        bmxy.m108581a(stringExtra);
        this.f10124c = stringExtra;
        this.f10123b = new qws(this, "IDENTITY_GMSCORE", null);
        adbs.m50134a(this, this, new gwz(this));
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            mo7414a(haz.m14157a("Calling package missing."));
            return;
        }
        bmxv a2 = aczr.m50057a(getApplicationContext(), a);
        if (!a2.mo66813a()) {
            mo7414a(haz.m14157a("Calling package not found."));
            return;
        }
        hel hel = (hel) adcj.m50161a(this).mo3444a(hel.class);
        gzz gzz = (gzz) adcj.m50162a(this, new gzv(getApplication(), a, (C1240of) a2.mo66814b(), beginSignInRequest, this.f10124c)).mo3444a(gzz.class);
        this.f10125d = gzz;
        gzz.f19333v.mo2445a(this, new gxa(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("AssistedSignInDialogFragment") == null) {
            new gxi().show(supportFragmentManager, "AssistedSignInDialogFragment");
        }
    }
}
