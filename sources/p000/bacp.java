package p000;

import android.content.Context;

/* renamed from: bacp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacp implements cayy {

    /* renamed from: a */
    private final cijl f100480a;

    /* renamed from: b */
    private final cijl f100481b;

    /* renamed from: c */
    private final cijl f100482c;

    /* renamed from: d */
    private final cijl f100483d;

    public bacp(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f100480a = cijl;
        this.f100481b = cijl2;
        this.f100482c = cijl3;
        this.f100483d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context b = ((baba) this.f100480a).mo6445a();
        ((baay) this.f100481b).mo6445a();
        String b2 = ((babc) this.f100482c).mo6445a();
        String b3 = ((babd) this.f100483d).mo6445a();
        bacn bacn = new bacn(b2, b3, spn.m35895h(b, b3));
        cazf.m127593a(bacn, "Cannot return null from a non-@Nullable @Provides method");
        return bacn;
    }
}
