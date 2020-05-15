package com.google.android.gms.trustagent.trustlet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InactivityTracker$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aurh f109164a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InactivityTracker$1(aurh aurh, String str) {
        super(str);
        this.f109164a = aurh;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String str;
        String str2;
        String string;
        String action = intent.getAction();
        if ("android.intent.action.USER_PRESENT".equals(action)) {
            aurh aurh = this.f109164a;
            aunx aunx = aurh.f92308a;
            if (aurh.f92316i) {
                aurh.f92316i = false;
                aurh.f92314g.mo25668a(aurh.f92311d);
            }
            aurg aurg = aurh.f92313f;
            synchronized (((aurl) aurg).f92336e) {
                if (((aurl) aurg).f92348q || ((aurl) aurg).f92347p) {
                    ((aurl) aurg).f92348q = false;
                    ((aurl) aurg).f92347p = false;
                    aunw a = aurl.f92332a.mo50711a("Device active, revalidating trust.", new Object[0]);
                    a.mo50708c();
                    a.mo50707b();
                    ((aurl) aurg).mo50830a("Device active, revalidating trust.");
                    ((aurl) aurg).mo50838c("user_is_present_from_device_idle");
                }
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            aurh aurh2 = this.f109164a;
            aunx aunx2 = aurh.f92308a;
            aurh2.mo50820a();
        } else if (aurh.f92309b.equals(action)) {
            aurg aurg2 = this.f109164a.f92313f;
            aunw a2 = aurl.f92332a.mo50711a("Device became inactive, revoking trust.", new Object[0]);
            a2.mo50708c();
            a2.mo50707b();
            aurl aurl = (aurl) aurg2;
            if (aurl.mo50840e()) {
                synchronized (aurl.f92336e) {
                    SharedPreferences a3 = aupo.m77578a(((aurl) aurg2).f92337f);
                    if (!a3.getBoolean("auth_trust_agent_pref_inactivity_revoke_trust_first_notice_key", false)) {
                        a3.edit().putBoolean("auth_trust_agent_pref_inactivity_revoke_trust_first_notice_key", true).apply();
                        int i = ((aurl) aurg2).f92344m.f92315h;
                        int a4 = qkj.m32287a(((aurl) aurg2).f92337f, C0126R.C0127drawable.quantum_ic_lock_outline_white_24);
                        aupf aupf = new aupf(((aurl) aurg2).f92337f);
                        aupf.f92248a = ((aurl) aurg2).f92337f.getString(C0126R.string.auth_google_trust_agent_title);
                        aupf.f92255h = "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings";
                        aupf.f92256i = aurh.f92310c;
                        aupf.f92254g = a4;
                        synchronized (((aurl) aurg2).f92336e) {
                            int i2 = i / 60;
                            if (i2 != 0) {
                                str = ((aurl) aurg2).f92337f.getResources().getQuantityString(C0126R.plurals.auth_trust_agent_inactivity_notification_hour, i2, Integer.valueOf(i2));
                            } else {
                                str = "";
                            }
                            int i3 = i % 60;
                            if (i3 != 0) {
                                str2 = ((aurl) aurg2).f92337f.getResources().getQuantityString(C0126R.plurals.auth_trust_agent_inactivity_notification_minute, i3, Integer.valueOf(i3));
                            } else {
                                str2 = "";
                            }
                            string = ((aurl) aurg2).f92337f.getString(C0126R.string.auth_trust_agent_inactivity_notification_text, str, str2);
                        }
                        aupf.f92250c = string;
                        aupf.mo50787b();
                    }
                }
            }
            synchronized (aurl.f92336e) {
                ((aurl) aurg2).f92348q = true;
            }
            aurl.mo50830a("Inactivity threshold triggered");
            aurl.mo50838c("device_became_inactive");
        }
    }
}
