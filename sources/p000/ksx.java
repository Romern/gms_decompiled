package p000;

import android.content.Context;
import com.android.volley.RequestQueue;

/* renamed from: ksx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ksx implements cayy {

    /* renamed from: a */
    private final cijl f24957a;

    public ksx(cijl cijl) {
        this.f24957a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context context = (Context) ((cayz) this.f24957a).f176439a;
        RequestQueue h = krp.m18485h();
        cazf.m127593a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
