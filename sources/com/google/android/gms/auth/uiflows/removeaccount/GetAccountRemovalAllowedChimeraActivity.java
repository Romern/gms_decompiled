package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAccountRemovalAllowedChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        Intent intent = getIntent();
        GetAccountRemovalAllowedController getAccountRemovalAllowedController = new GetAccountRemovalAllowedController((AccountAuthenticatorResponse) intent.getParcelableExtra("am_response"), (Account) intent.getParcelableExtra("account"), intent.getBooleanExtra("show_lock_screen", false), intent.getStringExtra("caller"));
        jxw a = getAccountRemovalAllowedController.mo7862a((jxy) null);
        Intent intent2 = a.f23487b;
        jxx.m17489a(intent2, getAccountRemovalAllowedController, a.f23486a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
