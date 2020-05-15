package p000;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: lhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lhv implements SharedPreferences.Editor {

    /* renamed from: a */
    public final SharedPreferences.Editor f26118a;

    /* renamed from: b */
    public final boolean f26119b;

    /* renamed from: c */
    public final Map f26120c = new HashMap();

    /* renamed from: d */
    public boolean f26121d = false;

    /* renamed from: e */
    final /* synthetic */ lhw f26122e;

    public lhv(lhw lhw, SharedPreferences.Editor editor, boolean z) {
        this.f26122e = lhw;
        this.f26118a = editor;
        this.f26119b = z;
    }

    /* renamed from: a */
    private final void m19142a(String str, Object obj) {
        if (obj == null) {
            this.f26120c.put(str, lhw.f26123a);
        } else {
            this.f26120c.put(str, obj);
        }
    }

    public final void apply() {
        lhw lhw = this.f26122e;
        synchronized (lhw.f26124b) {
            this.f26118a.apply();
        }
        if (!this.f26119b) {
            lhw.mo15134a(this);
        }
    }

    public final SharedPreferences.Editor clear() {
        this.f26121d = true;
        this.f26118a.clear();
        return this;
    }

    public final boolean commit() {
        boolean commit;
        lhw lhw = this.f26122e;
        synchronized (lhw.f26124b) {
            commit = this.f26118a.commit();
        }
        if (!this.f26119b && commit) {
            lhw.mo15134a(this);
        }
        return commit;
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        m19142a(str, Boolean.valueOf(z));
        this.f26118a.putBoolean(str, z);
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        m19142a(str, Float.valueOf(f));
        this.f26118a.putFloat(str, f);
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        m19142a(str, Integer.valueOf(i));
        this.f26118a.putInt(str, i);
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        m19142a(str, Long.valueOf(j));
        this.f26118a.putLong(str, j);
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        m19142a(str, str2);
        this.f26118a.putString(str, str2);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        m19142a(str, set);
        this.f26118a.putStringSet(str, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        m19142a(str, null);
        this.f26118a.remove(str);
        return this;
    }
}
