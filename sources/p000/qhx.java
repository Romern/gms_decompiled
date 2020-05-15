package p000;

import android.content.Context;
import java.util.List;

/* renamed from: qhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhx implements cayy {

    /* renamed from: a */
    private final cijl f41435a;

    /* renamed from: b */
    private final cijl f41436b;

    public qhx(cijl cijl, cijl cijl2) {
        this.f41435a = cijl;
        this.f41436b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        List a = qhw.m32192a((Context) this.f41435a.mo6445a(), (bngx) ((cayz) this.f41436b).f176439a);
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
