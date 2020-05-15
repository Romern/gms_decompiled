package p000;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: bdon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdon implements cayy {

    /* renamed from: a */
    private final cijl f106152a;

    /* renamed from: b */
    private final cijl f106153b;

    /* renamed from: c */
    private final cijl f106154c;

    /* renamed from: d */
    private final cijl f106155d;

    /* renamed from: e */
    private final cijl f106156e;

    public bdon(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        this.f106152a = cijl;
        this.f106153b = cijl2;
        this.f106154c = cijl3;
        this.f106155d = cijl4;
        this.f106156e = cijl5;
    }

    /* renamed from: b */
    public final bdom mo6445a() {
        return new bdom(((bdki) this.f106152a).mo6445a(), (Application) ((cayz) this.f106153b).f176439a, this.f106154c, ((bdfx) this.f106155d).mo6445a(), (SharedPreferences) this.f106156e.mo6445a());
    }
}
