package p000;

import java.util.Set;

/* renamed from: ayxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxx implements cayy {

    /* renamed from: a */
    private final cijl f98719a;

    /* renamed from: b */
    private final cijl f98720b;

    public ayxx(cijl cijl, cijl cijl2) {
        this.f98719a = cijl;
        this.f98720b = cijl2;
    }

    /* renamed from: a */
    public static ayxx m85058a(cijl cijl, cijl cijl2) {
        return new ayxx(cijl, cijl2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        azaa.m85121b();
        bnia j = bnic.m109500j();
        j.mo67752b((Iterable) ((Set) ((cayz) this.f98719a).f176439a));
        j.mo67629b(((ayxq) this.f98720b.mo6445a()).f98688c);
        ayxj ayxj = new ayxj(j.mo67751a());
        cazf.m127593a(ayxj, "Cannot return null from a non-@Nullable @Provides method");
        return ayxj;
    }
}
