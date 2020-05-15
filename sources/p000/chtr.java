package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: chtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chtr {

    /* renamed from: a */
    public static final chtk f189133a = new chtf();

    /* renamed from: b */
    public static final chti f189134b = new chtg();

    /* renamed from: c */
    static final boan f189135c = boan.f132470d.mo68783a();

    /* renamed from: d */
    public Object[] f189136d;

    /* renamed from: e */
    public int f189137e;

    public chtr() {
    }

    /* renamed from: a */
    private final void m149544a(int i, Object obj) {
        if (this.f189136d instanceof byte[][]) {
            m149548d(m149546c());
        }
        this.f189136d[i + i + 1] = obj;
    }

    /* renamed from: c */
    private final int m149546c() {
        Object[] objArr = this.f189136d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: d */
    private final void m149548d(int i) {
        Object[] objArr = new Object[i];
        if (!m149549d()) {
            System.arraycopy(this.f189136d, 0, objArr, 0, mo85646a());
        }
        this.f189136d = objArr;
    }

    /* renamed from: d */
    private final boolean m149549d() {
        return this.f189137e == 0;
    }

    /* renamed from: a */
    public final int mo85646a() {
        int i = this.f189137e;
        return i + i;
    }

    /* renamed from: b */
    public final Object mo85652b(chtn chtn) {
        for (int i = this.f189137e - 1; i >= 0; i--) {
            if (Arrays.equals(chtn.f189130b, mo85651a(i))) {
                return mo85647a(i, chtn);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f189137e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(mo85651a(i), bmwy.f131156a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f189135c.mo68794a(mo85654b(i)));
            } else {
                sb.append(new String(mo85654b(i), bmwy.f131156a));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public chtr(int i, Object[] objArr) {
        this.f189137e = i;
        this.f189136d = objArr;
    }

    /* renamed from: c */
    private final Object m149547c(int i) {
        return this.f189136d[i + i + 1];
    }

    /* renamed from: c */
    public final void mo85655c(chtn chtn) {
        if (!m149549d()) {
            int i = 0;
            for (int i2 = 0; i2 < this.f189137e; i2++) {
                if (!Arrays.equals(chtn.f189130b, mo85651a(i2))) {
                    m149545a(i, mo85651a(i2));
                    m149544a(i, m149547c(i2));
                    i++;
                }
            }
            Arrays.fill(this.f189136d, i + i, mo85646a(), (Object) null);
            this.f189137e = i;
        }
    }

    /* renamed from: d */
    public final void mo85656d(chtn chtn) {
        if (!m149549d()) {
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 0; i2 < this.f189137e; i2++) {
                if (!Arrays.equals(chtn.f189130b, mo85651a(i2))) {
                    m149545a(i, mo85651a(i2));
                    m149544a(i, m149547c(i2));
                    i++;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mo85647a(i2, chtn));
                }
            }
            Arrays.fill(this.f189136d, i + i, mo85646a(), (Object) null);
            this.f189137e = i;
        }
    }

    /* renamed from: a */
    private final void m149545a(int i, byte[] bArr) {
        this.f189136d[i + i] = bArr;
    }

    /* renamed from: b */
    public final Set mo85653b() {
        if (m149549d()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f189137e);
        for (int i = 0; i < this.f189137e; i++) {
            hashSet.add(new String(mo85651a(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Object mo85647a(int i, chtn chtn) {
        Object c = m149547c(i);
        if (c instanceof byte[]) {
            return chtn.mo85635a((byte[]) c);
        }
        chto chto = (chto) c;
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo85654b(int i) {
        Object c = m149547c(i);
        if (c instanceof byte[]) {
            return (byte[]) c;
        }
        chto chto = (chto) c;
        throw null;
    }

    /* renamed from: a */
    public final void mo85648a(chtn chtn, Object obj) {
        bmxy.m108582a(chtn, "key");
        bmxy.m108582a(obj, "value");
        if (mo85646a() == 0 || mo85646a() == m149546c()) {
            int a = mo85646a();
            m149548d(Math.max(a + a, 8));
        }
        m149545a(this.f189137e, chtn.f189130b);
        int i = this.f189137e;
        this.f189136d[i + i + 1] = chtn.mo85636a(obj);
        this.f189137e++;
    }

    /* renamed from: a */
    public final void mo85649a(chtr chtr) {
        if (!chtr.m149549d()) {
            int c = m149546c() - mo85646a();
            if (m149549d() || c < chtr.mo85646a()) {
                m149548d(mo85646a() + chtr.mo85646a());
            }
            System.arraycopy(chtr.f189136d, 0, this.f189136d, mo85646a(), chtr.mo85646a());
            this.f189137e += chtr.f189137e;
        }
    }

    /* renamed from: a */
    public final boolean mo85650a(chtn chtn) {
        for (int i = 0; i < this.f189137e; i++) {
            if (Arrays.equals(chtn.f189130b, mo85651a(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final byte[] mo85651a(int i) {
        return (byte[]) this.f189136d[i + i];
    }
}
