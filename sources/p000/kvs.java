package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: kvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvs implements cayy {

    /* renamed from: a */
    private final cijl f25228a;

    /* renamed from: b */
    private final cijl f25229b;

    /* renamed from: c */
    private final cijl f25230c;

    /* renamed from: d */
    private final cijl f25231d;

    public kvs(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25228a = cijl;
        this.f25229b = cijl2;
        this.f25230c = cijl3;
        this.f25231d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        lhi b = ((kvv) this.f25231d).mo6445a();
        int i = Build.VERSION.SDK_INT;
        ccke.f179227a.mo6606a().mo76174a();
        bmxv b2 = bmxv.m108566b(new lcl((Context) ((cayz) this.f25228a).f176439a, (kpk) this.f25229b.mo6445a(), (kbe) this.f25230c.mo6445a(), b));
        cazf.m127593a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
