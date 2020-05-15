package p000;

import java.lang.reflect.Method;

/* renamed from: ngx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngx {
    /* renamed from: a */
    public static Integer m26237a(Object obj, String str) {
        try {
            Method[] methods = obj.getClass().getMethods();
            for (Method method : methods) {
                String method2 = method.toString();
                StringBuilder sb = new StringBuilder(str.length() + 2);
                sb.append(".");
                sb.append(str);
                sb.append("(");
                if (method2.contains(sb.toString())) {
                    Integer num = (Integer) method.invoke(obj, new Object[0]);
                    String valueOf = String.valueOf(num);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb2.append("Invocation via reflection successful with result ");
                    sb2.append(valueOf);
                    sb2.toString();
                    return num;
                }
            }
            return null;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(valueOf2).length());
            sb3.append("Unable to invoke ");
            sb3.append(str);
            sb3.append("() via reflection ");
            sb3.append(valueOf2);
            nha.m26246c(sb3.toString());
            return null;
        }
    }
}
