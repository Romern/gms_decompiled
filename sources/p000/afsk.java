package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: afsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afsk implements cayy {

    /* renamed from: a */
    private final cijl f64664a;

    /* renamed from: b */
    private final cijl f64665b;

    /* renamed from: c */
    private final cijl f64666c;

    public afsk(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f64664a = cijl;
        this.f64665b = cijl2;
        this.f64666c = cijl3;
    }

    /* renamed from: b */
    public final bbkl mo6445a() {
        bbkh bbkh = new bbkh((Account) ((cayz) this.f64664a).f176439a, (Context) this.f64665b.mo6445a(), (bavw) this.f64666c.mo6445a());
        cazf.m127593a(bbkh, "Cannot return null from a non-@Nullable @Provides method");
        return bbkh;
    }
}
