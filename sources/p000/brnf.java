package p000;

import android.content.Context;

/* renamed from: brnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnf extends brmj {

    /* renamed from: g */
    private final String f143009g;

    /* renamed from: h */
    private final String f143010h;

    /* renamed from: i */
    private final String f143011i;

    public brnf(String str, String str2, brps brps, String str3, String str4, String str5, brpp brpp) {
        super(str, str2, brps, brpp, "SignINWithEmailAndPassword");
        this.f143009g = str3;
        this.f143010h = str4;
        this.f143011i = str5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f143009g;
        String str2 = this.f143010h;
        String str3 = this.f143011i;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34959a(brpj);
        brrn brrn = new brrn(str, str2, str3);
        brph.f143125b.mo69774a(brrn, new brro(), cdxz.m135248c(), "verifyPassword").mo50371a(new brmb(context, new brnr(brph, brpj)));
    }
}
