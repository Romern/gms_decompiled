package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: acfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acfk implements cayy {

    /* renamed from: a */
    private final cijl f59709a;

    public acfk(cijl cijl) {
        this.f59709a = cijl;
    }

    /* renamed from: b */
    public final PackageManager mo6445a() {
        PackageManager packageManager = ((Context) this.f59709a.mo6445a()).getPackageManager();
        cazf.m127593a(packageManager, "Cannot return null from a non-@Nullable @Provides method");
        return packageManager;
    }
}
