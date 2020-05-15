package p000;

import java.util.Locale;

/* renamed from: tzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tzd extends txx {

    /* renamed from: d */
    final /* synthetic */ uey f46999d;

    /* renamed from: e */
    final /* synthetic */ tzf f47000e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tzd(tzf tzf, uhn uhn, uih uih, uey uey) {
        super(uhn, uih, true);
        this.f47000e = tzf;
        this.f46999d = uey;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo26930a(ujx ujx) {
        if (!ujx.mo27601d()) {
            return false;
        }
        if (ujx.mo27523A() || ujx.mo27564a(this.f46999d)) {
            return true;
        }
        throw new vpr("Descendant is inaccessible", new tzy(String.format(Locale.US, "App (fullAccess=%s) cannot access %s", Boolean.valueOf(this.f46999d.mo27263a()), ujx.mo27616i())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo26950c(ujx ujx) {
        if (ujx.mo27523A()) {
            return false;
        }
        tzf tzf = this.f47000e;
        int i = tzf.f47001h;
        return ujx.mo27639v().mo27699b() != tzf.f47003g.mo27699b();
    }
}
