package p000;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: glq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glq {

    /* renamed from: a */
    public static final sek f18566a = new sek("DroidGuard", "DroidGuardUtil");

    /* renamed from: b */
    public static final Map f18567b = new HashMap();

    /* renamed from: c */
    public final Context f18568c;

    /* renamed from: d */
    private final vvp f18569d;

    public glq(Context context) {
        this.f18568c = context;
        this.f18569d = new vvp(context);
    }

    /* renamed from: a */
    public static final String m13398a(Context context, String str, String str2) {
        if (!gnv.m13504N()) {
            f18566a.mo25409a("DroidGuard is turned off", new Object[0]);
            return null;
        }
        glq glq = new glq(context);
        return glq.mo12021a(str, glq.mo12022a(str2));
    }

    /* renamed from: a */
    public static String m13399a(Context context, String str, Map map) {
        if (gnv.m13504N()) {
            return new glq(context).mo12021a(str, map);
        }
        f18566a.mo25409a("DroidGuard is turned off", new Object[0]);
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final String mo12021a(String str, Map map) {
        sdo.m34966a(this.f18568c, "context cannot be null!");
        sdo.m34966a((Object) str, (Object) "flowName cannot be null!");
        sdo.m34966a(map, "args cannot be null!");
        if (!gnv.m13504N()) {
            f18566a.mo25409a("DroidGuard is turned off", new Object[0]);
            return null;
        }
        try {
            String a = this.f18569d.mo28903a(str, map, (DroidGuardResultsRequest) null);
            String format = String.format("DroidGuard results.length:%s, flow:%s", Integer.valueOf(a.length()), str);
            if (!gnv.m13567l()) {
                f18566a.mo25409a(format, new Object[0]);
            } else {
                f18566a.mo25416d(format, new Object[0]);
            }
            return a;
        } catch (RuntimeException e) {
            f18566a.mo25413c("DroidGuard runtime exception: ", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final Map mo12022a(String str) {
        ilq ilq = new ilq(this.f18568c);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("dg_email", str);
        }
        hashMap.put("dg_androidId", ryv.m34679a(this.f18568c));
        hashMap.put("dg_gmsCoreVersion", Integer.toString(ilq.f21310e));
        hashMap.put("dg_package", ilq.f21309d);
        return hashMap;
    }
}
