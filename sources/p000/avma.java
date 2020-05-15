package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: avma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avma {

    /* renamed from: a */
    public static final avlv f93355a;

    /* renamed from: b */
    public static final avlv f93356b = new avlu("config.flag.").mo51362a("size_value", (Long) -1L, cfsi.f185591T);

    /* renamed from: c */
    public static final avlv f93357c = f93366l.mo51363a("description", "", cfsi.f185611i);

    /* renamed from: d */
    public static final avlv f93358d = f93366l.mo51363a("url", "", cfsi.f185601ac);

    /* renamed from: e */
    public static final avlv f93359e = f93366l.mo51363a("install_success_message", "", cfsi.f185621s);

    /* renamed from: f */
    public static final avlv f93360f = f93366l.mo51363a("install_failure_message", "", cfsi.f185620r);

    /* renamed from: g */
    public static final avlv f93361g = f93366l.mo51363a("required_setup", "", cfsi.f185587P);

    /* renamed from: h */
    public static final avlv f93362h = f93366l.mo51361a("is_security_update", Boolean.FALSE, cfsi.f185622t);

    /* renamed from: i */
    public static final avlv f93363i = f93366l.mo51363a("streaming_property_files", "", cfsi.f185596Y);

    /* renamed from: j */
    private static final sek f93364j = avpq.m79016c("SystemUpdate");

    /* renamed from: k */
    private static int f93365k = -1;

    /* renamed from: l */
    private static final avlu f93366l;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avlu.a(java.lang.String, java.lang.Long, bdyx):avlv
     arg types: [java.lang.String, long, bdyx]
     candidates:
      avlu.a(java.lang.String, java.lang.Boolean, bdyx):avlv
      avlu.a(java.lang.String, java.lang.String, bdyx):avlv
      avlu.a(java.lang.String, java.lang.Long, bdyx):avlv */
    static {
        avlu avlu = new avlu("config.flag.");
        f93366l = avlu;
        f93355a = avlu.mo51363a("title", "", cfsi.f185597Z);
    }

    /* renamed from: b */
    public static int m78774b(Context context) {
        int i = f93365k;
        if (i != -1) {
            return i;
        }
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.ota_base")) {
                    int i2 = moduleInfo.moduleVersion;
                    f93365k = i2;
                    return i2;
                }
            }
        } catch (Exception e) {
            f93364j.mo25417e("Failed to get the module version: %s", e, new Object[0]);
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m78773a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (soz.m35811h(context)) {
            return cfsg.f185570a.mo6606a().mo82621E();
        }
        return false;
    }
}
