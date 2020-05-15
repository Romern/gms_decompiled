package p000;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: bnrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnrz implements bnsi, bnsw {

    /* renamed from: a */
    private static final String f132055a = new String();

    /* renamed from: b */
    private final Level f132056b;

    /* renamed from: c */
    private final long f132057c;

    /* renamed from: d */
    private bnrx f132058d = null;

    /* renamed from: e */
    private bnsc f132059e = null;

    /* renamed from: f */
    private bntk f132060f = null;

    /* renamed from: g */
    private Object[] f132061g = null;

    protected bnrz(Level level, boolean z) {
        long e = bntd.m110371e();
        bnuy.m110474a(level, "level");
        this.f132056b = level;
        this.f132057c = e;
        if (z) {
            mo68403a(bnrw.f132048e, Boolean.TRUE);
        }
    }

    /* renamed from: b */
    private final void m110188b(String str, Object... objArr) {
        this.f132061g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof bnru) {
                objArr[i] = ((bnru) obj).mo20704a();
            }
        }
        if (str != f132055a) {
            this.f132060f = new bntk(mo68391b(), str);
        }
        bnro a = mo26017a();
        bnuy.m110474a(this, "data");
        try {
            a.f132041b.mo8544a(this);
        } catch (RuntimeException e) {
            try {
                a.f132041b.mo25077a(e, this);
            } catch (bnsy e2) {
                throw e2;
            } catch (RuntimeException e3) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e3.getMessage());
                printStream.println(valueOf.length() == 0 ? new String("logging error: ") : "logging error: ".concat(valueOf));
                bqye.m113759a(e3, System.err);
            }
        }
    }

    /* renamed from: n */
    private final boolean m110189n() {
        Object obj;
        int a;
        int i;
        if (this.f132059e == null) {
            bnsc a2 = bntd.m110368a().mo68472a(bnrz.class, 1);
            bnuy.m110474a(a2, "logger backend must not return a null LogSite");
            this.f132059e = a2;
        }
        if (this.f132059e != bnsc.f132067a) {
            obj = this.f132059e;
            String str = (String) mo68446k().mo68397b(bnrw.f132047d);
            if (str != null) {
                obj = new bnry(this.f132059e, str);
            }
        } else {
            obj = null;
        }
        bnrx bnrx = this.f132058d;
        if (!(bnrx == null || obj == null)) {
            Integer num = (Integer) bnrx.mo68397b(bnrw.f132045b);
            bnse bnse = (bnse) this.f132058d.mo68397b(bnrw.f132046c);
            bnsf bnsf = bnsg.f132069a;
            bnsg bnsg = (bnsg) bnsf.f132068a.get(obj);
            if (bnsg == null) {
                bnsg = new bnsg();
                bnsg bnsg2 = (bnsg) bnsf.f132068a.putIfAbsent(obj, bnsg);
                if (bnsg2 != null) {
                    bnsg = bnsg2;
                }
            }
            if (num != null) {
                if (bnsg.f132070b.getAndIncrement() % ((long) num.intValue()) != 0) {
                    return false;
                }
            }
            if (bnse != null) {
                bnsg.f132071c.get();
                throw null;
            }
        }
        bnsk bnsk = (bnsk) mo68446k().mo68397b(bnrw.f132050g);
        if (bnsk != null) {
            bnsj bnsj = bnrw.f132050g;
            bnrx bnrx2 = this.f132058d;
            if (bnrx2 != null && (a = bnrx2.mo68394a(bnsj)) >= 0) {
                int i2 = a + a;
                int i3 = i2 + 2;
                while (true) {
                    i = bnrx2.f132052b;
                    if (i3 >= i + i) {
                        break;
                    }
                    Object obj2 = bnrx2.f132051a[i3];
                    if (!obj2.equals(bnsj)) {
                        Object[] objArr = bnrx2.f132051a;
                        objArr[i2] = obj2;
                        objArr[i2 + 1] = objArr[i3 + 1];
                        i2 += 2;
                    }
                    i3 += 2;
                }
                bnrx2.f132052b = i - ((i3 - i2) >> 1);
                while (i2 < i3) {
                    bnrx2.f132051a[i2] = null;
                    i2++;
                }
            }
            mo68403a(bnrw.f132044a, new bnsd((Throwable) mo68446k().mo68397b(bnrw.f132044a), bnsk, bnux.m110473b(bnrz.class, new Throwable(), bnsk.f132080f)));
        }
        bntj c = bntd.m110370c();
        if (!c.f132129b.isEmpty()) {
            mo68403a(bnrw.f132049f, c);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bnro mo26017a();

    /* renamed from: a */
    public final void mo68402a(int i) {
        if (mo68445j()) {
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException("rate limit count must be positive");
        } else if (i > 1) {
            mo68403a(bnrw.f132045b, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bnuu mo68391b();

    /* renamed from: c */
    public final Level mo68438c() {
        return this.f132056b;
    }

    /* renamed from: d */
    public final long mo68439d() {
        return this.f132057c;
    }

    /* renamed from: e */
    public final String mo68440e() {
        return mo26017a().f132041b.mo68471a();
    }

    /* renamed from: f */
    public final bnsc mo68441f() {
        bnsc bnsc = this.f132059e;
        if (bnsc != null) {
            return bnsc;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    /* renamed from: g */
    public final bntk mo68442g() {
        return this.f132060f;
    }

    /* renamed from: h */
    public final Object[] mo68443h() {
        if (this.f132060f != null) {
            return this.f132061g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    /* renamed from: i */
    public final Object mo68444i() {
        if (this.f132060f == null) {
            return this.f132061g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    /* renamed from: j */
    public final boolean mo68445j() {
        return this.f132058d != null && Boolean.TRUE.equals(this.f132058d.mo68397b(bnrw.f132048e));
    }

    /* renamed from: k */
    public final bnta mo68446k() {
        bnrx bnrx = this.f132058d;
        return bnrx == null ? bnsz.f132117a : bnrx;
    }

    /* renamed from: l */
    public final boolean mo68447l() {
        return mo68445j() || mo26017a().mo68389c(this.f132056b);
    }

    /* renamed from: m */
    public final void mo68448m() {
        if (m110189n()) {
            m110188b(f132055a, "");
        }
    }

    /* renamed from: a */
    public final void mo68403a(bnsj bnsj, Object obj) {
        if (this.f132058d == null) {
            this.f132058d = new bnrx();
        }
        bnrx bnrx = this.f132058d;
        int a = bnrx.mo68394a(bnsj);
        if (a == -1) {
            int i = bnrx.f132052b + 1;
            Object[] objArr = bnrx.f132051a;
            int length = objArr.length;
            if (i + i > length) {
                bnrx.f132051a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = bnrx.f132051a;
            int i2 = bnrx.f132052b;
            bnuy.m110474a(bnsj, "metadata key");
            objArr2[i2 + i2] = bnsj;
            Object[] objArr3 = bnrx.f132051a;
            int i3 = bnrx.f132052b;
            bnuy.m110474a(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            bnrx.f132052b++;
            return;
        }
        Object[] objArr4 = bnrx.f132051a;
        bnuy.m110474a(obj, "metadata value");
        objArr4[a + a + 1] = obj;
    }

    /* renamed from: a */
    public final void mo68404a(bnsk bnsk) {
        bnuy.m110474a(bnsk, "stack size");
        if (bnsk != bnsk.NONE) {
            mo68403a(bnrw.f132050g, bnsk);
        }
    }

    /* renamed from: a */
    public final void mo68405a(String str) {
        if (m110189n()) {
            m110188b(f132055a, str);
        }
    }

    /* renamed from: a */
    public final void mo68406a(String str, byte b) {
        if (m110189n()) {
            m110188b(str, Byte.valueOf(b));
        }
    }

    /* renamed from: a */
    public final void mo68407a(String str, byte b, byte b2) {
        if (m110189n()) {
            m110188b(str, Byte.valueOf(b), Byte.valueOf(b2));
        }
    }

    /* renamed from: a */
    public final void mo68408a(String str, double d, double d2) {
        if (m110189n()) {
            m110188b(str, Double.valueOf(d), Double.valueOf(d2));
        }
    }

    /* renamed from: a */
    public final void mo68409a(String str, int i) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo68410a(String str, int i, byte b) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i), Byte.valueOf(b));
        }
    }

    /* renamed from: a */
    public final void mo68411a(String str, int i, int i2) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final void mo68412a(String str, int i, long j) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo68413a(String str, int i, Object obj) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i), obj);
        }
    }

    /* renamed from: a */
    public final void mo68414a(String str, int i, boolean z) {
        if (m110189n()) {
            m110188b(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo68415a(String str, long j) {
        if (m110189n()) {
            m110188b(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo68416a(String str, long j, int i) {
        if (m110189n()) {
            m110188b(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo68417a(String str, long j, long j2) {
        if (m110189n()) {
            m110188b(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: a */
    public final void mo68418a(String str, long j, Object obj) {
        if (m110189n()) {
            m110188b(str, Long.valueOf(j), obj);
        }
    }

    /* renamed from: a */
    public final void mo68419a(String str, long j, boolean z) {
        if (m110189n()) {
            m110188b(str, Long.valueOf(j), Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo68420a(String str, Object obj) {
        if (m110189n()) {
            m110188b(str, obj);
        }
    }

    /* renamed from: a */
    public final void mo68421a(String str, Object obj, byte b) {
        if (m110189n()) {
            m110188b(str, obj, Byte.valueOf(b));
        }
    }

    /* renamed from: a */
    public final void mo68422a(String str, Object obj, int i) {
        if (m110189n()) {
            m110188b(str, obj, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo68423a(String str, Object obj, long j) {
        if (m110189n()) {
            m110188b(str, obj, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo68424a(String str, Object obj, Object obj2) {
        if (m110189n()) {
            m110188b(str, obj, obj2);
        }
    }

    /* renamed from: a */
    public final void mo68425a(String str, Object obj, Object obj2, Object obj3) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3);
        }
    }

    /* renamed from: a */
    public final void mo68426a(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3, obj4);
        }
    }

    /* renamed from: a */
    public final void mo68427a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    /* renamed from: a */
    public final void mo68428a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    /* renamed from: a */
    public final void mo68429a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    /* renamed from: a */
    public final void mo68430a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (m110189n()) {
            m110188b(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    /* renamed from: a */
    public final void mo68431a(String str, Object obj, boolean z) {
        if (m110189n()) {
            m110188b(str, obj, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final void mo68432a(String str, String str2, int i, String str3) {
        bnsb bnsb = new bnsb(str, str2, i, str3);
        if (this.f132059e == null) {
            this.f132059e = bnsb;
        }
    }

    /* renamed from: a */
    public final void mo68433a(String str, short s) {
        if (m110189n()) {
            m110188b(str, Short.valueOf(s));
        }
    }

    /* renamed from: a */
    public final void mo68434a(String str, boolean z, Object obj) {
        if (m110189n()) {
            m110188b(str, Boolean.valueOf(z), obj);
        }
    }

    /* renamed from: a */
    public final void mo68435a(String str, boolean z, boolean z2) {
        if (m110189n()) {
            m110188b(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: a */
    public final void mo68436a(String str, Object[] objArr) {
        if (m110189n()) {
            m110188b(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: a */
    public final void mo68437a(Throwable th) {
        if (th != null) {
            mo68403a(bnrw.f132044a, th);
        }
    }
}
