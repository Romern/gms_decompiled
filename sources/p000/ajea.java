package p000;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ajea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajea {

    /* renamed from: a */
    public final Map f70409a = new WeakHashMap();

    /* renamed from: a */
    public final boolean mo38536a(Object obj) {
        return mo38537b(obj) != null;
    }

    /* renamed from: b */
    public final Object mo38537b(Object obj) {
        WeakReference weakReference = (WeakReference) this.f70409a.get(obj);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
