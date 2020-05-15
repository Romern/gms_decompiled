package p000;

import android.os.Build;
import android.provider.DeviceConfig;
import com.felicanetworks.mfc.BuildConfig;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ankj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankj {

    /* renamed from: a */
    private static final srn f77012a = srn.m36127a(sgj.PLATFORM_CONFIGURATOR);

    /* renamed from: b */
    private static boolean f77013b;

    static {
        try {
            boolean z = false;
            if (BuildConfig.FLAVOR_client.equals(Build.BRAND) && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6070236) {
                z = true;
            }
            f77013b = z;
        } catch (NumberFormatException e) {
            f77013b = true;
        }
        f77013b &= ssw.m36269a();
    }

    /* renamed from: a */
    public static String m64645a(String str, String str2) {
        return DeviceConfig.getProperty(str, str2);
    }

    /* renamed from: c */
    static boolean m64651c() {
        return f77013b && cghk.f186943a.mo83795k().mo83806k();
    }

    /* renamed from: a */
    public static void m64646a(String str, String str2, String str3, boolean z) {
        DeviceConfig.setProperty(str, str2, str3, z);
    }

    /* renamed from: b */
    public static boolean m64650b() {
        int i = Build.VERSION.SDK_INT;
        return !Build.ID.startsWith("QPP1") && !Build.ID.startsWith("QPP2") && cghk.f186943a.mo83795k().mo83799d();
    }

    /* renamed from: a */
    public static void m64647a(String str, Executor executor, DeviceConfig.OnPropertiesChangedListener onPropertiesChangedListener) {
        DeviceConfig.addOnPropertiesChangedListener(str, executor, onPropertiesChangedListener);
    }

    /* renamed from: a */
    public static boolean m64648a() {
        int i = Build.VERSION.SDK_INT;
        return cghk.m145451c();
    }

    /* renamed from: a */
    static boolean m64649a(String str, Map map) {
        try {
            DeviceConfig.Properties.Builder builder = new DeviceConfig.Properties.Builder(str);
            for (Map.Entry entry : map.entrySet()) {
                builder.setString((String) entry.getKey(), (String) entry.getValue());
            }
            return DeviceConfig.setProperties(builder.build());
        } catch (NoClassDefFoundError e) {
            bnsl bnsl = (bnsl) f77012a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankj", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("This device does not support atomic writes. Falling back to writing individual flags");
            f77013b = false;
            return false;
        } catch (Exception e2) {
            if (e2 instanceof DeviceConfig.BadConfigException) {
                throw new anki(e2);
            } else if (e2 instanceof SecurityException) {
                throw ((SecurityException) e2);
            } else {
                throw new RuntimeException(e2);
            }
        }
    }
}
