package com.google.android.gms.magictether.host;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FirstTimeSetupDialogChimeraActivity extends afcf {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((afah) getSupportFragmentManager().findFragmentByTag("dialog_fragment")) == null) {
            String str = this.f64171a;
            String str2 = this.f64172b;
            afah afah = new afah();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_title", str);
            bundle2.putString("dialog_message", str2);
            bundle2.putParcelable("dialog_result_receiver", (ResultReceiver) getIntent().getExtras().getParcelable("result_receiver"));
            afah.setArguments(bundle2);
            afah.show(getSupportFragmentManager(), "dialog_fragment");
        }
        afba a = afaz.m52798a();
        if (cfcm.m138682b()) {
            a.f64113b.mo24383c("magictether_setup_notification_tapped_count").mo24359a();
            a.f64113b.mo24388e();
        }
    }
}
