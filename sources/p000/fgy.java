package p000;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgy implements cayy {

    /* renamed from: a */
    private final cijl f16531a;

    /* renamed from: b */
    private final cijl f16532b;

    public fgy(cijl cijl, cijl cijl2) {
        this.f16531a = cijl;
        this.f16532b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        ImageLoader imageLoader = new ImageLoader((RequestQueue) this.f16531a.mo6445a(), (ImageLoader.ImageCache) this.f16532b.mo6445a());
        cazf.m127593a(imageLoader, "Cannot return null from a non-@Nullable @Provides method");
        return imageLoader;
    }
}
