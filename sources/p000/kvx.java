package p000;

import android.content.SharedPreferences;

/* renamed from: kvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvx implements cayy {

    /* renamed from: a */
    private final cijl f25238a;

    /* renamed from: b */
    private final cijl f25239b;

    public kvx(cijl cijl, cijl cijl2) {
        this.f25238a = cijl;
        this.f25239b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        lhn lhn = new lhn(((ktm) this.f25238a).mo6445a(), (SharedPreferences) this.f25239b.mo6445a());
        cazf.m127593a(lhn, "Cannot return null from a non-@Nullable @Provides method");
        return lhn;
    }
}
