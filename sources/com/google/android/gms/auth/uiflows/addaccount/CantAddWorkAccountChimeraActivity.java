package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CantAddWorkAccountChimeraActivity extends FragmentActivity implements rrh {
    /* renamed from: a */
    public final void mo7754a(rri rri, int i) {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rri.m34289a(getString(C0126R.string.auth_cant_add_work_account_message), getString(17039370), null, true).show(getSupportFragmentManager(), "error_dialog");
    }
}
