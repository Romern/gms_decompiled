package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bdyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyz implements bdyc {

    /* renamed from: a */
    private static final Map f106660a = new C1223np();

    /* renamed from: b */
    private final SharedPreferences f106661b;

    /* renamed from: c */
    private final SharedPreferences.OnSharedPreferenceChangeListener f106662c = new bdyy(this);

    /* renamed from: d */
    private final Object f106663d = new Object();

    /* renamed from: e */
    private volatile Map f106664e;

    /* renamed from: f */
    private final List f106665f = new ArrayList();

    private bdyz(SharedPreferences sharedPreferences) {
        this.f106661b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f106662c);
    }

    /* renamed from: b */
    public static void m91623b() {
        synchronized (bdyz.class) {
            for (bdyz bdyz : f106660a.values()) {
                bdyz.mo58457a();
            }
        }
    }

    /* renamed from: c */
    static synchronized void m91624c() {
        synchronized (bdyz.class) {
            for (bdyz bdyz : f106660a.values()) {
                bdyz.f106661b.unregisterOnSharedPreferenceChangeListener(bdyz.f106662c);
            }
            f106660a.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static bdyz m91622a(Context context, String str) {
        bdyz bdyz;
        SharedPreferences sharedPreferences;
        aytw.m84814b();
        if (!str.startsWith("direct_boot:") && !aytw.m84815b(context)) {
            return null;
        }
        synchronized (bdyz.class) {
            bdyz = (bdyz) f106660a.get(str);
            if (bdyz == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        aytw.m84814b();
                        sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    bdyz = new bdyz(sharedPreferences);
                    f106660a.put(str, bdyz);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return bdyz;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo58433a(String str) {
        Map<String, ?> map = this.f106664e;
        if (map == null) {
            synchronized (this.f106663d) {
                map = this.f106664e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f106661b.getAll();
                        this.f106664e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo58457a() {
        synchronized (this.f106663d) {
            this.f106664e = null;
            bdyx.m91613a();
        }
        synchronized (this) {
            for (bdxz bdxz : this.f106665f) {
                bdxz.mo58436a();
            }
        }
    }
}
