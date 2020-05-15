package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: chur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chur {
    /* renamed from: a */
    public static List m149599a(Class cls, Iterable iterable, ClassLoader classLoader, chuq chuq) {
        Iterable iterable2;
        if (!m149600a(classLoader)) {
            iterable2 = ServiceLoader.load(cls, classLoader);
            if (!iterable2.iterator().hasNext()) {
                iterable2 = ServiceLoader.load(cls);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    arrayList.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
            }
            iterable2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable2) {
            if (chuq.mo85621b(obj)) {
                arrayList2.add(obj);
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new chup(chuq)));
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: a */
    public static boolean m149600a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
