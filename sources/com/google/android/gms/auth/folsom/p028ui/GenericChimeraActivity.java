package com.google.android.gms.auth.folsom.p028ui;

import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;

/* renamed from: com.google.android.gms.auth.folsom.ui.GenericChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericChimeraActivity extends adcc {

    /* renamed from: b */
    private static final sek f10927b = jdh.m16547a("GenericChimeraActivity");

    /* renamed from: a */
    public static Intent m6630a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("security_domain", str2);
        return new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.folsom.ui.GenericActivity").setAction("com.google.android.gms.auth.folsom.StartKeyRetrieval").putExtras(bundle);
    }

    public final void onBackPressed() {
        f10927b.mo25412b("onBackPressed", new Object[0]);
        jdg.m16541a(7);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            jdg.m16541a(8);
        }
        setTheme(2132018636);
        String action = getIntent().getAction();
        if (!"com.google.android.gms.auth.folsom.StartKeyRetrieval".equals(action)) {
            sek sek = f10927b;
            String valueOf = String.valueOf(action);
            sek.mo25418e(valueOf.length() == 0 ? new String("Unexpected action: ") : "Unexpected action: ".concat(valueOf), new Object[0]);
            setResult(0);
            finish();
        }
        setContentView((int) C0126R.C0128layout.webview_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        jdc jdc = (jdc) supportFragmentManager.findFragmentByTag("webview_fragment");
        if (jdc == null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("account_name");
            bmxy.m108581a(stringExtra);
            bmxy.m108581a(intent.getStringExtra("security_domain"));
            jdc = new jdc();
            Bundle bundle2 = new Bundle();
            bundle2.putString("account_name", stringExtra);
            jdc.setArguments(bundle2);
        }
        supportFragmentManager.beginTransaction().replace(C0126R.C0129id.fragment, jdc, "webview_fragment").commit();
        ((jcw) adcj.m50161a(this).mo3444a(jcw.class)).f22200a.mo2445a(this, new jcx(this));
    }
}
