package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ayql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayql {

    /* renamed from: a */
    final /* synthetic */ ayqm f98289a;

    /* renamed from: b */
    private final Method f98290b;

    public ayql(ayqm ayqm, Method method) {
        this.f98289a = ayqm;
        this.f98290b = method;
    }

    /* renamed from: a */
    public final void mo54280a(Object... objArr) {
        try {
            this.f98290b.invoke(this.f98289a.f98291a, objArr);
        } catch (IllegalAccessException e) {
            throw new ayqn(e);
        } catch (InvocationTargetException e2) {
            throw new ayqn(e2);
        }
    }

    /* renamed from: b */
    public final Object mo54281b(Object... objArr) {
        try {
            Object invoke = this.f98290b.invoke(this.f98289a.f98291a, objArr);
            if (invoke != null) {
                return invoke;
            }
            throw new ayqn(new NullPointerException());
        } catch (IllegalAccessException e) {
            throw new ayqn(e);
        } catch (InvocationTargetException e2) {
            throw new ayqn(e2);
        }
    }
}
