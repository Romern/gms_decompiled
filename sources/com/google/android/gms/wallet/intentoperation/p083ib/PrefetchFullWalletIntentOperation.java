package com.google.android.gms.wallet.intentoperation.p083ib;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.security.SecureRandom;
import java.util.Collections;

/* renamed from: com.google.android.gms.wallet.intentoperation.ib.PrefetchFullWalletIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PrefetchFullWalletIntentOperation extends IntentOperation {

    /* renamed from: a */
    private awrh f110263a;

    /* renamed from: b */
    private awua f110264b;

    /* renamed from: c */
    private SecureRandom f110265c;

    /* renamed from: d */
    private awsz f110266d;

    /* renamed from: e */
    private rjx f110267e;

    public PrefetchFullWalletIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m94034a(Context context, BuyFlowConfig buyFlowConfig, String str, String str2) {
        Intent startIntent = IntentOperation.getStartIntent(context, PrefetchFullWalletIntentOperation.class, "com.google.android.gms.wallet.ib.PREFETCH_FULL_WALLET");
        sef.m35071a(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
        startIntent.putExtra("googleTransactionId", str);
        startIntent.putExtra("merchantTransactionId", str2);
        return startIntent;
    }

    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        awtl awtl = new awtl(this, new awvy(this, new awgj(rpr.m34216b().getRequestQueue())));
        awrh a = awrh.m80776a();
        SecureRandom a2 = awvz.m81273a();
        awsz awsz = new awsz(applicationContext);
        this.f110263a = a;
        this.f110264b = awtl;
        this.f110265c = a2;
        this.f110266d = awsz;
        this.f110267e = rjx.m33696b(this);
    }

    public final void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) sef.m35067a(intent2, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            String stringExtra = intent2.getStringExtra("googleTransactionId");
            String stringExtra2 = intent2.getStringExtra("merchantTransactionId");
            byak a = this.f110266d.mo52546a(stringExtra);
            if (a != null) {
                IbBuyFlowInput a2 = IbBuyFlowInput.m94104a(a.f165274d);
                blzu blzu = a.f165276f;
                if (blzu == null) {
                    blzu = blzu.f128387j;
                }
                String str = blzu.f128390b;
                blzu blzu2 = a.f165276f;
                if (blzu2 == null) {
                    blzu2 = blzu.f128387j;
                }
                if (awrt.m80804a(a2, blzu2.f128390b) != 3) {
                    a2.mo59985b(5);
                    blzu blzu3 = a.f165276f;
                    if (blzu3 == null) {
                        blzu3 = blzu.f128387j;
                    }
                    if (blzu3.f128396h) {
                        awrh awrh = this.f110263a;
                        awwt awwt = new awwt(this, this.f110267e);
                        int a3 = a2.mo59974a(str);
                        aspb aspb = new aspb();
                        aspb.f89334a = this.f110265c.nextLong();
                        aspb.f89338e = Collections.singletonList(1);
                        asmk asmk = (asmk) awrh.mo52502b(new awsb(buyFlowConfig, awwt, str, stringExtra, a3, aspb.mo49317a()));
                        if (asmk.mo7183bo().mo17710c()) {
                            a2.mo59985b(5);
                            a2.mo59978a(awvz.m81272a(asmk.mo49242b(), 2));
                        } else {
                            return;
                        }
                    }
                    awrh awrh2 = this.f110263a;
                    awua awua = this.f110264b;
                    awrq awrq = new awrq();
                    awrq.f94930b = stringExtra2;
                    awrh2.mo52502b(new awrz(buyFlowConfig, awua, a2, awrq.mo52513a(), a.f165275e.mo73780k()));
                    return;
                }
                return;
            }
            new Object[1][0] = stringExtra;
        } catch (Throwable th) {
            awye.m81493a(getApplicationContext(), th);
        }
    }

    public PrefetchFullWalletIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
