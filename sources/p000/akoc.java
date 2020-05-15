package p000;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.felicanetworks.mfc.C0126R;

/* renamed from: akoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akoc {

    /* renamed from: a */
    private static final srn f72342a = srn.m36127a(sgj.GUNS);

    /* renamed from: a */
    public static int m60115a(blcs blcs) {
        blda blda = blcs.f125980e;
        if (blda == null) {
            blda = blda.f126015t;
        }
        String str = blda.f126025i;
        if (cfqb.f185420a.mo6606a().mo82501n().equals(str)) {
            return C0126R.C0127drawable.ic_identity_app_security_threat;
        }
        if (cfqb.f185420a.mo6606a().mo82500m().equals(str)) {
            return C0126R.C0127drawable.ic_identity_app_security_notification;
        }
        if (cfqb.f185420a.mo6606a().mo82499l().equals(str)) {
            return C0126R.C0127drawable.ic_identity_app_login_event;
        }
        if (cfqb.f185420a.mo6606a().mo82496i().equals(str)) {
            return 17301543;
        }
        if (cfqb.f185420a.mo6606a().mo82498k().equals(str)) {
            return C0126R.C0127drawable.quantum_ic_google_white_24;
        }
        if (cfqb.f185420a.mo6606a().mo82497j().equals(str)) {
            return C0126R.C0127drawable.ic_google_box_white_24;
        }
        String a = cfqb.f185420a.mo6606a().mo82488a();
        blco blco = blcs.f125978c;
        if (blco == null) {
            blco = blco.f125949g;
        }
        if (!a.equals(blco.f125952b)) {
            return -1;
        }
        return C0126R.C0127drawable.ic_identity_app_security_threat;
    }

    /* renamed from: b */
    public static bldb m60121b(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.notifications.intents.target")) {
            return (bldb) m60117a(intent.getStringExtra("com.google.android.gms.notifications.intents.target"), (bxxk) bldb.f126036d.mo74142c(7));
        }
        ((bnsl) f72342a.mo68387b()).mo68405a("Intent did not contain the target key.");
        return null;
    }

    /* renamed from: c */
    public static boolean m60124c(blcs blcs) {
        if (blcs == null) {
            return false;
        }
        blco blco = blcs.f125978c;
        if (blco == null) {
            blco = blco.f125949g;
        }
        if (!blco.f125953c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m60125d(blcs blcs) {
        blda blda = blcs.f125980e;
        if (blda == null) {
            blda = blda.f126015t;
        }
        if (!blda.f126020d.isEmpty()) {
            blda blda2 = blcs.f125980e;
            if (blda2 == null) {
                blda2 = blda.f126015t;
            }
            if (!blda2.f126021e.isEmpty()) {
                return true;
            }
        }
        ((bnsl) f72342a.mo68387b()).mo68405a("Payload contains insufficient data to show the system notification.");
        return false;
    }

    /* renamed from: b */
    public static boolean m60122b(blcs blcs) {
        if (blcs == null) {
            return false;
        }
        blcw blcw = blcs.f125977b;
        if (blcw == null) {
            blcw = blcw.f125993b;
        }
        if (!blcw.f125995a.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m60123b(bldb bldb) {
        if (bldb == null || (bldb.f126038a & 2) == 0) {
            return false;
        }
        blcq blcq = bldb.f126040c;
        if (blcq == null) {
            blcq = blcq.f125965b;
        }
        blcp blcp = blcq.f125967a;
        if (blcp == null) {
            blcp = blcp.f125957g;
        }
        if (m60119a(blcp)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static blcs m60116a(Intent intent) {
        if (!intent.hasExtra("gms.gnots.payload")) {
            ((bnsl) f72342a.mo68387b()).mo68405a("Intent did not contain the payload key.");
            return null;
        }
        blcs blcs = (blcs) m60117a(intent.getStringExtra("gms.gnots.payload"), (bxxk) blcs.f125974l.mo74142c(7));
        if (!m60124c(blcs) || !m60122b(blcs)) {
            if (blcs != null) {
                blco blco = blcs.f125978c;
                if (blco == null) {
                    blco = blco.f125949g;
                }
                if (blco.f125956f.isEmpty()) {
                    return null;
                }
            }
            return null;
        }
        return blcs;
    }

    /* renamed from: a */
    public static bxxc m60117a(String str, bxxk bxxk) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (bxxc) bxxk.mo73657a(Base64.decode(str, 9));
        } catch (bxwf | IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f72342a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to parse to lite proto payload string.");
            return null;
        }
    }

    /* renamed from: a */
    public static String m60118a(bxxc bxxc) {
        if (bxxc != null) {
            return Base64.encodeToString(bxxc.mo73642k(), 9);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m60119a(blcp blcp) {
        int a;
        return (blcp == null || blcp.f125960b.isEmpty() || blcp.f125961c.isEmpty() || (a = blcu.m107028a(blcp.f125962d)) == 0 || a == 1) ? false : true;
    }

    /* renamed from: a */
    public static boolean m60120a(bldb bldb) {
        if (bldb == null) {
            return false;
        }
        bldc bldc = bldb.f126039b;
        if (bldc == null) {
            bldc = bldc.f126041c;
        }
        if (!bldc.f126043a.isEmpty()) {
            return true;
        }
        return false;
    }
}
