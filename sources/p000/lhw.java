package p000;

import android.content.SharedPreferences;
import com.google.android.gms.autofill.sharedpreferences.Change;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: lhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class lhw implements SharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public static final Object f26123a = new Object();

    /* renamed from: b */
    public final Object f26124b = new Object();

    /* renamed from: c */
    public final SharedPreferences f26125c;

    /* renamed from: d */
    private final Object f26126d = new Object();

    /* renamed from: e */
    private final Set f26127e = new HashSet();

    public lhw(SharedPreferences sharedPreferences) {
        this.f26125c = sharedPreferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15121a(Change change);

    /* renamed from: a */
    public final void mo15134a(lhv lhv) {
        ArrayList arrayList = new ArrayList(lhv.f26120c.size());
        for (Map.Entry entry : lhv.f26120c.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != f26123a) {
                arrayList.add(new Change.Put(str, value));
            } else {
                arrayList.add(new Change.Put(str, null));
            }
        }
        mo15121a(new Change(lhv.f26121d, (Change.Put[]) arrayList.toArray(new Change.Put[0])));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo15135b() {
        return this.f26125c.getAll();
    }

    public boolean contains(String str) {
        return this.f26125c.contains(str);
    }

    public final SharedPreferences.Editor edit() {
        return new lhv(this, this.f26125c.edit(), false);
    }

    public Map getAll() {
        return this.f26125c.getAll();
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f26125c.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return this.f26125c.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.f26125c.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.f26125c.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.f26125c.getString(str, str2);
    }

    public Set getStringSet(String str, Set set) {
        return this.f26125c.getStringSet(str, set);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ArrayList arrayList;
        synchronized (this.f26126d) {
            arrayList = new ArrayList(this.f26127e);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((SharedPreferences.OnSharedPreferenceChangeListener) arrayList.get(i)).onSharedPreferenceChanged(this, str);
        }
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f26126d) {
            this.f26127e.add(onSharedPreferenceChangeListener);
            if (this.f26127e.size() == 1) {
                this.f26125c.registerOnSharedPreferenceChangeListener(this);
            }
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f26126d) {
            this.f26127e.remove(onSharedPreferenceChangeListener);
            if (this.f26127e.isEmpty()) {
                this.f26125c.unregisterOnSharedPreferenceChangeListener(this);
            }
        }
    }
}
