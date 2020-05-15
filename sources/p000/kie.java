package p000;

import java.util.concurrent.Executor;

/* renamed from: kie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kie implements cayy {

    /* renamed from: a */
    private final kic f24204a;

    public kie(kic kic) {
        this.f24204a = kic;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Executor executor = this.f24204a.f24201a;
        cazf.m127593a(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
