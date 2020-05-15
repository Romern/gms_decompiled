package com.google.android.gms.wallet.intentoperation.p083ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: com.google.android.gms.wallet.intentoperation.ib.ReportFacilitatedTransactionChimeraIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportFacilitatedTransactionChimeraIntentOperation extends IntentOperation {

    /* renamed from: a */
    public awgj f110273a;

    /* renamed from: b */
    private awpg f110274b;

    public ReportFacilitatedTransactionChimeraIntentOperation() {
    }

    public final void onCreate() {
        awgj awgj = new awgj(rpr.m34216b().getRequestQueue());
        this.f110274b = new awpg(this, "ReportTxnIntentOp");
        this.f110273a = awgj;
    }

    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) sef.m35067a(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        bxvd da = blwc.f127918c.mo74144da();
        bxtx a = bxtx.m123261a(intent.getByteArrayExtra("com.google.android.gms.wallet.service.ib.ReportFacilitatedTransactionChimeraIntentOperation.transactionCompletionToken"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blwc blwc = (blwc) da.f164949b;
        a.getClass();
        blwc.f127920a |= 2;
        blwc.f127921b = a;
        Account account = buyFlowConfig.f110418b.f110407b;
        Log.i("ReportTxnIntentOp", "Reported facilitated transaction.");
        this.f110274b.mo52446a(new awnc(this, account, buyFlowConfig, (blwc) da.mo74062i()));
    }

    public ReportFacilitatedTransactionChimeraIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
