package com.google.android.gms.trustlet.onbody.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnbodyLure$UserPresentBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auvq f109251a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnbodyLure$UserPresentBroadcastReceiver(auvq auvq) {
        super("trustlet_onbody");
        this.f109251a = auvq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Log.i("Coffee-OnbodyLure", "User present, Check whether to show notification");
        if (this.f109251a.mo50980d()) {
            auvq auvq = this.f109251a;
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            int i = 0;
            for (String str : new HashMap(auvq.f92617b.getAll()).keySet()) {
                if (str.startsWith("onbody_lure_unlock_time_")) {
                    long parseLong = currentTimeMillis - Long.parseLong(str.substring(24));
                    if (parseLong > chac.f188164a.mo6606a().mo84854j()) {
                        auvq.f92617b.edit().remove(str).apply();
                    } else {
                        int i2 = auvq.f92617b.getInt(str, 0);
                        i += i2;
                        if (parseLong <= chac.f188164a.mo6606a().mo84856l()) {
                            auvq.f92617b.edit().putInt(str, i2 + 1).apply();
                            z = true;
                        }
                    }
                }
            }
            if (!z) {
                SharedPreferences.Editor edit = auvq.f92617b.edit();
                StringBuilder sb = new StringBuilder(44);
                sb.append("onbody_lure_unlock_time_");
                sb.append(currentTimeMillis);
                edit.putInt(sb.toString(), 1).apply();
            }
            if (i + 1 >= ((int) chac.f188164a.mo6606a().mo84855k())) {
                auvq.f92617b.edit().putInt("promotion_status_for_1", 2).apply();
                if (chac.f188164a.mo6606a().mo84848d()) {
                    Log.i("Coffee-OnbodyLure", "Show notification to enable onbody detection.");
                    String string = auvq.f92616a.getString(C0126R.string.onbody_promotion_notification_summary);
                    int a = aupf.m77548a();
                    PendingIntent a2 = aupf.m77549a(auvq.f92616a, bogq.ONBODY_LURE, a);
                    Intent intent2 = new Intent();
                    intent2.setClassName(auvq.f92616a, "com.google.android.gms.trustagent.discovery.PromoteScreenLockAndOnbodyActivity");
                    intent2.putExtra("extra_from_intent", "com.google.android.gms.trustagent.trustlet.OnbodyLure");
                    PendingIntent activity = PendingIntent.getActivity(auvq.f92616a, 0, intent2, JGCastService.FLAG_PRIVATE_DISPLAY);
                    aupf aupf = new aupf(auvq.f92616a);
                    aupf.f92248a = auvq.f92616a.getString(C0126R.string.auth_trust_agent_promotion_notification_title);
                    aupf.f92250c = string;
                    aupf.f92251d = activity;
                    aupf.f92252e = a2;
                    aupf.f92264q = a;
                    aupf.f92253f = bogq.ONBODY_LURE;
                    if (aupf.mo50787b()) {
                        auvq.f92617b.edit().putBoolean("onbody_lure_already_shown", true).putInt("promotion_status_for_1", 3).apply();
                        Log.i("Coffee-OnbodyLure", "log notification event notification type: TrustAgentEvent.ONBODY_LURE, notification event type: TrustAgentEvent.NOTIFICATION_SHOWN");
                        bogj bogj = (bogj) bohi.f133070z.mo74144da();
                        bxvd da = bogm.f133003e.mo74144da();
                        bogq bogq = bogq.ONBODY_LURE;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bogm bogm = (bogm) da.f164949b;
                        bogm.f133006b = bogq.f133019h;
                        int i3 = bogm.f133005a | 1;
                        bogm.f133005a = i3;
                        bogm.f133007c = 0;
                        bogm.f133005a = i3 | 2;
                        bogj.mo68908a((bogm) da.mo74062i());
                        aupk.m77567a(auvq.f92616a, (bohi) bogj.mo74062i());
                        this.f109251a.mo50977a();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f109251a.mo50979c();
    }
}
