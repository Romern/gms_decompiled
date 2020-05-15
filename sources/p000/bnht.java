package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bnht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnht extends bndv implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final transient bnhe f131642b;

    /* renamed from: c */
    final transient int f131643c;

    public bnht(bnhe bnhe, int i) {
        this.f131642b = bnhe;
        this.f131643c = i;
    }

    /* renamed from: b */
    public static bnhp m109442b() {
        return new bnhp();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo67308a(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: c */
    public final int mo67269c() {
        return this.f131643c;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Collection mo67127c(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo67270d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final Set mo67273e() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: f */
    public final bnic mo67316o() {
        return this.f131642b.keySet();
    }

    /* renamed from: g */
    public abstract bngm mo67692g(Object obj);

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Collection mo67275g() {
        return new bnhs(this);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Collection mo67277i() {
        return new bnhq(this);
    }

    /* renamed from: k */
    public final Map mo67279k() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: l */
    public bngm mo67315n() {
        return (bngm) super.mo67315n();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ Collection mo67317p() {
        throw null;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Map mo67318q() {
        return this.f131642b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final bnrd mo67278j() {
        return new bnhn(this);
    }

    /* renamed from: t */
    public final bngm mo67737t() {
        return (bngm) super.mo67317p();
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo67268a(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final boolean mo67271d(Object obj) {
        return this.f131642b.containsKey(obj);
    }

    /* renamed from: f */
    public final boolean mo67312f(Object obj) {
        return obj != null && super.mo67312f(obj);
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo67310c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
