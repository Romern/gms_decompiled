package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: chb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chb implements cgr {

    /* renamed from: a */
    private final cgx f6838a;

    /* renamed from: b */
    private final cha f6839b;

    /* renamed from: c */
    private final Map f6840c;

    /* renamed from: d */
    private final Map f6841d;

    /* renamed from: e */
    private final int f6842e;

    /* renamed from: f */
    private int f6843f;

    public chb() {
        this.f6838a = new cgx();
        this.f6839b = new cha();
        this.f6840c = new HashMap();
        this.f6841d = new HashMap();
        this.f6842e = 4194304;
    }

    /* renamed from: a */
    private final Object m4249a(cgz cgz, Class cls) {
        cgq c = m4253c(cls);
        Object a = this.f6838a.mo3886a(cgz);
        if (a != null) {
            this.f6843f -= c.mo3867a(a) * c.mo3866a();
            m4252b(c.mo3867a(a), cls);
        }
        if (a != null) {
            return a;
        }
        c.mo3869b();
        return c.mo3868a(cgz.f6832a);
    }

    /* renamed from: b */
    private final NavigableMap m4250b(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f6840c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6840c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: c */
    private final cgq m4253c(Class cls) {
        cgq cgq = (cgq) this.f6841d.get(cls);
        if (cgq == null) {
            if (cls.equals(int[].class)) {
                cgq = new cgy();
            } else if (cls.equals(byte[].class)) {
                cgq = new cgv();
            } else {
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No array pool found for: ") : "No array pool found for: ".concat(valueOf));
            }
            this.f6841d.put(cls, cgq);
        }
        return cgq;
    }

    /* renamed from: b */
    private final void m4251b(int i) {
        while (this.f6843f > i) {
            Object a = this.f6838a.mo3885a();
            crb.m7382a(a);
            cgq c = m4253c(a.getClass());
            this.f6843f -= c.mo3867a(a) * c.mo3866a();
            m4252b(c.mo3867a(a), a.getClass());
            c.mo3869b();
        }
    }

    public chb(int i) {
        this.f6838a = new cgx();
        this.f6839b = new cha();
        this.f6840c = new HashMap();
        this.f6841d = new HashMap();
        this.f6842e = i;
    }

    /* renamed from: b */
    private final void m4252b(int i, Class cls) {
        NavigableMap b = m4250b(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) b.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 56);
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            b.remove(valueOf);
        } else {
            b.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0.intValue() > (r4 * 8)) goto L_0x0025;
     */
    /* renamed from: a */
    public final synchronized Object mo3870a(int i, Class cls) {
        cgz cgz;
        Integer num = (Integer) m4250b(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f6843f;
            if (i2 != 0) {
                if (this.f6842e / i2 < 2) {
                }
            }
            cgz = this.f6839b.mo3894a(num.intValue(), cls);
        }
        cgz = this.f6839b.mo3894a(i, cls);
        return m4249a(cgz, cls);
    }

    /* renamed from: a */
    public final synchronized Object mo3871a(Class cls) {
        return m4249a(this.f6839b.mo3894a(8, cls), cls);
    }

    /* renamed from: a */
    public final synchronized void mo3872a() {
        m4251b(0);
    }

    /* renamed from: a */
    public final synchronized void mo3873a(int i) {
        if (i >= 40) {
            mo3872a();
        } else if (i >= 20 || i == 15) {
            m4251b(this.f6842e >> 1);
        }
    }

    /* renamed from: a */
    public final synchronized void mo3874a(Object obj) {
        Class<?> cls = obj.getClass();
        cgq c = m4253c(cls);
        int a = c.mo3867a(obj);
        int a2 = c.mo3866a() * a;
        int i = 1;
        if (a2 <= (this.f6842e >> 1)) {
            cgz a3 = this.f6839b.mo3894a(a, cls);
            this.f6838a.mo3887a(a3, obj);
            NavigableMap b = m4250b(cls);
            Integer num = (Integer) b.get(Integer.valueOf(a3.f6832a));
            Integer valueOf = Integer.valueOf(a3.f6832a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            b.put(valueOf, Integer.valueOf(i));
            this.f6843f += a2;
            m4251b(this.f6842e);
        }
    }
}
