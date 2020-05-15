package p000;

import java.util.List;

/* renamed from: bngu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngu extends bngx {

    /* renamed from: a */
    private final transient bngx f131607a;

    public bngu(bngx bngx) {
        this.f131607a = bngx;
    }

    /* renamed from: c */
    private final int m109345c(int i) {
        return (size() - 1) - i;
    }

    /* renamed from: d */
    private final int m109346d(int i) {
        return size() - i;
    }

    /* renamed from: a */
    public final bngx mo67669a(int i, int i2) {
        bmxy.m108585a(i, i2, size());
        return this.f131607a.subList(m109346d(i2), m109346d(i)).mo67670d();
    }

    public final boolean contains(Object obj) {
        return this.f131607a.contains(obj);
    }

    /* renamed from: d */
    public final bngx mo67670d() {
        return this.f131607a;
    }

    public final Object get(int i) {
        bmxy.m108584a(i, size());
        return this.f131607a.get(m109345c(i));
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return this.f131607a.mo67640h();
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f131607a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return m109345c(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f131607a.indexOf(obj);
        if (indexOf >= 0) {
            return m109345c(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.f131607a.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
