package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BetterTogetherFeatureSupportIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11092a = jsy.m17256a("BetterTogetherFeatureSupportIntentOperation");

    public BetterTogetherFeatureSupportIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6739a(Context context) {
        return IntentOperation.getStartIntent(context, BetterTogetherFeatureSupportIntentOperation.class, "com.google.android.gms.auth.proximity.UPDATE_FEATURE_SUPPORT");
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        jta a = jsz.m17257a();
        boolean z3 = true;
        if (intent == null || !intent.hasExtra("com.google.android.gms.auth.proximity.FORCE_ENROLLMENT") || !intent.getBooleanExtra("com.google.android.gms.auth.proximity.FORCE_ENROLLMENT", false)) {
            z = false;
        } else {
            z = true;
        }
        if (ccig.f179039a.mo6606a().mo76015l()) {
            if (!ccig.f179039a.mo6606a().mo76006c() || !ssh.m36213a(this).mo26045d()) {
                z2 = false;
            } else {
                z2 = true;
            }
            bsni bsni = bsni.BETTER_TOGETHER_HOST;
            if (!ccig.f179039a.mo6606a().mo76011h()) {
                z3 = false;
            } else if (z2) {
                z3 = false;
            }
            a.getClass();
            m6740a(bsni, z3, new jil(a), this, z);
        }
        if (ccig.f179039a.mo6606a().mo76017n()) {
            boolean i = ccig.f179039a.mo6606a().mo76012i();
            bsni bsni2 = bsni.SMS_CONNECT_HOST;
            a.getClass();
            m6740a(bsni2, i, new jim(a), this, z);
        }
    }

    BetterTogetherFeatureSupportIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: a */
    private static void m6740a(bsni bsni, boolean z, jin jin, Context context, boolean z2) {
        try {
            for (Account account : gie.m13199d(context, "com.google")) {
                Status a = jql.m17129a(context, bsni, z, account, inl.m15759a(context), z2);
                String b = iov.m15809b(a.f30115i);
                if (a.mo17710c()) {
                    f11092a.mo25414c("setFeatureSupported for [%s] finished with status [%s].", bsni.name(), b);
                    jin.mo13762a(0);
                } else {
                    f11092a.mo25416d("Failed to setFeatureSupported for [%s] with status [%s].", bsni.name(), b);
                    jin.mo13762a(1);
                }
            }
        } catch (RemoteException | rfv | rfw e) {
            f11092a.mo25417e("Failed to get Accounts.", e, new Object[0]);
            jsw.m17254a().mo14033a(e);
        }
    }
}
