package p000;

import java.util.concurrent.Executor;

/* renamed from: kgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kgz implements cayy {

    /* renamed from: a */
    private final cijl f24117a;

    public kgz(cijl cijl) {
        this.f24117a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Executor executor = (Executor) ((cayz) this.f24117a).f176439a;
        cazf.m127593a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
