package p000;

import android.content.Context;

/* renamed from: kvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvw implements cayy {

    /* renamed from: a */
    private final cijl f25236a;

    /* renamed from: b */
    private final cijl f25237b;

    public kvw(cijl cijl, cijl cijl2) {
        this.f25236a = cijl;
        this.f25237b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25236a).f176439a;
        kyp kyp = (kyp) ((cayz) this.f25237b).f176439a;
        if (kyp == kyp.PERSISTENT) {
            obj = new lhr(context.getSharedPreferences(kvu.m18639a(kyp), 0), new lhs(context));
        } else {
            obj = new lhx(context.getSharedPreferences(kvu.m18639a(kyp), 0), new lhs(context));
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
