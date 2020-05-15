package p000;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: klh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class klh implements klj {

    /* renamed from: a */
    private final Map f24423a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final kli mo14627a(Class cls) {
        kli kli = (kli) this.f24423a.get(cls);
        if (kli != null) {
            return kli;
        }
        klg klg = new klg(cls);
        this.f24423a.put(cls, klg);
        return klg;
    }
}
