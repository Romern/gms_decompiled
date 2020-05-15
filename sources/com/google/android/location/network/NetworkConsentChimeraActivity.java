package com.google.android.location.network;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkConsentChimeraActivity extends Activity implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private AlertDialog f150818a;

    /* renamed from: b */
    private int f150819b;

    /* renamed from: c */
    private int f150820c;

    /* renamed from: d */
    private Boolean f150821d = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aeri.a(android.content.Context, boolean, aerk):void
     arg types: [com.google.android.location.network.NetworkConsentChimeraActivity, int, aerk]
     candidates:
      aeri.a(android.content.Context, int, aerk):void
      aeri.a(android.content.Context, boolean, aerk):void */
    /* renamed from: a */
    private final void m117281a(boolean z) {
        if (this.f150821d == null) {
            this.f150821d = Boolean.valueOf(z);
            if (Log.isLoggable("NLPConsentDialog", 4)) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("consent dialog choice was ");
                sb.append(z);
                Log.i("NLPConsentDialog", sb.toString());
            }
            if (!isFinishing()) {
                finish();
            }
            if (z) {
                aeri.m52432a(this, true, aerk.ALLOWED, 3, this.f150819b, C0126R.string.common_agree, C0126R.string.common_disagree, this.f150820c);
                int i = Build.VERSION.SDK_INT;
                if (getIntent().getBooleanExtra("confirmLgaayl", false)) {
                    Intent intent = new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
                    intent.setFlags(268435456);
                    startActivity(intent);
                    return;
                }
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (Log.isLoggable("NLPConsentDialog", 4)) {
                Log.i("NLPConsentDialog", "setting location off");
            }
            aeri.m52431a((Context) this, false, aerk.ALLOWED);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m117281a(i == -1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Log.isLoggable("NLPConsentDialog", 4)) {
            Log.i("NLPConsentDialog", "displaying consent dialog");
        }
        sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        Window window = getWindow();
        window.addFlags(2);
        window.setDimAmount(0.6f);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        int i = Build.VERSION.SDK_INT;
        this.f150819b = C0126R.string.location_warning_title_v28;
        int i2 = Build.VERSION.SDK_INT;
        this.f150820c = C0126R.string.location_warning_message_v28;
        builder.setTitle(this.f150819b);
        builder.setMessage(this.f150820c);
        builder.setPositiveButton(getString(C0126R.string.common_agree), this);
        builder.setNegativeButton(getString(C0126R.string.common_disagree), this);
        builder.setOnCancelListener(new bgfd(this));
        AlertDialog create = builder.create();
        this.f150818a = create;
        create.getWindow().addFlags(4194304);
        this.f150818a.show();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        m117281a(false);
        super.onPause();
    }
}
