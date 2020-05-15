package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: agdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agdi extends agju {

    /* renamed from: a */
    public agdh f65293a = agdg.f65292a;

    /* renamed from: b */
    public Boolean f65294b;

    /* renamed from: c */
    private Boolean f65295c;

    public agdi(agje agje) {
        super(agje);
    }

    /* renamed from: m */
    public static final long m54038m() {
        return ((Long) aghn.f65503d.mo35389a()).longValue();
    }

    /* renamed from: n */
    public static final long m54039n() {
        return (long) ((Integer) aghn.f65510k.mo35389a()).intValue();
    }

    /* renamed from: o */
    public static final long m54040o() {
        return ((Long) aghn.f65447C.mo35389a()).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo35309a(String str) {
        if (!cfie.m139761b() || !mo35314a(aghn.f65499ay)) {
            return 500;
        }
        return mo35310a(str, aghn.f65451G, 500, 2000);
    }

    /* renamed from: b */
    public final int mo35315b() {
        if (!cfie.m139761b() || !mo35538v().mo35314a(aghn.f65500az) || mo35540x().mo35754n() < 2147483) {
            return 25;
        }
        return 100;
    }

    /* renamed from: c */
    public final long mo35318c() {
        return mo35537u().f65291a ? 201515 : 25021;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Bundle mo35321d() {
        try {
            if (mo35542z().getPackageManager() == null) {
                mo35497E().f65564c.mo35435a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = svr.m36484b(mo35542z()).mo26172a(mo35542z().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo35497E().f65564c.mo35435a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo35497E().f65564c.mo35436a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo35323e() {
        Boolean c;
        if (mo35537u().f65291a || (c = mo35319c("firebase_analytics_collection_deactivated")) == null || !c.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo35325f() {
        mo35242i();
        Boolean c = mo35319c("google_analytics_adid_collection_enabled");
        boolean z = true;
        if (c != null && !c.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final Boolean mo35326g() {
        mo35242i();
        cfkf.f184231a.mo6606a();
        return true;
    }

    /* renamed from: k */
    public final String mo35327k() {
        return mo35313a("debug.firebase.analytics.app", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo35328l() {
        if (this.f65295c == null) {
            Boolean c = mo35319c("app_measurement_lite");
            this.f65295c = c;
            if (c == null) {
                this.f65295c = false;
            }
        }
        if (this.f65295c.booleanValue() || !this.f65756y.f65689e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Boolean mo35319c(String str) {
        sdo.m34977c(str);
        Bundle d = mo35321d();
        if (d == null) {
            mo35497E().f65564c.mo35435a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (d.containsKey(str)) {
            return Boolean.valueOf(d.getBoolean(str));
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo35310a(String str, aghm aghm, int i, int i2) {
        return Math.max(Math.min(mo35317b(str, aghm), i2), i);
    }

    /* renamed from: e */
    public final boolean mo35324e(String str) {
        return "1".equals(this.f65293a.mo35308a(str, "gaia_collection_enabled"));
    }

    /* renamed from: a */
    public final long mo35311a(String str, aghm aghm) {
        if (str == null) {
            return ((Long) aghm.mo35389a()).longValue();
        }
        String a = this.f65293a.mo35308a(str, aghm.f65438a);
        if (TextUtils.isEmpty(a)) {
            return ((Long) aghm.mo35389a()).longValue();
        }
        try {
            return ((Long) aghm.mo35390a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException e) {
            return ((Long) aghm.mo35389a()).longValue();
        }
    }

    /* renamed from: b */
    public final int mo35316b(String str) {
        return mo35317b(str, aghn.f65514o);
    }

    /* renamed from: b */
    public final int mo35317b(String str, aghm aghm) {
        if (str == null) {
            return ((Integer) aghm.mo35389a()).intValue();
        }
        String a = this.f65293a.mo35308a(str, aghm.f65438a);
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aghm.mo35389a()).intValue();
        }
        try {
            return ((Integer) aghm.mo35390a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException e) {
            return ((Integer) aghm.mo35389a()).intValue();
        }
    }

    /* renamed from: c */
    public final boolean mo35320c(String str, aghm aghm) {
        if (str == null) {
            return ((Boolean) aghm.mo35389a()).booleanValue();
        }
        String a = this.f65293a.mo35308a(str, aghm.f65438a);
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) aghm.mo35389a()).booleanValue();
        }
        return ((Boolean) aghm.mo35390a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo35312a() {
        return !mo35537u().f65291a ? "FA" : "FA-SVC";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo35322d(String str) {
        Integer num;
        sdo.m34977c(str);
        Bundle d = mo35321d();
        if (d == null) {
            mo35497E().f65564c.mo35435a("Failed to load metadata: Metadata bundle is null");
            num = null;
        } else {
            num = d.containsKey(str) ? Integer.valueOf(d.getInt(str)) : null;
        }
        if (num == null) {
            return null;
        }
        try {
            String[] stringArray = mo35542z().getResources().getStringArray(num.intValue());
            if (stringArray != null) {
                return Arrays.asList(stringArray);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            mo35497E().f65564c.mo35436a("Failed to load string array from metadata: resource not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo35313a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            mo35497E().f65564c.mo35436a("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            mo35497E().f65564c.mo35436a("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            mo35497E().f65564c.mo35436a("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            mo35497E().f65564c.mo35436a("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo35314a(aghm aghm) {
        return mo35320c(null, aghm);
    }
}
