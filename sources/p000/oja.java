package p000;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: oja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oja extends oia {

    /* renamed from: a */
    private final Object f37736a;

    private oja(Object obj) {
        this.f37736a = obj;
    }

    /* renamed from: a */
    public static Object m28891a(oib oib) {
        if (oib instanceof oja) {
            return ((oja) oib).f37736a;
        }
        IBinder asBinder = oib.asBinder();
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
    public static oib m28892a(Object obj) {
        return new oja(obj);
    }
}
