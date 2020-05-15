package p000;

/* renamed from: cpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cpq {

    /* renamed from: a */
    final Class f11780a;

    /* renamed from: b */
    final cdm f11781b;

    /* renamed from: c */
    private final Class f11782c;

    public cpq(Class cls, Class cls2, cdm cdm) {
        this.f11782c = cls;
        this.f11780a = cls2;
        this.f11781b = cdm;
    }

    /* renamed from: a */
    public final boolean mo8088a(Class cls, Class cls2) {
        return this.f11782c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11780a);
    }
}
