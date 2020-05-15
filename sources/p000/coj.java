package p000;

/* renamed from: coj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class coj {

    /* renamed from: a */
    final coi f7161a;

    /* renamed from: b */
    private final Class f7162b;

    /* renamed from: c */
    private final Class f7163c;

    public coj(Class cls, Class cls2, coi coi) {
        this.f7162b = cls;
        this.f7163c = cls2;
        this.f7161a = coi;
    }

    /* renamed from: a */
    public final boolean mo4033a(Class cls, Class cls2) {
        return this.f7162b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7163c);
    }
}
