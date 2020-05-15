package com.google.android.gms.trustlet.place.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceLure$UserPresentBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ auxh f109275a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceLure$UserPresentBroadcastReceiver(auxh auxh) {
        super("trustlet_place");
        this.f109275a = auxh;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        auxh.f92702a.mo50711a("User present", new Object[0]);
        synchronized (this.f109275a.f92706e) {
            Iterator it = this.f109275a.f92707f.iterator();
            while (it.hasNext()) {
                auxh.f92702a.mo50711a("Check whether to show notification", new Object[0]);
                String str = (String) it.next();
                auxh auxh = this.f109275a;
                String str2 = (String) auxh.f92705d.get(str);
                String g = auxi.m78033g(str);
                String valueOf = String.valueOf(str);
                String str3 = valueOf.length() == 0 ? new String("auth_trust_agent_pref_place_lure_unlock_count_") : "auth_trust_agent_pref_place_lure_unlock_count_".concat(valueOf);
                if (!auxh.f92708g.getBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", false)) {
                    String string = auxh.f92708g.getString(g, "");
                    int i = auxh.f92708g.getInt(str3, 0);
                    int c = (int) chal.f188193a.mo6606a().mo84873c();
                    String format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
                    aunx aunx = auxh.f92702a;
                    String valueOf2 = String.valueOf(format);
                    aunx.mo50711a(valueOf2.length() == 0 ? new String("today (local timezone) is: ") : "today (local timezone) is: ".concat(valueOf2), new Object[0]).mo50708c();
                    if (TextUtils.isEmpty(string) || !string.equals(format)) {
                        aunx aunx2 = auxh.f92702a;
                        String valueOf3 = String.valueOf(format);
                        aunx2.mo50711a(valueOf3.length() == 0 ? new String("set today (local timezone) to ") : "set today (local timezone) to ".concat(valueOf3), new Object[0]).mo50708c();
                        auxh.f92708g.edit().putString(g, format).apply();
                        auxh.f92702a.mo50711a("clear count.", new Object[0]).mo50708c();
                        auxh.f92708g.edit().remove(str3).apply();
                        i = 0;
                    }
                    int i2 = i + 1;
                    auxh.f92708g.edit().putInt(str3, i2).apply();
                    if (i2 >= c) {
                        auxh.f92702a.mo50711a("Show notification to add the place.", new Object[0]).mo50708c();
                        String string2 = auxh.f92703b.getString(C0126R.string.auth_trust_agent_place_unlock_notification);
                        String string3 = auxh.f92703b.getString(C0126R.string.auth_trust_agent_place_unlock_notification_title);
                        int a = aupf.m77548a();
                        PendingIntent a2 = aupf.m77549a(auxh.f92703b, bogq.PLACE_LURE, a);
                        Bundle bundle = new Bundle();
                        bundle.putString("auth_trust_agent_bundle_trusted_place_home_work_account", str2);
                        bundle.putInt("notification_type_key", 0);
                        bundle.putLong("notification_shown_time", System.currentTimeMillis());
                        aupf aupf = new aupf(auxh.f92703b);
                        aupf.f92248a = string3;
                        aupf.f92250c = string2;
                        aupf.f92255h = "com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity";
                        aupf.f92256i = "trust_agent_trusted_places_action_enable_home";
                        aupf.f92261n = bundle;
                        aupf.f92252e = a2;
                        aupf.f92264q = a;
                        aupf.f92253f = bogq.PLACE_LURE;
                        if (aupf.mo50787b()) {
                            auxh.f92702a.mo50711a("log notification event notification type: TrustAgentEvent.PLACE_LURE, notification event type: TrustAgentEvent.NOTIFICATION_SHOWN", new Object[0]).mo50708c();
                            bogj bogj = (bogj) bohi.f133070z.mo74144da();
                            bxvd da = bogm.f133003e.mo74144da();
                            bogq bogq = bogq.PLACE_LURE;
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
                            aupk.m77567a(auxh.f92703b, (bohi) bogj.mo74062i());
                            auxh.f92708g.edit().putBoolean("auth_trust_agent_pref_place_lure_notification_do_not_show", true).apply();
                            it.remove();
                        }
                    }
                } else {
                    auxh.f92702a.mo50711a("Home unlock notification was shown before. No need to show again.", new Object[0]).mo50708c();
                }
            }
        }
    }
}
