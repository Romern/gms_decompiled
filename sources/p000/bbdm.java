package p000;

import java.util.concurrent.Executor;

/* renamed from: bbdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbdm implements cayy {

    /* renamed from: a */
    private final bbdl f102416a;

    public bbdm(bbdl bbdl) {
        this.f102416a = bbdl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Executor executor = this.f102416a.f102415a;
        cazf.m127593a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
