package com.google.android.gms.auth.api.credentials.authorization.p018ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.credentials.authorization.ui.AuthorizationChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthorizationChimeraActivity extends adcc {

    /* renamed from: b */
    public qws f10127b;

    /* renamed from: c */
    public String f10128c;

    /* renamed from: d */
    private String f10129d;

    /* renamed from: a */
    public final void mo7416a(hdh hdh) {
        Intent intent = new Intent();
        sef.m35071a(hdh.f19523b, intent, "status");
        if (hdh.f19522a.mo66813a()) {
            sef.m35071a((AuthorizationResult) hdh.f19522a.mo66814b(), intent, "authorization_result");
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(C0126R.style.ThemeTranslucent);
        super.onCreate(bundle);
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) sef.m35067a(getIntent(), "authorization_request", AuthorizationRequest.CREATOR);
        this.f10128c = getIntent().getStringExtra("session_id");
        this.f10127b = new qws(this, "IDENTITY_GMSCORE", null);
        adbs.m50134a(this, this, new hbk(this));
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            mo7416a(new hdh(new Status(10, "Calling package missing."), bmvz.f131120a));
            return;
        }
        this.f10129d = a;
        ((hdi) adcj.m50162a(this, new hdg(this.f10128c)).mo3444a(hdi.class)).f19525d.mo2445a(this, new hbl(this));
        if (((hdf) getSupportFragmentManager().findFragmentByTag("auth_controller")) == null) {
            getSupportFragmentManager().beginTransaction().add(hdf.m14203a(a, authorizationRequest, this.f10128c), "auth_controller").commitNow();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("dialog") == null) {
            hbp.m14174a(this.f10129d).show(supportFragmentManager, "dialog");
        }
    }
}
