package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fiv {

    /* renamed from: a */
    public final fiy f16682a;

    /* renamed from: b */
    public final sqv f16683b;

    /* renamed from: c */
    public boolean f16684c;

    /* renamed from: d */
    public long f16685d;

    /* renamed from: e */
    public long f16686e;

    /* renamed from: f */
    public long f16687f;

    /* renamed from: g */
    public boolean f16688g;

    /* renamed from: h */
    public final Map f16689h;

    /* renamed from: i */
    public final List f16690i;

    /* renamed from: j */
    private long f16691j;

    /* renamed from: k */
    private long f16692k;

    public fiv(fiv fiv) {
        this.f16682a = fiv.f16682a;
        this.f16683b = fiv.f16683b;
        this.f16685d = fiv.f16685d;
        this.f16686e = fiv.f16686e;
        this.f16687f = fiv.f16687f;
        this.f16691j = fiv.f16691j;
        this.f16692k = fiv.f16692k;
        this.f16690i = new ArrayList(fiv.f16690i);
        this.f16689h = new HashMap(fiv.f16689h.size());
        for (Map.Entry entry : fiv.f16689h.entrySet()) {
            fix c = m11788c((Class) entry.getKey());
            ((fix) entry.getValue()).mo10877a(c);
            this.f16689h.put((Class) entry.getKey(), c);
        }
    }

    /* renamed from: c */
    private static fix m11788c(Class cls) {
        try {
            return (fix) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (!(e instanceof IllegalAccessException)) {
                int i = Build.VERSION.SDK_INT;
                if (e instanceof ReflectiveOperationException) {
                    throw new IllegalArgumentException("Linkage exception", e);
                }
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
        }
    }

    /* renamed from: a */
    public final fiv mo10872a() {
        return new fiv(this);
    }

    /* renamed from: b */
    public final fix mo10875b(Class cls) {
        fix fix = (fix) this.f16689h.get(cls);
        if (fix != null) {
            return fix;
        }
        fix c = m11788c(cls);
        this.f16689h.put(cls, c);
        return c;
    }

    /* renamed from: a */
    public final fix mo10873a(Class cls) {
        return (fix) this.f16689h.get(cls);
    }

    /* renamed from: a */
    public final void mo10874a(fix fix) {
        sdo.m34959a(fix);
        Class<?> cls = fix.getClass();
        if (cls.getSuperclass() == fix.class) {
            fix.mo10877a(mo10875b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    public fiv(fiy fiy, sqv sqv) {
        sdo.m34959a(fiy);
        sdo.m34959a(sqv);
        this.f16682a = fiy;
        this.f16683b = sqv;
        this.f16691j = 1800000;
        this.f16692k = 3024000000L;
        this.f16689h = new HashMap();
        this.f16690i = new ArrayList();
    }
}
