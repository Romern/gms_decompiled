package com.google.android.gms.plus.circles;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AddToCircleConsentChimeraActivity extends FragmentActivity implements ansj {

    /* renamed from: a */
    private rkb f82333a;

    /* renamed from: b */
    private String f82334b;

    /* renamed from: c */
    private String f82335c;

    /* renamed from: a */
    public final void mo42182a(boolean z) {
        if (!z) {
            setResult(0);
        } else if (this.f82333a.mo24805i()) {
            rjo rjo = allr.f73629a;
            rkb rkb = this.f82333a;
            rkb.mo24795b(new amco(rkb, this.f82334b, this.f82335c));
            setResult(1);
        } else {
            setResult(1);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        String a = spn.m35852a((Activity) this);
        if (a == null || !rfz.m33557a(this).mo24610b(a)) {
            setResult(0);
            finish();
        }
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("com.google.android.gms.plus.circles.EXTRA_APPLICATION_ID", 0);
        String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        if (stringExtra != null) {
            a = stringExtra;
        }
        if (intExtra == 0) {
            intExtra = 80;
        }
        rjy rjy = new rjy(this);
        rjy.f43173b = a;
        rjo rjo = allr.f73629a;
        allp allp = new allp();
        allp.f73626a = intExtra;
        rjy.mo24780a(rjo, allp.mo40491a());
        this.f82333a = rjy.mo24784b();
        this.f82334b = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_ACCOUNT_NAME");
        this.f82335c = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_PAGE_ID");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_CONSENT_HTML");
        String stringExtra3 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_TITLE_TEXT");
        String stringExtra4 = intent.getStringExtra("com.google.android.gms.plus.circles.EXTRA_BUTTON_TEXT");
        if (getSupportFragmentManager().findFragmentByTag("consentDialog") == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("consentHtml", stringExtra2);
            bundle2.putString("titleText", stringExtra3);
            bundle2.putString("buttonText", stringExtra4);
            ansk ansk = new ansk();
            ansk.setArguments(bundle2);
            ansk.show(getSupportFragmentManager(), "consentDialog");
        }
    }

    public final void onStart() {
        super.onStart();
        this.f82333a.mo24801e();
    }

    public final void onStop() {
        this.f82333a.mo24803g();
        super.onStop();
    }
}
