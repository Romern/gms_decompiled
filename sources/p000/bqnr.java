package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bqnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqnr {

    /* renamed from: a */
    public final Class f141315a;

    /* renamed from: b */
    public final Class f141316b;

    /* renamed from: c */
    private final Map f141317c;

    @SafeVarargs
    protected bqnr(Class cls, bqnq... bqnqArr) {
        this.f141315a = cls;
        HashMap hashMap = new HashMap();
        bqnq bqnq = bqnqArr[0];
        if (hashMap.containsKey(bqnq.f141314a)) {
            String valueOf = String.valueOf(bqnq.f141314a.getCanonicalName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("KeyTypeManager constructed with duplicate factories for primitive ") : "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf));
        }
        hashMap.put(bqnq.f141314a, bqnq);
        this.f141316b = bqnqArr[0].f141314a;
        this.f141317c = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public abstract bxxc mo69297a(bxtx bxtx);

    /* renamed from: a */
    public final Object mo69298a(bxxc bxxc, Class cls) {
        bqnq bqnq = (bqnq) this.f141317c.get(cls);
        if (bqnq != null) {
            return bqnq.mo69296a(bxxc);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public abstract String mo69299a();

    /* renamed from: a */
    public abstract void mo69300a(bxxc bxxc);

    /* renamed from: b */
    public final Set mo69301b() {
        return this.f141317c.keySet();
    }

    /* renamed from: c */
    public bqnp mo69302c() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: d */
    public abstract int mo69303d();
}
