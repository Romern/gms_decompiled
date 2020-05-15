package com.google.android.gms.wallet.intentoperation.p083ib;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.intentoperation.ib.ReportErrorChimeraIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportErrorChimeraIntentOperation extends IntentOperation {

    /* renamed from: a */
    public awgj f110268a;

    /* renamed from: b */
    private Context f110269b;

    /* renamed from: c */
    private awra f110270c;

    /* renamed from: d */
    private ModuleManager f110271d;

    /* renamed from: e */
    private awpg f110272e;

    public ReportErrorChimeraIntentOperation() {
    }

    /* renamed from: a */
    public static void m94035a(BuyFlowConfig buyFlowConfig, String str, int i, int i2, int i3, Context context) {
        if (i2 != 7 && ((Boolean) awip.f94486f.mo58455c()).booleanValue()) {
            sdo.m34966a(buyFlowConfig, "buyFlowConfig is required");
            Intent startIntent = IntentOperation.getStartIntent(context, ReportErrorChimeraIntentOperation.class, "com.google.android.gms.wallet.ib.REPORT_ERROR");
            sef.m35071a(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
            startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.googleTransactionId", str);
            startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", i - 1);
            startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", i2);
            startIntent.putExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", i3);
            context.startService(startIntent);
        }
    }

    public final void onCreate() {
        this.f110269b = getApplicationContext();
        awra awra = new awra(this.f110269b);
        ModuleManager moduleManager = ModuleManager.get(this);
        awgj awgj = new awgj(rpr.m34216b().getRequestQueue());
        this.f110272e = new awpg(this, "ReportErrorIntentOp");
        this.f110270c = awra;
        this.f110271d = moduleManager;
        this.f110268a = awgj;
    }

    public final void onHandleIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) sef.m35067a(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
        bxvd da = blwa.f127905j.mo74144da();
        String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.googleTransactionId");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blwa blwa = (blwa) da.f164949b;
        stringExtra.getClass();
        blwa.f127907a |= 64;
        blwa.f127914h = stringExtra;
        int a = blvz.m107703a(intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.apiCall", 0));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blwa blwa2 = (blwa) da.f164949b;
        int i = a - 1;
        if (a != 0) {
            blwa2.f127913g = i;
            blwa2.f127907a |= 32;
            int intExtra = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.clientPublicErrorCode", 13);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwa blwa3 = (blwa) da.f164949b;
            blwa3.f127907a |= 16;
            blwa3.f127912f = intExtra;
            int intExtra2 = intent.getIntExtra("com.google.android.gms.wallet.service.ib.ReportErrorChimeraIntentOperation.internalErrorCode", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwa blwa4 = (blwa) da.f164949b;
            blwa4.f127907a |= 8;
            blwa4.f127911e = intExtra2;
            bwgu a2 = awrt.m80817a(this.f110270c.mo52470a(buyFlowConfig.f110419c));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwa blwa5 = (blwa) da.f164949b;
            a2.getClass();
            blwa5.f127910d = a2;
            blwa5.f127907a |= 4;
            rfi rfi = rfi.f42868a;
            int j = rfy.m33553j(this.f110269b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwa blwa6 = (blwa) da.f164949b;
            blwa6.f127907a |= 1;
            blwa6.f127908b = j;
            long j2 = (long) this.f110271d.getCurrentModule().moduleVersion;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blwa blwa7 = (blwa) da.f164949b;
            int i2 = blwa7.f127907a | 2;
            blwa7.f127907a = i2;
            blwa7.f127909c = j2;
            int i3 = buyFlowConfig.f110418b.f110406a;
            blwa7.f127907a = i2 | 128;
            blwa7.f127915i = i3;
            blwa blwa8 = (blwa) da.mo74062i();
            Account account = buyFlowConfig.f110418b.f110407b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            int a3 = blvz.m107703a(blwa8.f127913g);
            if (a3 == 0) {
                a3 = 1;
            }
            objArr[0] = Integer.valueOf(a3 - 1);
            objArr[1] = Integer.valueOf(blwa8.f127912f);
            objArr[2] = Integer.valueOf(blwa8.f127911e);
            Log.w("ReportErrorIntentOp", String.format(locale, "Reported %d.%d.%d", objArr));
            this.f110272e.mo52446a(new awnb(this, account, buyFlowConfig, blwa8));
            return;
        }
        throw null;
    }

    public ReportErrorChimeraIntentOperation(Context context) {
        attachBaseContext(context);
        this.f110269b = getApplicationContext();
    }
}
