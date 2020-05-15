package com.google.android.gms.wallet.p081ib;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import org.json.JSONException;

/* renamed from: com.google.android.gms.wallet.ib.IbPaymentRequestCompatChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IbPaymentRequestCompatChimeraActivity extends Activity {

    /* renamed from: d */
    public static final /* synthetic */ int f110221d = 0;

    /* renamed from: e */
    private static final String f110222e = awhg.m79946a("ibPaymentRequestCompat");

    /* renamed from: a */
    FullWallet f110223a;

    /* renamed from: b */
    MaskedWallet f110224b;

    /* renamed from: c */
    int f110225c = 0;

    /* renamed from: f */
    private BuyFlowConfig f110226f;

    /* renamed from: g */
    private LoadMaskedWalletServiceRequest f110227g;

    /* renamed from: h */
    private awhg f110228h;

    /* renamed from: i */
    private WebPaymentDataRequest f110229i;

    /* renamed from: j */
    private int f110230j;

    /* renamed from: k */
    private final awpc f110231k = new awmj(this);

    /* renamed from: a */
    public static Intent m93980a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.ib.IbPaymentRequestCompatActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        return intent2;
    }

    /* renamed from: b */
    private final void m93983b() {
        int i = this.f110225c;
        if (i == 0) {
            this.f110225c = 1;
            awpb awpb = mo59935a().f94357a;
            Message.obtain(((awou) awpb).f94784u, 47, this.f110227g).sendToTarget();
        } else if (i == 2) {
            this.f110225c = 3;
            awar awar = new awar(new FullWalletRequest());
            String str = this.f110224b.f109845a;
            FullWalletRequest fullWalletRequest = awar.f94140a;
            fullWalletRequest.f109795a = str;
            fullWalletRequest.f109797c = this.f110229i.f109909a;
            mo59935a().f94357a.mo52423a(new LoadFullWalletServiceRequest(this.f110227g.f110351a, fullWalletRequest, false));
        } else if (i == 4) {
            this.f110225c = 5;
            try {
                awbx a = WebPaymentData.m93795a();
                a.mo51838a(awrt.m80836a(this.f110223a));
                WebPaymentData webPaymentData = a.f94158a;
                Intent intent = new Intent();
                WebPaymentData.m93796a(intent, webPaymentData);
                m93982a(-1, intent);
            } catch (JSONException e) {
                mo59936a(8);
            }
        }
    }

    /* renamed from: c */
    private final void m93984c() {
        if (this.f110230j == -1) {
            this.f110230j = mo59935a().f94357a.mo52395a(this.f110231k);
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 8;
        if (i != 501) {
            if (i != 502) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                this.f110223a = (FullWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
                this.f110225c = 4;
                m93983b();
            } else if (i2 == 0) {
                m93982a(0, null);
            } else {
                if (intent != null) {
                    i3 = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8);
                }
                mo59936a(i3);
            }
        } else if (i2 == -1) {
            this.f110224b = (MaskedWallet) intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
            this.f110225c = 2;
            m93983b();
        } else if (i2 == 0) {
            m93982a(0, null);
        } else {
            if (intent != null) {
                i3 = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8);
            }
            mo59936a(i3);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f110226f = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.f110229i = (WebPaymentDataRequest) sef.m35067a(intent, "webPaymentDataRequest", WebPaymentDataRequest.CREATOR);
        this.f110227g = (LoadMaskedWalletServiceRequest) intent.getParcelableExtra("loadMaskedWalletServiceRequest");
        if (bundle != null) {
            this.f110225c = bundle.getInt("state");
            this.f110230j = bundle.getInt("serviceConnectionSavePoint");
            this.f110224b = (MaskedWallet) bundle.getParcelable("maskedWallet");
            this.f110223a = (FullWallet) bundle.getParcelable("fullWallet");
        } else {
            this.f110225c = 0;
            this.f110230j = -1;
        }
        if (mo59935a() == null) {
            BuyFlowConfig buyFlowConfig = this.f110226f;
            this.f110228h = awhg.m79945a(8, buyFlowConfig, buyFlowConfig.f110418b.f110407b);
            getSupportFragmentManager().beginTransaction().add(this.f110228h, f110222e).commit();
        }
        setFinishOnTouchOutside(false);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        m93984c();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo59935a().f94357a.mo52397a(this.f110231k, this.f110230j);
        this.f110230j = -1;
        m93983b();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m93984c();
        bundle.putInt("state", this.f110225c);
        bundle.putInt("serviceConnectionSavePoint", this.f110230j);
        MaskedWallet maskedWallet = this.f110224b;
        if (maskedWallet != null) {
            bundle.putParcelable("maskedWallet", maskedWallet);
        }
        FullWallet fullWallet = this.f110223a;
        if (fullWallet != null) {
            bundle.putParcelable("fullWallet", fullWallet);
        }
    }

    /* renamed from: a */
    public static Intent m93981a(BuyFlowConfig buyFlowConfig, WebPaymentDataRequest webPaymentDataRequest, LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        sdo.m34966a(buyFlowConfig, "buyFlowConfig is required");
        sdo.m34966a(webPaymentDataRequest, "request is required");
        Intent intent = new Intent("com.google.android.gms.wallet.ib.ACTION_COMPAT_LOAD_WEB_PAYMENT_DATA");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent.putExtra("loadMaskedWalletServiceRequest", loadMaskedWalletServiceRequest);
        sef.m35071a(webPaymentDataRequest, intent, "webPaymentDataRequest");
        return intent;
    }

    /* renamed from: a */
    private final void m93982a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final awhg mo59935a() {
        if (this.f110228h == null) {
            this.f110228h = (awhg) getSupportFragmentManager().findFragmentByTag(f110222e);
        }
        return this.f110228h;
    }

    /* renamed from: a */
    public final void mo59936a(int i) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        m93982a(1, intent);
    }

    /* renamed from: a */
    public final void mo59937a(LoadFullWalletServiceResponse loadFullWalletServiceResponse) {
        PendingIntent pendingIntent;
        Bundle bundle = loadFullWalletServiceResponse.f110348a;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(loadFullWalletServiceResponse.f110350c, pendingIntent);
        if (connectionResult.mo17670a()) {
            try {
                connectionResult.mo17669a(getContainerActivity(), 502);
            } catch (IntentSender.SendIntentException e) {
                mo59936a(8);
            }
        } else {
            FullWallet fullWallet = loadFullWalletServiceResponse.f110349b;
            if (fullWallet != null) {
                this.f110223a = fullWallet;
                this.f110225c = 4;
                m93983b();
                return;
            }
            mo59936a(loadFullWalletServiceResponse.f110350c);
        }
    }

    /* renamed from: a */
    public final void mo59938a(LoadMaskedWalletServiceResponse loadMaskedWalletServiceResponse) {
        PendingIntent pendingIntent;
        Bundle bundle = loadMaskedWalletServiceResponse.f110353a;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(loadMaskedWalletServiceResponse.f110355c, pendingIntent);
        if (connectionResult.mo17670a()) {
            try {
                connectionResult.mo17669a(getContainerActivity(), 501);
            } catch (IntentSender.SendIntentException e) {
                mo59936a(8);
            }
        } else {
            MaskedWallet maskedWallet = loadMaskedWalletServiceResponse.f110354b;
            if (maskedWallet != null) {
                this.f110224b = maskedWallet;
                this.f110225c = 2;
                m93983b();
                return;
            }
            mo59936a(loadMaskedWalletServiceResponse.f110355c);
        }
    }
}
