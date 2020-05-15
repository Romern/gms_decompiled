package p000;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: bnfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfi implements Iterable {

    /* renamed from: a */
    private final bmxv f131560a;

    protected bnfi() {
        this.f131560a = bmvz.f131120a;
    }

    /* renamed from: a */
    public static bnfi m109235a(Iterable iterable) {
        return iterable instanceof bnfi ? (bnfi) iterable : new bnfe(iterable, iterable);
    }

    /* renamed from: b */
    public static bnfi m109238b(Iterable iterable) {
        bmxy.m108581a(iterable);
        return new bnff(iterable);
    }

    /* renamed from: c */
    public final bmxv mo67507c(bmxz bmxz) {
        return bnjd.m109599f(mo67504a(), bmxz);
    }

    public String toString() {
        return bnjd.m109578a(mo67504a());
    }

    public bnfi(Iterable iterable) {
        bmxy.m108581a(iterable);
        this.f131560a = bmxv.m108567c(this == iterable ? null : iterable);
    }

    /* renamed from: a */
    public static bnfi m109236a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            bmxy.m108581a(iterableArr[i]);
        }
        return new bnfh(iterableArr);
    }

    /* renamed from: b */
    public final bngx mo67505b() {
        return bngx.m109355a(mo67504a());
    }

    /* renamed from: c */
    public final bnic mo67508c() {
        return bnic.m109488a(mo67504a());
    }

    /* renamed from: b */
    public final boolean mo67506b(bmxz bmxz) {
        return bnjd.m109592c(mo67504a(), bmxz);
    }

    /* renamed from: a */
    public static bnfi m109237a(Object[] objArr) {
        return m109235a(Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final bnfi mo67501a(bmxj bmxj) {
        return m109235a(bnjd.m109575a(mo67504a(), bmxj));
    }

    /* renamed from: a */
    public final bnfi mo67502a(bmxz bmxz) {
        return m109235a(bnjd.m109586b(mo67504a(), bmxz));
    }

    /* renamed from: a */
    public final bngx mo67503a(Comparator comparator) {
        return bnny.m109908a(comparator).mo67379b(mo67504a());
    }

    /* renamed from: a */
    public final Iterable mo67504a() {
        return (Iterable) this.f131560a.mo66812a(this);
    }
}
