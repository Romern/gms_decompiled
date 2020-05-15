package p000;

import java.util.HashMap;

/* renamed from: cgcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgcg implements cgcd {

    /* renamed from: a */
    public static final bdyx f186559a;

    /* renamed from: b */
    public static final bdyx f186560b;

    /* renamed from: c */
    public static final beah f186561c;

    static {
        bdyw a = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:");
        try {
            f186559a = bdyx.m91608a(a, "AppScopeConfig__all_apps_scope", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 73, 67, 73, 78, 71}), cgce.f186557a);
            try {
                f186560b = bdyx.m91608a(a, "ph_appcfg_com_d_google_d_android_d_gms", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 8, 71, 77, 83, 95, 67, 79, 82, 69, 10, 22, 71, 77, 83, 67, 79, 82, 69, 95, 65, 78, 68, 82, 79, 73, 68, 95, 80, 82, 73, 77, 69, 83}), cgcf.f186558a);
                HashMap hashMap = new HashMap(2);
                hashMap.put("AppScopeConfig__all_apps_scope", f186559a);
                hashMap.put("ph_appcfg_com_d_google_d_android_d_gms", f186560b);
                f186561c = new beah(a, hashMap);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"ph_appcfg_com_d_google_d_android_d_gms\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"AppScopeConfig__all_apps_scope\"");
        }
    }

    /* renamed from: a */
    public final bydj mo83489a() {
        return (bydj) f186559a.mo58455c();
    }

    /* renamed from: b */
    public final beah mo83490b() {
        return f186561c;
    }
}
