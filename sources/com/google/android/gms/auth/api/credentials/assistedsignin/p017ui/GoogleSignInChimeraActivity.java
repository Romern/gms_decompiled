package com.google.android.gms.auth.api.credentials.assistedsignin.p017ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: com.google.android.gms.auth.api.credentials.assistedsignin.ui.GoogleSignInChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSignInChimeraActivity extends adcc {

    /* renamed from: b */
    public qws f10126b;

    /* renamed from: a */
    public final void mo7415a(haz haz) {
        setResult(haz.mo12370b(), haz.mo12371c());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(C0126R.style.ThemeTranslucent);
        super.onCreate(bundle);
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) sef.m35067a(getIntent(), "get_sign_in_intent_request", GetSignInIntentRequest.CREATOR);
        this.f10126b = new qws(this, "IDENTITY_GMSCORE", null);
        adbs.m50134a(this, this, new gxj(this, getSignInIntentRequest));
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            mo7415a(haz.m14157a("Calling package not found"));
            return;
        }
        bmxv a2 = aczr.m50057a(getApplicationContext(), a);
        if (!a2.mo66813a()) {
            mo7415a(haz.m14157a("Calling package not found"));
            return;
        }
        ((hay) adcj.m50162a(this, new hax(getApplication(), a, getSignInIntentRequest, (CharSequence) ((C1240of) a2.mo66814b()).f26798a, (Bitmap) ((C1240of) a2.mo66814b()).f26799b)).mo3444a(hay.class)).f19390n.mo2445a(this, new gxk(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("GoogleSignInDialogFragment") == null) {
            new gxn().show(supportFragmentManager, "GoogleSignInDialogFragment");
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        if (supportFragmentManager2.findFragmentByTag("GoogleSignInControllerFragment") == null) {
            supportFragmentManager2.beginTransaction().add(new hav(), "GoogleSignInControllerFragment").commitNow();
        }
    }
}
