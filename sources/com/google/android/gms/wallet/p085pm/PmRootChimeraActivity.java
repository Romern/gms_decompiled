package com.google.android.gms.wallet.p085pm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: com.google.android.gms.wallet.pm.PmRootChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PmRootChimeraActivity extends awce implements View.OnFocusChangeListener {

    /* renamed from: i */
    private Toolbar f110313i;

    /* renamed from: j */
    private View f110314j;

    /* renamed from: k */
    private SecurePaymentsPayload f110315k;

    /* renamed from: l */
    private byte[] f110316l;

    /* renamed from: m */
    private byte[] f110317m;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        PmResult pmResult = (PmResult) parcelable;
        Intent d = awce.m79602d(z);
        if (pmResult != null) {
            String str = pmResult.f110309b;
            if (!TextUtils.isEmpty(str)) {
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", str);
            }
            byte[] bArr = pmResult.f110310c;
            if (bArr != null && bArr.length > 0) {
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
            SecurePaymentsPayload securePaymentsPayload = pmResult.f110308a;
            if (securePaymentsPayload != null) {
                d.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
            }
            String str2 = pmResult.f110311d;
            if (str2 != null) {
                d.putExtra("com.google.android.gms.wallet.firstparty.REAL_PAN", str2);
            }
            bwel bwel = pmResult.f110312e;
            if (bwel != null) {
                d.putExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT", bwel.mo73642k());
            }
        }
        mo51859a(-1, d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.pm.PmRootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a9  */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        awom awom;
        Intent intent = getIntent();
        awia.m79981a((Activity) this, mo51881h(), awia.f94384f, false);
        byte[] bArr2 = new byte[0];
        if (C1710chip.m148790b()) {
            SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
            this.f110315k = securePaymentsPayload;
            if (securePaymentsPayload != null) {
                bwjx bwjx = ((bwkc) bjvp.m104733a(securePaymentsPayload.f110176a, (bxxk) bwkc.f159947g.mo74142c(7))).f159951c;
                if (bwjx == null) {
                    bwjx = bwjx.f159888j;
                }
                bmaq bmaq = bwjx.f159892c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                bArr = bmaq.f128484d.mo73780k();
                mo51863a(bundle, awij.f94455c, 3, bpis.FLOW_TYPE_PURCHASE_MANAGER, bArr);
                super.onCreate(bundle);
                awcf.m79641a((dnx) this);
                setContentView((int) C0126R.C0128layout.wallet_activity_purchase_manager);
                if (!C1710chip.m148790b()) {
                    this.f110315k = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
                }
                this.f110316l = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                this.f110317m = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
                Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.purchase_manager_toolbar);
                this.f110313i = toolbar;
                mo8626a(toolbar);
                mo8628aW().mo15853b(false);
                View findViewById = findViewById(C0126R.C0129id.focus_stealer);
                this.f110314j = findViewById;
                findViewById.setOnFocusChangeListener(this);
                if (((awom) mo51879e()) == null) {
                    if (this.f110315k != null) {
                        BuyFlowConfig h = mo51881h();
                        String str = this.f94163b;
                        SecurePaymentsPayload securePaymentsPayload2 = this.f110315k;
                        LogContext logContext = this.f94164c;
                        awom = new awom();
                        Bundle a = awzk.m81653a(h, str, logContext);
                        a.putParcelable("securePaymentsPayload", securePaymentsPayload2);
                        awom.setArguments(a);
                    } else if (this.f110316l != null) {
                        BuyFlowConfig h2 = mo51881h();
                        String str2 = this.f94163b;
                        byte[] bArr3 = this.f110316l;
                        LogContext logContext2 = this.f94164c;
                        awom = new awom();
                        Bundle a2 = awzk.m81653a(h2, str2, logContext2);
                        a2.putByteArray("encryptedParameters", bArr3);
                        awom.setArguments(a2);
                    } else {
                        BuyFlowConfig h3 = mo51881h();
                        String str3 = this.f94163b;
                        byte[] bArr4 = this.f110317m;
                        LogContext logContext3 = this.f94164c;
                        awom = new awom();
                        Bundle a3 = awzk.m81653a(h3, str3, logContext3);
                        a3.putByteArray("unencryptedParameters", bArr4);
                        awom.setArguments(a3);
                    }
                    mo51866a(awom, (int) C0126R.C0129id.purchase_manager_container);
                }
                awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
            }
        }
        bArr = bArr2;
        mo51863a(bundle, awij.f94455c, 3, bpis.FLOW_TYPE_PURCHASE_MANAGER, bArr);
        super.onCreate(bundle);
        awcf.m79641a((dnx) this);
        setContentView((int) C0126R.C0128layout.wallet_activity_purchase_manager);
        if (!C1710chip.m148790b()) {
        }
        this.f110316l = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.f110317m = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        Toolbar toolbar2 = (Toolbar) findViewById(C0126R.C0129id.purchase_manager_toolbar);
        this.f110313i = toolbar2;
        mo8626a(toolbar2);
        mo8628aW().mo15853b(false);
        View findViewById2 = findViewById(C0126R.C0129id.focus_stealer);
        this.f110314j = findViewById2;
        findViewById2.setOnFocusChangeListener(this);
        if (((awom) mo51879e()) == null) {
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
    }

    public final void onFocusChange(View view, boolean z) {
        if (z && view == this.f110314j) {
            bkfr.m105559a(this, view);
        }
    }
}
