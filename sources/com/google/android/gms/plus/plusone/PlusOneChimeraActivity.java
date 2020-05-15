package com.google.android.gms.plus.plusone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlusOneChimeraActivity extends FragmentActivity implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: a */
    private aoah f82599a;

    /* renamed from: b */
    private Bundle f82600b;

    /* renamed from: c */
    private String f82601c;

    /* renamed from: d */
    private boolean f82602d;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            aoah aoah = this.f82599a;
            Activity activity = aoah.getActivity();
            if (activity != null) {
                aoah.f78023n = null;
                if (i2 != -1) {
                    activity.setResult(i2);
                    activity.finish();
                    return;
                }
                aoah.f78015f.mo42332x();
            }
        } else if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            setResult(i2);
            finish();
        } else {
            this.f82602d = false;
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f82599a != null) {
            aoah aoah = this.f82599a;
            aoah.f78022m = (ProgressBar) findViewById(C0126R.C0129id.progress_spinner);
            aoah.mo42512a(aoah.f78022m);
        }
    }

    public final void onBackPressed() {
        aoah aoah = this.f82599a;
        if (aoah != null) {
            aoah.mo42511a();
        }
        super.onBackPressed();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        String a = spn.m35852a((Activity) this);
        String stringExtra = intent.getStringExtra("com.google.android.gms.plus.intent.extra.TOKEN");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.plus.intent.extra.URL");
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.plus.intent.extra.EXTRA_SIGNED_UP", false);
        this.f82601c = intent.getStringExtra("com.google.android.gms.plus.intent.extra.ACCOUNT");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(action) || TextUtils.isEmpty(a)) {
            Log.e("PlusOneActivity", "Intent missing required arguments");
            setResult(0);
            finish();
            return;
        }
        if (this.f82601c == null) {
            this.f82601c = "<<default account>>";
        }
        Bundle bundle2 = new Bundle();
        this.f82600b = bundle2;
        bundle2.putString("PlusOneFragment#mCallingPackage", a);
        this.f82600b.putString("PlusOneFragment#mAccount", this.f82601c);
        this.f82600b.putString("PlusOneFragment#mUrl", stringExtra2);
        this.f82600b.putBoolean("PlusOneFragment#mApplyPlusOne", "com.google.android.gms.plus.action.PLUS_ONE".equals(action));
        this.f82600b.putString("PlusOneFragment#mToken", stringExtra);
        PlusCommonExtras b = PlusCommonExtras.m68418b(intent);
        anku.m64689a(this, b, "gppo0");
        if (bundle == null) {
            setResult(0);
            z = !booleanExtra;
            this.f82602d = z;
        } else {
            z = bundle.getBoolean("needs_sign_in");
            this.f82602d = z;
        }
        if (!z) {
            m68543a();
        } else if (bundle == null) {
            int myUid = Process.myUid();
            String str = this.f82601c;
            ClientContext clientContext = new ClientContext(myUid, str, str, a, getPackageName());
            b.mo46574a(clientContext.f30219i);
            for (int i = 0; i < aoah.f78010a.length; i++) {
                clientContext.mo17806d(aoah.f78010a[i]);
            }
            anui anui = new anui(this, clientContext);
            anui.f77744a = 2;
            startActivityForResult(anui.mo42290a(), 2);
        }
    }

    public final Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage((int) C0126R.string.plus_one_error).setNeutralButton(17039370, this).setCancelable(false);
        return builder.create();
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        if (!this.f82602d && this.f82599a == null) {
            m68543a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("needs_sign_in", this.f82602d);
    }

    /* renamed from: a */
    private final void m68543a() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenLayout;
        int i2 = configuration.screenLayout & 3;
        int i3 = C0126R.C0128layout.plus_one_activity;
        if (i2 != 0 && (configuration.orientation & 1) == 0) {
            i3 = C0126R.C0128layout.plus_one_activity_constrained;
        }
        setContentView(i3);
        aoah aoah = (aoah) getSupportFragmentManager().findFragmentByTag("PlusOneActivity#Fragment");
        this.f82599a = aoah;
        if (aoah == null) {
            aoah aoah2 = new aoah();
            this.f82599a = aoah2;
            aoah2.setArguments(this.f82600b);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(C0126R.C0129id.plus_one_container, this.f82599a, "PlusOneActivity#Fragment");
            beginTransaction.commit();
        }
        findViewById(C0126R.C0129id.frame_container).setOnClickListener(this);
        findViewById(C0126R.C0129id.plus_one_container).setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.frame_container) {
            aoah aoah = this.f82599a;
            if (aoah != null) {
                aoah.mo42511a();
            }
            finish();
        }
    }
}
