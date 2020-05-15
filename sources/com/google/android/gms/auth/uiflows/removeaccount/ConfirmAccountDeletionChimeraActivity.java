package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfirmAccountDeletionChimeraActivity extends jxx {

    /* renamed from: a */
    public static final sek f11566a = new sek("RemoveAccount", "ConfirmAccountDeletionActivity");

    /* renamed from: a */
    public static Intent m7097a(Context context, String str) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.login.ConfirmAccountDeletionActivity").putExtra("caller", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "ConfirmAccountDeletionActivity";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getExtras().getParcelable("response");
        if (accountAuthenticatorResponse != null) {
            if (i2 == -1) {
                f11566a.mo25414c("User authenticated, starting intent.", new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("booleanResult", true);
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                f11566a.mo25414c("Failed to confirm lock screen credential.", new Object[0]);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", false);
                accountAuthenticatorResponse.onResult(bundle2);
            }
            finish();
            return;
        }
        mo7874a(i2, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        boolean equals = "com.android.managedprovisioning".equals(bundle.getString("caller"));
        if (!equals) {
            i = C0126R.string.f7384xda545cf2;
        } else {
            i = C0126R.string.f7385x31fd34fe;
        }
        if (!equals) {
            i2 = C0126R.string.auth_factory_reset_protection_remove_account_confirmation_title;
        } else {
            i2 = C0126R.string.f7386xf7c319dd;
        }
        new AlertDialog.Builder(this).setCancelable(false).setTitle(i2).setMessage(i).setPositiveButton(17039370, new kaj(this)).setNegativeButton(17039360, new kai(this)).create().show();
    }
}
