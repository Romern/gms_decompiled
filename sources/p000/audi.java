package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: audi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audi {
    /* renamed from: a */
    public static long m76797a(Context context, int i) {
        return i != 2 ? m76798a(context).getLong("calls_blacklist_version", -1) : m76798a(context).getLong("messages_blacklist_version", -1);
    }

    /* renamed from: a */
    public static String m76799a(int i) {
        if (i == 1) {
            return "spam_module_enabled_apps";
        }
        if (i == 2) {
            return "spam_module_enabled_text_apps";
        }
        return null;
    }

    /* renamed from: b */
    public static int m76802b(int i) {
        int i2 = i - 2;
        return (i2 == -1 || i2 == 0) ? 1 : 2;
    }

    /* renamed from: c */
    public static long m76804c(Context context, int i) {
        return i != 2 ? m76798a(context).getLong("calls_blacklist_last_updated_time", -1) : m76798a(context).getLong("messages_blacklist_last_updated_time", -1);
    }

    /* renamed from: d */
    public static Set m76805d(Context context, int i) {
        return m76798a(context).getStringSet(m76799a(i), Collections.emptySet());
    }

    /* renamed from: e */
    public static boolean m76806e(Context context, int i) {
        SharedPreferences a = m76798a(context);
        int i2 = i - 2;
        return (i2 == -1 || i2 == 0) ? a.contains("calls_blacklist_experiment_id") && a.contains("calls_blacklist_version") && a.contains("calls_blacklist_country_codes") : a.contains("messages_blacklist_experiment_id") && a.contains("messages_blacklist_version") && a.contains("messages_blacklist_country_codes");
    }

    /* renamed from: f */
    public static long m76807f(Context context, int i) {
        return m76797a(context, m76802b(i));
    }

    /* renamed from: a */
    public static SharedPreferences m76798a(Context context) {
        return context.getSharedPreferences("scooby_preferences", 0);
    }

    /* renamed from: b */
    public static long m76803b(Context context, int i) {
        return i != 2 ? m76798a(context).getLong("calls_blacklist_experiment_id", -1) : m76798a(context).getLong("messages_blacklist_experiment_id", -1);
    }

    /* renamed from: a */
    public static boolean m76800a(Context context, bqia bqia) {
        SharedPreferences.Editor edit = m76798a(context).edit();
        bnic a = bnic.m109495a((Collection) bqia.f140766e);
        int b = bqig.m112866b(bqia.f140765d);
        if (b != 0 && b == 3) {
            edit.putLong("messages_blacklist_experiment_id", bqia.f140763b).putLong("messages_blacklist_last_updated_time", System.currentTimeMillis()).putStringSet("messages_blacklist_country_codes", a).putLong("messages_blacklist_version", bqia.f140762a);
        } else {
            int b2 = bqig.m112866b(bqia.f140765d);
            if (b2 != 0 && b2 == 2) {
                edit.putLong("calls_blacklist_experiment_id", bqia.f140763b).putLong("calls_blacklist_last_updated_time", System.currentTimeMillis()).putStringSet("calls_blacklist_country_codes", a).putLong("calls_blacklist_version", bqia.f140762a);
            }
        }
        return edit.commit();
    }

    /* renamed from: a */
    public static synchronized boolean m76801a(Context context, String str, int i, boolean z) {
        synchronized (audi.class) {
            SharedPreferences a = m76798a(context);
            String a2 = m76799a(i);
            if (a2 == null) {
                return false;
            }
            Set<String> stringSet = a.getStringSet(a2, new HashSet());
            if (z) {
                stringSet.add(str);
            } else {
                stringSet.remove(str);
            }
            boolean commit = a.edit().putStringSet(a2, stringSet).commit();
            return commit;
        }
    }
}
