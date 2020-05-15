package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;
import java.util.Map;
import java.util.Set;

/* renamed from: anfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anfb extends anfa {

    /* renamed from: d */
    public static final boolean f76758d = cdml.f181240a.mo6606a().mo77895a();

    /* renamed from: e */
    private final SharedPreferences f76759e;

    /* renamed from: f */
    private final SharedPreferences f76760f;

    public anfb(aney aney, String str, SharedPreferences sharedPreferences) {
        super(aney, str);
        this.f76759e = sharedPreferences;
        this.f76760f = null;
    }

    /* renamed from: a */
    public static SharedPreferences m64138a(Context context, String str) {
        if (str.startsWith("direct_boot:")) {
            str = str.substring(12);
            if (!f76758d || aytw.m84813a(context)) {
                context = aytw.m84817d(context);
            }
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public static SharedPreferences m64140b(Context context, String str) {
        if (str.startsWith("direct_boot:")) {
            str = str.substring(12);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: c */
    public static SharedPreferences m64141c(Context context, String str) {
        aytw.m84814b();
        if (!str.startsWith("direct_boot:")) {
            return null;
        }
        return aytw.m84817d(context).getSharedPreferences(str.substring(12), 0);
    }

    /* renamed from: d */
    public static void m64142d(Context context, String str) {
        sdo.m34974b(str.startsWith("direct_boot:"));
        aytw.m84814b();
        sdo.m34974b(!context.isDeviceProtectedStorage());
        if (!aytw.m84813a(context)) {
            Context d = aytw.m84817d(context);
            String substring = str.substring(12);
            if (f76758d) {
                if (context.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                    m64139a(d, context, substring);
                } else if (d.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                    m64139a(context, d, substring);
                }
            } else if (d.getSharedPreferences(substring, 0).getAll().isEmpty()) {
                d.moveSharedPreferencesFrom(context, substring);
            } else {
                context.deleteSharedPreferences(substring);
            }
        }
    }

    public anfb(aney aney, String str, String str2, Context context) {
        super(aney, str);
        if (f76758d) {
            this.f76759e = m64140b(context, str2);
            this.f76760f = m64141c(context, str2);
            return;
        }
        this.f76759e = m64138a(context, str2);
        this.f76760f = null;
    }

    /* renamed from: a */
    private static void m64139a(Context context, Context context2, String str) {
        Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
        SharedPreferences.Editor edit = context2.getSharedPreferences(str, 0).edit();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getValue() instanceof String) {
                edit.putString(entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue() instanceof Boolean) {
                edit.putBoolean(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            } else if (entry.getValue() instanceof Integer) {
                edit.putInt(entry.getKey(), ((Integer) entry.getValue()).intValue());
            } else if (entry.getValue() instanceof Long) {
                edit.putLong(entry.getKey(), ((Long) entry.getValue()).longValue());
            } else if (entry.getValue() instanceof Float) {
                edit.putFloat(entry.getKey(), ((Float) entry.getValue()).floatValue());
            } else if (entry.getValue() instanceof Set) {
                edit.putStringSet(entry.getKey(), (Set) entry.getValue());
            } else {
                return;
            }
        }
        edit.commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41769b(Configurations configurations) {
        boolean a = anfa.m64131a(this.f76759e, configurations);
        if (this.f76760f != null) {
            aytw.m84814b();
            a = anfa.m64131a(this.f76760f, configurations);
        }
        bdyz.m91623b();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo41768a() {
        return this.f76759e.getString("__phenotype_snapshot_token", null);
    }
}
