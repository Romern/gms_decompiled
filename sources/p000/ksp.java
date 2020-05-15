package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ksp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ksp implements cayy {

    /* renamed from: a */
    private final cijl f24946a;

    public ksp(cijl cijl) {
        this.f24946a = cijl;
    }

    /* renamed from: b */
    public final PackageManager mo6445a() {
        PackageManager c = krp.m18475c((Context) ((cayz) this.f24946a).f176439a);
        cazf.m127593a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
