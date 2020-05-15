package p000;

import java.util.Arrays;
import java.util.Set;

/* renamed from: bnhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnhy extends bnhz implements bnnn {

    /* renamed from: a */
    private transient bngx f131651a;

    /* renamed from: b */
    private transient bnic f131652b;

    @Deprecated
    /* renamed from: a */
    public final int mo67286a(Object obj, int i) {
        throw null;
    }

    /* renamed from: a */
    public abstract bnno mo67745a(int i);

    @Deprecated
    /* renamed from: b */
    public final void mo67290b(Object obj, int i) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo67292c(Object obj, int i) {
        throw null;
    }

    public final boolean contains(Object obj) {
        return mo67285a(obj) > 0;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo67323d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return bnns.m109873a(this, obj);
    }

    /* renamed from: g */
    public final bngx mo67639g() {
        bngx bngx = this.f131651a;
        if (bngx != null) {
            return bngx;
        }
        bngx g = super.mo67639g();
        this.f131651a = g;
        return g;
    }

    public final int hashCode() {
        return bnpf.m110044a((Set) mo67324e());
    }

    /* renamed from: i */
    public abstract bnic mo67748i();

    /* renamed from: j */
    public final bnic mo67324e() {
        bnic bnic;
        bnic bnic2 = this.f131652b;
        if (bnic2 != null) {
            return bnic2;
        }
        if (!isEmpty()) {
            bnic = new bnhw(this);
        } else {
            bnic = bnon.f131923a;
        }
        this.f131652b = bnic;
        return bnic;
    }

    public final String toString() {
        return mo67324e().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Object writeReplace();

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        bnrd a = mo67324e().iterator();
        while (a.hasNext()) {
            bnno bnno = (bnno) a.next();
            Arrays.fill(objArr, i, bnno.mo68118a() + i, bnno.f131866a);
            i += bnno.mo68118a();
        }
        return i;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return new bnhu(mo67324e().iterator());
    }
}
