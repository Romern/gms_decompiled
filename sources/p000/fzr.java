package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: fzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzr {
    /* renamed from: a */
    public static String m12810a(String str, Context context, String str2) {
        return m12811a(context, str2).getString(str, null);
    }

    /* renamed from: b */
    public static void m12813b(Context context, String str) {
        SharedPreferences.Editor edit = m12811a(context, str).edit();
        edit.clear();
        edit.commit();
    }

    /* renamed from: c */
    private static int m12815c(String str, Context context, String str2) {
        return m12811a(context, str2).getInt(str, 0);
    }

    /* renamed from: d */
    public static Long m12817d(Context context, String str) {
        return Long.valueOf(m12811a(context, str).getLong("creationTimestamp", 0));
    }

    /* renamed from: e */
    public static boolean m12818e(Context context, String str) {
        return m12812a("isNewInstall", false, context, str);
    }

    /* renamed from: f */
    public static boolean m12819f(Context context, String str) {
        return m12812a("isUpgradeInstall", false, context, str);
    }

    /* renamed from: g */
    public static String m12820g(Context context, String str) {
        return m12810a("scionCampaign", context, str);
    }

    /* renamed from: h */
    public static String m12821h(Context context, String str) {
        return m12810a("requestedLink", context, str);
    }

    /* renamed from: i */
    public static int m12822i(Context context, String str) {
        return m12815c("requestedLinkType", context, str);
    }

    /* renamed from: j */
    public static String m12823j(Context context, String str) {
        return m12810a("appCode", context, str);
    }

    /* renamed from: k */
    public static String m12824k(Context context, String str) {
        return m12810a("domainUriPrefix", context, str);
    }

    /* renamed from: l */
    public static String m12825l(Context context, String str) {
        return m12810a("sessionId", context, str);
    }

    /* renamed from: m */
    public static int m12826m(Context context, String str) {
        int a = bojd.m111251a(m12815c("invitationChannel", context, str));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    public static rtj m12811a(Context context, String str) {
        return new rtj(context, String.valueOf(str).concat(".AppInviteReferral"), true);
    }

    /* renamed from: b */
    public static void m12814b(String str, Context context, String str2) {
        SharedPreferences.Editor edit = m12811a(context, str2).edit();
        edit.putBoolean(str, true);
        edit.commit();
    }

    /* renamed from: c */
    public static boolean m12816c(Context context, String str) {
        try {
            rtj a = m12811a(context, str);
            if (!a.contains("Existence Indicator") || !"Existence Indicator".equalsIgnoreCase(a.getString("Existence Indicator", null))) {
                return false;
            }
            return true;
        } catch (rti e) {
            if (cbwa.f178438a.mo6606a().mo75513a()) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static boolean m12812a(String str, boolean z, Context context, String str2) {
        return m12811a(context, str2).getBoolean(str, z);
    }
}
