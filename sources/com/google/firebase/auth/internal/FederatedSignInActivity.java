package com.google.firebase.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FederatedSignInActivity extends C1021gj {

    /* renamed from: k */
    public static Runnable f152576k;

    /* renamed from: l */
    private static long f152577l = 0;

    /* renamed from: n */
    private static final brry f152578n = brry.f143287a;

    /* renamed from: o */
    private static Handler f152579o;

    /* renamed from: m */
    private boolean f152580m = false;

    /* renamed from: a */
    private final void m118912a(Status status) {
        f152577l = 0;
        this.f152580m = false;
        Intent intent = new Intent();
        brsb.m114521a(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!aki.m919a(this).mo874a(intent)) {
            f152578n.mo69825a(getApplicationContext(), status);
        } else {
            f152578n.mo69824a(this);
        }
        finish();
    }

    /* renamed from: e */
    private final void m118913e() {
        Intent intent = new Intent("com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN");
        intent.setPackage("com.google.android.gms");
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("com.google.firebase.auth.internal.OPERATION", getIntent().getAction());
        try {
            startActivityForResult(intent, 40963);
        } catch (ActivityNotFoundException e) {
            Log.w("IdpSignInActivity", "Could not launch web sign-in Intent. Google Play service is unavailable");
            m118912a(new Status(17499, "Could not launch web sign-in Intent. Google Play service is unavailable"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: d */
    public final void mo8657d() {
        f152577l = 0;
        this.f152580m = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!aki.m919a(this).mo874a(intent)) {
            f152578n.mo69825a(this, brrv.m114516a("WEB_CONTEXT_CANCELED"));
        } else {
            f152578n.mo69824a(this);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.SIGN_IN".equals(action) || "com.google.firebase.auth.internal.LINK".equals(action) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f152577l < 30000) {
                Log.e("IdpSignInActivity", "Could not start operation - already in progress");
                return;
            }
            f152577l = currentTimeMillis;
            if (bundle != null) {
                this.f152580m = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        Log.e("IdpSignInActivity", valueOf.length() == 0 ? new String("Could not do operation - unknown action: ") : "Could not do operation - unknown action: ".concat(valueOf));
        mo8657d();
    }

    public final void onNewIntent(Intent intent) {
        Runnable runnable;
        super.onNewIntent(intent);
        Handler handler = f152579o;
        if (!(handler == null || (runnable = f152576k) == null)) {
            handler.removeCallbacks(runnable);
            f152576k = null;
        }
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if ("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED".equals(intent.getAction())) {
            Log.e("IdpSignInActivity", "Web sign-in failed, finishing");
            if (brsb.m114522a(intent)) {
                m118912a(brsb.m114523b(intent));
            } else {
                mo8657d();
            }
        } else {
            if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION") && intent.hasExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST")) {
                String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                if ("com.google.firebase.auth.internal.SIGN_IN".equals(stringExtra) || "com.google.firebase.auth.internal.LINK".equals(stringExtra) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(stringExtra)) {
                    VerifyAssertionRequest verifyAssertionRequest = (VerifyAssertionRequest) sef.m35067a(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", VerifyAssertionRequest.CREATOR);
                    String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID");
                    verifyAssertionRequest.f152569n = stringExtra2;
                    f152577l = 0;
                    this.f152580m = false;
                    Intent intent2 = new Intent();
                    sef.m35071a(verifyAssertionRequest, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", stringExtra);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!aki.m919a(this).mo874a(intent2)) {
                        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit.putString("verifyAssertionRequest", sef.m35075b(verifyAssertionRequest));
                        edit.putString("operation", stringExtra);
                        edit.putString("tenantId", stringExtra2);
                        edit.putLong("timestamp", System.currentTimeMillis());
                        edit.commit();
                    } else {
                        f152578n.mo69824a(this);
                    }
                    finish();
                    return;
                }
            }
            if (this.f152580m) {
                f152576k = new brrx(this);
                if (f152579o == null) {
                    f152579o = new adzt();
                }
                f152579o.postDelayed(f152576k, 800);
                return;
            }
            m118913e();
            this.f152580m = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f152580m);
    }
}
