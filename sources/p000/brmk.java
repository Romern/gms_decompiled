package p000;

import android.content.Context;

/* renamed from: brmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmk extends brmj {

    /* renamed from: g */
    private final String f142972g;

    /* renamed from: h */
    private final String f142973h;

    public brmk(String str, String str2, brps brps, String str3, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "ApplyActionCode");
        this.f142972g = str3;
        this.f142973h = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142972g;
        String str2 = this.f142973h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        brra brra = new brra();
        sdo.m34977c(str);
        brra.f143209g = str;
        brra.f143210h = str2;
        brph.f143125b.mo69784a(brra, new brpf(brpj));
    }
}
