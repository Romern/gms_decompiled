package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInHubActivity extends C1021gj {

    /* renamed from: m */
    private static boolean f10353m = false;

    /* renamed from: k */
    public int f10354k;

    /* renamed from: l */
    public Intent f10355l;

    /* renamed from: n */
    private boolean f10356n = false;

    /* renamed from: o */
    private SignInConfiguration f10357o;

    /* renamed from: p */
    private boolean f10358p;

    /* renamed from: a */
    private final void m6419a(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f10357o);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException e) {
            this.f10356n = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m6420c(17);
        }
    }

    /* renamed from: c */
    private final void m6420c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f10353m = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.f10356n) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.f10346b) != null) {
                        icx a = icx.m15249a(this);
                        GoogleSignInOptions googleSignInOptions = this.f10357o.f10352b;
                        bmxy.m108581a(googleSignInAccount);
                        a.mo12928a(googleSignInOptions, googleSignInAccount);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f10358p = true;
                        this.f10354k = i2;
                        this.f10355l = intent;
                        m6421d();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m6420c(intExtra);
                        return;
                    }
                }
                m6420c(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        bmxy.m108581a(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m6420c(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bmxy.m108581a(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f10357o = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f10358p = z;
                if (z) {
                    this.f10354k = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    bmxy.m108581a(intent2);
                    this.f10355l = intent2;
                    m6421d();
                }
            } else if (f10353m) {
                setResult(0);
                m6420c(12502);
            } else {
                f10353m = true;
                m6419a(action);
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f10358p);
        if (this.f10358p) {
            bundle.putInt("signInResultCode", this.f10354k);
            bundle.putParcelable("signInResultData", this.f10355l);
        }
    }

    /* renamed from: d */
    private final void m6421d() {
        C1087iq.m15879a(this).mo13248a(0, null, new idj(this));
        f10353m = false;
    }
}
