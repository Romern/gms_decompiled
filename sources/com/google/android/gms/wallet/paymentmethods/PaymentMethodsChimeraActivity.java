package com.google.android.gms.wallet.paymentmethods;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.firstparty.bootstrap.PaymentMethodsWidgetOptions;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentMethodsChimeraActivity extends awce {

    /* renamed from: i */
    Toolbar f110307i;

    /* renamed from: a */
    public static Intent m94078a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.paymentmethods.PaymentMethodsActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_PAYMENT_METHODS");
        return intent2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awce.a(android.os.Parcelable, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      awce.a(int, android.content.Intent):void
      awce.a(android.view.View, rx):void
      awce.a(awzk, int):void
      awce.a(bmoc, boolean):void
      awib.a(bmoc, boolean):void
      awym.a(android.view.View, rx):void
      awce.a(android.os.Parcelable, boolean):void */
    /* renamed from: b */
    public final void mo51870b(int i) {
        awog awog = (awog) mo51879e();
        if (awog != null) {
            awog.mo52873af();
        } else {
            mo51864a((Parcelable) null, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.paymentmethods.PaymentMethodsChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        byte[] bArr2;
        Intent intent = getIntent();
        awia.m79981a((Activity) this, mo51881h(), awia.f94386h, false);
        mo51862a(bundle, awij.f94458f, 6, bpis.FLOW_TYPE_PAYMENT_METHODS);
        super.onCreate(bundle);
        awcf.m79641a((dnx) this);
        setContentView((int) C0126R.C0128layout.wallet_activity_common);
        Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.toolbar);
        this.f110307i = toolbar;
        mo8626a(toolbar);
        mo8628aW().mo15853b(true);
        awog awog = (awog) mo51879e();
        if (awog == null) {
            Bundle extras = intent.getExtras();
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
                bArr2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                bArr = null;
            } else if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS")) {
                bArr = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
                bArr2 = null;
            } else {
                throw new IllegalArgumentException("PaymentMethodsChimeraActivity requires either encrypted or unencrypted params");
            }
            String[] strArr = new String[0];
            PendingIntent[] pendingIntentArr = new PendingIntent[0];
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_ACTION_ID") && extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PENDING_INTENT")) {
                strArr = intent.getStringArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_ACTION_ID");
                pendingIntentArr = awia.m79994a(intent.getParcelableArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PENDING_INTENT"));
            }
            String[] strArr2 = strArr;
            PendingIntent[] pendingIntentArr2 = pendingIntentArr;
            boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_LAUNCH_ADD_INSTRUMENT_WHEN_NO_FOP", false);
            if (!booleanExtra) {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.EXTRA_WIDGET_OPTIONS");
                if (parcelableExtra instanceof PaymentMethodsWidgetOptions) {
                    booleanExtra = ((PaymentMethodsWidgetOptions) parcelableExtra).f110173a;
                }
            }
            boolean z = booleanExtra;
            if (extras.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                if (bArr2 != null) {
                    BuyFlowConfig h = mo51881h();
                    String str = this.f94163b;
                    LogContext logContext = this.f94164c;
                    sdo.checkIfNull(bArr2, "Encrypted params must not be null");
                    sdo.checkIfNull(byteArrayExtra, "Initialization token must not be null");
                    awog = awog.m80409a(h, bArr2, null, byteArrayExtra, strArr2, pendingIntentArr2, z, str, logContext);
                } else {
                    BuyFlowConfig h2 = mo51881h();
                    String str2 = this.f94163b;
                    LogContext logContext2 = this.f94164c;
                    sdo.checkIfNull(bArr, "Unencrypted params must not be null");
                    sdo.checkIfNull(byteArrayExtra, "Initialization token must not be null");
                    awog = awog.m80409a(h2, null, bArr, byteArrayExtra, strArr2, pendingIntentArr2, z, str2, logContext2);
                }
            } else if (bArr2 != null) {
                BuyFlowConfig h3 = mo51881h();
                String str3 = this.f94163b;
                LogContext logContext3 = this.f94164c;
                sdo.checkIfNull(bArr2, "Encrypted params must not be null");
                awog = awog.m80409a(h3, bArr2, null, null, strArr2, pendingIntentArr2, z, str3, logContext3);
            } else if (bArr != null) {
                BuyFlowConfig h4 = mo51881h();
                String str4 = this.f94163b;
                LogContext logContext4 = this.f94164c;
                sdo.checkIfNull(bArr, "Unencrypted params must not be null");
                awog = awog.m80409a(h4, null, bArr, null, strArr2, pendingIntentArr2, z, str4, logContext4);
            }
            mo51866a(awog, (int) C0126R.C0129id.fragment_holder);
        }
    }
}
