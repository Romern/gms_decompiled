package p000;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ahft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahft {

    /* renamed from: a */
    public final Object f67126a;

    /* renamed from: b */
    private final Class[] f67127b;

    public ahft(Object obj, Class[] clsArr) {
        this.f67126a = obj;
        this.f67127b = clsArr;
    }

    /* renamed from: a */
    public static ahft m55666a(Object obj) {
        return new ahft(obj, new Class[0]);
    }

    /* renamed from: a */
    public final ahfs mo36404a(String str, Class... clsArr) {
        try {
            return new ahfs(this, this.f67126a.getClass().getMethod(str, clsArr));
        } catch (NoSuchMethodException e) {
            throw new ahfu(e);
        }
    }

    /* renamed from: a */
    public final Object mo36405a(Object... objArr) {
        try {
            return ((Class) this.f67126a).getDeclaredConstructor(this.f67127b).newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new ahfu(e);
        } catch (InstantiationException e2) {
            throw new ahfu(e2);
        } catch (NoSuchMethodException e3) {
            throw new ahfu(e3);
        } catch (InvocationTargetException e4) {
            throw new ahfu(e4);
        } catch (ClassCastException e5) {
            throw new ahfu(e5);
        }
    }

    /* renamed from: a */
    public final void mo36406a(String str, Object obj) {
        try {
            Field declaredField = this.f67126a.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this.f67126a, obj);
        } catch (NoSuchFieldException e) {
            throw new ahfu(e);
        } catch (IllegalAccessException e2) {
            throw new ahfu(e2);
        }
    }
}
