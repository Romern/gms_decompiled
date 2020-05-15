package p000;

import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: acfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfo implements cayy {

    /* renamed from: a */
    private final cijl f59713a;

    /* renamed from: b */
    private final cijl f59714b;

    /* renamed from: c */
    private final cijl f59715c;

    /* renamed from: d */
    private final cijl f59716d;

    /* renamed from: e */
    private final cijl f59717e;

    /* renamed from: f */
    private final cijl f59718f;

    /* renamed from: g */
    private final cijl f59719g;

    public acfo(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        this.f59713a = cijl;
        this.f59714b = cijl2;
        this.f59715c = cijl3;
        this.f59716d = cijl4;
        this.f59717e = cijl5;
        this.f59718f = cijl6;
        this.f59719g = cijl7;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        cayo b = cayx.m127580b(this.f59713a);
        accz b2 = ((acda) this.f59714b).mo6445a();
        PackageManager b3 = ((acfk) this.f59715c).mo6445a();
        cayo b4 = cayx.m127580b(this.f59716d);
        Executor executor = (Executor) this.f59717e.mo6445a();
        apsn b5 = ((acfm) this.f59718f).mo6445a();
        aceo b6 = ((acep) this.f59719g).mo6445a();
        bmzi b7 = acfj.m49022b();
        ayuj ayuj = acaw.f59297aa;
        cazf.m127593a(ayuj, "Cannot return null from a non-@Nullable @Provides method");
        ayuj ayuj2 = acaw.f59399s;
        cazf.m127593a(ayuj2, "Cannot return null from a non-@Nullable @Provides method");
        ayuj ayuj3 = acaw.f59400t;
        cazf.m127593a(ayuj3, "Cannot return null from a non-@Nullable @Provides method");
        return new acev(b, b2, b3, b4, executor, b5, b6, b7, ayuj, ayuj2, ayuj3);
    }
}
