package p000;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bqfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum bqfw implements bqfv {
    INSTANCE;
    

    /* renamed from: b */
    private static final Set f140609b = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void mo69218a(Class cls) {
        for (WeakReference weakReference : f140609b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        bqfy.m112769a(cls);
        if (f140609b.size() > 1000) {
            f140609b.clear();
        }
        f140609b.add(new WeakReference(cls));
    }
}
