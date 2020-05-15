package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: aabl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabl extends AbstractGmsTracer implements adzu {
    public aabl(Context context, Class cls, int i) {
        super(cls.getClassLoader(), i, context, cls.getSimpleName());
    }

    /* renamed from: a */
    public static blji m21058a(aabl aabl, String str) {
        if (aabl != null) {
            return aabl.mo16696b(str);
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, boolean):blji
     arg types: [java.lang.String, int]
     candidates:
      aabl.a(aabl, java.lang.String):blji
      aabl.a(android.content.ComponentName, java.lang.String):blji
      aabl.a(java.lang.String, adzz):blji
      aabl.a(java.lang.String, android.content.Intent):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(android.os.Bundle, java.lang.String):java.lang.String
      adzu.a(android.content.ComponentName, java.lang.String):blji
      adzu.a(java.lang.String, adzz):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, boolean):blji */
    /* renamed from: b */
    public final blji mo16696b(String str) {
        return mo19213a(str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, bmzi, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* renamed from: a */
    public static blji m21059a(aabl aabl, String str, int i) {
        if (aabl != null) {
            return aabl.mo19212a(aabl.mo19214a(str), bmzn.m108683a((zzp) aabg.f27879a.get(Integer.valueOf(i))), (Intent) null, false);
        }
        return null;
    }

    public aabl(Context context, Class cls, int i, String str) {
        super(cls.getClassLoader(), i, context, str);
    }

    public aabl(Class cls, int i, String str) {
        super(cls.getClassLoader(), i, str, cls.getSimpleName());
    }

    public aabl(Class cls, int i, String str, String str2) {
        super(cls.getClassLoader(), i, str2, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* renamed from: a */
    public final blji mo16693a(ComponentName componentName, String str) {
        String className = !"com.google.android.gms".equals(componentName.getPackageName()) ? "external" : componentName.getClassName();
        StringBuilder a = mo19215a(className.length() + str.length() + 1);
        a.append(className);
        a.append('_');
        a.append(str);
        return mo19212a(a.toString(), (bmzi) null, (Intent) null, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, boolean):blji
     arg types: [java.lang.String, int]
     candidates:
      aabl.a(aabl, java.lang.String):blji
      aabl.a(android.content.ComponentName, java.lang.String):blji
      aabl.a(java.lang.String, adzz):blji
      aabl.a(java.lang.String, android.content.Intent):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(android.os.Bundle, java.lang.String):java.lang.String
      adzu.a(android.content.ComponentName, java.lang.String):blji
      adzu.a(java.lang.String, adzz):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, boolean):blji */
    /* renamed from: a */
    public final blji mo16694a(String str, adzz adzz) {
        sdo.m34959a(adzz);
        return mo19213a(str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, ?[OBJECT, ARRAY], android.content.Intent, int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* renamed from: a */
    public final blji mo16695a(String str, Intent intent) {
        return mo19212a(mo19214a(str), (bmzi) null, intent, false);
    }
}
