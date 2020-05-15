package com.google.android.gms.wallet.intentoperation.setupwizard;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.service.orchestration.SetupWizardInitializeRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentsSetupWizardAccountChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String[] f110278a = {"com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardActivity", "com.google.android.gms.wallet.im.SetupWizardImRootActivity"};

    /* renamed from: b */
    awtz f110279b;

    /* renamed from: c */
    awxw f110280c;

    public PaymentsSetupWizardAccountChangeIntentOperation() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.wallet.intentoperation.setupwizard.PaymentsSetupWizardAccountChangeIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m94038a(boolean z) {
        for (String str : f110278a) {
            spn.m35856a((Context) this, str, z);
        }
    }

    public final void onCreate() {
        this.f110280c = new awxw(getApplicationContext());
    }

    public PaymentsSetupWizardAccountChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x019f, code lost:
        if (r3 != 2) goto L_0x01a1;
     */
    public final void onHandleIntent(Intent intent) {
        Log.i("PmtsSwAccountIntentOp", String.format(Locale.US, "Processing intent action=%s", intent.getAction()));
        int i = Build.VERSION.SDK_INT;
        if (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction()) && (!"com.google.android.gms.wallet.TEST_SETUP_WIZARD".equals(intent.getAction()) || !((Boolean) awjd.f94527c.mo58455c()).booleanValue())) {
            Log.i("PmtsSwAccountIntentOp", String.format(Locale.US, "Unsupported intent operation action=%s", intent.getAction()));
        } else if (C1221nn.m19678a(getResources().getConfiguration().locale) != 0) {
        } else {
            if (((Boolean) awjd.f94526b.mo58455c()).booleanValue() || !this.f110280c.f95266a.getBoolean("accountAdded", false)) {
                Account[] a = adyd.m51363a(this).mo33916a("com.google");
                Locale locale = Locale.US;
                int length = a.length;
                Log.i("PmtsSwAccountIntentOp", String.format(locale, "Sw accountsLength=%d", Integer.valueOf(length)));
                if (length != 0) {
                    this.f110280c.f95266a.edit().putBoolean("accountAdded", true).apply();
                    Account account = a[0];
                    awyb a2 = BuyFlowConfig.m94175a();
                    awxz a3 = ApplicationParameters.m94173a();
                    a3.mo52744b(((Integer) awjd.f94525a.mo58455c()).intValue());
                    a3.mo52739a(account);
                    a2.mo52749a(a3.f95270a);
                    a2.mo52751b(getPackageName());
                    a2.mo52752c("flow_setupwizard");
                    BuyFlowConfig a4 = a2.mo52748a();
                    bxvd da = bwgk.f159212d.mo74144da();
                    bmaj a5 = awfx.m79877a(this, null, a4, a4.f110419c, false, false);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwgk bwgk = (bwgk) da.f164949b;
                    a5.getClass();
                    bwgk.f159215b = a5;
                    bwgk.f159214a |= 1;
                    SetupWizardInitializeRequest setupWizardInitializeRequest = new SetupWizardInitializeRequest(account, (bwgk) da.mo74062i());
                    try {
                        if (this.f110279b == null) {
                            this.f110279b = new awvy(this, new awgj(rpr.m34216b().getRequestQueue()));
                        }
                        ServerResponse a6 = this.f110279b.mo52601a(a4, setupWizardInitializeRequest);
                        if (a6.mo60050c() != 42) {
                            Log.i("PmtsSwAccountIntentOp", String.format(Locale.US, "serverResponse with type=%d", Integer.valueOf(a6.mo60050c())));
                            return;
                        }
                        bwgn bwgn = (bwgn) a6.mo60052e();
                        bwgz a7 = bwgz.m121952a(bwgn.f159226g);
                        if (a7 == null) {
                            a7 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                        }
                        if (a7 != bwgz.CONTINUE_FLOW_WITH_NEW_PAGE) {
                            this.f110280c.mo52732a(account);
                            Locale locale2 = Locale.US;
                            Object[] objArr = new Object[1];
                            bwgz a8 = bwgz.m121952a(bwgn.f159226g);
                            if (a8 == null) {
                                a8 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                            }
                            objArr[0] = Integer.valueOf(a8.f159484u);
                            Log.i("PmtsSwAccountIntentOp", String.format(locale2, "Unexpected flow instruction=%d", objArr));
                            m94038a(false);
                            return;
                        }
                        int a9 = bwgm.m121938a(bwgn.f159224e);
                        if (a9 == 0) {
                        }
                        int a10 = bwgm.m121938a(bwgn.f159224e);
                        if (a10 != 0) {
                            if (a10 != 1) {
                                awxw awxw = this.f110280c;
                                bjwa a11 = bjwb.m104764a();
                                a11.mo65581a(bwgn);
                                a11.mo65580a(System.currentTimeMillis());
                                awxw.f95266a.edit().putString(awxw.m81465b(account), a11.toString()).apply();
                                m94038a(true);
                                return;
                            }
                        }
                        this.f110280c.mo52732a(account);
                        Log.i("PmtsSwAccountIntentOp", "No branding returned for SetupWizard InitializeRequest");
                        m94038a(false);
                    } catch (RemoteException e) {
                        Log.e("PmtsSwAccountIntentOp", "Error when calling initialize", e);
                    }
                }
            } else {
                Log.i("PmtsSwAccountIntentOp", "Account added has already been processed");
            }
        }
    }
}
