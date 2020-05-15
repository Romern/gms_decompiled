package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeatureEnabledStateReconcilerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11128a = jsy.m17256a("FeatureEnabledStateReconciler");

    /* renamed from: b */
    private final jta f11129b = jsz.m17257a();

    public FeatureEnabledStateReconcilerIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6760a(Context context, Account account) {
        Intent startIntent = IntentOperation.getStartIntent(context, FeatureEnabledStateReconcilerIntentOperation.class, "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME", account.name);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        if (ccig.m129802b() && intent != null && "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE".equals(intent.getAction())) {
            Account account = new Account(intent.getStringExtra("EXTRA_ACCOUNT_NAME"), "com.google");
            int i = 1;
            if (!soz.m35791a(this, account)) {
                f11128a.mo25418e("Invalid account: %s", account.name);
                this.f11129b.mo14059o(0);
                return;
            }
            boolean a = jlf.m16865a(this).mo13850a(account);
            jta jta = this.f11129b;
            if (!a) {
                i = 2;
            }
            jta.mo14059o(i);
        }
    }

    public FeatureEnabledStateReconcilerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
