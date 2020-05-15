package com.google.android.gms.auth.api.credentials.credentialsaving.p021ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.credentials.credentialsaving.ui.SaveAccountLinkingTokenChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SaveAccountLinkingTokenChimeraActivity extends adcc {

    /* renamed from: b */
    public qws f10131b;

    /* renamed from: c */
    public String f10132c;

    /* renamed from: d */
    private String f10133d;

    /* renamed from: a */
    public final void mo7418a(hgk hgk) {
        Intent intent = new Intent();
        sef.m35071a(hgk.f19718b, intent, "status");
        if (hgk.f19717a.mo66813a()) {
            sef.m35071a((SaveAccountLinkingTokenResult) hgk.f19717a.mo66814b(), intent, "save_account_linking_token_result");
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
        this.f10132c = getIntent().getStringExtra("session_id");
        this.f10131b = new qws(this, "IDENTITY_GMSCORE", null);
        adbs.m50134a(this, this, new hfs(this));
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            mo7418a(new hgk(new Status(10, "Calling package missing."), bmvz.f131120a));
            return;
        }
        this.f10133d = a;
        if (((hgj) getSupportFragmentManager().findFragmentByTag("controller")) == null) {
            getSupportFragmentManager().beginTransaction().add(hgj.m14325a(this.f10133d, this.f10132c), "controller").commitNow();
        }
        ((hgl) adcj.m50161a(this).mo3444a(hgl.class)).f19720d.mo2445a(this, new hft(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("dialog") == null) {
            hfv.m14312a(this.f10133d).show(supportFragmentManager, "dialog");
        }
    }
}
