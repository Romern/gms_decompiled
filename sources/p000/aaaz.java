package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: aaaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaaz extends AbstractGmsTracer {
    /* JADX WARNING: Illegal instructions before constructor call */
    public aaaz(Context context, Binder binder) {
        super(r0, 8, context, r4.toString());
        ClassLoader classLoader = context.getClass().getClassLoader();
        String simpleName = context.getClass().getSimpleName();
        String b = m21041b(binder.getInterfaceDescriptor());
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 1 + String.valueOf(b).length());
        sb.append(simpleName);
        sb.append("-");
        sb.append(b);
    }

    /* renamed from: a */
    private static String m21040a(String str, String str2) {
        int indexOf;
        if (!str.startsWith(str2) || (indexOf = str.indexOf(46, str2.length())) < 0) {
            return null;
        }
        return str.substring(str2.length(), indexOf);
    }

    /* renamed from: b */
    private static String m21041b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, bmzi, ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    /* renamed from: a */
    public final blji mo16672a(int i, bmzi bmzi) {
        StringBuilder a = mo19215a(8);
        a.append(i - 1);
        return mo19212a(a.toString(), bmzi, (Intent) null, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public aaaz(dck dck) {
        super(r0, 19, r1, m21041b(dck.getInterfaceDescriptor()));
        ClassLoader classLoader = dck.getClass().getClassLoader();
        String interfaceDescriptor = dck.getInterfaceDescriptor();
        String a = m21040a(interfaceDescriptor, "com.google.android.gms.");
        if (a == null && (a = m21040a(interfaceDescriptor, "com.google.android.")) == null) {
            String a2 = m21040a(interfaceDescriptor, "com.google.firebase.");
            if (a2 != null) {
                interfaceDescriptor = a2.equals("appindexing") ? "icing" : a2;
            } else if (!interfaceDescriptor.startsWith("com.google.location.")) {
                int lastIndexOf = interfaceDescriptor.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    interfaceDescriptor = interfaceDescriptor.substring(0, lastIndexOf);
                }
            } else {
                interfaceDescriptor = "location";
            }
        } else {
            interfaceDescriptor = a;
        }
    }
}
