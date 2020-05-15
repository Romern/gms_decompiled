package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Set;

/* renamed from: rtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rtk implements SharedPreferences.Editor {

    /* renamed from: a */
    private final boolean f43652a;

    /* renamed from: b */
    private final Context f43653b;

    /* renamed from: c */
    private final String f43654c;

    /* renamed from: d */
    private final boolean f43655d;

    /* renamed from: e */
    private final SharedPreferences.Editor f43656e;

    /* renamed from: f */
    private Bundle f43657f;

    /* renamed from: g */
    private Bundle f43658g;

    /* renamed from: h */
    private boolean f43659h;

    public rtk(Context context, SharedPreferences sharedPreferences, String str, boolean z, boolean z2) {
        this.f43653b = context;
        this.f43652a = z;
        this.f43654c = str;
        if (z) {
            this.f43656e = null;
            m34398a();
        } else {
            this.f43656e = sharedPreferences.edit();
        }
        this.f43655d = z2;
    }

    /* renamed from: a */
    private final Bundle m34397a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("FUNCTION_NAME", "edit");
        bundle.putBoolean("KEY_COMMIT", z);
        bundle.putBoolean("isDirectBoot", this.f43655d);
        if (!this.f43658g.isEmpty()) {
            bundle.putBundle("KEY_TYPES", this.f43658g);
            bundle.putBundle("KEY_VALUES", this.f43657f);
        }
        if (this.f43659h) {
            bundle.putBoolean("KEY_CLEAR", true);
        }
        return bundle;
    }

    public final void apply() {
        if (this.f43652a) {
            rtl.m34399a(this.f43653b, this.f43654c, m34397a(false));
            m34398a();
            return;
        }
        this.f43656e.apply();
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        if (this.f43652a) {
            this.f43659h = true;
            this.f43657f.clear();
            this.f43658g.clear();
        } else {
            this.f43656e.clear();
        }
        return this;
    }

    public final boolean commit() {
        boolean z;
        if (!this.f43652a) {
            return this.f43656e.commit();
        }
        Bundle a = rtl.m34399a(this.f43653b, this.f43654c, m34397a(true));
        if (a != null) {
            z = a.getBoolean("edit");
        } else {
            z = false;
        }
        m34398a();
        return z;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (this.f43652a) {
            this.f43657f.putBoolean(str, z);
            this.f43658g.putInt(str, 5);
        } else {
            this.f43656e.putBoolean(str, z);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        if (this.f43652a) {
            this.f43657f.putFloat(str, f);
            this.f43658g.putInt(str, 4);
        } else {
            this.f43656e.putFloat(str, f);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        if (this.f43652a) {
            this.f43657f.putInt(str, i);
            this.f43658g.putInt(str, 2);
        } else {
            this.f43656e.putInt(str, i);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        if (this.f43652a) {
            this.f43657f.putLong(str, j);
            this.f43658g.putInt(str, 3);
        } else {
            this.f43656e.putLong(str, j);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        if (this.f43652a) {
            this.f43657f.putString(str, str2);
            this.f43658g.putInt(str, 0);
        } else {
            this.f43656e.putString(str, str2);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        if (this.f43652a) {
            this.f43657f.putStringArray(str, (String[]) set.toArray(new String[0]));
            this.f43658g.putInt(str, 1);
        } else {
            this.f43656e.putStringSet(str, set);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        if (this.f43652a) {
            this.f43657f.remove(str);
            this.f43658g.putInt(str, 6);
        } else {
            this.f43656e.remove(str);
        }
        return this;
    }

    /* renamed from: a */
    private final void m34398a() {
        this.f43657f = new Bundle();
        this.f43658g = new Bundle();
        this.f43659h = false;
    }
}
