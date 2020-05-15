package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.contextmanager.acl.UserConsentManager$1;

/* renamed from: dpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f13723a;

    /* renamed from: b */
    final /* synthetic */ UserConsentManager$1 f13724b;

    public dpa(UserConsentManager$1 userConsentManager$1, Intent intent) {
        this.f13724b = userConsentManager$1;
        this.f13723a = intent;
    }

    public final void run() {
        dpe dpe = this.f13724b.f7694a;
        Intent intent = this.f13723a;
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.udc.action.SETTING_CHANGED")) {
            if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.udc.extra.accountName"))) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dpe", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[UserConsentManager] Account name from UDC Api is empty or null.");
                return;
            }
            dwq.m9681y();
            dpe.mo9371d(dof.m8924b(intent.getStringExtra("com.google.android.gms.udc.extra.accountName")));
        } else if (TextUtils.equals(intent.getAction(), "com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
            for (doh doh : dwq.m9681y().mo9331a()) {
                dpe.mo9370c(doh);
            }
        }
    }
}
