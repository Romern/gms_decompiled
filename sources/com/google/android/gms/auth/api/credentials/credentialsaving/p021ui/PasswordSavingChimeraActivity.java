package com.google.android.gms.auth.api.credentials.credentialsaving.p021ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.credentials.credentialsaving.ui.PasswordSavingChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PasswordSavingChimeraActivity extends adcc {

    /* renamed from: b */
    public qws f10130b;

    /* renamed from: a */
    public final void mo7417a(Status status, int i) {
        Intent intent = new Intent();
        sef.m35071a(status, intent, "status");
        setResult(i, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C0126R.style.ThemeTranslucent);
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) sef.m35067a(getIntent(), "save_password_request", SavePasswordRequest.CREATOR);
        String stringExtra = getIntent().getStringExtra("session_id");
        bmxy.m108581a(stringExtra);
        String a = spn.m35852a((Activity) this);
        this.f10130b = new qws(this, "IDENTITY_GMSCORE", null);
        adbs.m50134a(this, this, new hfq(this, stringExtra));
        if (a == null) {
            mo7417a(new Status(10, "Calling package not found."), 0);
            return;
        }
        bmxv a2 = aczr.m50057a(getApplication(), a);
        if (!a2.mo66813a()) {
            mo7417a(new Status(10, "App info not found."), 0);
            return;
        }
        bmxv a3 = qqt.m32666a(this, a);
        if (!a3.mo66813a()) {
            mo7417a(new Status(10, "App ID is not present."), 0);
            return;
        }
        ((hhe) adcj.m50162a(this, new hhd(getApplication(), (String) a3.mo66814b(), a, stringExtra, (C1240of) a2.mo66814b(), savePasswordRequest)).mo3444a(hhe.class)).f19765t.mo2445a(this, new hfr(this));
        adcj.m50161a(this).mo3444a(hel.class);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("PasswordSavingBottomSheetDialogFragment") == null) {
            new hfp().show(supportFragmentManager, "PasswordSavingBottomSheetDialogFragment");
        }
    }
}
