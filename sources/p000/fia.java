package p000;

import android.content.Context;

/* renamed from: fia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fia implements cayy {

    /* renamed from: a */
    private final fhu f16633a;

    public fia(fhu fhu) {
        this.f16633a = fhu;
    }

    /* renamed from: a */
    public static Context m11732a(fhu fhu) {
        Context context = fhu.f16617a;
        cazf.m127593a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    /* renamed from: b */
    public final Context mo6445a() {
        return m11732a(this.f16633a);
    }
}
