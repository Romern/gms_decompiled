package p000;

import android.content.Context;

/* renamed from: brmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmn extends brmj {

    /* renamed from: g */
    private final String f142978g;

    /* renamed from: h */
    private final String f142979h;

    public brmn(String str, String str2, brps brps, String str3, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "CheckActionCode");
        this.f142978g = str3;
        this.f142979h = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142978g;
        String str2 = this.f142979h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        brph.f143125b.mo69783a(new brqw(str, null, str2), new brnz(brpj));
    }
}
