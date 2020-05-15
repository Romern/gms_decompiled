package com.google.android.gms.accountsettings.p010ui;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: com.google.android.gms.accountsettings.ui.MyAccountNotAvailableAlertChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MyAccountNotAvailableAlertChimeraActivity extends Activity {

    /* renamed from: a */
    DialogFragment f7806a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(C0126R.style.AsAlertDialogTheme);
        setFinishOnTouchOutside(false);
        ffo ffo = new ffo();
        this.f7806a = ffo;
        ffo.show(getSupportFragmentManager(), "nosettings");
    }
}
