package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: aaca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaca extends AbstractGmsTracer {
    public aaca(Context context, Class cls, int i) {
        super(cls.getClassLoader(), i, context, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, bmzi, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* renamed from: a */
    public final blji mo16711a(String str, bmzi bmzi) {
        aabk c = aach.m21088c();
        if (c == null || !c.f27887c) {
            return mo19212a(str, bmzi, (Intent) null, false);
        }
        c.f27887c = false;
        if (!cdoz.f181455a.mo6606a().mo78106S()) {
            return mo19212a(str, (bmzi) null, (Intent) null, true);
        }
        return mo19212a(str, (bmzi) null, (Intent) null, false);
    }
}
