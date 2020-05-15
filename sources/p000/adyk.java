package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: adyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyk implements adyj {
    /* renamed from: a */
    public final Map mo33926a() {
        return bnel.m109127a();
    }

    /* renamed from: b */
    public final Set mo33929b() {
        return bnen.m109149a();
    }

    /* renamed from: a */
    public final Map mo33927a(int i) {
        if (i <= 256) {
            return new C1223np(i);
        }
        return bnel.m109128a(i);
    }

    /* renamed from: a */
    public final Set mo33928a(Collection collection) {
        Set set;
        int size = collection.size();
        if (size <= 256) {
            set = new C1225nr(size);
        } else {
            set = bnen.m109150a(size);
        }
        set.addAll(collection);
        return set;
    }
}
