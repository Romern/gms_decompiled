package p000;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: rth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rth implements SharedPreferences {

    /* renamed from: a */
    private final SharedPreferences f43650a;

    public rth(SharedPreferences sharedPreferences) {
        this.f43650a = sharedPreferences;
    }

    public final boolean contains(String str) {
        return this.f43650a.contains(str);
    }

    public final SharedPreferences.Editor edit() {
        return this.f43650a.edit();
    }

    public final Map getAll() {
        return this.f43650a.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.f43650a.getBoolean(str, z);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return z;
        }
    }

    public final float getFloat(String str, float f) {
        try {
            return this.f43650a.getFloat(str, f);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return f;
        }
    }

    public final int getInt(String str, int i) {
        try {
            return this.f43650a.getInt(str, i);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return i;
        }
    }

    public final long getLong(String str, long j) {
        try {
            return this.f43650a.getLong(str, j);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return j;
        }
    }

    public final String getString(String str, String str2) {
        try {
            return this.f43650a.getString(str, str2);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return str2;
        }
    }

    public final Set getStringSet(String str, Set set) {
        try {
            return this.f43650a.getStringSet(str, set);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SafeSharedPrefs", sb.toString());
            return set;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f43650a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f43650a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
