package p000;

/* renamed from: ood */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ood {

    /* renamed from: a */
    private Object f38062a;

    public ood(Object obj) {
        this.f38062a = obj;
    }

    /* renamed from: a */
    public final Object mo22381a() {
        Object[] objArr = new Object[0];
        Object obj = this.f38062a;
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(bmzh.m108675a("None of the supplied values were non-null!", objArr));
    }

    /* renamed from: a */
    public final Object mo22382a(bmzi bmzi) {
        if (this.f38062a == null) {
            this.f38062a = bmzi.mo6606a();
        }
        return mo22381a();
    }

    /* renamed from: a */
    public final Object mo22383a(Object obj) {
        if (this.f38062a == null) {
            this.f38062a = obj;
        }
        return mo22381a();
    }
}
