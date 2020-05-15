package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: rem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rem {
    /* renamed from: a */
    public static Integer m33464a(Context context, String str) {
        m33465a(context);
        if (aytw.m84813a(context)) {
            context = context.createDeviceProtectedStorageContext();
        }
        int i = context.getSharedPreferences("QosTierPref", 0).getInt(str, -1);
        if (i != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m33465a(Context context) {
        aytw.m84814b();
        if (aytw.m84815b(context)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("QosTierPref", 0);
            if (!sharedPreferences.getBoolean("is_migrated_from_ce_to_de", false)) {
                SharedPreferences.Editor edit = context.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0).edit();
                edit.clear();
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (key.equals("qos_tier_fingerprint")) {
                        edit.putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Integer) {
                        edit.putInt(key, ((Integer) value).intValue());
                    }
                }
                edit.commit();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putBoolean("is_migrated_from_ce_to_de", true);
                edit2.commit();
            }
        }
    }

    /* renamed from: a */
    public static void m33466a(SharedPreferences sharedPreferences, cahb cahb) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.putLong("qos_tier_fingerprint", cahb.f174525b);
        bxwc bxwc = cahb.f174524a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            caha caha = (caha) bxwc.get(i);
            String str = caha.f174519a;
            cagz a = cagz.m126622a(caha.f174520b);
            if (a == null) {
                a = cagz.DEFAULT;
            }
            edit.putInt(str, a.f174516f);
        }
        edit.putBoolean("is_migrated_from_ce_to_de", true);
        edit.commit();
    }
}
