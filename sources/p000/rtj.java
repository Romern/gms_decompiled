package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: rtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rtj implements SharedPreferences {

    /* renamed from: a */
    private final SharedPreferences f43651a;

    public rtj(Context context, String str, boolean z) {
        this(context, str, z, false);
    }

    public final boolean contains(String str) {
        return this.f43651a.contains(str);
    }

    public final SharedPreferences.Editor edit() {
        return ((rtl) this.f43651a).edit();
    }

    public final Map getAll() {
        return this.f43651a.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.f43651a.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return this.f43651a.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return this.f43651a.getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return this.f43651a.getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return this.f43651a.getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return this.f43651a.getStringSet(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f43651a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f43651a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public rtj(Context context, String str, boolean z, boolean z2) {
        synchronized (rtj.class) {
        }
        this.f43651a = new rtl(context, str, z, z2);
    }
}
