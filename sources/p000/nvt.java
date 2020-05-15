package p000;

import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;

/* renamed from: nvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class nvt extends adzt {

    /* renamed from: a */
    private final WeakReference f36693a;

    public nvt(Object obj) {
        m27932a(getLooper());
        this.f36693a = new WeakReference(obj);
    }

    /* renamed from: a */
    private final void m27932a(Looper looper) {
        if (looper == Looper.getMainLooper()) {
            m27933a(getClass());
        }
    }

    /* renamed from: f */
    public final Object mo21726f() {
        return this.f36693a.get();
    }

    public nvt(Object obj, Looper looper) {
        super(looper);
        m27932a(getLooper());
        this.f36693a = new WeakReference(obj);
    }

    /* renamed from: a */
    private final void m27933a(Class cls) {
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && !Modifier.isStatic(cls.getModifiers())) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            Log.e("SafeHandler", valueOf.length() == 0 ? new String("Handler needs to be a top-level or static class; handler: ") : "Handler needs to be a top-level or static class; handler: ".concat(valueOf));
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            m27933a(superclass);
        }
    }
}
