package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.regex.Pattern;

/* renamed from: aoop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoop extends aaab {

    /* renamed from: c */
    private static final Pattern f78608c = Pattern.compile("[!-~&&[^ \",;\\\\]]*");

    /* renamed from: a */
    private final aooh f78609a;

    /* renamed from: b */
    private final PseudonymousIdToken f78610b;

    public aoop(aooh aooh, PseudonymousIdToken pseudonymousIdToken) {
        super(38, "SetToken");
        sdo.m34959a(aooh);
        this.f78609a = aooh;
        this.f78610b = pseudonymousIdToken;
    }

    /* renamed from: a */
    private static void m66222a(qxq qxq, String str) {
        if (qxq != null) {
            qxq.mo24383c(str).mo24359a();
        }
    }

    /* renamed from: a */
    public static boolean m66223a(aooe aooe, Context context) {
        qxq qxq = new qxq(new qws(rpr.m34216b(), "PSEUDONYMOUS_ID_COUNTERS", null), "PSEUDONYMOUS_ID_COUNTERS", 16);
        boolean a = m66224a(aooe, context, qxq);
        qxq.mo24388e();
        return a;
    }

    /* renamed from: a */
    public static boolean m66224a(aooe aooe, Context context, qxq qxq) {
        aonu aonu = (aonu) aooe;
        String str = aonu.f78594a;
        boolean z = false;
        if (str != null && !m66227a(str)) {
            m66222a(qxq, "SetInvalidPseudonymousId");
            String valueOf = String.valueOf(aonu.f78594a);
            Log.i("PseudonymousIdService", valueOf.length() == 0 ? new String("invalid cookie: ") : "invalid cookie: ".concat(valueOf));
            return false;
        }
        synchronized ("PseudonymousIdService") {
            SharedPreferences.Editor edit = context.getSharedPreferences("PseudonymousIdIntentService", 0).edit();
            if (aooq.f78612b == null) {
                aooq.f78612b = new PseudonymousIdToken(context.getSharedPreferences("PseudonymousIdIntentService", 0).getString("pseudonymousId", null));
            }
            if (new PseudonymousIdToken(((aonu) aooe).f78595b).equals(aooq.f78612b)) {
                String str2 = ((aonu) aooe).f78594a;
                if (str2 == null) {
                    edit.remove("pseudonymousId");
                    edit.putLong("wallTimeMillisLastPseudonymousIdReset", System.currentTimeMillis());
                    aooq.f78612b = aooq.f78611a;
                    m66222a(qxq, "UnsetPseudonymousID");
                    z = true;
                } else {
                    edit.putString("pseudonymousId", str2);
                    aooq.f78612b = new PseudonymousIdToken(((aonu) aooe).f78594a);
                    m66222a(qxq, "CompareAndSetPseudonymousID");
                    z = true;
                }
            }
            edit.apply();
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m66225a(PseudonymousIdToken pseudonymousIdToken, Context context) {
        qxq qxq = new qxq(new qws(rpr.m34216b(), "PSEUDONYMOUS_ID_COUNTERS", null), "PSEUDONYMOUS_ID_COUNTERS", 16);
        boolean a = m66226a(pseudonymousIdToken, context, qxq);
        qxq.mo24388e();
        return a;
    }

    /* renamed from: a */
    public static boolean m66226a(PseudonymousIdToken pseudonymousIdToken, Context context, qxq qxq) {
        String str;
        if (pseudonymousIdToken == null || (str = pseudonymousIdToken.f83468a) == null || m66227a(str)) {
            synchronized ("PseudonymousIdService") {
                SharedPreferences.Editor edit = context.getSharedPreferences("PseudonymousIdIntentService", 0).edit();
                if (pseudonymousIdToken != null) {
                    String str2 = pseudonymousIdToken.f83468a;
                    if (str2 != null) {
                        edit.putString("pseudonymousId", str2);
                        aooq.f78612b = pseudonymousIdToken;
                        m66222a(qxq, "SetPseudonymousID");
                        edit.apply();
                    }
                }
                edit.remove("pseudonymousId");
                edit.putLong("wallTimeMillisLastPseudonymousIdReset", System.currentTimeMillis());
                aooq.f78612b = aooq.f78611a;
                m66222a(qxq, "UnsetPseudonymousID");
                edit.apply();
            }
            return true;
        }
        m66222a(qxq, "SetInvalidPseudonymousId");
        String valueOf = String.valueOf(pseudonymousIdToken.f83468a);
        Log.i("PseudonymousIdService", valueOf.length() == 0 ? new String("invalid cookie: ") : "invalid cookie: ".concat(valueOf));
        return false;
    }

    /* renamed from: a */
    private static boolean m66227a(String str) {
        if (str.length() > 1 && str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }
        return f78608c.matcher(str).matches();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f78609a.mo43122a(!m66225a(this.f78610b, context) ? Status.f30109c : Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f78609a.mo43122a(status);
    }
}
