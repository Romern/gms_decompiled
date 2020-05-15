package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: ejx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejx implements cayy {

    /* renamed from: a */
    private final cijl f15159a;

    /* renamed from: b */
    private final cijl f15160b;

    public ejx(cijl cijl, cijl cijl2) {
        this.f15159a = cijl;
        this.f15160b = cijl2;
    }

    /* renamed from: b */
    public final ekt mo6445a() {
        ekh b = ejw.m10556b();
        emg.m10662b();
        int i = Build.VERSION.SDK_INT;
        ekb ekb = new ekb((Context) ((cayz) this.f15159a).f176439a, (ekw) this.f15160b.mo6445a(), b);
        cazf.m127593a(ekb, "Cannot return null from a non-@Nullable @Provides method");
        return ekb;
    }
}
