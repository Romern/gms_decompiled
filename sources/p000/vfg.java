package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vfg implements vff {

    /* renamed from: a */
    public static final sbw f49167a = new sbw("PreferencesImpl", "");

    /* renamed from: b */
    public final Set f49168b = new HashSet();

    /* renamed from: c */
    private final Context f49169c;

    /* renamed from: a */
    public static txg m40284a(boolean z) {
        int i;
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        txi txi = new txi();
        txi.f46910b = i;
        txi.f46911c = false;
        txi.f46912d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return txi.mo26871a();
    }

    /* renamed from: b */
    public static String m40285b(String str) {
        return String.format("ActivityLevel.%s", str);
    }

    /* renamed from: c */
    private static String m40286c(String str) {
        return String.format("drive_preferences.folder_color_palette.%s", str);
    }

    /* renamed from: d */
    public final SharedPreferences mo28388d() {
        return this.f49169c.getSharedPreferences("drive.shared_prefs", 4);
    }

    public vfg(Context context) {
        this.f49169c = context;
    }

    @Deprecated
    /* renamed from: c */
    public final SharedPreferences mo28387c() {
        return PreferenceManager.getDefaultSharedPreferences(this.f49169c);
    }

    /* renamed from: a */
    public final List mo28382a(String str) {
        String string = mo28388d().getString(m40286c(str), null);
        if (string == null) {
            return new ArrayList();
        }
        return Arrays.asList(string.split(","));
    }

    /* renamed from: b */
    public final long mo28385b() {
        long currentTimeMillis = System.currentTimeMillis();
        mo28386a(currentTimeMillis);
        return currentTimeMillis;
    }

    /* renamed from: a */
    public final void mo28386a(long j) {
        mo28388d().edit().putLong("databaseInstanceId", j).commit();
    }

    /* renamed from: a */
    public final void mo28383a(String str, List list) {
        mo28388d().edit().putString(m40286c(str), TextUtils.join(",", list)).commit();
    }

    /* renamed from: a */
    public final boolean mo28384a() {
        SharedPreferences d = mo28388d();
        if (!d.contains("drive_preferences.sync_over_wifi_only")) {
            SharedPreferences c = mo28387c();
            if (c.contains("drive_preferences.sync_over_wifi_only")) {
                d.edit().putBoolean("drive_preferences.sync_over_wifi_only", c.getBoolean("drive_preferences.sync_over_wifi_only", true)).commit();
            }
        }
        return d.getBoolean("drive_preferences.sync_over_wifi_only", true);
    }
}
