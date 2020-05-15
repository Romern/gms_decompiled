package com.google.android.gms.plus.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountSignUpChimeraActivity extends FragmentActivity implements rjz, rka {

    /* renamed from: a */
    public String f82214a;

    /* renamed from: b */
    public String f82215b;

    /* renamed from: c */
    public boolean f82216c;

    /* renamed from: d */
    public int f82217d;

    /* renamed from: e */
    public String f82218e;

    /* renamed from: f */
    public PendingIntent f82219f;

    /* renamed from: g */
    public String f82220g;

    /* renamed from: h */
    public String f82221h;

    /* renamed from: i */
    public anll f82222i;

    /* renamed from: j */
    public PlusCommonExtras f82223j;

    /* renamed from: k */
    private String[] f82224k;

    /* renamed from: l */
    private final anlf[] f82225l = {new anlb(this), new anla(this), new ankz(this), new ankx(this), new anky(this), new anle(this), new anld(this)};

    /* renamed from: a */
    private static void m68288a(Context context, String str, String str2) {
        if (str != null && str2 != null) {
            shz.m35339a(context, str, (String) null, riy.f43140a, riz.f43143a, str2);
            shz.m35338a(context, str, riz.f43143a, riz.f43144b, str2);
        }
    }

    /* renamed from: b */
    private final void m68290b() {
        if (this.f82220g == null && Log.isLoggable("AccountSignUpActivity", 6)) {
            Log.e("AccountSignUpActivity", "Resolution intents must be called with startIntentSenderForResult");
        }
        m68289a(this, this.f82214a, this.f82220g, riy.f43142c);
        setResult(0);
        finish();
    }

    /* renamed from: c */
    private final int m68291c() {
        int i = 0;
        while (true) {
            anlf[] anlfArr = this.f82225l;
            int length = anlfArr.length;
            if (i >= 7) {
                return 7;
            }
            if (!anlfArr[i].mo41917c()) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo46535a();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2) {
                shz.m35337a(this, this.f82214a, i2 != -1 ? riy.f43142c : riy.f43141b, rin.f43077b, riz.f43144b, this.f82220g);
                if (i2 == -1) {
                    this.f82217d = 0;
                    mo46535a();
                    return;
                }
                m68290b();
            } else if (i == 3) {
                String str = this.f82214a;
                if (str != null) {
                    shz.m35337a(this, str, i2 != -1 ? riy.f43142c : riy.f43141b, riz.f43146d, riz.f43144b, this.f82220g);
                }
                if (i2 == -1) {
                    this.f82219f = null;
                    this.f82218e = null;
                    this.f82216c = true;
                    mo46535a();
                    return;
                }
                m68290b();
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("invalid request code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("authAccount");
            this.f82214a = stringExtra;
            m68288a(this, stringExtra, this.f82220g);
            shz.m35337a(this, this.f82214a, riy.f43141b, riz.f43145c, riz.f43144b, this.f82220g);
            this.f82216c = true;
            mo46535a();
        } else {
            m68290b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (soz.m35807f(this)) {
            Log.w("AccountSignUpActivity", "This activity is not available for restricted profile.");
            m68290b();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (bundle != null) {
            int i = bundle.getInt("stateIndex");
            anlf[] anlfArr = this.f82225l;
            int length = anlfArr.length;
            if (i < 7 && !anlfArr[i].mo41916b()) {
                this.f82225l[i].f77046c = true;
            }
            this.f82216c = bundle.getBoolean("shouldSetDefaultAccount", false);
            extras = bundle;
        } else {
            if (extras == null) {
                extras = new Bundle();
            }
            String a = spn.m35852a((Activity) this);
            this.f82220g = a;
            if (a == null) {
                m68290b();
                return;
            } else if (!getPackageName().equals(this.f82220g)) {
                String string = extras.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
                String string2 = extras.getString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME");
                if ((string != null && !string.equals(this.f82220g)) || (string2 != null && !string2.equals(this.f82220g))) {
                    rfz.m33557a(this).mo24605a(this.f82220g);
                }
            }
        }
        if ("com.google.android.gms.common.oob.OOB_SIGN_UP".equals(getIntent().getAction())) {
            this.f82220g = spn.m35852a((Activity) this);
            if (rfz.m33557a(this).mo24610b(this.f82220g)) {
                this.f82215b = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME");
                this.f82214a = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME");
                this.f82221h = this.f82220g;
            } else {
                throw new SecurityException("com.google.android.gms.common.oob.OOB_SIGN_UP is only available to first-party clients");
            }
        } else {
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                this.f82220g = extras.getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            }
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME")) {
                this.f82221h = extras.getString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME");
            } else {
                this.f82221h = this.f82220g;
            }
            this.f82214a = extras.getString("authAccount");
        }
        PlusCommonExtras b = PlusCommonExtras.m68418b(getIntent());
        this.f82223j = b;
        anku.m64689a(this, b, "gpsi0");
        if (this.f82221h == null) {
            m68290b();
        } else {
            if (extras.containsKey("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE")) {
                this.f82217d = extras.getInt("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE");
            } else {
                this.f82217d = 2;
            }
            this.f82224k = null;
            if (extras.containsKey("request_visible_actions")) {
                this.f82224k = extras.getStringArray("request_visible_actions");
            }
            this.f82218e = extras.getString("com.google.android.gms.plus.intent.extra.AUTH_SCOPE_STRING");
            this.f82219f = (PendingIntent) extras.getParcelable("com.google.android.gms.plus.intent.extra.AUTH_TOKEN_INTENT");
        }
        if (bundle == null && (str = this.f82214a) != null) {
            m68288a(this, str, this.f82220g);
        }
        this.f82222i = new anll(this, this, this, this.f82224k);
        mo46535a();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        aoni aoni = (aoni) supportFragmentManager.findFragmentByTag("progress_dialog");
        if (aoni != null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.detach(aoni);
            beginTransaction.commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        String string = getString(C0126R.string.plus_loading);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((aoni) supportFragmentManager.findFragmentByTag("progress_dialog")) == null) {
            aoni a = aoni.m66138a(string);
            a.setStyle(1, 2132019651);
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(a, "progress_dialog");
            beginTransaction.commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        anuh.m65337a(bundle, this.f82214a, this.f82220g, this.f82221h, this.f82217d, this.f82218e, this.f82224k, this.f82219f);
        int c = m68291c();
        bundle.putInt("stateIndex", c);
        anlf[] anlfArr = this.f82225l;
        int length = anlfArr.length;
        boolean z = true;
        if (c < 7 && !anlfArr[c].f77046c) {
            z = false;
        }
        sdo.m34970a(z);
        bundle.putBoolean("shouldSetDefaultAccount", this.f82216c);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        anll anll = this.f82222i;
        if (anll != null) {
            anll.mo25308x();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        anll anll = this.f82222i;
        if (anll != null) {
            anll.mo14032j();
        }
    }

    /* renamed from: a */
    private static void m68289a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        if (str != null && str2 != null) {
            shz.m35339a(context, str, (String) null, favaDiagnosticsEntity, riz.f43144b, str2);
            shz.m35338a(context, str, riz.f43144b, riz.f43143a, str2);
        }
    }

    /* renamed from: a */
    public final void mo46535a() {
        int c = m68291c();
        anlf[] anlfArr = this.f82225l;
        int length = anlfArr.length;
        if (c < 7) {
            anlf anlf = anlfArr[c];
            if (!anlf.f77046c) {
                anlf.mo41915a();
                return;
            }
            return;
        }
        m68289a(this, this.f82214a, this.f82220g, riy.f43141b);
        setResult(-1);
        finish();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        int c = m68291c();
        anlf[] anlfArr = this.f82225l;
        int length = anlfArr.length;
        if (c < 7 && anlfArr[c].mo41916b()) {
            this.f82225l[c].f77046c = false;
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        m68290b();
    }

    /* renamed from: a */
    public final void mo46536a(String str) {
        Toast.makeText(this, str, 1).show();
        m68290b();
    }
}
