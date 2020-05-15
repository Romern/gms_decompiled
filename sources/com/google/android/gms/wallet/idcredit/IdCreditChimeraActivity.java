package com.google.android.gms.wallet.idcredit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IdCreditChimeraActivity extends awce {
    /* renamed from: a */
    public static Intent m94004a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.idcredit.IdCreditActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_IDENTITY");
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.idcredit.IdCreditChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        awia.m79981a((Activity) this, buyFlowConfig, awia.f94383e, true);
        mo51862a(bundle, awij.f94457e, 5, bpis.FLOW_TYPE_IDENTITY_CREDIT);
        super.onCreate(bundle);
        awcf.m79641a((dnx) this);
        setContentView((int) C0126R.C0128layout.wallet_activity_common_with_focus_stealer);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15853b(true);
        if (((awmq) mo51879e()) == null) {
            if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                String str = this.f94163b;
                LogContext logContext = this.f94164c;
                awmq awmq = new awmq();
                Bundle a = awzk.m81653a(buyFlowConfig, str, logContext);
                a.putByteArray("initializeToken", byteArrayExtra);
                awmq.setArguments(a);
                mo51866a(awmq, (int) C0126R.C0129id.fragment_holder);
            } else if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                String str2 = this.f94163b;
                LogContext logContext2 = this.f94164c;
                awmq awmq2 = new awmq();
                Bundle a2 = awzk.m81653a(buyFlowConfig, str2, logContext2);
                a2.putByteArray("encryptedParams", byteArrayExtra2);
                awmq2.setArguments(a2);
                mo51866a(awmq2, (int) C0126R.C0129id.fragment_holder);
            } else {
                throw new IllegalArgumentException("IdCreditChimeraActivity requires either encrypted parameters or initialization token");
            }
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        byte[] bArr;
        IdCreditResult idCreditResult = (IdCreditResult) parcelable;
        Intent d = awce.m79602d(z);
        if (!(idCreditResult == null || (bArr = idCreditResult.f110242a) == null || bArr.length <= 0)) {
            d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
        }
        mo51859a(-1, d);
    }
}
