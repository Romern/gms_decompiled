package p000;

import android.content.SharedPreferences;

/* renamed from: bdfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdfy implements cayy {

    /* renamed from: a */
    private final cijl f105566a;

    public bdfy(cijl cijl) {
        this.f105566a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((bmzi) ((cayz) this.f105566a).f176439a).mo6606a();
        cazf.m127593a(sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferences;
    }
}
