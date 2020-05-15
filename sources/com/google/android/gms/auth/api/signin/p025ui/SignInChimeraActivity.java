package com.google.android.gms.auth.api.signin.p025ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.ui.SignInChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInChimeraActivity extends adcc {

    /* renamed from: b */
    public GoogleSignInOptions f10361b;

    /* renamed from: c */
    public String f10362c;

    /* renamed from: d */
    public qws f10363d;

    /* renamed from: e */
    public Intent f10364e;

    /* renamed from: f */
    public String f10365f;

    /* renamed from: g */
    private final sek f10366g = new sek("Auth.Api.SignIn", "Activity", "SignInChimeraActivity");

    /* renamed from: h */
    private adan f10367h;

    /* renamed from: i */
    private qws f10368i;

    /* renamed from: a */
    public final void mo7538a(int i) {
        if (((Boolean) icl.f20738c.mo58455c()).booleanValue()) {
            this.f10368i.mo24333a(idx.m15307a(this.f10362c, 3, Integer.valueOf(i), this.f10361b)).mo24327b();
        }
    }

    public final void finish() {
        if (this.f10364e == null) {
            Intent intent = new Intent();
            intent.putExtra("errorCode", Status.f30111e.f30115i);
            setResult(0, intent);
            this.f10366g.mo25414c("User exited the activity.", new Object[0]);
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132017796);
        this.f10368i = new qws(this, "ANDROID_AUTH", null);
        this.f10363d = new qws(this, "IDENTITY_GMSCORE", null);
        if (bundle != null) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) bundle.getParcelable("sign_in_options");
            bmxy.m108581a(googleSignInOptions);
            this.f10361b = googleSignInOptions;
            String string = bundle.getString("consumer_package_name");
            bmxy.m108581a(string);
            this.f10362c = string;
            this.f10365f = this.f10361b.f10343p;
        } else if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(getIntent().getAction())) {
            this.f10366g.mo25418e("Unknown action sent to SignInActivity", new Object[0]);
            mo7539a(0, null);
            return;
        } else {
            SignInConfiguration signInConfiguration = (SignInConfiguration) getIntent().getParcelableExtra("config");
            if (signInConfiguration == null) {
                this.f10366g.mo25418e("Activity started with invalid configuration.", new Object[0]);
                mo7539a(0, null);
                return;
            }
            String a = spn.m35852a((Activity) this);
            if (a == null || !a.equals(signInConfiguration.f10351a)) {
                this.f10366g.mo25418e("Calling package [%s] does not match configuration.", bmxx.m108578b(a));
                mo7539a(0, null);
                return;
            }
            this.f10362c = a;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f10352b;
            String str = googleSignInOptions2.f10343p;
            if (str == null) {
                this.f10365f = adbv.m50143a();
                ich ich = new ich(googleSignInOptions2);
                ich.f20726b = this.f10365f;
                GoogleSignInOptions a2 = ich.mo12912a();
                this.f10361b = a2;
                Scope[] b = a2.mo7527b();
                GoogleSignInOptions googleSignInOptions3 = this.f10361b;
                if (cgmd.m146192b()) {
                    this.f10363d.mo24333a(addd.m50200a(this.f10362c, b, googleSignInOptions3.f10343p, googleSignInOptions3.f10337j, googleSignInOptions3.f10339l, googleSignInOptions3.f10338k)).mo24327b();
                }
            } else {
                this.f10361b = googleSignInOptions2;
                this.f10365f = str;
            }
            sek sek = this.f10366g;
            String valueOf = String.valueOf(this.f10365f);
            sek.mo25412b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        }
        if (cgmd.m146192b()) {
            adbs.m50134a(this, this, new idt(this));
        }
        adan a3 = adan.m50084a((FragmentActivity) this);
        this.f10367h = a3;
        bqga.m112781a(a3.mo33294b(1, new idu(this)), new idv(this), bqfb.INSTANCE);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sign_in_options", this.f10361b);
        bundle.putString("consumer_package_name", this.f10362c);
    }

    /* renamed from: a */
    public final void mo7539a(int i, Intent intent) {
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
