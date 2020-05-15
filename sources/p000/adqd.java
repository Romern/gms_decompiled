package p000;

import android.content.SharedPreferences;

/* renamed from: adqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqd implements cayy {

    /* renamed from: a */
    private final cijl f62481a;

    public adqd(cijl cijl) {
        this.f62481a = cijl;
    }

    /* renamed from: a */
    public static adqd m50985a(cijl cijl) {
        return new adqd(cijl);
    }

    /* renamed from: b */
    public final SharedPreferences mo6445a() {
        SharedPreferences sharedPreferences = ((adpp) this.f62481a).mo6445a().getSharedPreferences("MediastoreIndexerSharedPrefs", 0);
        cazf.m127593a(sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferences;
    }
}
