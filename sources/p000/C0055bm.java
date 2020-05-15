package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0055bm extends C0058bp {

    /* renamed from: a */
    private final Application f5153a;

    public C0055bm(Application application) {
        this.f5153a = application;
    }

    /* renamed from: a */
    public C0053bl mo3261a(Class cls) {
        if (!C1261p.class.isAssignableFrom(cls)) {
            return super.mo3261a(cls);
        }
        try {
            return (C0053bl) cls.getConstructor(Application.class).newInstance(this.f5153a);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
