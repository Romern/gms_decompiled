package p000;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: bfkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkj {
    /* renamed from: a */
    public static void m97123a(PrintWriter printWriter, Class cls) {
        printWriter.println("");
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                try {
                    Object obj = field.get(cls);
                    if (obj instanceof bdyx) {
                        bdyx bdyx = (bdyx) obj;
                        String b = bdyx.mo58453b();
                        String valueOf = String.valueOf(bdyx.mo58455c());
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 14 + String.valueOf(valueOf).length());
                        sb.append(" value of ");
                        sb.append(b);
                        sb.append(" is ");
                        sb.append(valueOf);
                        printWriter.println(sb.toString());
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}
