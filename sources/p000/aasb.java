package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Collection;
import java.util.Map;

/* renamed from: aasb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasb {
    /* renamed from: a */
    public static int m46830a(Context context, HelpConfig helpConfig, String str, int i) {
        return new aasc(context, helpConfig).mo31693a(str, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, long):long
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean */
    /* renamed from: b */
    public static boolean m46834b(Context context, HelpConfig helpConfig, String str) {
        return new aasc(context, helpConfig).mo31699a(str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasa.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aasa.a(java.lang.String, int):void
      aasa.a(java.lang.String, long):void
      aasa.a(java.lang.String, java.lang.String):void
      aasa.a(java.lang.String, boolean):void */
    /* renamed from: c */
    public static void m46835c(Context context, HelpConfig helpConfig, String str) {
        aasa a = new aasc(context, helpConfig).mo31695a();
        a.mo31690a(str, true);
        a.mo31685a();
    }

    /* renamed from: a */
    public static String m46831a(Context context, HelpConfig helpConfig, String str, String str2) {
        return new aasc(context, helpConfig).mo31697a(str, str2);
    }

    /* renamed from: a */
    public static Map m46832a(Context context, HelpConfig helpConfig) {
        aasc aasc = new aasc(context, helpConfig);
        Collection<aars> values = aars.m46806b().values();
        C1223np npVar = new C1223np(values.size());
        for (aars aars : values) {
            String a = aasc.mo31697a(aasc.m46836a(aars), (String) null);
            if (a != null) {
                npVar.put(aars, a);
            }
        }
        return npVar;
    }

    /* renamed from: a */
    public static void m46833a(Context context, HelpConfig helpConfig, String str) {
        aasa a = new aasc(context, helpConfig).mo31695a();
        a.mo31686a(str);
        a.mo31685a();
    }
}
