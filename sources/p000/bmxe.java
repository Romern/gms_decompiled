package p000;

/* renamed from: bmxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bmxe implements bmxj {

    /* renamed from: a */
    private transient bmxe f131166a;

    /* renamed from: a */
    public bmxe mo66854a() {
        bmxe bmxe = this.f131166a;
        if (bmxe != null) {
            return bmxe;
        }
        bmxd bmxd = new bmxd(this);
        this.f131166a = bmxd;
        return bmxd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo12636a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo12637b(Object obj);

    /* renamed from: c */
    public Object mo66855c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = mo12637b(obj);
        bmxy.m108581a(b);
        return b;
    }

    /* renamed from: d */
    public Object mo66856d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = mo12636a(obj);
        bmxy.m108581a(a);
        return a;
    }

    protected bmxe() {
    }

    /* renamed from: a */
    public final Iterable mo66860a(Iterable iterable) {
        bmxy.m108582a(iterable, "fromIterable");
        return new bmxc(this, iterable);
    }

    @Deprecated
    public final Object apply(Object obj) {
        return mo66855c(obj);
    }
}
