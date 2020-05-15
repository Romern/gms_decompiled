package p000;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: cpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpj {

    /* renamed from: a */
    public final Context f11770a;

    public cpj(Context context) {
        this.f11770a = context;
    }

    /* renamed from: a */
    public static cph m7250a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m7251a(cls, e);
            } catch (IllegalAccessException e2) {
                m7251a(cls, e2);
            } catch (NoSuchMethodException e3) {
                m7251a(cls, e3);
            } catch (InvocationTargetException e4) {
                m7251a(cls, e4);
            }
            if (obj instanceof cph) {
                return (cph) obj;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: a */
    private static void m7251a(Class cls, Exception exc) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString(), exc);
    }
}
