package com.google.android.gms.tapandpay.keyguard;

import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyguardDismissedIntentOperation extends asjx {

    /* renamed from: a */
    private static final srn f108608a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[Catch:{ asks | RuntimeException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7 A[Catch:{ asks | RuntimeException -> 0x00b3 }] */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        try {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (intent.getBooleanExtra("com.google.android.gms.tapandpay.keyguard.EXTRA_MANUAL_UNLOCK", false)) {
                    new atkm(this).mo50011a(elapsedRealtime);
                } else if (atcx.m75568a(this, askc.m74272b())) {
                    if (!asjk.m74227a()) {
                        if (!new aszt(this).mo49721a(elapsedRealtime)) {
                            return;
                        }
                    }
                    int i = Build.VERSION.SDK_INT;
                    try {
                        if (atak.m75290b("android_pay_recent_unlock_key_2")) {
                            new atkm(this).mo50011a(elapsedRealtime);
                            bnsl a = f108608a.mo26019b(aske.m74275a());
                            a.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a.mo68415a("onHandleIntent: unlock detected at %s", elapsedRealtime);
                        }
                    } catch (atag e) {
                        e = e;
                        bnsl a2 = f108608a.mo26019b(aske.m74275a());
                        a2.mo68437a(e);
                        a2.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a2.mo68405a("Key missing or invalidated");
                        if (asjk.m74228b(this)) {
                            bnsl a3 = f108608a.mo26019b(aske.m74275a());
                            a3.mo68437a(e);
                            a3.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a3.mo68405a("Password strength insufficient");
                            asjj.m74222b(this);
                            return;
                        }
                        aszy.m75272c(this);
                        athu.m75913a(this);
                    } catch (ataf e2) {
                        e = e2;
                        bnsl a22 = f108608a.mo26019b(aske.m74275a());
                        a22.mo68437a(e);
                        a22.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a22.mo68405a("Key missing or invalidated");
                        if (asjk.m74228b(this)) {
                        }
                    }
                }
            } else {
                intent.getAction();
            }
        } catch (asks | RuntimeException e3) {
            bnsl bnsl = (bnsl) f108608a.mo68387b();
            bnsl.mo68437a(e3);
            bnsl.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error handling intent");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo59374a() {
        try {
            return atak.m75290b("android_pay_recent_unlock_key_2");
        } catch (ataf | atag e) {
            bnsl a = f108608a.mo26019b(aske.m74275a());
            a.mo68437a(e);
            a.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68405a("Key missing or invalidated");
            if (asjk.m74228b(this)) {
                aszy.m75272c(this);
                athu.m75913a(this);
                return false;
            }
            bnsl a2 = f108608a.mo26019b(aske.m74275a());
            a2.mo68437a(e);
            a2.mo68432a("com.google.android.gms.tapandpay.keyguard.KeyguardDismissedIntentOperation", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("Password strength insufficient");
            asjj.m74222b(this);
            return false;
        }
    }
}
