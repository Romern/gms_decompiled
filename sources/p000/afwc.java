package p000;

import android.accounts.Account;

/* renamed from: afwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afwc implements cayy {

    /* renamed from: a */
    private final cijl f64865a;

    /* renamed from: b */
    private final cijl f64866b;

    /* renamed from: c */
    private final cijl f64867c;

    /* renamed from: d */
    private final cijl f64868d;

    public afwc(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f64865a = cijl;
        this.f64866b = cijl2;
        this.f64867c = cijl3;
        this.f64868d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bbio b = ((afwj) this.f64866b).mo6445a();
        batv batv = (batv) this.f64867c.mo6445a();
        afwa afwa = new afwa((String) ((cayz) this.f64868d).f176439a, batv, b, (Account) ((cayz) this.f64865a).f176439a);
        cazf.m127593a(afwa, "Cannot return null from a non-@Nullable @Provides method");
        return afwa;
    }
}
