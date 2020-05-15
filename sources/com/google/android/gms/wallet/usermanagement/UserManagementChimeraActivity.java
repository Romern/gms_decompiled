package com.google.android.gms.wallet.usermanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserManagementChimeraActivity extends awce {
    /* renamed from: a */
    public static Intent m94303a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        if (!((Boolean) awig.f94437c.mo58455c()).booleanValue()) {
            return axdg.m82385a(context, intent, buyFlowConfig);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.usermanagement.UserManagementActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_USER_MANAGEMENT");
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.usermanagement.UserManagementChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        awia.m79981a((Activity) this, mo51881h(), awia.f94385g, true);
        mo51862a(bundle, awij.f94469q, 16, bpis.FLOW_TYPE_USER_MANAGEMENT);
        super.onCreate(bundle);
        awcf.m79641a((dnx) this);
        setContentView((int) C0126R.C0128layout.wallet_activity_common_with_focus_stealer);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15853b(true);
        if (((axdd) mo51879e()) == null) {
            Intent intent = getIntent();
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
            BuyFlowConfig h = mo51881h();
            String str = this.f94163b;
            LogContext logContext = this.f94164c;
            if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z && !z2) {
                z3 = false;
            }
            sdo.m34975b(z3, "Parameters or initializeToken is required to launch UserManagement.");
            axdd axdd = new axdd();
            Bundle a = awzk.m81653a(h, str, logContext);
            if (byteArrayExtra != null) {
                a.putByteArray("parameters", byteArrayExtra);
            }
            if (byteArrayExtra2 != null) {
                a.putByteArray("initializeToken", byteArrayExtra2);
            }
            axdd.setArguments(a);
            mo51866a(axdd, (int) C0126R.C0129id.fragment_holder);
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }
}
