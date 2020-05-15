package com.google.android.gms.wallet.common.p079ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: com.google.android.gms.wallet.common.ui.ErrorChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorChimeraActivity extends Activity implements bkcy {
    /* renamed from: a */
    public static Intent m93895a(BuyFlowConfig buyFlowConfig, Intent intent, String str) {
        Intent intent2 = new Intent();
        intent2.setClassName("com.google.android.gms", "com.google.android.gms.wallet.common.ui.ErrorActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("resultCode", 0);
        intent2.putExtra("resultData", intent);
        sdo.m34959a((Object) str);
        intent2.putExtra("message", str);
        return intent2;
    }

    public final void onBackPressed() {
        m93896a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.common.ui.ErrorChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        awia.m79981a((Activity) this, (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), awia.f94379a, false);
        super.onCreate(bundle);
        bkcz bkcz = (bkcz) getSupportFragmentManager().findFragmentByTag("errorDialogFragment");
        if (bundle == null) {
            bkcz = bkcz.m105338a(4, (String) null, intent.getStringExtra("message"), 0);
            getSupportFragmentManager().beginTransaction().add(bkcz, "errorDialogFragment").commit();
        }
        bkcz.f124032a = this;
    }

    /* renamed from: a */
    private final void m93896a() {
        Intent intent = getIntent();
        setResult(intent.getIntExtra("resultCode", 0), (Intent) intent.getParcelableExtra("resultData"));
        finish();
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        m93896a();
    }
}
