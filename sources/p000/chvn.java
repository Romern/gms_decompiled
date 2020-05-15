package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvn {

    /* renamed from: a */
    public final Class f189274a;

    /* renamed from: b */
    public final Method f189275b;

    /* renamed from: c */
    public final Method f189276c;

    /* renamed from: d */
    public final Method f189277d;

    /* renamed from: e */
    public final List f189278e = new ArrayList();

    public chvn(Class cls, ClassLoader classLoader) {
        Class asSubclass = cls.asSubclass(bllc.class);
        this.f189274a = asSubclass;
        this.f189277d = asSubclass.getMethod("getScopes", new Class[0]);
        Method declaredMethod = Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(bllc.class).getDeclaredMethod("newBuilder", new Class[0]);
        this.f189275b = declaredMethod;
        Class<?> returnType = declaredMethod.getReturnType();
        this.f189276c = returnType.getMethod("build", new Class[0]);
        Method method = this.f189274a.getMethod("getClientId", new Class[0]);
        this.f189278e.add(new chvo(method, returnType.getMethod("setClientId", method.getReturnType())));
        Method method2 = this.f189274a.getMethod("getClientEmail", new Class[0]);
        this.f189278e.add(new chvo(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        Method method3 = this.f189274a.getMethod("getPrivateKey", new Class[0]);
        this.f189278e.add(new chvo(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        Method method4 = this.f189274a.getMethod("getPrivateKeyId", new Class[0]);
        this.f189278e.add(new chvo(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
    }
}
