package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ahfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfs {

    /* renamed from: a */
    final /* synthetic */ ahft f67124a;

    /* renamed from: b */
    private final Method f67125b;

    public ahfs(ahft ahft, Method method) {
        this.f67124a = ahft;
        this.f67125b = method;
    }

    /* renamed from: a */
    public final Object mo36403a(Object... objArr) {
        try {
            return this.f67125b.invoke(this.f67124a.f67126a, objArr);
        } catch (IllegalAccessException e) {
            throw new ahfu(e);
        } catch (InvocationTargetException e2) {
            throw new ahfu(e2);
        }
    }
}
