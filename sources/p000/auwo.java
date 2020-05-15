package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutorService;

/* renamed from: auwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auwo {

    /* renamed from: a */
    public static final aunx f92664a = new aunx("TrustAgent", "OnbodyUtils");

    /* renamed from: a */
    public static long m77982a(auol auol) {
        long a = auol.mo50724a("auth_trust_agent_pref_phone_position_trustlet_last_toggle_time_millis", 0);
        long currentTimeMillis = System.currentTimeMillis();
        auol.mo50732b("auth_trust_agent_pref_phone_position_trustlet_last_toggle_time_millis", currentTimeMillis);
        if (a != 0) {
            return (currentTimeMillis - a) / 1000;
        }
        return 0;
    }

    /* renamed from: b */
    public static bqgg m77989b(Context context) {
        aupq.m77579a().mo50792b();
        boolean z = false;
        if (!PhonePositionTrustletChimeraService.m93538a(aupo.m77578a(context)) && PhonePositionTrustletChimeraService.m93537a(context)) {
            z = true;
        }
        return bqdx.m112673a(m77992d(context), new auwl(z), bqfb.INSTANCE);
    }

    /* renamed from: c */
    public static bqgg m77991c(Context context) {
        if (!aupi.m77556a((KeyguardManager) context.getSystemService("keyguard"))) {
            return bqga.m112775a((Object) true);
        }
        return bqgs.m112811a((ExecutorService) snp.m35704b(9)).mo25819b(new auwm(context));
    }

    /* renamed from: d */
    public static bqgg m77992d(Context context) {
        if (!aupi.m77556a((KeyguardManager) context.getSystemService("keyguard"))) {
            return bqga.m112775a((Object) true);
        }
        return bqgs.m112811a((ExecutorService) snp.m35704b(9)).mo25819b(new auwn(context));
    }

    /* renamed from: a */
    public static bqgg m77983a(Context context) {
        aupq.m77579a().mo50792b();
        boolean z = false;
        if (!PhonePositionTrustletChimeraService.m93538a(aupo.m77578a(context)) && PhonePositionTrustletChimeraService.m93537a(context)) {
            z = true;
        }
        return bqdx.m112673a(m77991c(context), new auwk(z), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public static void m77990b(Context context, bogq bogq) {
        SharedPreferences.Editor edit = aupo.m77578a(context).edit();
        String valueOf = String.valueOf(Integer.toString(bogq.f133019h));
        edit.putBoolean(valueOf.length() == 0 ? new String("onbody_notification_already_shown_per_type_") : "onbody_notification_already_shown_per_type_".concat(valueOf), true).commit();
    }

    /* renamed from: a */
    public static String m77984a(auol auol, String str) {
        if (!str.isEmpty()) {
            auol.mo50733b("trust_agent_pref_onbody_from_intent_key", str);
        }
        return auol.mo50725a("trust_agent_pref_onbody_from_intent_key", "");
    }

    /* renamed from: a */
    public static void m77985a(Context context, int i, boolean z) {
        m77986a(context, i, z, -1, "");
    }

    /* renamed from: a */
    public static void m77986a(Context context, int i, boolean z, long j, String str) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        bxvd da = bohf.f133058h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bohf bohf = (bohf) da.f164949b;
        bohf.f133060a |= 4;
        bohf.f133063d = z;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi2 = (bohi) bogj.f164949b;
        bohf bohf2 = (bohf) da.mo74062i();
        bohf2.getClass();
        bohi2.f133089s = bohf2;
        bohi2.f133071a |= 8192;
        if (j >= 0) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi3 = (bohi) bogj.f164949b;
            bohi3.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bohi3.f133091u = j;
        }
        if (!str.isEmpty()) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi4 = (bohi) bogj.f164949b;
            str.getClass();
            bohi4.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bohi4.f133093w = str;
        }
        aupk.m77567a(context, (bohi) bogj.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m77987a(Context context, auol auol, String str) {
        m77986a(context, 19, false, m77982a(auol), m77984a(auol, str));
        auol.mo50728a("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", true);
        auol.mo50728a("onbody_already_set", true);
        aunw a = f92664a.mo50711a("Onbody trustlet is enabled by user.", new Object[0]);
        a.mo50708c();
        a.mo50707b();
    }

    /* renamed from: a */
    public static boolean m77988a(Context context, bogq bogq) {
        SharedPreferences a = aupo.m77578a(context);
        String valueOf = String.valueOf(Integer.toString(bogq.f133019h));
        return a.getBoolean(valueOf.length() == 0 ? new String("onbody_notification_already_shown_per_type_") : "onbody_notification_already_shown_per_type_".concat(valueOf), false);
    }
}
