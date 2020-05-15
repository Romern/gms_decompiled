package com.google.android.gms.wallet.fixinstrument;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FixInstrumentRootChimeraActivity extends awce implements View.OnFocusChangeListener {

    /* renamed from: i */
    private Toolbar f110191i;

    /* renamed from: j */
    private View f110192j;

    /* renamed from: k */
    private byte[] f110193k;

    /* renamed from: l */
    private byte[] f110194l;

    /* renamed from: a */
    public static Intent m93940a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.fixinstrument.FixInstrumentRootActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT");
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.fixinstrument.FixInstrumentRootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        Intent intent = getIntent();
        boolean z3 = true;
        awia.m79981a((Activity) this, mo51881h(), awia.f94383e, true);
        mo51862a(bundle, awij.f94460h, 8, bpis.FLOW_TYPE_FIX_INSTRUMENT);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wallet_activity_common_with_focus_stealer);
        this.f110193k = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.f110194l = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.toolbar);
        this.f110191i = toolbar;
        mo8626a(toolbar);
        mo8628aW().mo15853b(true);
        View findViewById = findViewById(C0126R.C0129id.focus_stealer);
        this.f110192j = findViewById;
        findViewById.setOnFocusChangeListener(this);
        if (((awma) mo51879e()) == null) {
            BuyFlowConfig h = mo51881h();
            String str = this.f94163b;
            byte[] bArr = this.f110193k;
            byte[] bArr2 = this.f110194l;
            LogContext logContext = this.f94164c;
            if (bArr == null || bArr.length <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (bArr2 == null || bArr2.length <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            sdo.m34975b(z ? true : z2, "Parameters or initializeToken is required to launch FixInstrument.");
            if (z && z2) {
                z3 = false;
            }
            sdo.m34975b(z3, "Only parameters or initializeToken should be set when launching FixInstrument.");
            awma awma = new awma();
            Bundle a = awzk.m81653a(h, str, logContext);
            if (bArr != null) {
                a.putByteArray("parameters", bArr);
            }
            if (bArr2 != null) {
                a.putByteArray("initializeToken", bArr2);
            }
            awma.setArguments(a);
            mo51866a(awma, (int) C0126R.C0129id.fragment_holder);
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }

    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.f110192j) {
            bkfr.m105559a(this, view);
        }
    }
}
