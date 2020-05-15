package p000;

import android.content.Context;

/* renamed from: acfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfm implements cayy {

    /* renamed from: a */
    private final cijl f59711a;

    public acfm(cijl cijl) {
        this.f59711a = cijl;
    }

    /* renamed from: b */
    public final apsn mo6445a() {
        aply aply = new aply();
        aply.f84722a = "AppsUploadModule";
        apsn a = aplx.m70649a((Context) this.f59711a.mo6445a(), aply.mo47407a());
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
