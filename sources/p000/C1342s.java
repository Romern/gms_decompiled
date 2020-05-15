package p000;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1342s {

    /* renamed from: a */
    static final C1342s f26957a = new C1342s();

    /* renamed from: b */
    public final Map f26958b = new HashMap();

    /* renamed from: c */
    private final Map f26959c = new HashMap();

    /* renamed from: a */
    private static final void m20190a(Map map, C1315r rVar, C0005ad adVar, Class cls) {
        C0005ad adVar2 = (C0005ad) map.get(rVar);
        if (adVar2 != null && adVar != adVar2) {
            Method method = rVar.f26884b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + adVar2 + ", new value " + adVar);
        } else if (adVar2 == null) {
            map.put(rVar, adVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1288q mo15880b(Class cls) {
        C1288q qVar = (C1288q) this.f26959c.get(cls);
        return qVar == null ? mo15878a(cls, null) : qVar;
    }

    /* renamed from: a */
    public final C1288q mo15878a(Class cls, Method[] methodArr) {
        int i;
        C1288q b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo15880b(superclass)) == null)) {
            hashMap.putAll(b.f26847b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : mo15880b(cls2).f26847b.entrySet()) {
                m20190a(hashMap, (C1315r) entry.getKey(), (C0005ad) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = mo15879a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0013ak.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0005ad a = onLifecycleEvent.mo1075a();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0005ad.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0005ad.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length <= 2) {
                    m20190a(hashMap, new C1315r(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1288q qVar = new C1288q(hashMap);
        this.f26959c.put(cls, qVar);
        this.f26958b.put(cls, Boolean.valueOf(z));
        return qVar;
    }

    /* renamed from: a */
    public final Method[] mo15879a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
