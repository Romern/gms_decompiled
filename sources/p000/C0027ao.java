package p000;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0027ao {

    /* renamed from: a */
    private static final Map f1860a = new HashMap();

    /* renamed from: b */
    private static final Map f1861b = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r5.booleanValue() == false) goto L_0x00c7;
     */
    /* renamed from: a */
    private static int m1748a(Class cls) {
        Constructor<?> constructor;
        Integer num = (Integer) f1860a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 2;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            int i2 = 0;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR == null ? "" : packageR.getName();
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
                if (!name.isEmpty()) {
                    str = name + "." + str;
                }
                constructor = Class.forName(str).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException e) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor == null) {
                C1342s sVar = C1342s.f26957a;
                Boolean bool = (Boolean) sVar.f26958b.get(cls);
                if (bool == null) {
                    Method[] a = sVar.mo15879a(cls);
                    for (Method method : a) {
                        if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                            sVar.mo15878a(cls, a);
                            i = 1;
                            break;
                        }
                    }
                    sVar.f26958b.put(cls, false);
                    Class superclass = cls.getSuperclass();
                    if (m1751b(superclass)) {
                        if (m1748a(superclass) != 1) {
                            arrayList = new ArrayList((Collection) f1861b.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i2 < length) {
                            Class<?> cls2 = interfaces[i2];
                            if (m1751b(cls2)) {
                                if (m1748a((Class) cls2) == 1) {
                                    i = 1;
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f1861b.get(cls2));
                            }
                            i2++;
                        } else if (arrayList != null) {
                            f1861b.put(cls, arrayList);
                        }
                    }
                }
                i = 1;
            } else {
                f1861b.put(cls, Collections.singletonList(constructor));
            }
        } else {
            i = 1;
        }
        f1860a.put(cls, Integer.valueOf(i));
        return i;
    }

    /* renamed from: b */
    private static boolean m1751b(Class cls) {
        return cls != null && C0012aj.class.isAssignableFrom(cls);
    }

    /* renamed from: a */
    private static C0003ac m1749a(Constructor constructor, Object obj) {
        try {
            return (C0003ac) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    static C0011ai m1750a(Object obj) {
        boolean z = obj instanceof C0011ai;
        boolean z2 = obj instanceof C0001aa;
        if (z && z2) {
            return new C0002ab((C0001aa) obj, (C0011ai) obj);
        }
        if (z2) {
            return new C0002ab((C0001aa) obj, null);
        }
        if (z) {
            return (C0011ai) obj;
        }
        Class<?> cls = obj.getClass();
        if (m1748a((Class) cls) != 2) {
            return new C0044bc(obj);
        }
        List list = (List) f1861b.get(cls);
        if (list.size() == 1) {
            return new C0047bf(m1749a((Constructor) list.get(0), obj));
        }
        C0003ac[] acVarArr = new C0003ac[list.size()];
        for (int i = 0; i < list.size(); i++) {
            acVarArr[i] = m1749a((Constructor) list.get(i), obj);
        }
        return new C1369t(acVarArr);
    }
}
