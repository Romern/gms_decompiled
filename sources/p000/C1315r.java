package p000;

import java.lang.reflect.Method;

/* renamed from: r */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1315r {

    /* renamed from: a */
    final int f26883a;

    /* renamed from: b */
    final Method f26884b;

    public C1315r(int i, Method method) {
        this.f26883a = i;
        this.f26884b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1315r) {
            C1315r rVar = (C1315r) obj;
            return this.f26883a == rVar.f26883a && this.f26884b.getName().equals(rVar.f26884b.getName());
        }
    }

    public final int hashCode() {
        return (this.f26883a * 31) + this.f26884b.getName().hashCode();
    }
}
