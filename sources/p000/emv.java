package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: emv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emv {

    /* renamed from: a */
    private final Context f15307a;

    public emv(Context context) {
        this.f15307a = context;
    }

    /* renamed from: b */
    static String m10694b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("dl-");
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append(".apk");
        return sb.toString();
    }

    /* renamed from: c */
    static String m10695c(emn emn) {
        return m10694b(emn.f15272a, emn.f15273b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final emn mo10295a(String str, String str2) {
        String a = emn.m10671a(str, str2);
        SharedPreferences b = mo10298b();
        if (b.contains(a)) {
            return emn.m10670a(b.getString(a, null));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SharedPreferences mo10298b() {
        return this.f15307a.getSharedPreferences("AndroidDynamicModules", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo10296a() {
        File dir = this.f15307a.getDir("zapp_modules", 0);
        dir.mkdir();
        if (dir.isDirectory()) {
            return dir;
        }
        dir.delete();
        if (!dir.mkdir()) {
            return null;
        }
        return dir;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo10299b(emn emn) {
        return new File(mo10296a(), m10695c(emn));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo10297a(emn emn) {
        File b = mo10299b(emn);
        if (b.exists()) {
            return b.getAbsolutePath();
        }
        return null;
    }
}
