package com.google.android.gms.wallet.selector;

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
public class InitializeGenericSelectorRootChimeraActivity extends awce {

    /* renamed from: i */
    private byte[] f110325i;

    /* renamed from: j */
    private int f110326j = 1;

    /* renamed from: a */
    public static Intent m94090a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        sdo.m34959a(buyFlowConfig);
        sdo.m34959a(buyFlowConfig.f110418b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.selector.InitializeGenericSelectorRootActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("com.google.android.gms.wallet.account", buyFlowConfig.f110418b.f110407b);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.selector.InitializeGenericSelectorRootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    public final void onCreate(Bundle bundle) {
        bdyx bdyx;
        awot awot;
        boolean z;
        awia.m79981a((Activity) this, mo51881h(), awia.f94383e, true);
        int i = this.f110326j;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                bdyx = awij.f94461i;
            } else if (i2 == 2) {
                bdyx = awij.f94463k;
            } else if (i2 != 3) {
                bdyx = awij.f94464l;
            } else {
                bdyx = awij.f94462j;
            }
            mo51862a(bundle, bdyx, 10, bpis.FLOW_TYPE_GENERIC_SELECTOR);
            super.onCreate(bundle);
            this.f110326j = bmqz.m108301a(getIntent().getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_GENERIC_SELECTOR_SCENARIO", 2));
            this.f110325i = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
            if (awia.m79997b(this.f110326j)) {
                sdo.checkIfNull(this.f110325i, "GenericSelectorParameters are required.");
            }
            if (bundle == null) {
                if (!getIntent().hasExtra("com.google.android.gms.identity.intents.EXTRA_REQUEST") || !getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_COUNTRY_CODE")) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34970a(z);
            }
            setContentView((int) C0126R.C0128layout.wallet_activity_initialize_generic_selector);
            mo8626a((Toolbar) findViewById(C0126R.C0129id.tool_bar));
            mo8628aW().mo15853b(true);
            if (((awot) mo51879e()) == null) {
                if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                    byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                    BuyFlowConfig h = mo51881h();
                    int i3 = this.f110326j;
                    byte[] bArr = this.f110325i;
                    String str = this.f94163b;
                    LogContext logContext = this.f94164c;
                    if (awia.m79997b(i3)) {
                        sdo.m34959a(bArr);
                    }
                    sdo.m34959a(byteArrayExtra);
                    awot = new awot();
                    Bundle a = awzk.m81653a(h, str, logContext);
                    a.putByteArray("genericParameters", bArr);
                    bjvp.m104736a(a, "initializeToken", (bmrc) bjvp.m104733a(byteArrayExtra, (bxxk) bmrc.f130465f.mo74142c(7)));
                    awot.setArguments(a);
                } else {
                    BuyFlowConfig h2 = mo51881h();
                    byte[] bArr2 = this.f110325i;
                    String str2 = this.f94163b;
                    LogContext logContext2 = this.f94164c;
                    sdo.m34959a(bArr2);
                    awot awot2 = new awot();
                    Bundle a2 = awzk.m81653a(h2, str2, logContext2);
                    a2.putByteArray("genericParameters", bArr2);
                    awot2.setArguments(a2);
                    awot = awot2;
                }
                mo51866a(awot, (int) C0126R.C0129id.selector_fragment_holder);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo51858a(int i) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", 8);
        int i2 = this.f110326j;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            mo51859a(1, intent);
        } else if (i3 != 3) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            mo51859a(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            mo51859a(1, intent);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        GenericSelectorResult genericSelectorResult = (GenericSelectorResult) parcelable;
        Intent d = awce.m79602d(z);
        if (genericSelectorResult != null) {
            if (genericSelectorResult.mo59967c()) {
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", genericSelectorResult.f110324f);
            }
            if (genericSelectorResult.mo59966b()) {
                d.putExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS", genericSelectorResult.f110320b);
            }
            if (!genericSelectorResult.mo59966b() && !genericSelectorResult.mo59967c()) {
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", genericSelectorResult.f110321c);
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", genericSelectorResult.f110322d);
                bxtx bxtx = genericSelectorResult.f110323e;
                if (bxtx != null) {
                    d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_OPTION_TOKEN", bxtx.mo73780k());
                }
            }
        }
        mo51859a(-1, d);
    }
}
