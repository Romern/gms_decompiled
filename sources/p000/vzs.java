package p000;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: vzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzs extends vzq {

    /* renamed from: a */
    private final Object f50297a;

    private vzs(Object obj) {
        this.f50297a = obj;
    }

    /* renamed from: a */
    public static Object m41641a(vzr vzr) {
        if (vzr instanceof vzs) {
            return ((vzs) vzr).f50297a;
        }
        IBinder asBinder = vzr.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    /* renamed from: a */
    public static vzr m41642a(Object obj) {
        return new vzs(obj);
    }
}
