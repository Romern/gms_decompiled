package com.google.android.gms.magictether.host;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProvisioningFailedDialogChimeraActivity extends afcf {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((afao) getSupportFragmentManager().findFragmentByTag("dialog_fragment")) == null) {
            String str = this.f64171a;
            String str2 = this.f64172b;
            afao afao = new afao();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_content_title", str);
            bundle2.putString("dialog_content_message", str2);
            afao.setArguments(bundle2);
            afao.show(getSupportFragmentManager(), "dialog_fragment");
        }
    }
}
