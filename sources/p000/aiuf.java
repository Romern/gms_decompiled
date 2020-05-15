package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: aiuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiuf {

    /* renamed from: a */
    private final aivd f69772a;

    /* renamed from: b */
    private final Map f69773b = new C1223np();

    /* renamed from: c */
    private final Map f69774c = new C1223np();

    /* renamed from: d */
    private final Map f69775d = new C1223np();

    /* renamed from: e */
    private int f69776e = 1;

    /* renamed from: f */
    private byte[] f69777f;

    public aiuf(aivd aivd) {
        this.f69772a = aivd;
        this.f69777f = aivd.mo38105d();
    }

    /* renamed from: b */
    private final void m57949b() {
        if (!Arrays.equals(this.f69777f, this.f69772a.mo38105d())) {
            srn srn = ailf.f69111a;
            this.f69777f = this.f69772a.mo38105d();
            this.f69776e = 1;
            this.f69773b.clear();
            this.f69774c.clear();
            this.f69775d.clear();
        }
    }

    /* renamed from: f */
    private final aiud m57950f(short s) {
        m57949b();
        Map map = this.f69774c;
        Short valueOf = Short.valueOf(s);
        aiud aiud = (aiud) map.get(valueOf);
        if (aiud != null) {
            return aiud;
        }
        aiud aiud2 = new aiud();
        this.f69774c.put(valueOf, aiud2);
        return aiud2;
    }

    /* renamed from: g */
    private final aiue m57951g(short s) {
        m57949b();
        Map map = this.f69773b;
        Short valueOf = Short.valueOf(s);
        aiue aiue = (aiue) map.get(valueOf);
        if (aiue != null) {
            return aiue;
        }
        aiue aiue2 = new aiue();
        this.f69773b.put(valueOf, aiue2);
        return aiue2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo38038a() {
        int i;
        m57949b();
        i = this.f69776e;
        this.f69776e = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo38044c(short s) {
        srn srn = ailf.f69111a;
        this.f69774c.remove(Short.valueOf(s));
        m57951g(s).f69770a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo38045d(short s) {
        srn srn = ailf.f69111a;
        this.f69773b.remove(Short.valueOf(s));
        m57950f(s).f69769a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized aivg mo38046e(short s) {
        return m57951g(s).f69771b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo38039a(short s) {
        Integer num;
        num = (Integer) this.f69775d.get(Short.valueOf(s));
        return num != null ? num.intValue() : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38040a(short s, int i) {
        this.f69775d.put(Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo38043b(short s) {
        boolean z;
        boolean z2 = m57950f(s).f69769a;
        z = true;
        m57950f(s).f69769a = true;
        boolean z3 = m57951g(s).f69770a;
        m57951g(s).f69770a = true;
        if (!z2) {
            if (!z3) {
                z = false;
            }
        }
        if (!z) {
            srn srn = ailf.f69111a;
        } else {
            srn srn2 = ailf.f69111a;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38041a(short s, aivg aivg) {
        m57951g(s).f69771b = aivg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo38042a(short s, boolean z) {
        if (!z) {
            mo38045d(s);
        } else {
            mo38044c(s);
        }
    }
}
