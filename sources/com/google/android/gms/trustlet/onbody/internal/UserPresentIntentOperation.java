package com.google.android.gms.trustlet.onbody.internal;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import java.util.Random;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresentIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final aunx f109266a = new aunx("TrustAgent", "UserPresentIntentOperation");

    /* renamed from: b */
    private SharedPreferences f109267b;

    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            if (cgzt.m147784i() && ((double) new Random().nextFloat()) < cgzt.m147785j()) {
                f109266a.mo50711a("onUserPresent", new Object[0]);
                auva d = auva.m77911d();
                synchronized (d.f92568b) {
                    if (d.f92570d != aupi.m77556a(d.f92572f)) {
                        d.f92570d = aupi.m77556a(d.f92572f);
                        auva.f92566a.mo50711a("Screen lock state changed: %s", Boolean.valueOf(d.f92570d));
                        d.mo50965f();
                    }
                }
                boolean isKeyguardSecure = ((KeyguardManager) getSystemService("keyguard")).isKeyguardSecure();
                this.f109267b = aupo.m77578a(this);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long j = this.f109267b.getLong("coffee_last_is_keyguard_secure_set_timestamp_seconds", currentTimeMillis);
                if (isKeyguardSecure) {
                    return;
                }
                if (!this.f109267b.getBoolean("coffee_last_is_keyguard_secure_set_timestamp_confirmed", false) || currentTimeMillis - j <= chac.f188164a.mo6606a().mo84846b() / 1000) {
                    auve.m77923a().mo50967b();
                    return;
                }
                auve a = auve.m77923a();
                auve.f92589a.mo50711a("Screen lock disabled", new Object[0]);
                if (!a.f92591b.contains("promotion_status_for_3")) {
                    a.f92591b.edit().putInt("promotion_status_for_3", 2).commit();
                }
                if (chac.f188164a.mo6606a().mo84850f()) {
                    a.mo50966a(bogq.ONBODY_ON_DISABLE_SCREEN_LOCK, "com.google.android.gms.trustagent.discovery.OnbodyScreenLockNotificationsManager$disablescreenlock", C0126R.string.auth_trust_agent_promotion_notification_title, C0126R.string.onbody_promotion_notification_summary);
                }
            }
        }
    }
}
