package p000;

/* renamed from: bngj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bngj extends bnhe implements bndw {
    /* renamed from: b */
    public static bngh m109310b() {
        return new bngh();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bndw mo67382a() {
        throw null;
    }

    /* renamed from: c */
    public abstract bngj mo67620c();

    /* renamed from: d */
    public final bnic values() {
        return mo67620c().keySet();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ bngm mo67622e() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bngi(this);
    }
}
