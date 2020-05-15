package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: axd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axd implements Comparable {

    /* renamed from: a */
    public String f2473a;

    /* renamed from: b */
    public String f2474b;

    /* renamed from: c */
    public axd f2475c;

    /* renamed from: d */
    public List f2476d;

    /* renamed from: e */
    public axp f2477e;

    /* renamed from: f */
    public boolean f2478f;

    /* renamed from: g */
    public boolean f2479g;

    /* renamed from: h */
    public boolean f2480h;

    /* renamed from: i */
    public boolean f2481i;

    /* renamed from: j */
    private List f2482j;

    public axd(String str, axp axp) {
        this(str, null, axp);
    }

    /* renamed from: a */
    private static final axd m2330a(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axd axd = (axd) it.next();
            if (axd.f2473a.equals(str)) {
                return axd;
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m2331c(String str) {
        if (!"[]".equals(str) && mo2792a(str) != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
            sb.append("Duplicate property or field node '");
            sb.append(str);
            sb.append("'");
            throw new awn(sb.toString(), 203);
        }
    }

    /* renamed from: k */
    private final boolean m2332k() {
        return "xml:lang".equals(this.f2473a);
    }

    /* renamed from: l */
    private final boolean m2333l() {
        return "rdf:type".equals(this.f2473a);
    }

    /* renamed from: m */
    private final List m2334m() {
        if (this.f2476d == null) {
            this.f2476d = new ArrayList(0);
        }
        return this.f2476d;
    }

    /* renamed from: b */
    public final axd mo2795b(int i) {
        return (axd) m2334m().get(i - 1);
    }

    /* renamed from: b */
    public final void mo2797b() {
        this.f2482j = null;
    }

    public final Object clone() {
        axp axp;
        try {
            axp = new axp(mo2810i().f2502a);
        } catch (awn e) {
            axp = new axp();
        }
        axd axd = new axd(this.f2473a, this.f2474b, axp);
        try {
            Iterator f = mo2807f();
            while (f.hasNext()) {
                axd.mo2794a((axd) ((axd) f.next()).clone());
            }
            Iterator h = mo2809h();
            while (h.hasNext()) {
                axd.mo2800c((axd) ((axd) h.next()).clone());
            }
        } catch (awn e2) {
        }
        return axd;
    }

    public final int compareTo(Object obj) {
        if (mo2810i().mo2847g()) {
            return this.f2474b.compareTo(((axd) obj).f2474b);
        }
        return this.f2473a.compareTo(((axd) obj).f2473a);
    }

    /* renamed from: d */
    public final int mo2803d() {
        List list = this.f2476d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo2805e(axd axd) {
        m2331c(axd.f2473a);
        axd.f2475c = this;
        mo2811j().add(0, axd);
    }

    /* renamed from: f */
    public final Iterator mo2807f() {
        if (this.f2482j != null) {
            return mo2811j().iterator();
        }
        return Collections.EMPTY_LIST.listIterator();
    }

    /* renamed from: g */
    public final boolean mo2808g() {
        List list = this.f2476d;
        return list != null && list.size() > 0;
    }

    /* renamed from: h */
    public final Iterator mo2809h() {
        if (this.f2476d != null) {
            return new axc(m2334m().iterator());
        }
        return Collections.EMPTY_LIST.iterator();
    }

    /* renamed from: i */
    public final axp mo2810i() {
        if (this.f2477e == null) {
            this.f2477e = new axp();
        }
        return this.f2477e;
    }

    /* renamed from: j */
    public final List mo2811j() {
        if (this.f2482j == null) {
            this.f2482j = new ArrayList(0);
        }
        return this.f2482j;
    }

    public axd(String str, String str2, axp axp) {
        this.f2482j = null;
        this.f2476d = null;
        this.f2473a = str;
        this.f2474b = str2;
        this.f2477e = axp;
    }

    /* renamed from: b */
    public final axd mo2796b(String str) {
        return m2330a(this.f2476d, str);
    }

    /* renamed from: d */
    public final void mo2804d(axd axd) {
        axp i = mo2810i();
        if (axd.m2332k()) {
            i.mo2838a(false);
        } else if (axd.m2333l()) {
            i.mo2842c(false);
        }
        m2334m().remove(axd);
        if (this.f2476d.isEmpty()) {
            i.mo2840b(false);
            this.f2476d = null;
        }
    }

    /* renamed from: a */
    public final axd mo2791a(int i) {
        return (axd) mo2811j().get(i - 1);
    }

    /* renamed from: c */
    public final int mo2799c() {
        List list = this.f2482j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo2806e() {
        List list = this.f2482j;
        return list != null && list.size() > 0;
    }

    /* renamed from: a */
    public final axd mo2792a(String str) {
        return m2330a(mo2811j(), str);
    }

    /* renamed from: b */
    public final void mo2798b(axd axd) {
        mo2811j().remove(axd);
        mo2793a();
    }

    /* renamed from: c */
    public final void mo2800c(axd axd) {
        String str = axd.f2473a;
        if ("[]".equals(str) || mo2796b(str) == null) {
            axd.f2475c = this;
            axd.mo2810i().mo2828a(32, true);
            mo2810i().mo2840b(true);
            if (axd.m2332k()) {
                this.f2477e.mo2838a(true);
                m2334m().add(0, axd);
            } else if (axd.m2333l()) {
                this.f2477e.mo2842c(true);
                m2334m().add(this.f2477e.mo2839a() ? 1 : 0, axd);
            } else {
                m2334m().add(axd);
            }
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("Duplicate '");
            sb.append(str);
            sb.append("' qualifier");
            throw new awn(sb.toString(), 203);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2793a() {
        if (this.f2482j.isEmpty()) {
            this.f2482j = null;
        }
    }

    /* renamed from: a */
    public final void mo2794a(axd axd) {
        m2331c(axd.f2473a);
        axd.f2475c = this;
        mo2811j().add(axd);
    }
}
