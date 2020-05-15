package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: bxys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxys implements PrivilegedExceptionAction {
    /* renamed from: a */
    public static final Unsafe m124434a() {
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m124434a();
    }
}
