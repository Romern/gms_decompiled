package com.google.android.gms.wallet.p081ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationClosedEvent;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.analytics.events.OwMaskedWalletReceivedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwAccountChangedEvent;
import com.google.android.gms.wallet.analytics.events.OwMwUnsuccessfulEvent;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.buyflow.BuyFlowResult;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.IntermediatePaymentData;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.gms.wallet.intentoperation.AnalyticsIntentOperation;
import com.google.android.gms.wallet.intentoperation.p083ib.PrefetchFullWalletIntentOperation;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.google.android.gms.wallet.ib.IbChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IbChimeraActivity extends awce implements awhd, awgr, bjfg, aweq, awep {

    /* renamed from: y */
    public static final /* synthetic */ int f110201y = 0;

    /* renamed from: z */
    private static final String f110202z = awhg.m79946a("ibActivity");

    /* renamed from: A */
    private IbMerchantParameters f110203A;

    /* renamed from: B */
    private awhg f110204B;

    /* renamed from: i */
    public BuyFlowConfig f110205i;

    /* renamed from: j */
    public IbBuyFlowInput f110206j;

    /* renamed from: k */
    awpc f110207k = new awmh(this);

    /* renamed from: l */
    Bundle f110208l;

    /* renamed from: m */
    public ProcessBuyFlowResultResponse f110209m;

    /* renamed from: n */
    String f110210n;

    /* renamed from: o */
    boolean f110211o;

    /* renamed from: p */
    boolean f110212p;

    /* renamed from: q */
    int f110213q;

    /* renamed from: r */
    PaymentDataRequestUpdate f110214r;

    /* renamed from: s */
    long f110215s;

    /* renamed from: t */
    boolean f110216t = false;

    /* renamed from: u */
    PopoverView f110217u;

    /* renamed from: v */
    bjfh f110218v;

    /* renamed from: w */
    awer f110219w;

    /* renamed from: x */
    int f110220x = 1;

    /* renamed from: A */
    private final void m93942A() {
        if (mo59933y() == null) {
            this.f110204B = awhg.m79945a(8, this.f110205i, mo51878cn());
            getSupportFragmentManager().beginTransaction().add(this.f110204B, f110202z).commit();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: B */
    private final void m93943B() {
        mo59933y().f94357a.mo52397a(this.f110207k, this.f110213q);
        this.f110213q = -1;
    }

    /* renamed from: C */
    private final void m93944C() {
        if (this.f110213q == -1) {
            this.f110213q = mo59933y().f94357a.mo52395a(this.f110207k);
        }
    }

    /* renamed from: D */
    private final void m93945D() {
        if (!this.f110211o) {
            this.f110211o = true;
            awhf a = awhf.m79933a(mo51878cn(), awyd.m81489a(this.f110205i.f110418b));
            a.mo52167a((awhd) this);
            getSupportFragmentManager().beginTransaction().add(a, "RetrieveAuthTokensFragment").commit();
        }
    }

    /* renamed from: E */
    private final void m93946E() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    /* renamed from: a */
    public static Intent m93947a(BuyFlowConfig buyFlowConfig, byte[] bArr, byte[] bArr2, IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str) {
        sdo.m34966a(buyFlowConfig, "buyFlowConfig is required");
        sdo.m34966a(ibBuyFlowInput, "buyFlowInput is required");
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        if (bArr != null && bArr.length > 0) {
            bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        }
        bundle.putByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN", bArr2);
        bundle.putParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", m93948a(ibBuyFlowInput, ibMerchantParameters, str));
        Intent intent = new Intent("com.google.android.gms.wallet.ib.INSTANT_BUY");
        intent.setClassName(rpr.m34216b(), "com.google.android.gms.wallet.ib.IbActivity");
        if (((Boolean) awie.f94427w.mo58455c()).booleanValue()) {
            intent.putExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras", awsp.m80970a(bundle));
        } else {
            intent.putExtras(bundle);
        }
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    /* renamed from: b */
    private static blzw m93952b(BuyFlowResult buyFlowResult) {
        blzw blzw = blzw.f128403k;
        byte[] bArr = buyFlowResult.f110019d;
        return bArr != null ? (blzw) bjvp.m104733a(bArr, (bxxk) blzw.f128403k.mo74142c(7)) : blzw;
    }

    /* renamed from: c */
    private final void m93953c(int i, int i2) {
        m93949a(5, i, i2, 9);
        Intent intent = new Intent();
        int m = this.f110206j.mo60005m();
        int i3 = m - 1;
        if (m != 0) {
            if (i3 == 1 || i3 == 3) {
                awbb a = MaskedWallet.m93790a();
                a.mo51808a(this.f110206j.mo59994e());
                a.mo51809b(this.f110203A.f110343b);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", a.f94143a);
            } else if (i3 == 4) {
                awap a2 = FullWallet.m93786a();
                a2.mo51790a(this.f110206j.mo59994e());
                a2.mo51791b(this.f110203A.f110343b);
                intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a2.f94139a);
            }
            awfm.m79848a(this.f110205i, intent, i);
            setResult(1, intent);
            finish();
            return;
        }
        throw null;
    }

    /* renamed from: g */
    private final void m93954g(int i) {
        m93949a(4, -1, 0, i);
        setResult(0);
        finish();
    }

    /* renamed from: h */
    private final void m93955h(int i) {
        byte[] bArr;
        this.f110216t = true;
        if (i == 7) {
            mo59932f(7);
        } else if (mo51879e() != null && ((awer) mo51879e()).mo52031C()) {
            awer awer = (awer) mo51879e();
            if (awer.mo52031C()) {
                bArr = awer.f95398ak.f110468q.f128508g.mo73780k();
            } else {
                bArr = awer.f94220a;
            }
            if (bArr.length == 0) {
                mo59932f(8);
            } else {
                m93950a((blzk) bjvp.m104733a(bArr, (bxxk) blzk.f128350d.mo74142c(7)));
            }
        } else if (i == 9) {
            mo59931b(8, 1061);
        } else {
            m93954g(i);
        }
    }

    /* renamed from: i */
    private final void m93956i(int i) {
        this.f110217u.mo59875b(i);
    }

    /* renamed from: cn */
    public final Account mo51878cn() {
        return this.f110205i.f110418b.f110407b;
    }

    /* renamed from: d */
    public final void mo52162d(int i) {
        mo59931b(409, 1039);
    }

    /* renamed from: e */
    public final void mo52133e(int i) {
        m93955h(i);
    }

    /* renamed from: f */
    public final void mo59932f(int i) {
        mo59931b(i, 1);
    }

    public final void finish() {
        super.finish();
        if (chha.f188610a.mo6606a().mo85230a() && this.f110216t) {
            overridePendingTransition(0, 17432577);
        }
    }

    /* renamed from: h */
    public final BuyFlowConfig mo51881h() {
        return this.f110205i;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f110220x = 4;
            mo59934z();
        } else if (i2 != 0) {
            this.f110220x = 5;
            mo59931b(8, 1023);
        } else {
            this.f110220x = 3;
            m93954g(3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.ib.IbChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras")) {
                this.f110208l = (Bundle) awsp.m80966a(Bundle.CREATOR, getIntent().getStringExtra("com.google.android.gms.wallet.ib.IbActivity.transformedExtras"));
            } else {
                this.f110208l = intent.getExtras();
            }
        } else {
            this.f110208l = (Bundle) bundle.getParcelable("extras");
        }
        this.f110208l.setClassLoader(IbChimeraActivity.class.getClassLoader());
        Bundle bundle2 = (Bundle) this.f110208l.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS");
        sdo.m34966a(bundle2, "activityParams is required");
        if (bundle != null) {
            this.f110205i = (BuyFlowConfig) bundle.getParcelable("buyFlowConfig");
            this.f110206j = (IbBuyFlowInput) bundle.getParcelable("buyFlowInput");
            this.f110220x = bpij.m111956a(bundle.getInt("lockscreenStatus"));
        } else {
            this.f110205i = (BuyFlowConfig) this.f110208l.getParcelable("com.google.android.gms.wallet.buyFlowConfig");
            this.f110220x = 2;
            this.f110206j = (IbBuyFlowInput) bundle2.getParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory");
        }
        sdo.m34966a(this.f110205i, "buyFlowConfig is required");
        sdo.m34966a(this.f110206j, "buyFlowInput is required");
        this.f110203A = (IbMerchantParameters) bundle2.getParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters");
        this.f110210n = bundle2.getString("apiCallAnalyticsSessionId");
        mo51862a(bundle, awij.f94456d, 4, bpis.FLOW_TYPE_BUYFLOW);
        awia.m79981a((Activity) this, this.f110205i, awia.f94382d, true);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wallet_activity_checkout);
        mo8628aW().mo15853b(true);
        PopoverView popoverView = (PopoverView) findViewById(C0126R.C0129id.popover);
        this.f110217u = popoverView;
        if (popoverView != null) {
            PopoverView.m93901a(this);
            PopoverView popoverView2 = this.f110217u;
            popoverView2.f110100f = this;
            ApplicationParameters applicationParameters = this.f110205i.f110418b;
            popoverView2.mo59869a(applicationParameters.f110413h, applicationParameters.f110414i);
        }
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
        if (bundle != null) {
            this.f110209m = (ProcessBuyFlowResultResponse) bundle.getParcelable("processBuyFlowResultResponse");
            this.f110213q = bundle.getInt("serviceConnectionSavePoint");
            this.f110211o = bundle.getBoolean("hasAuthTokens");
            this.f110212p = bundle.getBoolean("processingBuyflowResult");
            this.f110216t = bundle.getBoolean("shouldOverrideExitAnimation");
            this.f110219w = (awer) mo51879e();
        } else {
            this.f110209m = null;
            this.f110213q = -1;
            this.f110211o = false;
            this.f110212p = false;
            byte[] byteArray = this.f110208l.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_BUY_FLOW_STATE_TOKEN");
            if (this.f110208l.containsKey("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                this.f110219w = awer.m79720a(this.f110208l.getByteArray("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN"), this.f110206j.mo59992d(), this.f110205i, this.f94163b, byteArray, this.f94164c);
            } else {
                this.f110219w = awer.m79733b(null, this.f110206j.mo59992d(), this.f110205i, this.f94163b, byteArray, this.f94164c);
            }
            m93945D();
            mo51866a(this.f110219w, (int) C0126R.C0129id.popover_content_holder);
        }
        m93942A();
        awer awer = this.f110219w;
        awer.f94244q = this;
        awer.f94245r = this;
        awpq.m80645a((dnx) this);
        this.f110218v = bjfh.m103300a(this, this, bundle);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f110218v.mo65283D();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        m93944C();
        this.f110218v.mo65281B();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        awhf awhf = (awhf) getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (awhf != null) {
            awhf.mo52167a((awhd) this);
        }
        m93943B();
        this.f110218v.mo65280A();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m93944C();
        this.f110218v.mo52015a(bundle);
        bundle.putParcelable("extras", this.f110208l);
        bundle.putParcelable("processBuyFlowResultResponse", this.f110209m);
        bundle.putBoolean("processingBuyflowResult", this.f110212p);
        bundle.putInt("serviceConnectionSavePoint", this.f110213q);
        bundle.putParcelable("buyFlowConfig", this.f110205i);
        bundle.putParcelable("buyFlowInput", this.f110206j);
        int i = this.f110220x;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("lockscreenStatus", i2);
            bundle.putBoolean("shouldOverrideExitAnimation", this.f110216t);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo51890q() {
        if (this.f110205i == null || (!chhy.f188634a.mo6606a().mo85248c().f165797a.contains(this.f110205i.f110419c) && !chhy.f188634a.mo6606a().mo85251f())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Intent mo51891r() {
        Intent a = awef.m79686a(this, 2, this.f110205i, getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0));
        a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS", (Bundle) this.f110208l.getParcelable("com.google.android.gms.wallet.firstparty.EXTRA_ACTIVITY_PARAMETERS"));
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
    }

    /* renamed from: w */
    public final void mo52163w() {
        m93946E();
    }

    /* renamed from: x */
    public final void mo52164x() {
        mo59931b(409, 1038);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final awhg mo59933y() {
        if (this.f110204B == null) {
            this.f110204B = (awhg) getSupportFragmentManager().findFragmentByTag(f110202z);
        }
        return this.f110204B;
    }

    /* renamed from: z */
    public final void mo59934z() {
        Intent intent;
        MaskedWallet maskedWallet;
        ProcessBuyFlowResultResponse processBuyFlowResultResponse = this.f110209m;
        if (processBuyFlowResultResponse.f110362b == 1) {
            BuyFlowConfig buyFlowConfig = this.f110205i;
            Intent intent2 = processBuyFlowResultResponse.f110363c;
            int i = 413;
            if (awfm.m79849a(buyFlowConfig)) {
                Status a = awah.m79564a(intent2);
                if (a != null) {
                    i = a.f30115i;
                }
            } else {
                i = intent2.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
            }
            int i2 = this.f110209m.f110365e;
            int i3 = i2 - 1;
            if (i2 != 0) {
                m93949a(5, i, i3, 9);
            } else {
                throw null;
            }
        } else {
            m93949a(2, -1, 0, 2);
        }
        ProcessBuyFlowResultResponse processBuyFlowResultResponse2 = this.f110209m;
        if (!(processBuyFlowResultResponse2.f110362b != -1 || (intent = processBuyFlowResultResponse2.f110363c) == null || (maskedWallet = (MaskedWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")) == null)) {
            startService(PrefetchFullWalletIntentOperation.m94034a(this, this.f110205i, maskedWallet.f109845a, maskedWallet.f109846b));
        }
        ProcessBuyFlowResultResponse processBuyFlowResultResponse3 = this.f110209m;
        setResult(processBuyFlowResultResponse3.f110362b, processBuyFlowResultResponse3.f110363c);
        finish();
    }

    /* renamed from: b */
    public final void mo51870b(int i) {
        if (this.f110212p) {
            m93956i(i);
        } else {
            super.mo51870b(i);
        }
    }

    /* renamed from: b */
    public final void mo59931b(int i, int i2) {
        int i3 = i2 - 1;
        if (i2 != 0) {
            m93953c(i, i3);
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo51874c(int i) {
        m93956i(i);
    }

    /* renamed from: a */
    public static Bundle m93948a(IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.buyFlowInputFactory", ibBuyFlowInput);
        bundle.putParcelable("com.google.android.gms.wallet.ib.IbActivity.merchantParameters", ibMerchantParameters);
        bundle.putString("apiCallAnalyticsSessionId", str);
        return bundle;
    }

    /* renamed from: a */
    private final void m93949a(int i, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        if (i6 != 0) {
            BuyFlowConfig buyFlowConfig = this.f110205i;
            String e = this.f110206j.mo59994e();
            int m = this.f110206j.mo60005m();
            int i7 = m - 1;
            if (m != 0) {
                int i8 = 3;
                if (i7 != 1) {
                    i8 = i7 != 3 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? 1 : 7 : 6 : 5 : 4;
                }
                ReportErrorChimeraIntentOperation.m94035a(buyFlowConfig, e, i8, i2, i3, this);
            } else {
                throw null;
            }
        }
        bjst.m104518a(this.f94164c, awga.m79886a(i), i5);
        AnalyticsIntentOperation.m94032a(this, new OrchestrationClosedEvent(i, i2, i4, mo51878cn().name, this.f94163b));
        int m2 = this.f110206j.mo60005m();
        int i9 = m2 - 1;
        if (m2 == 0) {
            throw null;
        } else if (i9 == 4) {
            String str = this.f110205i.f110418b.f110407b.name;
            BuyFlowConfig buyFlowConfig2 = this.f110205i;
            int i10 = this.f110220x;
            int i11 = i10 - 1;
            if (i10 != 0) {
                OwFullWalletRequestedEvent.m93832a(this, buyFlowConfig2, i, i2, i3, 0, 0, i11, str, this.f110206j.mo59994e());
                return;
            }
            throw null;
        } else if (i9 == 5) {
            BuyFlowConfig buyFlowConfig3 = this.f110205i;
            bxvd da = bpih.f137746i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpih bpih = (bpih) da.f164949b;
            bpih.f137749b = i - 1;
            int i12 = bpih.f137748a | 1;
            bpih.f137748a = i12;
            int i13 = 2 | i12;
            bpih.f137748a = i13;
            bpih.f137750c = i5;
            bpih.f137748a = i13 | 4;
            bpih.f137751d = i6;
            if (this.f110206j.mo59994e() != null) {
                String e2 = this.f110206j.mo59994e();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpih bpih2 = (bpih) da.f164949b;
                e2.getClass();
                bpih2.f137748a |= 8;
                bpih2.f137752e = e2;
            }
            int i14 = this.f110220x;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpih bpih3 = (bpih) da.f164949b;
            int i15 = i14 - 1;
            if (i14 != 0) {
                bpih3.f137753f = i15;
                bpih3.f137748a |= 16;
                bwev b = awrt.m80857b(((bwgv) this.f110206j.f110341c.f164949b).f159280d);
                if (b != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpih bpih4 = (bpih) da.f164949b;
                    b.getClass();
                    bpih4.f137755h = b;
                    bpih4.f137748a |= 64;
                }
                String a = awjn.m80013a(((bwgv) this.f110206j.f110341c.f164949b).f159279c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpih bpih5 = (bpih) da.f164949b;
                a.getClass();
                bpih5.f137748a |= 32;
                bpih5.f137754g = a;
                LoadWebPaymentDataCallEvent.m93812a(this, buyFlowConfig3, (bpih) da.mo74062i(), this.f110205i.f110418b.f110407b.name);
                return;
            }
            throw null;
        } else if (i9 == 6) {
            BuyFlowConfig buyFlowConfig4 = this.f110205i;
            bxvd da2 = bpig.f137738g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpig bpig = (bpig) da2.f164949b;
            bpig.f137741b = i - 1;
            int i16 = bpig.f137740a | 1;
            bpig.f137740a = i16;
            int i17 = 2 | i16;
            bpig.f137740a = i17;
            bpig.f137742c = i5;
            bpig.f137740a = i17 | 4;
            bpig.f137743d = i6;
            if (this.f110206j.mo59994e() != null) {
                String e3 = this.f110206j.mo59994e();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpig bpig2 = (bpig) da2.f164949b;
                e3.getClass();
                bpig2.f137740a |= 8;
                bpig2.f137744e = e3;
            }
            bwev a2 = awrt.m80816a(this.f110206j);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpig bpig3 = (bpig) da2.f164949b;
            a2.getClass();
            bpig3.f137745f = a2;
            bpig3.f137740a |= 16;
            LoadPaymentDataCallEvent.m93811a(this, buyFlowConfig4, (bpig) da2.mo74062i());
        } else if (i4 == 2) {
            int i18 = this.f110220x;
            int i19 = i18 - 1;
            if (i18 != 0) {
                OwMaskedWalletReceivedEvent.m93833a(this, i19, this.f110206j.mo59994e(), this.f110210n, -1);
                return;
            }
            throw null;
        } else {
            int i20 = this.f110220x;
            int i21 = i20 - 1;
            if (i20 != 0) {
                OwMwUnsuccessfulEvent.m93836a(this, i2, i, i3, i21, this.f110210n, this.f110206j.mo59994e());
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    private final void m93950a(blzk blzk) {
        if (!stm.m36302d(blzk.f128354c)) {
            awrt.m80846a(this.f110206j.mo59998g(), blzk.f128354c);
        }
        int a = blzj.m107806a(blzk.f128352a);
        if (a == 0) {
            a = 1;
        }
        m93953c(awrt.m80867d(a), blzk.f128353b);
    }

    /* renamed from: a */
    private final void m93951a(bpik bpik) {
        Context applicationContext = getApplicationContext();
        BuyFlowConfig buyFlowConfig = this.f110205i;
        SimpleAnalyticsEvent.m93844a(applicationContext, buyFlowConfig, bpik, buyFlowConfig.f110418b.f110407b);
    }

    /* renamed from: a */
    public final void mo51858a(int i) {
        m93955h(9);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        int i2;
        if (i == 101) {
            if (bjfd.mo65080a() != 0) {
                Log.e("IbChimeraActivity", String.format(Locale.US, "Callback Action failed with a status: %d", Integer.valueOf(bjfd.mo65080a())));
                this.f110219w.mo52052a(awrt.m80868d(""));
            }
            CallbackOutput callbackOutput = (CallbackOutput) bjfd.f122613a.getParcelableExtra("extra_callback_output");
            this.f110206j.mo59977a(awrt.m80812a(callbackOutput));
            bxvd da = bpid.f137722e.mo74144da();
            int i3 = callbackOutput.f110032b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpid bpid = (bpid) da.f164949b;
            int i4 = bpid.f137724a | 1;
            bpid.f137724a = i4;
            bpid.f137725b = i3;
            int i5 = callbackOutput.f110031a;
            bpid.f137724a = i4 | 2;
            bpid.f137726c = i5;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f110215s;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpid bpid2 = (bpid) da.f164949b;
            bpid2.f137724a |= 4;
            bpid2.f137727d = elapsedRealtime;
            bpid bpid3 = (bpid) da.mo74062i();
            int i6 = callbackOutput.f110032b;
            if (i6 != 1) {
                Log.e("IbChimeraActivity", String.format("Callback failed with status: %d; errorMessage: %s", Integer.valueOf(i6), callbackOutput.f110034d));
                bxvd da2 = bpik.f137757s.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpik bpik = (bpik) da2.f164949b;
                bpid3.getClass();
                bpik.f137776r = bpid3;
                bpik.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                m93951a((bpik) da2.mo74062i());
                awer awer = this.f110219w;
                int i7 = callbackOutput.f110031a;
                if (i7 == 1) {
                    i2 = 7;
                } else if (i7 == 2) {
                    i2 = 6;
                } else {
                    throw new IllegalArgumentException("Unknown callback type!");
                }
                String string = awer.getString(C0126R.string.wallet_uic_title_possibly_recoverable_error_dialog);
                String string2 = awer.getString(C0126R.string.wallet_uic_unknown_error);
                if (awer.f95427z != null) {
                    awer.getFragmentManager().beginTransaction().remove(awer.f95427z).commit();
                }
                awer.f95427z = bkcz.m105338a(2, string, string2, i2);
                bkcz bkcz = awer.f95427z;
                bkcz.f124032a = awer;
                bkcz.show(awer.getFragmentManager(), "PageFragment.ErrorDialog");
                return;
            }
            try {
                awru awru = new awru();
                PaymentDataRequestUpdate a = awrt.m80826a(callbackOutput, this.f110214r);
                this.f110214r = a;
                bwef a2 = awrt.m80814a(callbackOutput, a, awru);
                if (!awru.f94946a.isEmpty()) {
                    Log.e("IbChimeraActivity", String.format("callback output validation failed with the following error message: %s", TextUtils.join(", ", awru.f94946a)));
                    bxvd da3 = bpik.f137757s.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpik bpik2 = (bpik) da3.f164949b;
                    bpid3.getClass();
                    bpik2.f137776r = bpid3;
                    bpik2.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    m93951a((bpik) da3.mo74062i());
                    mo59931b(10, awru.f94947b);
                    return;
                }
                bxvd da4 = bpik.f137757s.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpik bpik3 = (bpik) da4.f164949b;
                bpid3.getClass();
                bpik3.f137776r = bpid3;
                bpik3.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                m93951a((bpik) da4.mo74062i());
                int i8 = callbackOutput.f110031a;
                if (i8 == 2) {
                    this.f110219w.mo52052a(a2);
                } else if (i8 == 1) {
                    awer awer2 = this.f110219w;
                    if ((a2.f158971a & 2) != 0) {
                        awer2.mo52808n(true);
                        bwee bwee = a2.f158975e;
                        if (bwee == null) {
                            bwee = bwee.f158964d;
                        }
                        awer2.mo52866a("", bwee.f158967b);
                        return;
                    }
                    awer2.mo52873af();
                }
            } catch (JSONException e) {
                Log.e("IbChimeraActivity", String.format("Error occurred while constructing client parameters : %s", e.getMessage()));
                bxvd da5 = bpik.f137757s.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpik bpik4 = (bpik) da5.f164949b;
                bpid3.getClass();
                bpik4.f137776r = bpid3;
                bpik4.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                m93951a((bpik) da5.mo74062i());
                mo59932f(10);
            }
        }
    }

    /* renamed from: a */
    public final void mo51860a(Account account) {
        m93944C();
        if (mo59933y() != null) {
            getSupportFragmentManager().beginTransaction().remove(this.f110204B).commit();
            getSupportFragmentManager().executePendingTransactions();
            this.f110204B = null;
        }
        m93946E();
        this.f110213q = -1;
        this.f110207k = new awmh(this);
        awxz a = ApplicationParameters.m94174a(this.f110205i.f110418b);
        a.mo52739a(account);
        ApplicationParameters applicationParameters = a.f95270a;
        awyb a2 = BuyFlowConfig.m94176a(this.f110205i);
        a2.mo52749a(applicationParameters);
        this.f110205i = a2.mo52748a();
        awqc.m80662a(this, new OwMwAccountChangedEvent(this.f110210n, account.name));
        this.f110211o = false;
        m93945D();
        m93942A();
        m93943B();
        awpb awpb = mo59933y().f94357a;
        Message.obtain(((awou) awpb).f94784u, 38, this.f110206j).sendToTarget();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        BuyFlowResult buyFlowResult = (BuyFlowResult) parcelable;
        blzw b = m93952b(buyFlowResult);
        if ((b.f128405a & 1) != 0) {
            blzk blzk = b.f128406b;
            if (blzk == null) {
                blzk = blzk.f128350d;
            }
            m93950a(blzk);
            return;
        }
        this.f110212p = true;
        awpb awpb = mo59933y().f94357a;
        Message.obtain(((awou) awpb).f94784u, 35, new ProcessBuyFlowResultRequest(this.f110206j, this.f110203A, buyFlowResult.f110020e, buyFlowResult.f110019d, buyFlowResult.f110021f)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo52028a(bwdp bwdp) {
        try {
            awey a = CallbackInput.m93870a();
            a.mo52089a(2);
            IntermediatePaymentData a2 = awrt.m80825a(bwdp);
            a2.f110036b = this.f110206j.f110339a;
            a.mo52090a(sef.m35074a(a2));
            bjfc a3 = awps.m80649a(a.f94254a, this.f110205i.f110419c);
            this.f110215s = SystemClock.elapsedRealtime();
            this.f110218v.mo65084a(101, a3);
        } catch (JSONException e) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "Callback failed while creating JSONObject for IntermediatePaymentData object for callback request: %s", e.getMessage()));
        }
    }

    /* renamed from: a */
    public final void mo52027a(BuyFlowResult buyFlowResult) {
        PaymentData a = awrt.m80823a(m93952b(buyFlowResult), this.f110205i.f110418b.f110407b.name, this.f110203A.f110344c, this.f110206j.mo60006n(), this.f110206j.mo59994e());
        a.f109883h = this.f110206j.f110339a;
        awey a2 = CallbackInput.m93870a();
        a2.mo52089a(1);
        a2.mo52090a(sef.m35074a(a));
        bjfc a3 = awps.m80649a(a2.f94254a, this.f110205i.f110419c);
        this.f110215s = SystemClock.elapsedRealtime();
        this.f110218v.mo65084a(101, a3);
    }
}
