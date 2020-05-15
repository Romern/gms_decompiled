package com.google.android.gms.wallet.buyflow;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.common.p079ui.BottomSheetView;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckoutChimeraActivity extends awce implements awhd, bkcy, awgr, aweo {

    /* renamed from: i */
    int f110023i;

    /* renamed from: j */
    bkcz f110024j;

    /* renamed from: k */
    PopoverView f110025k;

    /* renamed from: l */
    BottomSheetView f110026l;

    /* renamed from: m */
    Toolbar f110027m;

    /* renamed from: n */
    private boolean f110028n;

    /* renamed from: A */
    private final boolean m93848A() {
        return mo51881h().f110418b.f110415j == 1;
    }

    /* renamed from: a */
    static int m93849a(Context context, BuyFlowConfig buyFlowConfig) {
        boolean z;
        boolean z2;
        WalletCustomTheme walletCustomTheme = buyFlowConfig.f110418b.f110411f;
        if (walletCustomTheme == null || walletCustomTheme.f110169b.getInt("windowTransitionsStyle", -1) != 4) {
            z = false;
        } else {
            z = true;
        }
        if (!awia.m79986a(context.getResources()) || !((Boolean) awih.f94442c.mo58455c()).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean a = chfw.f188574a.mo6606a().mo85204a();
        if (z && z2) {
            return 2;
        }
        if (z) {
            return 3;
        }
        if (!z2) {
            return !a ? 0 : 4;
        }
        return 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity.a(int, int, int, boolean):android.content.Intent
     arg types: [int, int, int, int]
     candidates:
      awce.a(android.os.Bundle, bdyx, int, bpis):void
      com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity.a(int, int, int, boolean):android.content.Intent */
    /* renamed from: f */
    private final void m93852f(int i) {
        Intent a = m93850a(5, i, 9, false);
        a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        setResult(1, a);
        StringBuilder sb = new StringBuilder(40);
        sb.append("sendErrorAndFinish errorCode=");
        sb.append(i);
        sb.toString();
        finish();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity.a(int, int, int, boolean):android.content.Intent
     arg types: [int, int, int, int]
     candidates:
      awce.a(android.os.Bundle, bdyx, int, bpis):void
      com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity.a(int, int, int, boolean):android.content.Intent */
    /* renamed from: g */
    private final void m93853g(int i) {
        setResult(0, m93850a(4, 0, i, false));
        finish();
    }

    /* renamed from: z */
    private final void m93854z() {
        awer awer;
        if (!awyf.m81495a(this)) {
            if (this.f110024j != null) {
                getSupportFragmentManager().beginTransaction().remove(this.f110024j).commit();
            }
            bkcz a = bkcz.m105336a();
            this.f110024j = a;
            a.f124032a = this;
            a.show(getSupportFragmentManager(), "CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
            return;
        }
        if (!this.f110028n) {
            this.f110028n = true;
            getSupportFragmentManager().beginTransaction().add(awhf.m79933a(mo51878cn(), awyd.m81489a(mo51881h().f110418b)), "RetrieveAuthTokensFragment").commit();
        }
        Intent intent = getIntent();
        if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
            awer = awer.m79720a(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), null, mo51881h(), this.f94163b, null, this.f94164c);
        } else if (intent.getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS")) {
            awer = awer.m79733b(intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS"), intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS"), mo51881h(), this.f94163b, null, this.f94164c);
        } else {
            throw new IllegalArgumentException("CheckoutChimeraActivity requires either buyflow params or InitializeResponse token");
        }
        mo51866a(awer, (int) C0126R.C0129id.popover_content_holder);
    }

    /* renamed from: c */
    public final void mo51874c(int i) {
        if (this.f110025k != null) {
            if (awia.m79986a(getResources())) {
                m93853g(i);
            } else {
                this.f110025k.mo59875b(i);
            }
        } else if (this.f110026l != null) {
            mo59823y();
            findViewById(C0126R.C0129id.bottom_sticky_button_container).setVisibility(8);
            BottomSheetView bottomSheetView = this.f110026l;
            bottomSheetView.f110056l = i;
            bottomSheetView.f110048d = true;
            BottomSheetBehavior bottomSheetBehavior = bottomSheetView.f110053i;
            bottomSheetBehavior.f151097k = true;
            bottomSheetBehavior.mo71035b(true);
            awgr awgr = bottomSheetView.f110055k;
            if (awgr != null) {
                awgr.mo52133e(i);
            }
        } else {
            m93853g(i);
        }
    }

    /* renamed from: d */
    public final void mo52162d(int i) {
        m93852f(-1);
    }

    /* renamed from: e */
    public final void mo52133e(int i) {
        m93853g(i);
    }

    public final void finish() {
        super.finish();
        if (this.f110023i == 3) {
            overridePendingTransition(0, awia.m79965a(mo51881h()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.buyflow.CheckoutChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        BuyFlowConfig h = mo51881h();
        if (!mo51890q()) {
            int a = m93849a(this, h);
            this.f110023i = a;
            awia.m79981a((Activity) this, h, (a == 1 || a == 2 || a == 3) ? awia.f94383e : a != 4 ? awia.f94380b : awia.f94381c, true);
        }
        mo51862a(bundle, awij.f94453a, 1, bpis.FLOW_TYPE_BUYFLOW);
        super.onCreate(bundle);
        if (!mo51890q()) {
            int i = this.f110023i;
            if (i == 1 || i == 2 || i == 3) {
                setContentView((int) C0126R.C0128layout.wallet_activity_checkout_fullscreen);
                Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.buyflow_toolbar);
                this.f110027m = toolbar;
                mo8626a(toolbar);
            } else if (i != 4) {
                setContentView((int) C0126R.C0128layout.wallet_activity_checkout);
                TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.colorWalletActionBarForeground});
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                Drawable a2 = C1163lk.m19268a(getResources(), (int) C0126R.C0127drawable.quantum_ic_clear_white_24, getTheme());
                if (!(color == 0 || a2 == null)) {
                    C1173lt.m19599a(a2, color);
                    mo8628aW().mo15856c(a2);
                    mo8628aW().mo15865f((int) C0126R.string.close_button_label);
                }
            } else {
                setContentView((int) C0126R.C0128layout.wallet_activity_checkout_bottom_sheet);
                Toolbar toolbar2 = (Toolbar) findViewById(C0126R.C0129id.buyflow_toolbar);
                this.f110027m = toolbar2;
                mo8626a(toolbar2);
                mo59823y();
            }
            mo8628aW().mo15853b(true);
            BottomSheetView bottomSheetView = (BottomSheetView) findViewById(C0126R.C0129id.bottom_sheet);
            this.f110026l = bottomSheetView;
            if (bottomSheetView != null) {
                boolean A = m93848A();
                double d = h.f110418b.f110413h;
                if (A) {
                    bottomSheetView.setVisibility(8);
                }
                bottomSheetView.f110050f = d;
                bottomSheetView.f110053i = new BottomSheetBehavior();
                ((aip) bottomSheetView.getLayoutParams()).mo787a(bottomSheetView.f110053i);
                bottomSheetView.f110053i.mo71029a(new awgn(bottomSheetView));
                bottomSheetView.f110053i.mo71037c(4);
                bottomSheetView.f110053i.mo71035b(false);
                this.f110026l.f110055k = this;
            }
            PopoverView popoverView = (PopoverView) findViewById(C0126R.C0129id.popover);
            this.f110025k = popoverView;
            if (popoverView != null) {
                if (m93848A()) {
                    this.f110025k.setVisibility(8);
                }
                PopoverView.m93901a(this);
                PopoverView popoverView2 = this.f110025k;
                popoverView2.f110100f = this;
                ApplicationParameters applicationParameters = h.f110418b;
                popoverView2.mo59869a(applicationParameters.f110413h, applicationParameters.f110414i);
            }
            if (bundle != null) {
                this.f110028n = bundle.getBoolean("hasAuthTokens");
                if (bundle.getBoolean("initializeProgressSpinnerVisible")) {
                    mo52026a(true);
                }
            } else {
                m93854z();
            }
            awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (mo51879e() != null) {
            ((awer) mo51879e()).mo52058b(intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        bkcz bkcz = (bkcz) getSupportFragmentManager().findFragmentByTag("CheckoutChimeraActivity.NETWORK_ERROR_DIALOG");
        this.f110024j = bkcz;
        if (bkcz != null) {
            bkcz.f124032a = this;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasAuthTokens", this.f110028n);
        View findViewById = findViewById(C0126R.C0129id.initialize_progress_spinner);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("initializeProgressSpinnerVisible", z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo51890q() {
        BuyFlowConfig h = mo51881h();
        return h != null && chfd.f188555a.mo85191b().mo85192a().f165797a.contains(h.f110419c) && getIntent().getExtras().containsKey("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Intent mo51891r() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        Intent a = awef.m79686a(this, 1, mo51881h(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0));
        a.putExtra("encryptedParams", byteArrayExtra);
        return a;
    }

    /* renamed from: t */
    public final void mo52134t() {
        mo51870b(4);
    }

    /* renamed from: u */
    public final void mo52135u() {
        if (mo51879e() != null) {
            ((awer) mo51879e()).mo52030B();
        }
    }

    /* renamed from: v */
    public final void mo52136v() {
        if (this.f110026l != null) {
            mo8628aW().mo15859d();
            int[] iArr = {16842801, C0126R.attr.colorPrimaryDark};
            Arrays.sort(iArr);
            TypedArray obtainStyledAttributes = obtainStyledAttributes(iArr);
            int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, 16842801), -1);
            int color2 = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, (int) C0126R.attr.colorPrimaryDark), -16777216);
            obtainStyledAttributes.recycle();
            getWindow().getDecorView().setBackgroundColor(color);
            int i = Build.VERSION.SDK_INT;
            getWindow().setStatusBarColor(color2);
        }
    }

    /* renamed from: w */
    public final void mo52163w() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    /* renamed from: x */
    public final void mo52164x() {
        m93853g(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo59823y() {
        this.f110027m.setVisibility(4);
        getWindow().getDecorView().setBackgroundColor(0);
        int i = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(0);
    }

    /* renamed from: a */
    private final Intent m93850a(int i, int i2, int i3, boolean z) {
        Intent d = awce.m79602d(z);
        bpil a = AnalyticsIntentOperation.m94032a(this, new OrchestrationClosedEvent(i, i2, i3, mo51878cn() != null ? mo51878cn().name : "", this.f94163b));
        if (a != null) {
            bxwc bxwc = a.f137779a;
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                bpik bpik = (bpik) bxwc.get(i4);
                bphe bphe = bpik.f137766h;
                if (bphe == null) {
                    bphe = bphe.f137630n;
                }
                if (bphe.f137635d.size() != 0) {
                    bphe bphe2 = bpik.f137766h;
                    if (bphe2 == null) {
                        bphe2 = bphe.f137630n;
                    }
                    bxwc bxwc2 = bphe2.f137635d;
                    int size2 = bxwc2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        bphh bphh = (bphh) bxwc2.get(i5);
                        bxvd bxvd = (bxvd) bphh.mo74142c(5);
                        bxvd.mo73625a((bxvk) bphh);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bphh bphh2 = (bphh) bxvd.f164949b;
                        bphh bphh3 = bphh.f137646f;
                        bphh2.f137648a &= -9;
                        bphh2.f137652e = bphh.f137646f.f137652e;
                        bphh bphh4 = (bphh) bxvd.mo74062i();
                    }
                }
            }
        }
        bjvp.m104735a(d, "com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", a);
        byte[] bArr = this.f94165d;
        if (bArr != null && bArr.length > 0) {
            d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", bArr);
        }
        bjst.m104518a(this.f94164c, awga.m79886a(i), i2);
        return d;
    }

    /* renamed from: a */
    public static Intent m93851a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        sdo.m34959a(buyFlowConfig);
        sdo.m34959a(buyFlowConfig.f110418b);
        sdo.m34974b(!buyFlowConfig.f110418b.f110409d);
        if (!((Boolean) awig.f94436b.mo58455c()).booleanValue()) {
            return axdg.m82385a(context, intent, buyFlowConfig);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.buyflow.CheckoutActivity");
        intent2.putExtras(intent.getExtras());
        intent2.setAction("com.google.android.gms.wallet.ACTION_CHECKOUT");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        int a = m93849a(context, buyFlowConfig);
        if (a == 2 || a == 3 || a == 4) {
            return intent2;
        }
        intent2.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        return intent2;
    }

    /* renamed from: a */
    public final void mo51858a(int i) {
        m93852f(i);
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        if (i2 != 1000) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown error dialog error code: ");
            sb.append(i2);
            Log.e("CheckoutChimeraActivity", sb.toString());
            m93852f(-1);
        } else if (i != 1) {
            m93853g(7);
        } else {
            m93854z();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        BuyFlowResult buyFlowResult = (BuyFlowResult) parcelable;
        Intent a = m93850a(2, 0, 2, z);
        if (buyFlowResult != null) {
            byte[] bArr = buyFlowResult.f110019d;
            if (bArr != null) {
                a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
            if (!TextUtils.isEmpty(buyFlowResult.f110017b)) {
                a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", buyFlowResult.f110017b);
            }
            if (!TextUtils.isEmpty(buyFlowResult.f110018c)) {
                a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_DISPLAY_MESSAGE", buyFlowResult.f110018c);
            }
            byte[] bArr2 = buyFlowResult.f110022g;
            if (bArr2 != null) {
                a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", bArr2);
            }
            Object[] objArr = {buyFlowResult.f110017b, buyFlowResult.f110018c};
        }
        setResult(-1, a);
        finish();
    }

    /* renamed from: a */
    public final void mo52026a(boolean z) {
        View findViewById;
        int i;
        if (m93848A() && (findViewById = findViewById(C0126R.C0129id.initialize_progress_spinner)) != null) {
            if (!z) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
