package p000;

import java.util.concurrent.Executor;

/* renamed from: bbhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhq implements cayy {

    /* renamed from: a */
    private final bbhm f102670a;

    public bbhq(bbhm bbhm) {
        this.f102670a = bbhm;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Executor executor = this.f102670a.f102659b.f102662a;
        cazf.m127593a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
