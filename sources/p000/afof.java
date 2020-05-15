package p000;

import java.util.concurrent.Executor;

/* renamed from: afof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afof implements cayy {

    /* renamed from: a */
    private final afnu f64421a;

    public afof(afnu afnu) {
        this.f64421a = afnu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Executor executor = this.f64421a.f64414a;
        cazf.m127593a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
