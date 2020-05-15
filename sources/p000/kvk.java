package p000;

import android.content.Context;

/* renamed from: kvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvk implements cayy {

    /* renamed from: a */
    private final cijl f25180a;

    /* renamed from: b */
    private final cijl f25181b;

    /* renamed from: c */
    private final cijl f25182c;

    /* renamed from: d */
    private final cijl f25183d;

    public kvk(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25180a = cijl;
        this.f25181b = cijl2;
        this.f25182c = cijl3;
        this.f25183d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25180a).f176439a;
        kpk kpk = (kpk) this.f25181b.mo6445a();
        kbe kbe = (kbe) this.f25182c.mo6445a();
        lhi b = ((kvv) this.f25183d).mo6445a();
        if (cckb.f179223a.mo6606a().mo76172b()) {
            obj = bmxv.m108566b(new lbn(context, kpk, kbe, b));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
