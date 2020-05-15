package p000;

import java.util.Set;

/* renamed from: aywa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywa implements cayy {

    /* renamed from: a */
    private final cijl f98592a;

    /* renamed from: b */
    private final cijl f98593b;

    /* renamed from: c */
    private final cijl f98594c;

    /* renamed from: d */
    private final cijl f98595d;

    public aywa(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f98592a = cijl;
        this.f98593b = cijl2;
        this.f98594c = cijl3;
        this.f98595d = cijl4;
    }

    /* renamed from: a */
    public static aywa m84954a(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        return new aywa(cijl, cijl2, cijl3, cijl4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        ayvq b = ((ayvz) this.f98592a).mo6445a();
        cijl cijl = this.f98594c;
        Set b2 = ((cazi) this.f98595d).mo6445a();
        aytf.m84780b();
        ayvu ayvu = new ayvu((bqgj) this.f98593b.mo6445a(), cijl, b2, b);
        cazf.m127593a(ayvu, "Cannot return null from a non-@Nullable @Provides method");
        return ayvu;
    }
}
