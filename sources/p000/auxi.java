package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: auxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxi {
    /* renamed from: a */
    public static String m78021a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_enabled_") : "auth_trust_agent_pref_trusted_place_enabled_".concat(valueOf);
    }

    /* renamed from: b */
    public static String m78025b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_name_") : "auth_trust_agent_pref_trusted_place_name_".concat(valueOf);
    }

    /* renamed from: c */
    public static String m78028c(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_address_") : "auth_trust_agent_pref_trusted_place_address_".concat(valueOf);
    }

    /* renamed from: d */
    public static String m78030d(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_account_") : "auth_trust_agent_pref_trusted_place_account_".concat(valueOf);
    }

    /* renamed from: e */
    public static String m78031e(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_home_account_enabled_") : "auth_trust_agent_pref_trusted_place_home_account_enabled_".concat(valueOf);
    }

    /* renamed from: f */
    public static String m78032f(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_home_work_address_last_fetch_") : "auth_trust_agent_pref_trusted_place_home_work_address_last_fetch_".concat(valueOf);
    }

    /* renamed from: g */
    public static String m78033g(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_place_lure_unlock_count_date_") : "auth_trust_agent_pref_place_lure_unlock_count_date_".concat(valueOf);
    }

    /* renamed from: h */
    public static String m78034h(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("auth_trust_agent_pref_home_place_for_account_") : "auth_trust_agent_pref_home_place_for_account_".concat(valueOf);
    }

    /* renamed from: i */
    public static String m78035i(String str) {
        if (str.startsWith("auth_trust_agent_pref_trusted_place_enabled_")) {
            return str.substring(44);
        }
        return null;
    }

    /* renamed from: a */
    public static String m78022a(String str, String str2, SharedPreferences sharedPreferences) {
        return m78023a(str, str2, new aupj(sharedPreferences));
    }

    /* renamed from: b */
    public static void m78026b(String str, aupn aupn) {
        for (String str2 : new HashSet(aupn.mo50735c())) {
            if (m78027b(str2, str, aupn)) {
                aupn.mo50731b(str2);
            }
        }
        aupn.mo50731b(m78034h(str));
        aupn.mo50737d();
    }

    /* renamed from: c */
    public static void m78029c(String str, aupn aupn) {
        aupn.mo50731b(m78025b(str));
        aupn.mo50731b(m78028c(str));
        aupn.mo50731b(m78030d(str));
        aupn.mo50731b(m78021a(str));
        aupn.mo50731b(m78033g(str));
        aupn.mo50737d();
    }

    /* renamed from: a */
    public static String m78023a(String str, String str2, aupn aupn) {
        if (str2.equals("Home")) {
            String a = aupn.mo50725a(m78034h(str), "");
            if (!a.isEmpty()) {
                return a;
            }
        }
        Iterator it = aupn.mo50735c().iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                return null;
            }
            String str4 = (String) it.next();
            if (m78027b(str4, str, aupn)) {
                if (str4.startsWith("auth_trust_agent_pref_trusted_place_account_")) {
                    str3 = str4.substring(44);
                }
                String valueOf = String.valueOf(str3);
                if (aupn.mo50725a(valueOf.length() == 0 ? new String("auth_trust_agent_pref_trusted_place_name_") : "auth_trust_agent_pref_trusted_place_name_".concat(valueOf), "").equals(str2)) {
                    return str3;
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m78027b(String str, String str2, aupn aupn) {
        return str.startsWith("auth_trust_agent_pref_trusted_place_account_") && aupn.mo50725a(str, "").equals(str2);
    }

    /* renamed from: a */
    public static Collection m78024a(String str, aupn aupn) {
        String str2;
        Set<String> c = aupn.mo50735c();
        HashSet hashSet = new HashSet();
        if (c != null) {
            for (String str3 : c) {
                if (str3.startsWith("auth_trust_agent_pref_home_place_for_account_")) {
                    str2 = str3.substring(45);
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2) && aupn.mo50725a(str3, "").equals(str)) {
                    hashSet.add(str2);
                }
            }
            String a = aupn.mo50725a(m78030d(str), "");
            if (!TextUtils.isEmpty(a)) {
                hashSet.add(a);
            }
        }
        return hashSet;
    }
}
