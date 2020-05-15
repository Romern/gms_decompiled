package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.Map;
import java.util.Set;

/* renamed from: gvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvh {
    /* renamed from: a */
    public static SharedPreferences m13996a(Context context) {
        return context.getSharedPreferences("account_transfer_storage", 0);
    }

    /* renamed from: a */
    public static String m13998a(int i) {
        return i != 1 ? "key_device_auth_info_export" : "key_device_auth_info_import";
    }

    /* renamed from: b */
    public static String m14002b(int i) {
        return i != 1 ? "key_challenge_authenticators_export" : "key_challenge_authenticators_import";
    }

    /* renamed from: c */
    static String m14004c(int i) {
        return i != 1 ? "key_export_session_in_progress" : "key_import_session_in_progress";
    }

    /* renamed from: d */
    public static Map m14006d(Context context, int i) {
        String str;
        SharedPreferences a = m13996a(context);
        if (i != 1) {
            str = "key_export_all_accounts_progress";
        } else {
            str = "key_import_all_accounts_progress";
        }
        Set<String> stringSet = a.getStringSet(str, null);
        if (stringSet == null || stringSet.isEmpty()) {
            return new C1223np(0);
        }
        C1223np npVar = new C1223np(stringSet.size());
        for (String str2 : stringSet) {
            String string = a.getString(m13999a(str2, i), null);
            if (string != null) {
                npVar.put(str2, string);
            }
        }
        return npVar;
    }

    /* renamed from: a */
    public static DeviceAuthInfo m13997a(Context context, int i) {
        SharedPreferences a = m13996a(context);
        String a2 = m13998a(i);
        long j = a.getLong(a2.concat("_age"), -1);
        boolean z = a.getBoolean(a2.concat("_unlocked"), false);
        gud gud = new gud();
        gud.mo12233a(z);
        gud.mo12232a(j);
        return gud.mo12231a();
    }

    /* renamed from: b */
    public static Set m14003b(Context context, int i) {
        return m13996a(context).getStringSet(m14002b(i), null);
    }

    /* renamed from: c */
    public static boolean m14005c(Context context, int i) {
        return m13996a(context).getBoolean(m14004c(i), false);
    }

    /* renamed from: a */
    public static String m13999a(String str, int i) {
        if (i != 1) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("prefix_key_export_account_progress") : "prefix_key_export_account_progress".concat(valueOf);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String("prefix_key_import_account_progress") : "prefix_key_import_account_progress".concat(valueOf2);
    }

    /* renamed from: a */
    public static void m14000a(Context context, Map map, int i) {
        SharedPreferences.Editor edit = m13996a(context).edit();
        for (Map.Entry entry : map.entrySet()) {
            edit.putString(m13999a((String) entry.getKey(), i), (String) entry.getValue());
        }
        edit.apply();
    }

    /* renamed from: a */
    public static void m14001a(Context context, boolean z, int i) {
        SharedPreferences.Editor edit = m13996a(context).edit();
        edit.putBoolean(m14004c(i), z);
        edit.apply();
    }
}
