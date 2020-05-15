package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: dui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dui extends dum {

    /* renamed from: a */
    public final TreeSet f14042a;

    private dui(TreeSet treeSet) {
        super(Long.MAX_VALUE);
        this.f14042a = treeSet;
    }

    /* renamed from: a */
    public static dui m9371a() {
        return new dui(new TreeSet());
    }

    /* renamed from: b */
    public static dui m9372b() {
        dui a = m9371a();
        a.mo9616c();
        return a;
    }

    /* renamed from: c */
    public final void mo9616c() {
        this.f14042a.clear();
        this.f14042a.add(duk.m9379a(0, Long.MAX_VALUE));
    }

    /* renamed from: d */
    public final boolean mo9617d() {
        return sqw.m36041a((Collection) this.f14042a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f14042a.iterator();
        while (it.hasNext()) {
            duk duk = (duk) it.next();
            sb.append("[");
            sb.append(duk.f14046a);
            sb.append(",");
            sb.append(duk.f14047b);
            sb.append("],");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo9614a(dui dui) {
        for (duk duk : dui.f14042a) {
            m9392b(duk, this.f14042a);
        }
    }

    /* renamed from: a */
    public final void mo9615a(duk duk) {
        duk a = duk.m9379a(0, duk.f14046a);
        duk a2 = duk.m9379a(duk.f14047b, Long.MAX_VALUE);
        mo9633a(a, this.f14042a);
        mo9633a(a2, this.f14042a);
    }
}
