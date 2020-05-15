package p000;

import java.util.Locale;

/* renamed from: tyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tyi extends txx {

    /* renamed from: d */
    final /* synthetic */ uey f46982d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyi(uhn uhn, uih uih, uey uey) {
        super(uhn, uih, true);
        this.f46982d = uey;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo26930a(ujx ujx) {
        if (!ujx.mo27621j()) {
            return false;
        }
        if (ujx.mo27523A() || ujx.mo27564a(this.f46982d)) {
            return true;
        }
        throw new vpr("Descendant inaccessible", new tzy(String.format(Locale.US, "App (fullAccess=%s) cannot access %s", Boolean.valueOf(this.f46982d.mo27263a()), ujx.mo27616i())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo26950c(ujx ujx) {
        return !ujx.mo27523A();
    }
}
