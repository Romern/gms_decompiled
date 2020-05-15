package p000;

import android.app.Application;
import com.google.android.chimera.config.ModuleManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: adui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adui extends C0055bm {

    /* renamed from: a */
    private final Application f62767a;

    /* renamed from: b */
    private final ModuleManager.ModuleInfo f62768b;

    public adui(Application application, ModuleManager.ModuleInfo moduleInfo) {
        super(application);
        this.f62767a = application;
        this.f62768b = moduleInfo;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        if (!aduh.class.isAssignableFrom(cls)) {
            return super.mo3261a(cls);
        }
        try {
            return (C0053bl) cls.getConstructor(Application.class, ModuleManager.ModuleInfo.class).newInstance(this.f62767a, this.f62768b);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Cannot create an instance of ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString(), e);
        }
    }
}
