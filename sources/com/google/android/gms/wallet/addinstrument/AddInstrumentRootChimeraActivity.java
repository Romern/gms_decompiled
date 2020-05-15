package com.google.android.gms.wallet.addinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AddInstrumentRootChimeraActivity extends awce {

    /* renamed from: i */
    private Toolbar f109916i;

    /* renamed from: j */
    private byte[] f109917j;

    /* renamed from: a */
    public static Intent m93802a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.addinstrument.AddInstrumentRootActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_WIDGET");
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.addinstrument.AddInstrumentRootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        boolean z = true;
        awia.m79981a((Activity) this, mo51881h(), awia.f94383e, true);
        mo51862a(bundle, awij.f94459g, 7, bpis.FLOW_TYPE_ADD_INSTRUMENT);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wallet_activity_add_instrument_widget);
        if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
            this.f109917j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        } else if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
            this.f109917j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        } else {
            throw new IllegalArgumentException("AddInstrumentRootChimeraActivity requires AddInstrumentParameters");
        }
        Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.add_instrument_toolbar);
        this.f109916i = toolbar;
        mo8626a(toolbar);
        mo8628aW().mo15853b(true);
        this.f94166e = (ProgressSpinnerView) findViewById(C0126R.C0129id.progress_spinner_container);
        if (((awcj) mo51879e()) == null) {
            BuyFlowConfig h = mo51881h();
            String str = this.f94163b;
            byte[] bArr = this.f109917j;
            LogContext logContext = this.f94164c;
            if (bArr == null || bArr.length <= 0) {
                z = false;
            }
            sdo.m34975b(z, "Parameters is required to lauch AddInstrument.");
            awcj awcj = new awcj();
            Bundle a = awzk.m81653a(h, str, logContext);
            a.putByteArray("parameters", bArr);
            awcj.setArguments(a);
            mo51866a(awcj, (int) C0126R.C0129id.add_instrument_container);
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }
}
