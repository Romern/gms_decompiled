package p000;

import android.content.Context;

/* renamed from: bbdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbdg implements cayy {

    /* renamed from: a */
    private final bbdf f102406a;

    public bbdg(bbdf bbdf) {
        this.f102406a = bbdf;
    }

    /* renamed from: a */
    public static Context m87839a(bbdf bbdf) {
        Context context = bbdf.f102405a;
        cazf.m127593a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    /* renamed from: b */
    public final Context mo6445a() {
        return m87839a(this.f102406a);
    }
}
